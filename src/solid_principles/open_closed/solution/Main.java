package solid_principles.open_closed.solution;

public class Main {
    public static void main(String[] args) {

        //SOLUTION
        Customer customer1 = new Customer(1L, "gurkan", new BasicSubscription());
        Customer customer2 = new Customer(2L, "mehmet", new FreeSubscription());
        Customer customer3 = new Customer(2L, "ahmet", new PremiumSubscriptionBase());

        var orderApprovement = new OrderApprovement();
        double basePrice = 20;
        var priceForBasicSubs = orderApprovement.calculateDeliveryFee(20.0, customer1);
        var priceForFreeSubs = orderApprovement.calculateDeliveryFee(20.0, customer2);
        var priceForPremiumSubs = orderApprovement.calculateDeliveryFee(20.0, customer3);
        System.out.println("BASIC:" + priceForBasicSubs);
        System.out.println("FREE:" + priceForFreeSubs);
        System.out.println("PREMIUM:" + priceForPremiumSubs);

        //************************************************************//
        // if we want to add PREMIUM subscription, what will we do?   //
        // add one more PREMIUM CLASS and extend SubscribtionBaseType //
        //************************************************************//

    }
}
