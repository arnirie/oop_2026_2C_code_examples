package practice_abstract_interface;

import java.util.ArrayList;

public abstract class PaymentMethod {
    protected String transactionId;
    protected double amount;

    public PaymentMethod(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public abstract boolean validatePayment();

    public abstract double calculateProcessingFee();

    public void processTransaction(){
        if(validatePayment()){
            double totalAmt = this.amount + calculateProcessingFee();
            IO.println("Transaction ID: " + this.transactionId);
            IO.println("Amount: " + this.amount);
            IO.println("Processing Fee: " + calculateProcessingFee());
            IO.println("Total Amount: " + totalAmt);
        } else {
            IO.println("Transaction " + transactionId + "FAILED: Invalid payment details");
        }
    }
}

class CreditCardPayment extends PaymentMethod {
    private String cardNumber, cvv;

    public CreditCardPayment(String transactionId, double amount, String cardNumber, String cvv) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean validatePayment(){
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    @Override
    public double calculateProcessingFee(){
        return amount * 0.025;
    }
}

//DigitalWalletPayment
//Additional Attributes: walletId (String, e.g., mobile number or email) and walletBalance (double).
//Constructor: Accepts transactionId, amount, walletId, and walletBalance.
//calculateProcessingFee(): Digital wallets charge a flat fee of $15.00 (or ₱15.00) for transactions over 1000.00, and 0.00 for 1000.00 or below.
//validatePayment(): Returns true only if walletBalance is greater than or equal to amount + calculateProcessingFee().

class DigitalWalletPayment extends PaymentMethod {
    private String walletId;
    private double walletBalance;

    public DigitalWalletPayment(String transactionId, double amount, String walletId, double walletBalance) {
        super(transactionId, amount);
        this.walletId = walletId;
        this.walletBalance = walletBalance;
    }

    @Override
    public boolean validatePayment(){
        return walletBalance >= amount + calculateProcessingFee();
    }

    @Override
    public double calculateProcessingFee(){
        return amount > 1000 ? 15 : 0;
    }
}

class CheckoutSystem {
    static void main() {
        ArrayList<PaymentMethod> payments = new ArrayList<>();
        payments.add(new CreditCardPayment("#001", 500,
                "1234567890123456", "123"));
        payments.add(new DigitalWalletPayment("#002", 100,
                "123", 900));
        payments.add(new DigitalWalletPayment("#003", 1000,
                "456", 50));
        for(PaymentMethod payment : payments){
            payment.processTransaction();
        }
    }
}

//Task 3: Create the Test Class (CheckoutSystem)
//In the main method, create an array or ArrayList of PaymentMethod objects.
//Add at least three test cases:
//A valid CreditCardPayment.
//A valid DigitalWalletPayment (over 1000.00 to trigger the flat fee).
//An invalid payment (e.g., a DigitalWalletPayment with insufficient balance or a CreditCardPayment with a wrong CVV length).
//Loop through the list and call processTransaction() on each element.

