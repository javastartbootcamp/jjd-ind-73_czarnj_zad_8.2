package pl.javastart.task.model;

public class GiftTicket extends Ticket {
    private static final double ADDITIONAL_CHARGE_PERCENTAGE = 0.05;
    private String boxColor;
    private boolean isAutograph;

    public GiftTicket(String eventName, Address address, String type, double basePrice,
                      double discount, String boxColor, boolean isAutograph) {
        super(eventName, address, type, basePrice, discount);
        this.boxColor = boxColor;
        this.isAutograph = isAutograph;
    }

    @Override
    public double calculateFinalPrice() {
        double basePriceWithDiscount = super.calculateFinalPrice();
        return basePriceWithDiscount + ADDITIONAL_CHARGE_PERCENTAGE * basePriceWithDiscount;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" Kolor opakowania: %s Autograf: %b", boxColor, isAutograph);
    }

    public String getBoxColor() {
        return boxColor;
    }

    public void setBoxColor(String boxColor) {
        this.boxColor = boxColor;
    }

    public boolean isAutograph() {
        return isAutograph;
    }

    public void setAutograph(boolean autograph) {
        isAutograph = autograph;
    }
}
