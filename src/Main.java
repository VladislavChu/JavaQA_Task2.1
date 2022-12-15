import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Чтобы рассчитать кол-во начисленных баллов, введите, пожалуйста, стоимость вашего билета: ");
        Scanner scan = new Scanner(System.in);
        int cost = scan.nextInt();
        int bonus = cost / 20;
        System.out.println("Вам будет начисленно " + bonus + " баллa(ов).");

    }
}
