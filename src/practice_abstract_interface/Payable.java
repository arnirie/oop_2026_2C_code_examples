package practice_abstract_interface;

import java.util.ArrayList;

public interface Payable {
    String getTransactionId();
    double getAmount();
    boolean validatePayment();
    double calculateProcessingFee();

    default void processTransaction(){
        if(validatePayment()){
            double totalAmt = getAmount() + calculateProcessingFee();
            IO.println("Transaction ID: " + getTransactionId());
            IO.println("Amount: " + getAmount());
            IO.println("Processing Fee: " + calculateProcessingFee());
            IO.println("Total Amount: " + totalAmt);
        } else {
            IO.println("Transaction " + getTransactionId() + "FAILED: Invalid payment details");
        }
    }
}

class ICreditCardPayment implements Payable, Rewardable {
    private String transactionId, cardNumber, cvv;
    private double amount;

    public ICreditCardPayment(String transactionId, double amount, String cardNumber, String cvv) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.amount = amount;
    }

    @Override
    public String getTransactionId(){
        return this.transactionId;
    }

    @Override
    public double getAmount(){
        return this.amount;
    }

    @Override
    public boolean validatePayment(){
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    @Override
    public double calculateProcessingFee(){
        return amount * 0.025;
    }

//calculateRewardPoints(): Earns 1 point for every 100.00 spent (Math.floor(amount / 100.0)).
    @Override
    public double calculateRewardPoints(){
        return Math.floor(amount/100.0);
    }
}
class IDigitalWalletPayment implements Payable {
    private String transactionId;
    private double amount;
    private String walletId;
    private double walletBalance;

    public IDigitalWalletPayment(String transactionId, double amount, String walletId, double walletBalance) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.walletId = walletId;
        this.walletBalance = walletBalance;
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public double getAmount() {
        return amount;
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

class ICheckoutSystem {
    static void main() {
        ArrayList<Payable> payments = new ArrayList<>();
        payments.add(new ICreditCardPayment("#001", 500,
                "1234567890123456", "123"));
        payments.add(new IDigitalWalletPayment("#002", 100,
                "123", 900));
        payments.add(new IDigitalWalletPayment("#003", 1000,
                "456", 50));
        for(Payable payment : payments){
            payment.processTransaction();
            if(payment instanceof Rewardable p){
                IO.println("Reward Points: " + p.calculateRewardPoints());
            }
            //casting -> Rewardable
        }
    }
}

/*

ipconfig /release
ipconfig /renew

 */