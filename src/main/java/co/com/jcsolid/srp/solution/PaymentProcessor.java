package co.com.jcsolid.srp.solution;

public class PaymentProcessor {
    private final CardValidator validator = new CardValidator();
    private final InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    public void processPayment(String cardNumber, String cvv, double amount) {
        if (!validator.validate(cardNumber, cvv)) {
            throw new IllegalArgumentException("Tarjeta inválida.");
        }

        System.out.println("Procesando pago de $" + amount + " con la tarjeta: " + cardNumber);

        invoiceGenerator.generate(amount);
    }
}
