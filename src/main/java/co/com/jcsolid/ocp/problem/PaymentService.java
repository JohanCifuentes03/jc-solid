package co.com.jcsolid.ocp.problem;

public class PaymentService {
    public void processPayment(String type, double amount) {
        switch (type) {
            case "PayPal" -> System.out.println("Processing PayPal payment of $" + amount);
            case "CreditCard" -> System.out.println("Processing Credit Card payment of $" + amount);
            case "BankTransfer" -> System.out.println("Processing Bank Transfer payment of $" + amount);
            default -> System.out.println("No se encontró eñ método de pago especificado");
        }
    }
}
