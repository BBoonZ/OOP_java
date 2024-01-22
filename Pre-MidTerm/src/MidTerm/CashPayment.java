public class CashPayment implements Pay{
    public CashPayment(){
        System.out.println("Instance CA Payment is constructed.");
    }
   @Override
   public boolean pay(Person payor, Person payee, double amount){
        if (amount <= payor.getWallet().getCash()){
            payor.getWallet().setCash(payor.getWallet().getCash()-amount);
            payee.getWallet().setCash(payee.getWallet().getCash()+amount);
            System.out.println("successful CA transaction.");
            return true;
        }else{
            System.out.println("fail CA transaction.");
            return false;
        }
    }
   
}
