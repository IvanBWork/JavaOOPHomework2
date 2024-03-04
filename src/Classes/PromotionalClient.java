package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс описывает структуру акционного клиента.
 * Является потомком класса Actor.
 */
public class PromotionalClient extends Actor implements iActorBehaviour, iReturnOrder {

    private String nameOfPromo;  // название акции.
    private int idPromoClient; // ID акционного клиента.
    private static int countPromoClient; // количество участников акции.

    public PromotionalClient(String name, int idPromoClient) {
        super(name);
        this.idPromoClient = idPromoClient;
    }

    /**
     * Метод для получения флага состояния полученного заказа клиентом
     * @return флаг состояния - клиент получил или не получил заказ
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Метод для получения флага состояния сделанного заказа клиентом
     * @return флаг состояния - клиент сделал или не сделал заказ
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Метод для установки флага состояния полученного заказа клиентом
     * @param val переменная состояния заказа у клиента - получен или не получен
     */
    @Override
    public void setTakeOrder(boolean val) { this.isTakeOrder = val; }

    /**
     * Метод для установки флага состояния сделанного заказа клиентом
     * @param val переменная состояния заказа у клиента - сделан или не сделан
     */
    @Override
    public void setMakeOrder(boolean val) { this.isMakeOrder = val; }

    /**
     * Метод получения экземпляра акционного клиента.
     * @return возвращает экземпляр акционного клиента.
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Метод получения имени акционного клиента.
     * @return возвращает имя акционного клиента.
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Метод присвоения имени акционного клиента.
     * @param name задаваемое имя акционного клиента.
     */
    @Override
    public void setName(String name) {
    }

    /**
     * Метод возвращает id клиента.
     * @return возвращает id клиента.
     */
    public int getID() {
        return idPromoClient;
    }

    /**
     * Метод устанавливает id клиента.
     * @param idPromoClient для присвоения id клиенту.
     */
    public void setID(int idPromoClient) {
        this.idPromoClient = idPromoClient;
    }

    /**
     * Метод возвращает количество участников акции.
     * @return количество участников акции.
     */
    public static int getCountPromoClient() {
        return countPromoClient;
    }

    /**
     * Метод задает количество участников акции.
     * @param countPromoClient количество участников акции.
     */
    public static void setCountPromoClient(int countPromoClient) {
        PromotionalClient.countPromoClient = countPromoClient;
    }

    /**
     * Метод возвращает название акции.
     * @return название акции.
     */
    public String getNameOfPromo() {
        return nameOfPromo;
    }

    /**
     * Метод задает название акции.
     * @param nameOfPromo название акции.
     */
    public void setNameOfAction(String nameOfPromo) {
        this.nameOfPromo = nameOfPromo;
    }

    /**
     * Метод показывает, является ли клиент участником текущей акции.
     */
    public void showCurrentPromo() {
        if (idPromoClient <= countPromoClient) {
            System.out.println("Клиент " + super.name + " с id:" + this.idPromoClient + " участвует в акции " + this.nameOfPromo);
        } else
            System.out.println("Клиент " + super.name + " с id:" + this.idPromoClient + "  не участвует в акции " + this.nameOfPromo);
    }

    /**
     * Метод возвращения клиентом товара.
     * @param actor Клиент вернувший товар.
     */
    @Override
    public void ReturnOrder(iActorBehaviour actor) {

    }
}
