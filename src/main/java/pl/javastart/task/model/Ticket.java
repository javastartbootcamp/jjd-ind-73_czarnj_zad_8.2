package pl.javastart.task.model;

public class Ticket {
    private static int nextId = 1;
    private String eventName;
    private Address address;
    private String type;
    private double basePrice;
    private double discount;
    private int id;

    public Ticket(String eventName, Address address, String type, double basePrice, double discount) {
        this.eventName = eventName;
        this.address = address;
        this.type = type;
        this.basePrice = basePrice;
        this.discount = discount;
        this.id = nextId++;
    }

    public double calculateFinalPrice() {
        return basePrice - discount * basePrice;
    }

    public String getInfo() {
        return String.format("Wydarzenie: %s Miejsce: %s Typ: %s Cena podstawowa: %.2f Zniżka: %.2f Id: %d" +
                        " Cena ostateczna: %.2f", eventName, address.getInfo(), type, basePrice, discount, id, calculateFinalPrice());
    }

    public int getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddres(Address address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
