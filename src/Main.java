//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    private static boolean runNextGame(Scanner scan) {
        System.out.println("Попробуешь еще раз? (да/нет)");
        String answer = scan.nextLine().trim().toLowerCase();

        while (!answer.equals("да") && !answer.equals("нет")) {
            System.out.println("Пожалуйста, введите 'да' или 'нет':");
            answer = scan.nextLine().trim().toLowerCase();
        }

        return answer.equals("да");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("Введите первое число: ");
            int num1 = scan.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = scan.nextInt();
            System.out.println("Введите действие ( + , - , * , /)");
            scan.nextLine();
            String evictoin = scan.nextLine().trim();

            int res = 0;
            String operation = "";

            switch (evictoin) {
                case "+":
                    res = num1 + num2;
                    operation = "Сумма";
                    break;
                case "-":
                    res = num1 - num2;
                    operation = "Вычитание";
                    break;
                case "*":
                    res = num1 * num2;
                    operation = "Умножение";
                    break;
                case "/":
                    if (num2 != 0) {
                        res = num1 / num2;
                        operation = "Деление";
                    } else {
                        System.out.println("Делить на 0 нельзя!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Неизвестное действие!");
                    continue;
            }

            System.out.println(operation + " равно: " + res);
            run = runNextGame(scan);
        }

        System.out.println("Спасибо за использование калькулятора!");
    }
}