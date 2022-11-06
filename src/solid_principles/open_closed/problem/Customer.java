package solid_principles.open_closed.problem;

public class Customer {
    private Long id;
    private String username;
    private SubscriptionType subsType;

    public Customer(Long id, String username, SubscriptionType subsType) {
        this.id = id;
        this.username = username;
        this.subsType = subsType;
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

    public SubscriptionType getSubsType() {
        return subsType;
    }

    public void setSubsType(SubscriptionType subsType) {
        this.subsType = subsType;
    }
}
