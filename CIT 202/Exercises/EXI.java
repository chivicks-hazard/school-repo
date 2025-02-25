public class EXI {
    public static void main(String[] args) {
        // EX. 1
        /* int a = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
            a += i;
        }

        System.out.println(a); */


        // EX. 2
        /* double PI = 0.0;

        for (int i = 3, count = 0; i <= 11; i = i + 2, count++) {
            
            System.out.println(count);
            
            if (count % 2 == 0 ) {
                PI = PI - (double)(1 / i);
                System.out.println("-1/" + i);
            } else {
                PI = PI + (double)(1 / i);
                System.out.println("1/" + i);
            }
        }

        System.out.println(PI); */

        // EX. 3
        /* double PI = 3.14159;
        double radius = 6.5;

        double perimeter = 2 * radius * PI;
        double area = radius * radius * PI;

        System.out.println("Perimeter: " + perimeter + "m");
        System.out.println("Area: " + area+ " sq. m"); */

        // EX .4
        /* double width = 5.3;
        double height = 8.6;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Perimeter: " + perimeter + "m");
        System.out.println("Area: " + area+ " sq. m"); */

        int distance = 24;
        int hour = 1;
        int minutes = 40;
        int seconds = 35;

        double totalTime = (double) hour + (minutes / 60.0) + (seconds / 3600.0);

        double speed = (distance * 1.6) / totalTime;

        System.out.println("The average speed of the runner is: " + speed + " km/h");
    }
}