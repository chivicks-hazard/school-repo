import java.util.Scanner;

public class EXII {
    public static void main(String[] args) {
        // EX. 1: Convert miles to kilometres
        /* double mile = 0.0;
        double kilometre = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        mile = input.nextDouble();
        kilometre = mile * 1.6;

        System.out.println(mile + " miles is equal to " + kilometre + " kilometres"); */

        // EX. 2: Area of eq. triangle & volume of eq. triangular prism
        /* double length = 0.0;
        double area = 0.0;
        double volume = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the sides and height of the equilateral triangle: ");
        length = input.nextDouble();

        area = (Math.sqrt(3.0) / 4) * length * length;
        volume = area * length;

        System.out.println("The area is: " + area);
        System.out.println("The volume of the triangular prism: " + volume); */

        // EX. 3: Convert meter to feet
        /* double meter = 0.0;
        double feet = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for meter: ");
        meter = input.nextDouble();

        feet = meter * 3.2786;
        System.out.println(meter + " metres is " + feet + " feet"); */

        // EX. 4: Convert sq. meter to ping
        /* double squareMeter = 0.0;
        double ping = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in square meters: ");
        squareMeter = input.nextDouble();

        ping = squareMeter * 0.3025;

        System.out.println(squareMeter + " square meters is " + ping + " pings"); */

        // EX. 5: Find the number of years from minutes
        /* int minutes = 0;
        int days = 0;
        int years = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        minutes = input.nextInt();

        years = (minutes - (minutes % (365 * 24 * 60))) / (365 * 24 * 60);
        
        int remainingMinutes = minutes % (365 * 24 * 60);
        days = (remainingMinutes - (remainingMinutes % (24 * 60))) / (24 * 60);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days."); */

        // EX. 5: Calculate acceleration
        /* double v0 = 0.0;
        double v1 = 0.0;
        double time = 0.0;
        double acceleration = 0.0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter v0: ");
        v0 = input.nextDouble();
        System.out.print("Enter v1: ");
        v1 = input.nextDouble();
        System.out.print("Enter time: ");
        time = input.nextDouble();

        acceleration = (v1 - v0) / time;

        System.out.println("The average acceleration is " + acceleration); */

        // EX. 6: Finding the runway length
        /* double speed = 0.0;
        double acceleration = 0.0;
        double runwayLength = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed: ");
        speed = input.nextDouble();
        System.out.print("Enter acceleration: ");
        acceleration = input.nextDouble();

        runwayLength = (speed * speed) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is: " + runwayLength); */

        // EX. 7: BMI calculator
        /* double weight = 0.0;
        double height = 0.0;
        double BMI = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        height = input.nextDouble();

        BMI = (weight * 0.45359237) / Math.pow(height * 0.0254, 2);

        System.out.println("BMI is: " + BMI); */

        // EX. 8: Distance of two points
        /* double x1;
        double x2;
        double y1;
        double y2;
        double distance;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        x1 = input.nextDouble();
        System.out.print("Enter x2: ");
        x2 = input.nextDouble();
        System.out.print("Enter y1: ");
        y1 = input.nextDouble();
        System.out.print("Enter y2: ");
        y2 = input.nextDouble();

        distance = Math.sqrt((Math.pow(x2 - x1, 2) - Math.pow(y2 - y1, 2)));

        System.out.println("The distance between the two points is: " + distance); */ // Result: NaN

        // EX. 9: Area of a hexagon
        /* double side;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        side = input.nextDouble();

        area = ((3 * Math.sqrt(3)) / 2) * (side * side);

        System.out.println("The area of the hexagon is " + area); */

        // EX. 10: Area of the triangle
        /* double x1;
        double x2;
        double x3;
        double y1;
        double y2;
        double y3;
        double side1;
        double side2;
        double side3;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coordinates of the three points separated by spaces");
        System.out.print("Enter x1: ");
        x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        y2 = input.nextDouble();
        System.out.print("Enter x3: ");
        x3 = input.nextDouble();
        System.out.print("Enter y3: ");
        y3 = input.nextDouble();

        side1 = Math.abs(Math.sqrt((Math.pow(x2 - x1, 2) - Math.pow(y2 - y1, 2))));
        side2 = Math.abs(Math.sqrt((Math.pow(x3 - x2, 2) - Math.pow(y3 - y2, 2))));
        side3 = Math.abs(Math.sqrt((Math.pow(x1 - x3, 2) - Math.pow(y1 - y3, 2))));

        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));

        System.out.println("The area of the triangle is: " + area); */ // Result: NaN

    }
}
