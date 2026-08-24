public class Ledger {
    private String ledgerId;
    private long balance;

    public Ledger(String ledgerId, long balance) {
        this.ledgerId = ledgerId;
        this.balance = balance;
    }

    public String getLedgerId() {
        return ledgerId;
    }

    public long getBalance() {
        return balance;
    }
}