import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmethicOperation arithmethicOperation = new ArithmethicOperation();
        int number1 = arithmethicOperation.number1;
        int number2 = arithmethicOperation.number2;
        int point = 0;
        int resultOfAdd = number1 + number2;
        int resultOfSub = number1 - number2;
        int result3OfMul = number1 * number2;
        int resultOfDiv = number1 % number2;




        for (int calculator = 0; calculator <= 4; calculator = calculator + 1) {

            System.out.println(calculator + ". " + number1 + " + " + number2 + " = ");
            String answer = scanner.next();
            System.out.println("Ваш ответ: " + answer);
            System.out.println("Правильный ответ: " + resultOfAdd);

            if (answer.equals(resultOfAdd)) {
                point = point + 5;
                System.out.println("Поздравляю, вы заработали баллов: " + point);
                System.out.println("Общее количество баллов: " + point);

            } else if (answer.equals("exit")){
                System.out.println("Ура, опросник завершен! Ваше количество баллов: " + point);
                return;


            } else  {
                point = point - 5;
                System.out.println("К сожалению ваши баллы не прибавились.");
                System.out.println("Общее количество баллов: " + point );
            }

            System.out.println(calculator + ". " + number1 + " - " + number2 + " = ");
            String answer2 = scanner.next();
            System.out.println("Ваш ответ: " + answer2);
            System.out.println("Правильный ответ: " + resultOfSub);

            if (answer2.equals(resultOfSub)) {
                point = point + 5;
                System.out.println("Поздравляю, вы заработали +5 баллов");
                System.out.println("Общее количество баллов: " + point);

            } else if (answer2.equals("exit")){
                System.out.println("Ура, опросник завершен! Ваше количество баллов: " + point);
                return;

            } else {
                point = point - 5;
                System.out.println("К сожалению ваши баллы не прибавились.");
                System.out.println("Общее количество баллов: " + point );
            }

            System.out.println(calculator + ". " + number1 + " * " + number2 + " = ");
            String answer3 = scanner.next();
            System.out.println("Ваш ответ: " + answer3);
            System.out.println("Правильный ответ: " + result3OfMul);

            if (answer3.equals(result3OfMul)) {
                point = point + 5;
                System.out.println("Поздравляю, вы заработали баллов: " + point);
                System.out.println("Общее количество баллов: " + point);
            }  else if (answer3.equals("exit")){
                System.out.println("Ура, опросник завершен! Ваше количество баллов: " + point);
                return;

            } else {
                point = point - 5;
                System.out.println("К сожалению ваши баллы не прибавились.");
                System.out.println("Общее количество баллов: " + point);
            }

            System.out.println(calculator + ". " + number1 + " / " + number2 + " = ");
            String answer4 = scanner.next();
            System.out.println("Ваш ответ: " + answer4);
            System.out.println("Правильный ответ: " + resultOfDiv);

            if (answer4.equals(resultOfDiv)) {
                point = point + 5;
                System.out.println("Поздравляю, вы заработали баллов +5 баллов");
                System.out.println("Общее количество баллов: " + point);
            } else if (answer4.equals(resultOfDiv)) {
                System.out.println("Ура, опросник завершен! Ваше количество баллов: " + point);
                return;

            } else {
                point = point - 5;
                System.out.println("К сожалению ваши баллы не прибавились.");
                System.out.println("Общее количество баллов: " + point);
            }








        }
    }
}


