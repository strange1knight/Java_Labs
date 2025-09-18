import java.util.Scanner;

public class Laba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 1: Треугольник");
        System.out.println("Введите через пробел три длины отрезков:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Это треугольник");
        } else {
            System.out.println("Это не треугольник");
        }

        System.out.println("Задание 2: Длина отрезка");
        System.out.println("Введите через пробел координаты двух точек (x1 y1 x2 y2):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        System.out.println("Расстояние: " + distance);

        scanner.close();
    }
}
