double weight = 0.0;
        double height = 0.0;
        double BMI = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        height = input.nextDouble();

        BMI = (weight * 0.45359237) / Math.pow(height * 0.0254, 2);

        System.out.println("BMI is: " + BMI);