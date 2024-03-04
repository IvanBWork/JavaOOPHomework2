import Classes.*;
import Interfaces.iActorBehaviour;

/**
 * Клиентский класс, в котором идет запуск проекта.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Masha");
        iActorBehaviour client3 = new SpecialClient("Prezident", 1);
        iActorBehaviour client4 = new TaxInspector();
        PromotionalClient client5 = new PromotionalClient("Alexander", 11);

        PromotionalClient.setCountPromoClient(15);
        client5.setNameOfAction("EVERY 3 PINEAPPLE FREE");
        client5.showCurrentPromo();
        client5.setNameOfAction("10% DISCOUNT ON MEAT");
        PromotionalClient.setCountPromoClient(5);
        client5.showCurrentPromo();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);

        magnit.update();

        magnit.ReturnOrder(client2);
    }
}
