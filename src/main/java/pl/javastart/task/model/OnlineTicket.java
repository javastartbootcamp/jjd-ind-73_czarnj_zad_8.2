package pl.javastart.task.model;

public class OnlineTicket extends Ticket {
    private String email;

    public OnlineTicket(String eventName, Address address, String type, double basePrice,
                        double discount, String email) {
        super(eventName, address, type, basePrice, discount);
        this.email = email;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" Email: %s", email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
