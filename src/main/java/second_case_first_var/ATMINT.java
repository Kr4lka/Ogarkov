package second_case_first_var;

public interface ATMINT {
    void insertCard(Card card);
    void ejectCard();
    boolean verifyPIN(int pin);
    void showUserInfo();
    double getCurrentBalance();
    void deposit(double amount);
    void withdraw(double amount);
}
