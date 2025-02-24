package co.com.jcsolid.srp.problem;

class PaymentService {
    public void processPayment(String cardNumber, String cvv, double amount) {
        if (!validateCard(cardNumber, cvv)) {
            throw new IllegalArgumentException("Tarjeta inválida.");
        }

        System.out.println("Procesando pago de $" + amount + " con la tarjeta: " + cardNumber);

        generateInvoice(amount);
    }

    private boolean validateCard(String cardNumber, String cvv) {
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    private void generateInvoice(double amount) {
        System.out.println("Generando factura por $" + amount);
    }
}
