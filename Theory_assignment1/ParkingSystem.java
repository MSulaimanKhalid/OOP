public class ParkingSystem {
    private String campusName;
    Supervisor supervisor;
    ParkingZone[] zones = new ParkingZone[2];
    PermitHolder[] permitHolders = new PermitHolder[2];
    static ParkingSystem instance;
    private ParkingSystem(String campusName, Supervisor supervisor) {
        this.campusName = campusName;
        this.supervisor = supervisor;
    }
    public static ParkingSystem getInstance(String campusName, Supervisor supervisor) {
        if (instance == null) {
            instance = new ParkingSystem(campusName, supervisor);
        }
        else {
            System.out.println("ParkingSystem already exists!");
        }
        return instance;
    }
    void addZone(ParkingZone zone) {
        for (int i = 0; i < zones.length; i++) {
            if (zones[i] == null) {
                zones[i] = zone;
                break;
            }
            else {
                System.out.println("Zone already exists in his slot!");
            }
        }
    }
    void addPermitHolder(PermitHolder holder) {
        for (int i = 0; i < permitHolders.length; i++) {
            if (permitHolders[i] == null) {
                permitHolders[i] = holder;
                break;
            }
            else {
                System.out.println("PermitHolder already exists in his slot!");
            }
        }
    }
}