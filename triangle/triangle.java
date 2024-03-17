public class triangle {
    private double a; // Длина стороны a
    private double b; // Длина стороны b
    private double c; // Длина стороны c

    // Конструктор
    public triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Метод для вычисления периметра
    public double getPerimeter() {
        return a + b + c;
    }

    // Метод для вычисления площади по формуле Герона
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Метод для проверки на равнобедренность
    public boolean isIsosceles() {
        return a == b || a == c || b == c;
    }

    // Геттеры и сеттеры (при необходимости)
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Метод main для демонстрации
    public static void main(String[] args) {
        triangle triangle = new triangle(3, 4, 5);
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Треугольник равнобедренный: " + triangle.isIsosceles());
    }
}