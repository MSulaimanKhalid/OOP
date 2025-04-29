public class Vehicle {
    private String type;
    private String liscencePlate;
    private Owner owner;
    Vehicle (String type, String liscencePlate, Owner owner) {
        this.type = type;
        this.liscencePlate = liscencePlate;
        this.owner = owner;
    }
    void shallowCopy () {
        new Vehicle(this.type, this.liscencePlate, this.owner);
    }
    void deepCopy () {
        Owner reOwner = new Owner(this.owner.getName());
        new Vehicle(this.type, this.liscencePlate, reOwner);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setLiscencePlate(String liscencePlate) {
        this.liscencePlate = liscencePlate;
    }

    public String getLiscencePlate() {
        return liscencePlate;
    }

    @Override
    public String toString() {
        return "Vehicle type: " + type + "\n" +
                "liscencePlate: " + liscencePlate + "\n" +
                "Owner's details; \n" + owner.toString() + "\n";
    }
}
