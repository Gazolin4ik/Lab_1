public class rectangle {
    double width;
    double height;

    public rectangle(double a, double b) { // конструктор, проверка на корректность даных
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Длина стороны прямоугольника не может быть отрицательной!");
        }
        this.width = a;
        this.height = b;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    } // периметр

    public double getArea() {
        return a * b;
    } // площадь 

    public double getLenDiagonal() { // длина диагонали
        return Math.sqrt(a * a + b * b);
    } 
}
