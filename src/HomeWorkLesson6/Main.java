//Создать класс CreditCard с полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке. Напишите программу, которая создает три объекта
//класса CreditCard у которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.

package HomeWorkLesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CreditCard CreditCardFirst = new CreditCard("9112 0000 0123 1234", 25170000);
        CreditCard CreditCardSecond = new CreditCard("4112 0000 0016 0012", 150000);
        CreditCard CreditCardThird = new CreditCard("4220 1234 0123 0300", 90000000);
        System.out.println("Cards Info:");
        CreditCardFirst.displayInfoCurrentAmounts();
        CreditCardSecond.displayInfoCurrentAmounts();
        CreditCardThird.displayInfoCurrentAmounts();
        System.out.println(" "); // для разделения сток

        Scanner scan;
        System.out.println("Enter the amount to top up to your 9112 0000 0123 1234 account:");
        scan = new Scanner(System.in);
        double amountFirstCreditCard = scan.nextInt();
        CreditCardFirst.cashReplenishment((int) amountFirstCreditCard);

        System.out.println(" "); // для разделения сток
        System.out.println("Enter the amount to top up to your 9112 0000 0123 1234 account:");
        scan = new Scanner(System.in);
        int amountSecondCreditCard = scan.nextInt();
        CreditCardSecond.cashReplenishment(amountSecondCreditCard);

        System.out.println(" "); // для разделения сток
        System.out.println("Enter the amount to withdraw from your 9112 0000 0123 1234 account:");
        scan = new Scanner(System.in);
        int amountThirdCreditCard = scan.nextInt();
        CreditCardThird.cahsWithdrawal(amountThirdCreditCard);

        System.out.println(" "); // для разделения сток
        System.out.println("Updated Cards Info:");
        CreditCardFirst.displayInfo();
        CreditCardSecond.displayInfo();
        CreditCardThird.displayInfo();
    }
}
