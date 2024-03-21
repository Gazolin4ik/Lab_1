public class rectangle { 
	public static void main(String[] args) { 
		double a = 10, b = 8;
		System.out.println("Периметр:" + (2 * a + 2 * b));
		System.out.println("Площадь:" + (a * b));
		System.out.println("Диагональ:" + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))));
	}
}