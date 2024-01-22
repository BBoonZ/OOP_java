public class Customer extends Person{
    private Vehicle vehicle;
    public Customer(){
        this(null, null, "");
        System.out.println("Instance CU1 is constructed.");
    }
    public Customer(Vehicle vehicle, Wallet wallet, String name){
        super(wallet, name);
        this.vehicle = vehicle;
        System.out.println("Instance CU2 is constructed.");
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void driveVehicle(String time){
        ((Car)vehicle).move(time);
    }
}
