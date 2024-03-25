public class triangle {
    double side1;
    double side2;
    double side3;	

    public triangle(double a, double b, double c) { // конструктор, проверка на корректность даных
<<<<<<< HEAD:src/triangle/triangle.java
        if ((a <= 0 || b <= 0 || c <= 0) || (((a + b) <= c) || ((a + c) <= b) || ((c + b) <= a))) {
=======
        if ((a <= 0 || b <= 0 || c <= 0) || ((a + b <= c) || (a + c <= b) || (b + c <= a))) {
>>>>>>> zinin_vyacheslav:triangle/triangle.java
            throw new IllegalArgumentException("Стороны треугольника должны быть положительными");
        }
        this.side1 = a;
        this.side2 = b;
	this.side3 = c;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    } // периметр

    public double getArea() {
	double s = getPerimeter() / 2;
	return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    } // вычисление площади треугольника по формуле герона

    public boolean getCheckIsosceles() { // проверка на равнобедренность
        return side1 == side2 || side1 == side3 || side2 == side3;
    } 
}