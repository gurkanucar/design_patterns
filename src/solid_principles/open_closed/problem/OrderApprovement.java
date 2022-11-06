package solid_principles.open_closed.problem;

public class OrderApprovement {
    public double calculateDeliveryFee(double basePrice, Customer customer) {
        var price = basePrice;
        switch (customer.getSubsType()) {
            case FREE:
                price = basePrice;
                break;
            case BASIC:
                price = basePrice * 0.5;
                break;
        }
        return price;
    }
}
