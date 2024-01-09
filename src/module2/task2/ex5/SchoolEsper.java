package src.module2.task2.ex5;

public class SchoolEsper {
    public static void main(String[] args) {
        School specialSchool = new School("SpecialSchool", 10);

        School hogwarts = new School("Hogwarts", "pyrokynetic", 4);
        Esper[] espersHogwarts = new Esper[4];
        espersHogwarts[0] = new Esper("Johans", 50, "telekinetic");
        espersHogwarts[1] = new Esper("Moris", 3, "pyrokynetic");
        espersHogwarts[2] = new Esper("Daves", 2000, "medium");
        espersHogwarts[3] = new Esper("Amandas", 3000, "pyrokynetic");

        School xSchool = new School("Xschool", "medium", 3);
        Esper[] espersXSchool = new Esper[3];
        espersXSchool[0] = new Esper("Didi", 1003, "medium");
        espersXSchool[1] = new Esper("Zaza", 9, "medium");
        espersXSchool[2] = new Esper("Hehe", 700, "pyrokynetic");

        School umbrella = new School("Umbrella", "telekinetic", 3);
        Esper[] espersUmbrella = new Esper[3];
        espersUmbrella[0] = new Esper("Tumita", 200, "pyrokynetic");
        espersUmbrella[1] = new Esper("Masita", 2500, "medium");
        espersUmbrella[2] = new Esper("Rokuta", 8, "telekinetic");

        for (Esper esper : espersHogwarts) {
            if (!hogwarts.addEsper(esper)){
                specialSchool.addInSpecialSchool(esper);
            }
        }

        for (Esper esper : espersUmbrella) {
            if (!umbrella.addEsper(esper)){
                specialSchool.addInSpecialSchool(esper);
            }
        }

        for (Esper esper : espersXSchool) {
            if (!xSchool.addEsper(esper)){
                specialSchool.addInSpecialSchool(esper);
            }
        }

        System.out.println(hogwarts.getTitle() + " " + hogwarts.getCount());
        System.out.println(xSchool.getTitle() + " " + xSchool.getCount());
        System.out.println(umbrella.getTitle() + " " + umbrella.getCount());
        System.out.println(specialSchool.getTitle() + " " + specialSchool.getCount());


    }
}
