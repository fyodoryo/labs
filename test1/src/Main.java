import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Бабаев Фёдор");
        two();
        summa();
        radius();
    }


    public static void two() {
        System.out.println("Второе задание");
        int value1 = 54; //переменная 1
        int value2 = 20; //переменная 2
        System.out.println(value1 - value2); // Замените ??? на недостающую часть программы
    }
    public static void radius() {
        System.out.println("Четвёртое задание");
        Scanner scan = new Scanner(System.in);
        System.out.println("radius=");
        double r = scan.nextDouble();
        double pi = 3.14;
        space(r, pi);
        length(r, pi);
    }

    public static void space(double r, double pi) {
        double result = pi * (r * r);
        System.out.println("S = " + result);
    }

    public static void length(double r, double pi) {
        double result = 2 * pi * r;
        System.out.println("L = " + result);
    }
    public static void summa() {
        System.out.println("Третье задание");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int value1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int value2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int value3 = scanner.nextInt();
        summ(value1, value2, value3);
    }

    public static int summ(int value1, int value2, int value3) {
        int result = value1 + value2 + value3;
        System.out.println(value1 + "+" + value2 + "+" + value3 + "=" + result);
        return result;
    }
}