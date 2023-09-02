import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int population = 10000000;
        int born = 14;
        int death = 8;
        int dif = born - death;
        for (int i = 1; i <= 10; i++) {
            population += population * dif / 1000;
        }
        System.out.println(population + "\n");


        int population2 = 10000000;
        int born2 = 14;
        int death2 = 8;
        for (int i = 1; i <= 10; i++) {
            if (born2 > 7) born2 -= 1;
            if (death2 > 6) death2 -= 1;
            population2 += population2 * (born2 - death2) / 1000;
        }
        System.out.println(population2 + "\n");


        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float sum = in.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int period = in.nextInt();

        for (int i = 1; i <= period; i++) {
            sum += sum * 0.07;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period, sum);


        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float sum2 = in2.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int period2 = in2.nextInt();
        int i = period2;

        while (i > 0) {
            sum2 += sum2 * 0.07;
            i--;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period2, sum2);
        in2.close();


        for (int i2 = 1; i2 < 10; i2++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d\t", i2 * j);
            }
            System.out.println();
        }

    }
}