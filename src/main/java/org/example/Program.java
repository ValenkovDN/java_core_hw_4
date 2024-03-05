package org.example;
import java.util.Scanner;
public class Program {


    public static void main(String[] args) {
        try {
            bank();
        }
        catch (MyIllegalArgumentException e){
            System.out.println(e);
        }
        catch (MyInsufficientFundsException e){
            System.out.println(e);
        }
    }

    static void bank()throws MyIllegalArgumentException, MyInsufficientFundsException{
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Добро пожаловать в наш банк!");
        System.out.println("Укажите начальный баланс счета: ");
        Bank_account bankAccount = new Bank_account(in.nextInt());
        if (bankAccount.getAccount() < 0){
            throw new MyIllegalArgumentException("Попытка создать счет с отрицательным начальным балансом.", bankAccount.getAccount());
        }



        while (n != 3){
            System.out.println(bankAccount.toString());
            System.out.println();
            System.out.println("Выберите операцию: \n" +
                    "1 - внести деньги на счет. \n" +
                    "2 - снять деньги со счета. \n" +
                    "3 - завершить все операции.");

            n = in.nextInt();
            if (n == 1){
                System.out.println("Укажите сумму, которую хотите внести на счет: ");
                int debit = in.nextInt();
                if (debit < 0){
                    throw new MyIllegalArgumentException("Депозит не может быть отрицательным.", debit);
                }
                bankAccount.increase(debit);
                System.out.println();
            }
            if (n == 2){
                System.out.println("Укажите сумму, которую хотите снять со счета: ");
                bankAccount.removed(in.nextInt());
                if (bankAccount.getAccount() < 0){
                    throw new MyIllegalArgumentException("У вас недостаточно средств", bankAccount.getAccount());
                }
                System.out.println();
            }
        }

        System.out.println("Спасибо, что воспользовались услугами нашего банка!");
    }
}