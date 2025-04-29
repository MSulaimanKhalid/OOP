//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor("Dr. Ayesha",5);
        ParkingSystem system = ParkingSystem.getInstance("CUI Lahore", supervisor);
        ParkingSystem system2 = ParkingSystem.getInstance("ShouldNotWork", supervisor);
        ParkingZone zone1 = new ParkingZone();
        ParkingZone zone2 = new ParkingZone();
        Owner owner1 = new Owner("Ali");
        Owner owner2 = new Owner("Bob");
        Owner owner3 = new Owner("Dan");
        Vehicle v1 = new Vehicle("bike","LEA123",owner1);
        Vehicle v2 = new Vehicle("bike","LEA123",owner2);
        Vehicle v3 = new Vehicle("car","LEA123",owner3);
        zone1.addVehicle(v1);
        zone1.addVehicle(v2);
        zone2.addVehicle(v3);
        system.addZone(zone1);
        system.addZone(zone2);
        PermitHolder ph1 = new PermitHolder("sara");
        PermitHolder ph2 = new PermitHolder("saad");
        system.addPermitHolder(ph1);
        system.addPermitHolder(ph2);
        System.out.println(system);
    }
}