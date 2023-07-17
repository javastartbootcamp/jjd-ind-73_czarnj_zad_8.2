package pl.javastart.task.utils;

import pl.javastart.task.model.Address;
import pl.javastart.task.model.GiftTicket;
import pl.javastart.task.model.OnlineTicket;
import pl.javastart.task.model.StandardTicket;

import java.util.Scanner;

public class DataReader {
    private static final String ONLINE_TICKRT_TYPE = "bilet internetowy";
    private static final String STANDARD_TICKRT_TYPE = "bilet standardowy";
    private static final String GIFT_TICKRT_TYPE = "bilet prezentowy";

    private Scanner scanner = new Scanner(System.in);

    public OnlineTicket createOnlineTicket() {
        String eventName = readEventName();
        Address address = readAddress();
        double basePrice = readBasePrice();
        double discount = readDiscount();
        String email = readEmail();
        return new OnlineTicket(eventName, address, ONLINE_TICKRT_TYPE, basePrice, discount, email);
    }

    public StandardTicket createStandartTicket() {
        String eventName = readEventName();
        Address address = readAddress();
        double basePrice = readBasePrice();
        double discount = readDiscount();
        System.out.println("Dane do wysyłki:");
        Address shippingAddress = readAddress();
        return new StandardTicket(eventName, address, STANDARD_TICKRT_TYPE, basePrice, discount, shippingAddress);
    }

    public GiftTicket createGiftTicket() {
        String eventName = readEventName();
        Address address = readAddress();
        double basePrice = readBasePrice();
        double discount = readDiscount();
        String boxColor = readBoxColor();
        boolean isAutograph = readIsAutograph();
        return new GiftTicket(eventName, address, GIFT_TICKRT_TYPE, basePrice, discount, boxColor, isAutograph);
    }

    private String readEventName() {
        System.out.println("Podaj nazwę wydarzenia:");
        return scanner.nextLine();
    }

    private Address readAddress() {
        System.out.println("Podaj miejscowość:");
        String city = scanner.nextLine();
        System.out.println("Podaj ulicę:");
        String street = scanner.nextLine();
        System.out.println("Podaj numer:");
        String number = scanner.nextLine();
        return new Address(city, street, number);
    }

    private double readBasePrice() {
        System.out.println("Podaj cenę podstawową:");
        double basePrice = scanner.nextDouble();
        scanner.nextLine();
        return basePrice;
    }

    private double readDiscount() {
        System.out.println("Podaj zniżkę");
        double discount = scanner.nextDouble();
        scanner.nextLine();
        return discount;
    }

    private String readEmail() {
        System.out.println("Podaj email");
        return scanner.nextLine();
    }

    private String readBoxColor() {
        System.out.println("Podaj kolor opakowania:");
        return scanner.nextLine();
    }

    private boolean readIsAutograph() {
        System.out.println("Czy jest autograf:");
        return scanner.nextBoolean();
    }
}
