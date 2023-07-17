package pl.javastart.task.model;

public class StandardTicket extends Ticket {
    private final static double LOGISTICS_COST = 5;
    private Address shippingAddress;

    public StandardTicket(String eventName, Address address, String type, double basePrice,
                          double discount, Address shippingAddress) {
        super(eventName, address, type, basePrice, discount);
        this.shippingAddress = shippingAddress;
    }

    @Override
    public double calculateFinalPrice() {
        return super.calculateFinalPrice() + LOGISTICS_COST;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" Adres wysyłki: %s", shippingAddress.getInfo());
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
