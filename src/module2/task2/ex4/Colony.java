package src.module2.task2.ex4;

public class Colony {
    private int pos = 0;
    private String name;
    private int smetPrice;
    private int apCount;
    private Apartment[] aparts;

    public Colony(String name, int smetPrice, int apCount) {
        this.name = name;
        this.smetPrice = smetPrice;
        this.apCount = apCount;
        this.aparts = new Apartment[apCount];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSmetPrice() {
        return smetPrice;
    }

    public void setSmetPrice(int smetPrice) {
        this.smetPrice = smetPrice;
    }

    public int getApCount() {
        return apCount;
    }

    public void setApCount(int apCount) {
        this.apCount = apCount;
    }

    public Apartment[] getAparts() {
        return aparts;
    }

    public void setAparts(Apartment[] aparts) {
        this.aparts = aparts;
    }

    public void addApart(Apartment apartment){
        aparts[pos++] = apartment;
    }

    public Apartment getCheapestApartment(){
        if (aparts.length == 0){
            return null;
        }
        if (aparts.length == 1){
            return aparts[0];
        }
        Apartment apartment = aparts[0];
        for (int i = 1; i < aparts.length; i++) {
            apartment = apartment.getSmet() < aparts[i].getSmet() ? apartment : aparts[i];
        }
        return apartment;
    }

    public int getCheapestPrice(){
        return getCheapestApartment().getSmet() * smetPrice;
    }


}
