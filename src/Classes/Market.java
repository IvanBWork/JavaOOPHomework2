package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс описывает работу магазина.
 * Методы класса работают с клиентами, которые представляют собой экземпляры классов, наследующихся от абстрактного класса Actor.
 * Экземпляры клиентов передаются в класс магазина в свойство в виде списка.
 * Структура класса позволяет след. операции с клиентами:
 * - фиксировать приход клиентов в магазин.
 * - проверять клиентов на наличие сделанного заказа.
 * - выдавать клиентам заказ.
 * - удалять клиента из очереди после получения заказа.
 * - фиксировать уход клиента из магазина.
 * - вернуть товар обратно в магазин.
 */
public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder  {

    private List<iActorBehaviour> queue; // список для хранения клиентов.

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Метод фиксирует приход клиента в магазин, выполняет постановку клиента в очередь в магазине.
     * @param actor клиент пришедший в магазин.
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Метод добавления клиента в очередь в магазине.
     * @param actor клиент для добавления в очередь в магазине.
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * Метод, фиксирующий создание заказа клиентом.
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }
    }

    /**
     * Метод, фиксирующий получение заказа клиентом.
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    /**
     * Метод, фиксирующий уход клиента с очереди.
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releseFromMarket(releaseActors);
    }

    /**
     * Метод фиксирует уход клиента из магазина, выполняет удаление клиента из очереди в списке.
     * @param actors Клиент для удаления из очереди в списке.
     */
    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * Метод, фиксирующий возвращение клиентом заказа.
     * @param actor Клиент вернувший заказ.
     */
    @Override
    public void ReturnOrder(iActorBehaviour actor) {
        if (actor.isMakeOrder()) {
            System.out.println(actor.getActor().getName() + " клиент вернул заказ");
        }
    }

    /**
     * Метод реализующий обновление состояний.
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
}
    

