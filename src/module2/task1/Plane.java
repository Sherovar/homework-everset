package src.module2.task1;

public class Plane {
    private String id;
    private String arrivalTime;
    private String departureTime;

    public String getId() {
        return id;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public Plane(String id, String departureTime, String arrivalTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public int getFlightTime(){
        int arrivalHours = Integer.parseInt(this.getArrivalTime().split(":")[0]);
        int arrivalMinutes = Integer.parseInt(this.getArrivalTime().split(":")[1]);
        int departureHours = Integer.parseInt(this.getDepartureTime().split(":")[0]);
        int departureMinutes = Integer.parseInt(this.getDepartureTime().split(":")[1]);
        int flightTime = arrivalHours * 60 + arrivalMinutes - departureHours * 60 - departureMinutes;
        return flightTime / 60;
    }

    @Override
    public String toString() {
        return id + " " +  departureTime + " " + arrivalTime;
    }

    public static void main(String[] args) {
        Plane[] array = new Plane[7];
        array[0] = new Plane("ABC", "12:05", "12:45");
        array[1] = new Plane("FDR", "12:00", "12:30");
        array[2] = new Plane("DWE", "15:20", "18:40");
        array[3] = new Plane("OYH", "12:00", "12:10");
        array[4] = new Plane("LQW", "15:20", "17:50");
        array[5] = new Plane("BDF", "12:15", "15:43");
        array[6] = new Plane("TNE", "15:41", "16:00");
        for (Plane plane : array) {
            if (plane.getFlightTime() >= 2){
                System.out.println(plane);
            }
        }

    }
}
