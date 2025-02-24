package co.com.jcsolid.srp.solution;

public class CardValidator {
    public boolean validate(String cardNumber, String cvv) {
        return cardNumber.length() == 16 && cvv.length() == 3;
    }
}
