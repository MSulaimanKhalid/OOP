public class ParkingZone {
    private String id;
    private static int idCounter = 0;
    Vehicle[] vehicles = new Vehicle[5];

    ParkingZone() {
        this.id = "A" + idCounter++;
    }

    void addVehicle(Vehicle v) {
        boolean found = false;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getLiscencePlate().equals(v.getLiscencePlate()))
                found = true;
            System.out.println("Similar liscence plate detected! vehicle entry failed!");
        }
        if (!found) {
            for (int i = 0; i < vehicles.length; i++) {
                if (vehicles[i] == null) {
                    vehicles[i] = v;
                }
            }
        }
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Zone ID: " + id + "\n").append("Vehicles' details:\n ");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                builder.append(vehicles[i].toString());
            }
            else{
                builder.append("No vehicle detected on this spot!");
            }
        }
        return builder.toString();
    }
}
