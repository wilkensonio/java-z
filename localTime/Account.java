package localTime; // package declaration

class Account {
    String owner;
    double balance;
    double minBalance; // minimum balance

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        double amt = 0; // amount to withdraw

        return amt; // return the amount withdrawn
    }
}