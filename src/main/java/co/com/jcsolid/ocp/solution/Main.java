package co.com.jcsolid.ocp.solution;

public class Main {
    public static void main(String[] args) {
        PaymentService paypalService = new PaymentService(new PayPalPayment());
        paypalService.processPayment(100.0);

        PaymentService creditCardService = new PaymentService(new CreditCardPayment());
        creditCardService.processPayment(200.0);

        PaymentService bankTransferService = new PaymentService(new BankTransferPayment());
        bankTransferService.processPayment(300.0);
    }
}
