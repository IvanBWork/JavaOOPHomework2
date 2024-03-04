package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс описывает структуру обычного клиента.
 * Является потомком класса Actor.
 */
public class OrdinaryClient extends Actor implements iActorBehaviour, iReturnOrder {

    public OrdinaryClient(String name) {
        super(name);
    }

    /**
     * Метод для получения флага состояния полученного заказа клиентом.
     * @return флаг состояния - клиент получил или не получил заказ.
     */
    @Override
    public boolean isTakeOrder() { return super.isTakeOrder; }

    /**
     * Метод для получения флага состояния сделанного заказа клиентом.
     * @return флаг состояния - клиент сделал или не сделал заказ.
     */
    @Override
    public boolean isMakeOrder() { return super.isMakeOrder; }

    /**
     * Метод для установки флага состояния полученного заказа клиентом.
     * @param val переменная состояния заказа у клиента - получен или не получен.
     */
    @Override
    public void setTakeOrder(boolean val) { super.isTakeOrder = val; }

    /**
     * Метод для установки флага состояния сделанного заказа клиентом.
     * @param val переменная состояния заказа у клиента - сделан или не сделан.
     */
    @Override
    public void setMakeOrder(boolean val) { super.isMakeOrder = val; }

    /**
     * Метод получения экземпляра клиента.
     * @return возвращает экземпляр клиента.
     */
    @Override
    public Actor getActor() { return this; }

    /**
     * Метод получения имени клиента.
     * @return возвращает имя клиента.
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Метод присвоения имени клиента.
     * @param name задаваемое имя клиента.
     */
    @Override
    public void setName(String name) { super.name = name; }

    /**
     * Метод возвращения клиентом товара.
     * @param actor Клиент вернувший товар.
     */
    @Override
    public void ReturnOrder(iActorBehaviour actor) {
    }
}