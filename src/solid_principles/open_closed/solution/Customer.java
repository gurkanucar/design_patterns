package solid_principles.open_closed.solution;


public class Customer {
    private Long id;
    private String username;
    private SubscriptionBaseType subscriptionBaseType;

    public Customer(Long id, String username, SubscriptionBaseType subscriptionBaseType) {
        this.id = id;
        this.username = username;
        this.subscriptionBaseType = subscriptionBaseType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public SubscriptionBaseType getSubscriptionType() {
        return subscriptionBaseType;
    }

    public void setSubscriptionType(SubscriptionBaseType subscriptionBaseType) {
        this.subscriptionBaseType = subscriptionBaseType;
    }
}
