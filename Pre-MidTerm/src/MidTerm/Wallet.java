public class Wallet {
    private double cash;
    private double creditUsed;
    private final double CREDIT_LIMIT = 50000;
    public Wallet(){
        this(0, 0);
        System.out.println("Instance WA1 is constructed.");
    }
    public Wallet(double cash, double creditUsed){
        System.out.println("Instance WA2 is constructed.");
        if (cash >= 0){
            this.cash = cash;
        }else{
            System.out.println("Negative Balance Not Permitted.");
        }
        if (creditUsed >= 0 && creditUsed <= CREDIT_LIMIT){
            this.creditUsed = creditUsed;
        }else{
            System.out.println("Credit Limit Exceeded or Negative.");
        }
    }
    public double getCREDIT_LIMIT(){
        return CREDIT_LIMIT;
    }
    public double getCash(){
        return cash;
    }
    public double getCreditUsed(){
        return creditUsed;
    }
    public void setCash(double cash){
        if (cash >= 0){
            this.cash = cash;
        }else{
            System.out.println("Negative Balance Not Permitted.");
        }
    }
    public void setCreditUsed(double creditUsed){
        if (creditUsed >= 0 && creditUsed <= CREDIT_LIMIT){
            this.creditUsed = creditUsed;
        }else{
            System.out.println("Credit Limit Exceeded or Negative.");
        }
    }
    @Override
    public String toString(){
        return "my wallet detail : cash=" + cash + ", creditUsed=" + creditUsed + ", CREDIT_LIMIT=" + CREDIT_LIMIT +".";
    }
}
