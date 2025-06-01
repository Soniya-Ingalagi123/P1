public class Bank_Transaction {
    String account_name;
    String accountholder_name;
    String account_type;
    long account_number;
    double balance;

    public Bank_Transaction(String account_name, String accountholder_name, String account_type,
                            long account_number, double balance) {
        this.account_name = account_name;
        this.accountholder_name = accountholder_name;
        this.account_type = account_type;
        this.account_number = account_number;
        this.balance = balance;
    }

    public void displayTransaction() {
        System.out.println("Bank: " + account_name);
        System.out.println("Holder: " + accountholder_name);
        System.out.println("Type: " + account_type);
        System.out.println("Account No.: " + account_number);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank_Transaction txn = new Bank_Transaction("SBI", "Unnati", "Saving", 1234567890L, 10000);
        txn.displayTransaction();
    }
}
