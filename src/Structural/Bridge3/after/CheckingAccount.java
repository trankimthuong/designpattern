package Structural.Bridge3.after;

public class CheckingAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("checking account");
    }
}
