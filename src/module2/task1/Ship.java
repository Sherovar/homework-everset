package src.module2.task1;

public class Ship {
    private String name;
    private String arivalTime;
    private int stayTime;
    private boolean isDistress;

    public Ship(String name, String arivalTime, int stayTime, boolean isDistress) {
        this.name = name;
        this.arivalTime = arivalTime;
        this.stayTime = stayTime;
        this.isDistress = isDistress;
    }

    public String getName() {
        return name;
    }

    public String getArivalTime() {
        return arivalTime;
    }

    public int getStayTime() {
        return stayTime;
    }

    public boolean isDistress() {
        return isDistress;
    }

    public boolean isPossibleToStay(){
        if (isDistress) {
            return true;
        }
        int hours = Integer.parseInt(arivalTime.split(":")[0]);
        int minutes = Integer.parseInt(arivalTime.split(":")[1]);
        minutes += stayTime;
        hours += minutes / 60;
        if (hours < 10){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Ship[] ships = new Ship[10];
        ships[0] = new Ship("HERMES", "8:30", 120, false);
        ships[1] = new Ship("TITO", "5:00", 30, false);
        ships[2] = new Ship("SHANYRAK", "10:10", 25, true);
        ships[3] = new Ship("BOLONA", "18:15", 30, true);
        ships[4] = new Ship("KELVIN", "2:05", 480, false);
        ships[5] = new Ship("TATOOAN", "5:00", 180, false);
        ships[6] = new Ship("KIKOGAWA", "6:45", 1020, true);
        ships[7] = new Ship("RAMSES", "9:45", 30, false);
        ships[8] = new Ship("DIVORA", "11:00", 60, false);
        ships[9] = new Ship("HELENA", "7:30", 300, true);

        for (Ship ship : ships) {
            if (ship.isPossibleToStay()){
                System.out.println(ship.getName());
            }
        }
    }
}
