public class Supervisor extends Person {
    private int yearsOfExperience;
    public Supervisor(String name, int yearsOfExperience) {
        super(name);
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public String toString() {
        return "Supervisor name: "+ getName() +"\nSupervisor's yearsOfExperience: " + yearsOfExperience + "\n";
    }
}
