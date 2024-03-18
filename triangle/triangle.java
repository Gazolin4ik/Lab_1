public class triangle {
    // Метод main для демонстрации
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        double s = (a + b + c) / 2;
        System.out.println("Периметр треугольника: " + (a + b + c));
        System.out.println("Площадь треугольника: " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
        System.out.println("Треугольник равнобедренный: " + (a == b || a == c || b == c));
    }
}