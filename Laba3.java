import java.util.ArrayList;

public class Laba3 {
    // Задание 1: Класс кнопки Button
    static class Button {
        private int count = 0;

        public void click() {
            count++;
            System.out.println("Button was clicked " + count + " times");
        }
    }

    // Задание 2: Класс весов Balance
    static class Balance {
        private int leftWeight = 0;
        private int rightWeight = 0;

        public void addLeft(int w) {
            leftWeight += w;
        }

        public void addRight(int w) {
            rightWeight += w;
        }

        public void result() {
            if (leftWeight == rightWeight) {
                System.out.println("=");
            } else if (leftWeight > rightWeight) {
                System.out.println("L");
            } else {
                System.out.println("R");
            }
        }
    }

    // Задание 3: Класс звонка Bell
    static class Bell {
        private boolean dingTurn = true;

        public void sound() {
            if (dingTurn) {
                System.out.println("ding");
            } else {
                System.out.println("dong");
            }
            dingTurn = !dingTurn;
        }
    }

    // Задание 4: Класс для разделения чисел на четные и нечетные
    static class OddEvenSeparator {
        private final ArrayList<Integer> numbers = new ArrayList<>();

        public void addNumber(int n) {
            numbers.add(n);
        }

        public void even() {
            System.out.print("Четные числа: ");
            for (int n : numbers) {
                if (n % 2 == 0) System.out.print(n + " ");
            }
            System.out.println();
        }

        public void odd() {
            System.out.print("Нечетные числа: ");
            for (int n : numbers) {
                if (n % 2 != 0) System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    // Задание 5: Класс двумерной таблицы
    static class Table {
        private final int[][] data;
        private final int rows;
        private final int cols;

        public Table(int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
            data = new int[rows][cols];
        }

        public int getValue(int row, int col) {
            return data[row][col];
        }

        public void setValue(int row, int col, int value) {
            data[row][col] = value;
        }

        public int rows() {
            return rows;
        }

        public int cols() {
            return cols;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sb.append(data[i][j]).append(" ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }

        public double average() {
            int sum = 0;
            int count = rows * cols;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum += data[i][j];
                }
            }
            return (double) sum / count;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1: Button");
        Button button = new Button();
        button.click();
        button.click();
        button.click();

        System.out.println("Задание 2: Balance");
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(15);
        balance.result();
        balance.addLeft(10);
        balance.result();

        System.out.println("Задание 3: Bell");
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();

        System.out.println("Задание 4: OddEvenSeparator");
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(5);
        separator.addNumber(10);
        separator.addNumber(7);
        separator.addNumber(8);
        separator.even();
        separator.odd();

        System.out.println("Задание 5: Table");
        Table table = new Table(3, 3);
        table.setValue(0, 0, 1);
        table.setValue(1, 1, 2);
        table.setValue(2, 2, 3);
        System.out.println("Таблица:");
        System.out.println(table.toString());
        System.out.println("Среднее значение: " + table.average());
    }
}
