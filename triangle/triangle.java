public class triangle {
    // Метод main для демонстрации
    public static void main(String[] args) {
	
        double a = 3, b = 4, c = 5;
	// вычисление полупериметра 
        double s = (a + b + c) / 2;
	// вычисление периметра треугольника
        System.out.println("Периметр треугольника: " + (a + b + c));
	// вычисление площади треугольника 
        System.out.println("Площадь треугольника: " + Math.sqrt(s * (s - a) * (s - b) * (s - c))); 
	// проверка на равнобедренность
        System.out.println("Треугольник равнобедренный: " + (a == b || a == c || b == c)); 
    }
} 
