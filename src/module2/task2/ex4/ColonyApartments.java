package src.module2.task2.ex4;

public class ColonyApartments {
    public static void main(String[] args) {
        Colony lalatown = new Colony("Lalatown", 100, 3);
        lalatown.addApart(new Apartment("NCA408R", 9, "Cyberbricks"));
        lalatown.addApart(new Apartment("KBK312S", 12, "Carbonpanel"));
        lalatown.addApart(new Apartment("TUU514L", 6, "Nanolite"));
        Colony redDeadVillage = new Colony("RedDeadVillage", 50, 4);
        redDeadVillage.addApart(new Apartment("GALA27Y", 10, "Nanolite"));
        redDeadVillage.addApart(new Apartment("TIKO14D", 16, "Cyberbricks"));
        redDeadVillage.addApart(new Apartment("GALA34U", 12, "Nanolite"));
        redDeadVillage.addApart(new Apartment("GALA25Y", 10, "Carbonpanel"));
        Colony newShymkent = new Colony("NewShymkent", 80, 2);
        newShymkent.addApart(new Apartment("JEBR777Е", 20, "Cyberbricks"));
        newShymkent.addApart(new Apartment("UKOL512T", 10, "Carbonpanel"));
        Colony[] colonies = new Colony[3];
        colonies[0] = lalatown;
        colonies[1] = redDeadVillage;
        colonies[2] = newShymkent;
        int cheapestPrice = Integer.MAX_VALUE;
        String cheapestColonyName = "";
        Apartment apartment = null;
        for (Colony colony : colonies) {
            if (cheapestPrice > colony.getCheapestPrice()){
                cheapestPrice = colony.getCheapestPrice();
                apartment = colony.getCheapestApartment();
                cheapestColonyName = colony.getName();
            }
        }
        System.out.printf("%s - %d - %s", apartment.getTitle(), cheapestPrice, cheapestColonyName);



    }
}
