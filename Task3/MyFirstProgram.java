class MyFirstClass {
    public static void main(String[] s) {
        // Создаем объект с числами 5 и 3
        MySecondClass o = new MySecondClass(5, 3);
        System.out.println(o.getMinimum());

        // Двойной цикл для таблицы
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setFirstNumber(i);    // Устанавливаем первое число
                o.setSecondNumber(j);   // Устанавливаем второе число
                System.out.print(o.getMinimum());  // Выводим минимум
                System.out.print(" ");
            }
            System.out.println();  // Переход на новую строку
        }
    }
}

class MySecondClass {
    private int firstNumber;
    private int secondNumber;

    // Конструктор
    public MySecondClass(int first, int second) {
        this.firstNumber = first;
        this.secondNumber = second;
    }

    // Геттеры
    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    // Сеттеры
    public void setFirstNumber(int value) {
        this.firstNumber = value;
    }

    public void setSecondNumber(int value) {
        this.secondNumber = value;
    }

    // Метод для нахождения минимума
    public int getMinimum() {
        if (firstNumber < secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}