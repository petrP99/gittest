/*
Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
300$ в месяц Ваня тратит на еду и развлечения.
10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
* */
package CyclesTask;

public class Task3 {
    public static void main(String[] args) {

        int currentZP = 600; //текущая зп
        int timeOfWork = 15; // количество отработанных месяцев
        int tratyFoodInMonth = 300; // траты на еду каждый месяц
        printInfo(currentZP,timeOfWork, tratyFoodInMonth);
    }
    private static void printInfo (int currentZP, int timeOfWork, int tratyFoodInMonth ) {
        int finalZP = 0; // всего получено зарплаты
        double invest = 0; // инвест депозит
        for (int i = 1; i <= timeOfWork; i++) {
            if (i % 6 == 0) currentZP = currentZP + 400;   // текущая зп, увеличивается на 400 каждые 6 мес
            finalZP = finalZP + currentZP;
            invest = (invest + (currentZP / 10))*1.02;  // инвет счет, 10% от зп + 2% в месяц
        }
        
        int toInvestDeposit = (int) (finalZP * 0.10); // сколько было отчислено на депозит за все время
        int tratyAllTime = (timeOfWork * tratyFoodInMonth) + toInvestDeposit; //все траты
        int finalDepo = finalZP - tratyAllTime; // итоговый счет за вычетом трат
        
        System.out.println("Vsego polucheno: " + finalZP);
        System.out.println("Vsego rashodov: " + tratyAllTime);
        System.out.println("Итоговый счет программиста: " + finalDepo);
        System.out.println("Итоговый инвест-счет: " + invest);
    }
}
