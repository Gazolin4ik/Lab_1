public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Функция вычисления периметра
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Функция вычисления площади
    public double calculateArea() {
        return width * height;
    }

    // Функция вычисления длины диагонали
    public double calculateDiagonal() {
        return Math.sqrt(width * width + height * height);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Длина диагонали прямоугольника: " + rectangle.calculateDiagonal());
    }
}
