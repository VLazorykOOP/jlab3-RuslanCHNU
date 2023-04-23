//Лабораторна робота 3
//Завдання 2

abstract class Root {
    protected double[] roots;
    public abstract void computeRoots();
    public void printRoots() {
        if (roots != null) {
            for (double root : roots) {
                System.out.println(root);
            }
        }
    }
}

class Linear extends Root {
    private double a;
    private double b;
    public Linear(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void computeRoots() {
        if (a != 0) {
            roots = new double[1];
            roots[0] = -b / a;
        }
    }
    @Override
    public String toString() {
        return "Лінійне рівняння: " + a + "x + " + b + " = 0";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Linear) {
            Linear other = (Linear) obj;
            return a == other.a && b == other.b;
        }
        return false;
    }
}

class Square extends Root {
    private double a;
    private double b;
    private double c;
    public Square(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void computeRoots() {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(d)) / (2 * a);
            roots[1] = (-b - Math.sqrt(d)) / (2 * a);
        } else if (d == 0) {
            roots = new double[1];
            roots[0] = -b / (2 * a);
        }
    }
    @Override
    public String toString() {
        return "Квадратне рівняння: " + a + "x^2 + " + b + "x + " + c + " = 0";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square other = (Square) obj;
            return a == other.a && b == other.b && c == other.c;
        }
        return false;
    }
}

public class Lab3_2 {
    public static void main(String[] args) {
        Root[] equations = new Root[2];
        equations[0] = new Linear(2, 3);
        equations[1] = new Square(1, 5, 6);
        for (Root equation : equations) {
            System.out.println(equation.toString());
            equation.computeRoots();
            equation.printRoots();
            System.out.println();
        }
    }
}
