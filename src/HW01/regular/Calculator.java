package HW01.regular;

/**
 * Класс, в котором прописаны 4 основных математических действия.
 */

public class Calculator {
    /**
     * Метод суммирует числа
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b;
     */
    public static int sumOfNumbers (int a, int b){
        return a + b;
    }
    /**
     * Метод вычитает числа
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b;
     */
    public static int subtractionOfNumbers (int a, int b) {
        return a - b;
    }

    /**
     * Метод умножает числа
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b;
     */
    public static int multiplicationOfNumbers (int a, int b) {
        return a * b;
    }

    /**
     * Метод делит числа
     * @param a делимое
     * @param b делитель
     * @return частное a и b;
     */
    public static int divisionOfNumbers (int a, int b) {
        return a / b;
    }

}
