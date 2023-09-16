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
        int timeOfWork = 5; // количество отработанных месяцев
        int tratyFoodInMonth = 300; // траты на еду каждый месяц
        printInfo(currentZP,timeOfWork, tratyFoodInMonth);
    }
    private static void printInfo (int currentZP, int timeOfWork, int tratyFoodInMonth ) {
        int finalZP = 0;
//        double investProfit = 0;
        double invest = 0;
        for (int i = 1; i <= timeOfWork; i++) {
            if (i % 6 == 0) {
                currentZP = currentZP + 400; }
            finalZP = finalZP + currentZP;
            invest = (invest + (currentZP / 10))*1.02;
//            if (i % 12 == 0) {
//                invest = invest * 1.02;
////                investProfit = (double) ((finalZP - investProfit) / 10 ) * 0.02;

        }
        int toInvestDeposit = (int) (finalZP * 0.10);
        int tratyAllTime = (timeOfWork * tratyFoodInMonth) + toInvestDeposit;
        int finalDepo = finalZP - tratyAllTime;
        System.out.println("Vsego polucheno: " + finalZP);
        System.out.println("Vsego rashodov: " + tratyAllTime);
        System.out.println("Итоговый счет программиста: " + finalDepo);
        System.out.println("Итоговый инвест-счет: " + invest);
    }
}
