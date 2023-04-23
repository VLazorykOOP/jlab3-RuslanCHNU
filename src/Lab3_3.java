//Лабораторна робота 3
//Завдання 3

interface Root {
   void computeRoots();
   void printRoots();
}

class Linear implements Root {
   private double a, b;

   public Linear(double a, double b) {
      this.a = a;
      this.b = b;
   }

   @Override
   public void computeRoots() {
      double x = -b/a;
      System.out.println("Root: " + x);
   }

   @Override
   public void printRoots() {
      System.out.println("Linear equation roots:");
      computeRoots();
   }
}

class Square implements Root {
   private double a, b, c;

   public Square(double a, double b, double c) {
      this.a = a;
      this.b = b;
      this.c = c;
   }

   @Override
   public void computeRoots() {
      double delta = b * b - 4 * a * c;
      if (delta < 0) {
         System.out.println("No real roots.");
      } else if (delta == 0) {
         double x = -b / (2 * a);
         System.out.println("Root: " + x);
      } else {
         double x1 = (-b + Math.sqrt(delta)) / (2 * a);
         double x2 = (-b - Math.sqrt(delta)) / (2 * a);
         System.out.println("Roots: " + x1 + ", " + x2);
      }
   }

   @Override
   public void printRoots() {
      System.out.println("Quadratic equation roots:");
      computeRoots();
   }
}

public class Lab3_3{
public static void main(String[] args) {
   Root[] equations = new Root[2];
   equations[0] = new Linear(2, 1);
   equations[1] = new Square(1, -5, 6);

   for (Root eq : equations) {
      eq.printRoots();
   }
}}

