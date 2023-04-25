import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стоимость Вашего авиабилета:");
        int input = in.nextInt();
        int cf = 20;
        int res = input / cf;

        System.out.println("Количество Ваших милей: " + res);

    }
}
