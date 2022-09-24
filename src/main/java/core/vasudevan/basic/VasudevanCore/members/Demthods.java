package core.vasudevan.basic.VasudevanCore.members;

public class Demthods {
    public static void main(String[] args) {
        Bank bnk1=new Bank();
        bnk1.balance=90000.34;bnk1.holder="Razak Mohamed S";bnk1.number=9876567895L;bnk1.contact=8670237344L;
        bnk1.withdrawl(23500);
        bnk1.withdrawl(45000);
        bnk1.withdrawl(55000);

        Bank bnk2=new Bank();
        bnk2.contact=87656787656L;bnk2.holder="Vasudevan";bnk2.balance=459023.5;bnk2.number=12121219834567L;
        bnk2.withdrawl(100000);
    }
}

class Bank{
    String holder;
    long number;
    long contact;
    double balance;

    public void withdrawl(int required){
        if(required<=balance){
            balance-=required;
            System.out.println(required+" cash withdrawn successfully from "+number);
        }
        else{
            System.out.println("Insufficient balance in account "+number);
        }
    }
}