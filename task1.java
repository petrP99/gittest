/*В переменной minutes лежит число от 0 до 59.
Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).

Протестировать функцию в main.*/
public class Task1 {
    public static void main(String[] args) {
    int minutes = 16;
    printOfPart(minutes);
    }
    private static void printOfPart (int value) {
        if (value <= 15 && value >0) System.out.println("1-я четверть часа");
        else if (value >= 16 && value <=30 ) System.out.println("2-я четверть часа");
        else if (value >= 31 && value <=45 ) System.out.println("3-я четверть часа");
        else if (value >= 46 && value <=59 ) System.out.println("4-я четверть часа");
    }
}