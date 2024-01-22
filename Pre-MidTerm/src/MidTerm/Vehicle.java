public abstract class Vehicle {
    protected String brand;
    protected double fuel;
    protected String model;
    public Vehicle(String brand, String model, double fuel){
        this.brand = brand;
        this.fuel = fuel;
        this.model = model;
        System.out.println("Instance VE is constructed.");
    }
    public String getBrand(){
        return brand;
    }
    public double getFuel(){
        return fuel;
    }
    public String getModel(){
        return model;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public void setModel(String model){
        this.model = model;
    }
    public abstract double fuelUp(double amount);
    @Override
    public String toString(){
        return "My Vehicle detail : brand=" + brand + ", model=" + model + ", fuel=" + fuel + ".";
    }
}
