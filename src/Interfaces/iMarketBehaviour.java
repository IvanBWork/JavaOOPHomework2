package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Интерфейс описывает работу магазина.
 */
public interface iMarketBehaviour {
    public void acceptToMarket(iActorBehaviour actor); // Метод фиксирует приход клиента в магазин.
    public void releseFromMarket(List<Actor> actors); // Метод фиксирует уход клиента из магазина.
    public void update(); // Метод реализующий обновление состояний.
}
