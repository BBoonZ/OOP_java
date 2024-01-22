public class Car extends Vehicle{
    public static final double MAX_FUEL_CAPACITY = 60;
    public Car(){
        this("", "", 0);
        System.out.println("Instance CR1 is constructed.");
    }
    public Car(String brand, String model, double fuel){
       super(brand, model, fuel);
       System.out.println("Instance CR2 is constructed.");
    }
    @Override
    public double fuelUp(double amount){
        if (getFuel()+amount <= MAX_FUEL_CAPACITY){
            setFuel(getFuel()+amount);
            System.out.println("Fueling Completed.");
            return amount;
        }else{
            double i = MAX_FUEL_CAPACITY-getFuel();
            System.out.println("Only " + i + " liters of fuel have been added out of the requested " + MAX_FUEL_CAPACITY );
            setFuel(MAX_FUEL_CAPACITY);
            return i;
        }
    }
    public void move(){
        move("1");
    }
    public void move(String time){
        for(int i =0;i<Integer.parseInt(time);i++){
           if (getFuel() >= 5){
                setFuel(getFuel()-5);
                System.out.println("Move Move.");
            }else{
                System.out.println("Not enough to move.");
            }
        }
    }
    @Override
    public String toString(){
        return "My car detail : brand=" + brand + ", model=" + model + ", fuel=" + fuel + ".";
    }
}
