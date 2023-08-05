public class Account {

    private static int nextId =9000;
    private int accountId;
    private int customerId;
    private double balance;
    private AccountType accountType;


    public Account() {
    }

    public Account(int customerId, AccountType accountType) {
        this.accountId = ++nextId;
        this.customerId = customerId;
        this.accountType = accountType;
    }


    public int getAccountId() {
        return accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }


    public void depositToAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " TL, hesabınıza başarıyla aktarıldı.");
            System.out.println("Güncel Bakiye: " + balance + " TL");
        } else {
            System.out.println("Yatırılacak tutar sıfırdan büyük olmalıdır! Tekrar Deneyiniz...");
        }
    }

    public void withdrawToAmount(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(amount + " TL hesabınızdan başarıyla çekildi.");
                System.out.println("Güncel Bakiye: " + balance);
            } else {
                System.out.println(amount + " TL tutarı için, yetersiz bakiye!");
                System.out.println("Güncel Bakiye: " + balance);
            }
        } else {
            System.out.println("Çekilecek tutar sıfırdan büyük olmalıdır! Tekrar Deneyiniz...");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", customerId=" + customerId +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }
}
