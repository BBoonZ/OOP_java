public class CardPayment implements Pay{
    public CardPayment(){
        System.out.println("Instance CC Payment is constructed.");
    }
    @Override
    public boolean pay(Person payor, Person payee, double amount){
        if (payor.getWallet().getCreditUsed()+amount <= payor.getWallet().getCREDIT_LIMIT()){
            payor.getWallet().setCreditUsed( payor.getWallet().getCreditUsed()+amount);
            payee.getWallet().setCash(payee.getWallet().getCash()+amount);
            System.out.println("successful CC transaction.");
            return true;
        }else{
            System.out.println("fail CC transaction.");
            return false;
        }
    }
}
