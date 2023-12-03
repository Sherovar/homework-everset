package src;

import java.util.Scanner;

public class CinemaProject {

    public static final int PRICE = 10;
    public static int currentIncome = 0;
    public static int currentFreeSpaces = 0;

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter rows number: ");
        int rows = scanner.nextInt();
        System.out.println("Enter seats number: ");
        int seats = scanner.nextInt();
        String[][] places = initPlaces(rows, seats);
        currentFreeSpaces = seats * rows;
        while (true) {
            System.out.println("Input action (Buy, Statistic, Print, Exit)");
            String input = scanner.next();
            if (input.equalsIgnoreCase("Exit"))
                break;
            if (input.equalsIgnoreCase("buy")) {
                buyPlace(places);
                continue;
            }
            if (input.equalsIgnoreCase("Print")) {
                printPlaces(places);
                continue;
            }
            if (input.equalsIgnoreCase("Statistic")) {
                System.out.println("Current income: " + currentIncome);
                System.out.println("Total income: " + (rows * seats * PRICE));
                System.out.println("Number of free seats: " + currentFreeSpaces);
                System.out.println("Total Number of seats: " + (rows * seats));
            }
        }

    }


    public static void buyPlace(String[][] places) {
        if (currentFreeSpaces == 0){
            System.err.println("ALL PLACEs HAS BEEN BOUGHT!!");
            return;
        }
        System.out.println("Choose the place");
        System.out.println("Enter row:");
        int row = scanner.nextInt();
        System.out.println("Enter seat:");
        int seat = scanner.nextInt();
        if (row > places.length || seat > places[0].length || row <= 0 || seat <= 0) {
            System.err.println("SUCH SEAT DOESN'T EXIST!!!");
            buyPlace(places);
        }
        if (places[row - 1][seat - 1].equals("B")) {
            System.err.println("THAT PLACE HAS BEEN BOOKED");
            buyPlace(places);
        }
        places[row - 1][seat - 1] = "B";
        currentIncome += 10;
        currentFreeSpaces--;
        System.out.println("Price: " + PRICE + "$");
    }

    public static void printPlaces(String[][] places) {
        for (int i = 0; i < places.length; i++) {
            for (int i1 = 0; i1 < places[i].length; i1++) {
                System.out.print(places[i][i1] + " ");
            }
            System.out.println();
        }

    }


    static String[][] initPlaces(int rows, int seats) {
        String[][] array = new String[rows][seats];
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                array[i][i1] = "S";
            }
        }
        return array;
    }

/*    public static void printPlaces(int rows, int seats){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                System.out.print("S ");
            }
            System.out.println();
        }
    }*/
/*    public static int currentIncome(String[][] places){
        int sum = 0;
        for (String[] place : places) {
            for (String s : place) {
                if (s.equals("B"))
                    sum += PRICE;
            }
        }
        return sum;
    }*/

/*    public static int countFreeSpaces(String[][] places){
        int count = 0;
        for (String[] place : places) {
            for (String s : place) {
                if (s.equals("B"))
                    count++;
            }
        }
        return count;
    }*/

}
