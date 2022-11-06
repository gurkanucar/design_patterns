package solid_principles.open_closed.solution;


public class OrderApprovement {
    public double calculateDeliveryFee(double basePrice, Customer customer) {
        return customer.getSubscriptionType().calculateDeliveryFee(basePrice);
    }
}
