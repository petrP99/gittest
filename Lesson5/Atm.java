package Lesson5;

/**
 * Создать класс, описывающий банкомат.
 * <p>
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 10, 20 и 50.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма. Сначала банкомат
 * будет пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10 (не нужно рассматривать более сложные
 * варианты выдачи наличных, чтобы не усложнять алгоритм).
 */
public class Atm {
    private final int NOMINAL10 = 10;
    private final int NOMINAL20 = 20;
    private final int NOMINAL50 = 50;
    private int balance = 0;
    private int countBanknote10 = 0;
    private int countBanknote20 = 0;
    private int countBanknote50 = 0;


    void addCash(int addCash) {

        balance += addCash;
        int tempCash = 0; /* переменная для хранения внесенных денег в методе,
             при распределния по купюрам в каждом цикле */

        int currentCountBanknote50 = addCash / NOMINAL50; //переменная количества купюр в методе
        if (currentCountBanknote50 > 0) {
            countBanknote50 = countBanknote50 + currentCountBanknote50;
        }
        tempCash = addCash - currentCountBanknote50 * NOMINAL50;


        int currentCountBanknote20 = tempCash / NOMINAL20; //переменная количества купюр в методе
        if (currentCountBanknote20 > 0) {
            countBanknote20 = countBanknote20 + currentCountBanknote20;
        }
        tempCash = tempCash - currentCountBanknote20 * NOMINAL20;


        int currentCountBanknote10 = tempCash / NOMINAL10; //переменная количества купюр в методе
        if (currentCountBanknote10 > 0) {
            countBanknote10 = countBanknote10 + currentCountBanknote10;
        }
        tempCash = tempCash - currentCountBanknote10 * NOMINAL10;

        System.out.println("Пополнение прошло успешно!");

    }

    boolean withdrawCash(int drawCash) {

        if (drawCash > balance || drawCash % 10 != 0) {
            System.out.println("Сумма для снятия превышает баланс, либо не кратна 10!" + "\n");
            return false;

        } else {

            int tempCash = 0; /* переменная для хранения остатка внесенных денег в методе,
             после распределния по купюрам в каждом цикле */

            int currentCountBanknote50 = drawCash / NOMINAL50; //переменная количества купюр в методе
            if (currentCountBanknote50 > 0 && currentCountBanknote50 <= countBanknote50) {
                countBanknote50 = countBanknote50 - currentCountBanknote50;
            }
            tempCash = drawCash - currentCountBanknote50 * NOMINAL50;


            int currentCountBanknote20 = tempCash / NOMINAL20; //переменная количества купюр в методе
            if (currentCountBanknote20 > 0) {
                if (currentCountBanknote20 <= countBanknote20) {
                    countBanknote20 = countBanknote20 - currentCountBanknote20;
                }
                currentCountBanknote20 = 0;
            }
            tempCash = tempCash - currentCountBanknote20 * NOMINAL20;


            int currentCountBanknote10 = tempCash / NOMINAL10; //переменная количества купюр в методе
            if (currentCountBanknote10 > 0) {
                if (currentCountBanknote10 <= countBanknote10) {
                    countBanknote10 = countBanknote10 - currentCountBanknote10;
                }
                currentCountBanknote10 = 0;
            }
            tempCash = tempCash - currentCountBanknote10 * NOMINAL10;


            if (tempCash != 0) {
                System.out.println("Операция не успешна");
                countBanknote10 = countBanknote10 + currentCountBanknote10;
                countBanknote20 = countBanknote20 + currentCountBanknote20;
                countBanknote50 = countBanknote50 + currentCountBanknote50;
                return false;
            }
            balance -= drawCash;
            System.out.println("Операция успешна");
            return true;
        }
    }


    void printInfo() {
        System.out.println("Баланс: " + getBalance());
        System.out.println("Количество купюр в банкомате номиналом 50: " + getCountBanknote50());
        System.out.println("Количество купюр в банкомате номиналом 20: " + getCountBanknote20());
        System.out.println("Количество купюр в банкомате номиналом 10: " + getCountBanknote10() + "\n");
    }

    public int getCountBanknote10() {
        return countBanknote10;
    }

    public void setCountBanknote10(int countBanknote10) {
        this.countBanknote10 = countBanknote10;
    }

    public int getCountBanknote20() {
        return countBanknote20;
    }

    public void setCountBanknote20(int countBanknote20) {
        this.countBanknote20 = countBanknote20;
    }

    public int getCountBanknote50() {
        return countBanknote50;
    }

    public void setCountBanknote50(int countBanknote50) {
        this.countBanknote50 = countBanknote50;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}