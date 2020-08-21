package Structural.Bridge3.after;

public class SavingAccount implements Account{
    @Override
    public void openAccount() {
        System.out.println("saving account");
    }
}
