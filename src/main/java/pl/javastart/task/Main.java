package pl.javastart.task;

import pl.javastart.task.model.Address;
import pl.javastart.task.model.GiftTicket;
import pl.javastart.task.model.OnlineTicket;
import pl.javastart.task.model.StandardTicket;
import pl.javastart.task.utils.DataReader;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Wrocław", "Borowska", "7A");
        Address address2 = new Address("Warszawa", "Marszałkowska", "4");
        OnlineTicket onlineTicket = new OnlineTicket("Koncert Budka Suflera", address1,
                "bilet internetowy", 100, 0, "abc@gmail.com");
        StandardTicket standardTicket = new StandardTicket("Spektakl Szalone nożyczki", address1,
                "bilet standardowy", 150, 0.1, address2);
        GiftTicket giftTicket = new GiftTicket("Koncert Oki", address1, "bilet prezentowy",
                75, 0, "zielony", false);
        System.out.println(onlineTicket.getInfo());
        System.out.println(standardTicket.getInfo());
        System.out.println(giftTicket.getInfo());

        DataReader dataReader = new DataReader();
        OnlineTicket onlineTicket2 = dataReader.createOnlineTicket();
        System.out.println(onlineTicket2.getInfo());
        StandardTicket standardTicket2 = dataReader.createStandartTicket();
        System.out.println(standardTicket2.getInfo());
        GiftTicket giftTicket2 = dataReader.createGiftTicket();
        System.out.println(giftTicket2.getInfo());
    }
}
