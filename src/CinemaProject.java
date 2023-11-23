package src;

import java.util.Scanner;

public class CinemaProject {

    public static final int PRICE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows number: ");
        int rows = scanner.nextInt();
        System.out.println("Enter seats number: ");
        int seats = scanner.nextInt();
        String[][] places = initPlaces(rows, seats);
        while (true){
            System.out.println("Input action (Buy, Statistic, Print, Exit)");
            String input = scanner.next();
            if (input.equalsIgnoreCase("Exit"))
                break;
            if (input.equalsIgnoreCase("buy")){
                System.out.println("Enter row:");
                int row = scanner.nextInt();
                System.out.println("Enter seat:");
                int seat = scanner.nextInt();
                if (row > rows || seat > seats || row <= 0 || seat <= 0) {
                    System.err.println("SUCH SEAT DOESN'T EXIST!!!");
                    continue;
                }
                System.out.println("Price: " + PRICE + "$");
                buyPlace(places, row, seat);
                continue;
            }
            if(input.equalsIgnoreCase("Print")){
                printPlaces(places);
                continue;
            }
            if (input.equalsIgnoreCase("Statistic")){
                System.out.println("Current income: " + currentIncome(places));
                System.out.println("Total income: " + (rows * seats * PRICE));
                System.out.println("Number of free seats: " + countFreeSpaces(places));
                System.out.println("Total Number of seats: " + (rows * seats));
            }
        }

    }




    public static void buyPlace(String[][] places, int row, int seat){
        if (places[row - 1][seat - 1].equals("B")){
            System.err.println("THAT PLACE IS BOOKED");
            return;
        }
        places[row - 1][seat - 1] = "B";
    }

    public static void printPlaces(String[][] places){
        for (int i = 0; i < places.length; i++) {
            for (int i1 = 0; i1 < places[i].length; i1++) {
                System.out.print(places[i][i1] + " ");
            }
            System.out.println();
        }

    }

    public static void printPlaces(int rows, int seats){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                System.out.print("S ");
            }
            System.out.println();
        }
    }

    static String[][] initPlaces(int rows, int seats){
        String[][] array = new String[rows][seats];
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                array[i][i1] = "S";
            }
        }
        return array;
    }

    public static int currentIncome(String[][] places){
        int sum = 0;
        for (String[] place : places) {
            for (String s : place) {
                if (s.equals("B"))
                    sum += PRICE;
            }
        }
        return sum;
    }

    public static int countFreeSpaces(String[][] places){
        int count = 0;
        for (String[] place : places) {
            for (String s : place) {
                if (s.equals("B"))
                    count++;
            }
        }
        return count;
    }

}
