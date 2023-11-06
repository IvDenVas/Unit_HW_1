package task1;
public class Calculator {
    private int a;
    private int b;

    public Calculator() {

    }

    public double calculateDiscount(int a, int b) {
        if ( a <= 0) throw new ArithmeticException("Стоимость не может быть отрицательной и нулевой!");
        else {
            if(b < 0 || b > 90 ) throw new ArithmeticException("Размер скидки в диапазоне 0 - 90 %");
        }
        return (double) a * (100 - b) / 100;
    }
}
