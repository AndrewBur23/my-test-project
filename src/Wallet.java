public class Wallet {
    String ownerName;
    double balance;

    public Wallet(String ownerName, double balance ) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amout) {
        balance += amout;
        System.out.println(ownerName + " пополнил счет на " + amout);
    }

    public void spend(double amout) {
        if (amout <= balance) {
            balance -= amout;
            System.out.println("Уплочено: " + amout + ". Осталось: " + balance);
        } else {
            System.out.println("Ошибка! Недостаточно средств.");
        }
    }

    public void showbalance() {
        System.out.println("Баланс пользователя " + ownerName + " : " + balance );
    }

    public static void main(String[] args) {
        Wallet myWallet = new Wallet("Алексей" , 5000);
        myWallet.showbalance();
        myWallet.deposit(23);
        myWallet.showbalance();
        myWallet.spend(7023);
        myWallet.spend(1000);
        myWallet.showbalance();
    }
}
