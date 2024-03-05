package org.example;

public class Bank_account {
    private int account;


    public Bank_account(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    /**
     * Пополнение счета
     * @param debit сумма на которую пополняем счет
     * @return счет
     */
    public int increase(int debit){
        setAccount(account + debit);
        return getAccount();
    }

    /**
     * Снятие денег со счета
     * @param credit сумма снятия
     * @return
     */
    public int removed(int credit){
        setAccount(account - credit);
        return getAccount();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Текущий баланс счета " + getAccount();
    }
}
