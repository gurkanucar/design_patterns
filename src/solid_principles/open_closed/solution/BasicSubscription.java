package solid_principles.open_closed.solution;

public class BasicSubscription extends SubscriptionBaseType {
    @Override
    public double calculateDeliveryFee(double basePrice) {
        return basePrice * 0.5;
    }
}
