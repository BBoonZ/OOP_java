public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(new Car("Honda", "City", 40), new Wallet(1000, 30000), "John");
        OwnerGasStation o1 = new OwnerGasStation(new Wallet(1000, 2000), "Adam");
        Wallet w = new Wallet(1000, 40000);
        w.setCash(2000);
        System.out.println(w);
        w.setCash(-100);
        System.out.println(w);
        w.setCreditUsed(49000);
        System.out.println(w);
        w.setCreditUsed(90000);
        System.out.println(w);
        c1.getWallet().setCash(2000);
        System.out.println(c1);
        c1.getWallet().setCash(-100);
        System.out.println(c1);
        c1.getWallet().setCreditUsed(49000);
        System.out.println(c1);
        c1.getWallet().setCreditUsed(90000);
        System.out.println(c1);
        System.out.println(o1);
    }  
}