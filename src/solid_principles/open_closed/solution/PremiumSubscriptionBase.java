package solid_principles.open_closed.solution;

public class PremiumSubscriptionBase extends SubscriptionBaseType {
    @Override
    public double calculateDeliveryFee(double basePrice) {
        //free for premium users
        return 0;
    }
}
