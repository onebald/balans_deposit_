import java.util.Scanner;

/**
 * зтолаіьлуаь ілаьлі літаіш
 */
public class serednieAryfm {
    public static void main(String[] args) {
       //вклад 100, %20
        double vklad = 0, balance = 0, vidsotok = 0.2, termin = 0;
        Scanner skan = new Scanner(System.in);
        System.out.println("Введіть суму Вашого вкладу: ");
        vklad = skan.nextInt();
        System.out.println("Введіть термін Вашого депозиту: ");
        termin = skan.nextInt();
        for (int rik = 1; rik <= termin; rik++) {
            balance = vklad * Math.pow((1 + vidsotok),rik);
            System.out.println("Баланс на кінець " + rik + " року становить: " + balance);
        }
        System.out.println("Цілковитий баланс протягом " + (int)termin + " років становить: " + balance);

    }

}
