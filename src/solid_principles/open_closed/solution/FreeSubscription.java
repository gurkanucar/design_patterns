package solid_principles.open_closed.solution;

public class FreeSubscription extends SubscriptionBaseType {
    @Override
    public double calculateDeliveryFee(double basePrice) {
        return basePrice;
    }
}
