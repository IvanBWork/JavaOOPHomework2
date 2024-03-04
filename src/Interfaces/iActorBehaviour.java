package Interfaces;

import Classes.Actor;

/**
 * Интерфейс описывает поведение клиентов
 */
public interface iActorBehaviour {
    public boolean isTakeOrder(); // Метод для получения флага состояния полученного заказа клиентом.
    public boolean isMakeOrder(); // Метод для получения флага состояния сделанного заказа клиентом.
    public void setTakeOrder(boolean val); // Метод для установки флага состояния полученного заказа клиентом.
    public void setMakeOrder(boolean val); // Метод для установки флага состояния полученного заказа клиентом.
    public Actor getActor(); // Метод получения экземпляра клиента.
}
