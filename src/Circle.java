

    public class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        public double getRadius() {
            return radius;
        }

        public static void main(String[] args) {
            Circle circle1 = new Circle(5);
            Circle circle2 = new Circle(10);

            System.out.println("Circle 1 Properties:");
            System.out.println("Radius: " + circle1.getRadius());
            System.out.println("Area: " + circle1.getArea());
            System.out.println("Perimeter: " + circle1.getPerimeter());

            System.out.println("\nCircle 2 Properties:");
        }
    }