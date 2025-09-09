public class Laba1 {
    public static void main(String[] args) {
        System.out.println("Задание 1: Перебор чисел");
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("Задание 2: Реверс ");
        String str = "make install";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

        System.out.println("Задание 3: Уравнение (x^2 - 3x + 2 = 0)");
        double a = 1.0, b = -3.0, c = 2.0; // Для уравнения x^2 - 3x + 2 = 0.
        double discriminant = b * b - 4 * a * c;
		System.out.println("Дискриминант равен b * b - 4 * a * c = " + discriminant);
        
        if (discriminant >= 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("нет вещественных корней");
        }

        System.out.println("Задание 4: Сумма ряда");
        double sum = 0.0;
        int n = 2;
        double term;
        
        do {
            term = 1.0 / (n * n + n - 2);
            sum += term;
            n++;
        } while (term >= 1e-6);
        
        System.out.println("Сумма ряда: " + sum);

        System.out.println("Задание 5: Палиндром");
        String palindrome = "create";
        boolean isPalindrome = true;
        
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println("Строка \"" + palindrome + "\" " + (isPalindrome ? "является палиндромом" : "не является палиндромом"));
	//Не работает, если есть пробелы, проверет только слово. Со строками сложность.
   }
}