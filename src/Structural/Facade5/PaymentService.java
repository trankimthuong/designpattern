package Structural.Facade5;

public class PaymentService {
    public void paymentByPaypal(){
        System.out.println("Payment by Paypal");
    }

    public void paymentByCreditCard(){
        System.out.println("payment by CreditCard");
    }

    public void paymentByEbankingAccount(){
        System.out.println("Payment by E-banking account");
    }

    public void paymentByCash(){
        System.out.println("Payment by cash");
    }
}
