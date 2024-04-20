import figuras.Circle;
import figuras.Square;
import figuras.triangle;

import java.util.Scanner;

public class ShapeCalculator {

    public static <Shape> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccionar propiedad a calcular:");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.print("Opción: ");

            int propertyChoice = scanner.nextInt();

            System.out.println("Seleccionar la figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            System.out.print("Opción: ");

            int shapeChoice = scanner.nextInt();

            Shape shape;
            double result;

            switch (shapeChoice) {
                case 1:
                    System.out.print("Radio del círculo: ");
                    double radius = scanner.nextDouble();
                    shape = (Shape) new Circle(radius);
                    break;
                case 2:
                    System.out.print("Base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Altura del triángulo: ");
                    double height = scanner.nextDouble();
                    shape =(Shape) new triangle(base, height);
                    break;
                case 3:
                    System.out.print("Lado del cuadrado: ");
                    double sideLength = scanner.nextDouble();
                    shape =(Shape) new Square(sideLength);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            if (propertyChoice == 1) {
                result = shape.getClass().getModifiers();
            } else result = shape.getClass().getModifiers();

            System.out.println("Resultado: " + result);

            System.out.print("¿Desea realizar otro cálculo? (s/n): ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}