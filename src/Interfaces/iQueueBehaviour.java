package Interfaces;

/**
 * Интерфейс описывает поведение клиентов в очереди
 */
public interface iQueueBehaviour {
    public void takeInQueue(iActorBehaviour actor); // Метод добавления клиента в очередь в магазине.
    public void releaseFromQueue(); // Метод, фиксирующий уход клиента с очереди.
    public void takeOrder (); // Метод, фиксирующий создание заказа клиентом.
    public void giveOrder (); // Метод, фиксирующий получение заказа клиентом.
}
