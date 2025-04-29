public class PermitHolder extends Person{
    private static int PermitCounter = 100;
    private int permitId;
    PermitHolder(String name){
        super(name);
        this.permitId = PermitCounter++;
    }

    public int getPermitId() {
        return permitId;
    }
    public String toString(){
        return "Permit holder name: "+getName()+"Permit ID: " + permitId+"\n";
    }
}
