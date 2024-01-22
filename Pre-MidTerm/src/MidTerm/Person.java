public abstract class Person {
    private String name;
    private Wallet wallet;
    public Person(Wallet wallet, String name){
        this.name = name;
        this.wallet = wallet;
        System.out.println("Instance PE is constructed.");
    }
    public String getName(){
        return name;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    @Override
    public String toString(){
        return "My person detail : name=" + name + ", wallet="+ wallet +".";
    }
}
