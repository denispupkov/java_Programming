package day18_GarbageCollection;

public class TestBankAccount {


    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.setInfo("Gadir",123456598);

        System.out.println(bankAccount1);

        bankAccount1.deposit(1000);

        bankAccount1.checkBalance();

        bankAccount1.withdraw(700);

        bankAccount1.checkBalance();

        System.out.println("==============================");

        BankAccount bankAccount2 = new BankAccount();

        bankAccount2.setInfo("Sebastian",687613546);

        bankAccount2.deposit(1500);

        bankAccount1.checkBalance();
        bankAccount2.checkBalance();
        bankAccount2.withdraw(350);
        bankAccount2.checkBalance();



    }
}