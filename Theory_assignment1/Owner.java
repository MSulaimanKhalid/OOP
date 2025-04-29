public class Owner extends Person {
    Owner (String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Owner name: " +getName()+"\n";
    }
}
