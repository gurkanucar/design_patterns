package solid_principles.open_closed.problem;

public class Main {
    public static void main(String[] args) {

        //PROBLEM
        Customer customer1 = new Customer(1L, "gurkan", SubscriptionType.BASIC);
        Customer customer2 = new Customer(2L, "mehmet", SubscriptionType.FREE);

        var orderApprovement = new OrderApprovement();
        double basePrice = 20;
        var priceForBasicSubs = orderApprovement.calculateDeliveryFee(20.0, customer1);
        var priceForFreeSubs = orderApprovement.calculateDeliveryFee(20.0, customer2);
        System.out.println("BASIC:" + priceForBasicSubs);
        System.out.println("FREE:" + priceForFreeSubs);

        //**********************************************************//
        // if we want to add PREMIUM subscription, what will we do? //
        // add one more switch case statement and PREMIUM enum type //
        //**********************************************************//

    }
}
