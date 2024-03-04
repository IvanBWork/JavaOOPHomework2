package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс описывает структуру налогового инспектора.
 */
public class TaxInspector implements iActorBehaviour, iReturnOrder {
    private String name;
    private boolean isTakeOrder; // флаг состояния - инспектор получил заказ.
    private boolean isMakeOrder; // флаг состояния - инспектор сделал заказ.


    public TaxInspector() {
        this.name = "Tax Audit";
    }

    /**
     * Метод присвоения имени налоговому инспектору.
     * @param name задаваемое имя налогового инспектора.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод получения имени налогового инспектора.
     * @return возвращает имя налогового инспектора.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Метод для получения флага состояния полученного заказа инспектором.
     * @return флаг состояния - инспектор получил или не получил заказ.
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Метод для получения флага состояния сделанного заказа инспектором.
     * @return флаг состояния - инспектор сделал или не сделал заказ.
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder; 
    }

    /**
     * Метод для установки флага состояния полученного заказа инспектором.
     * @param val переменная состояния заказа у инспектора - получен или не получен.
     */
    @Override
    public void setTakeOrder(boolean val) {
        isTakeOrder = val;
    }

    /**
     * Метод для установки флага состояния сделанного заказа инспектором.
     * @param val переменная состояния заказа у инспектора - сделан или не сделан.
     */
    @Override
    public void setMakeOrder(boolean val) {
        isMakeOrder = val;        
    }

    /**
     * Метод получения экземпляра инспектора.
     * @return возвращает экземпляр инспектора.
     */
    @Override
    public Actor getActor() { return new OrdinaryClient(name); }

    /**
     * Метод возвращения инспектором товара.
     * @param actor Инспектор вернувший товар.
     */
    @Override
    public void ReturnOrder(iActorBehaviour actor) {

    }
}
