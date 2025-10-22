import java.util.Random;
public class Tasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        float weightVelychko = 74;
        float marsDifference = 0.38f;
        float marsWeightVelychko;
        double marsWeightVelychkoDouble;
        int marsWeightVelychkoInt;
        char marsWeightVelychkoChar;
        int newInt;

        marsWeightVelychko = weightVelychko*marsDifference;
        System.out.println(marsWeightVelychko + " multiplication of two float number");

        marsWeightVelychkoDouble = (double)marsWeightVelychko;
        System.out.printf("%.4f convert float to double and round to 4 elements after dot%n", marsWeightVelychkoDouble);

        marsWeightVelychkoInt = (int)marsWeightVelychkoDouble;
        System.out.println(marsWeightVelychkoInt + " convert double to int");

        marsWeightVelychkoChar = (char)marsWeightVelychkoInt;
        System.out.println(marsWeightVelychkoChar + " convert int to char but unicode 28 is not writable");

        marsWeightVelychkoChar = (char) (marsWeightVelychkoChar*3);
        System.out.println(marsWeightVelychkoChar + " multiply above char by 3 and got 'T' because unicode of 84");

        newInt = (int)marsWeightVelychkoChar;
        System.out.println(newInt + " convert char to int and get 84");

    }

    static void task2(){
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Generates random number 1-100: " + randomNumber);

        if (randomNumber % 2 == 0) {
            System.out.println(randomNumber + " is enen");
        }
        else {
            System.out.println(randomNumber + " is odd");
        }
    }

    static void task3(){
        int amountOfBricks = 81;
        System.out.println("Lego bricks in total: " + amountOfBricks);

        int containerSize = 8;
        System.out.println("Each container size:  " + containerSize);

        int fullContainers = amountOfBricks / containerSize;
        System.out.println("Maximum amount of full containers: " + fullContainers);

        int remainingBricks = amountOfBricks % containerSize;
        System.out.println("Remaining bricks: " + remainingBricks);

        int totalContainers = fullContainers + (remainingBricks > 0 ? 1 : 0);
        System.out.println("In total containers: " + totalContainers);
    }

    static void task4(){
        double price = 9.99;
        double vat = 0.23;

        double grossPrice = price * (1 + vat);
        System.out.println("Gross price (double): " + grossPrice);

        double grossTotal = grossPrice * 10000;
        System.out.println("Total gross value (double): " + grossTotal);

        double totalNetPrice = grossTotal / (1 + vat);
        System.out.println("Total net value (double): " + totalNetPrice + "\n\n");


        java.math.BigDecimal priceBD = new java.math.BigDecimal("9.99");
        java.math.BigDecimal vatBD = new java.math.BigDecimal("0.23");

        java.math.BigDecimal grossPriceBD = priceBD.multiply(java.math.BigDecimal.ONE.add(vatBD));
        System.out.println("Gross price (BigDecimal): " + grossPriceBD);

        java.math.BigDecimal grossTotalBD = grossPriceBD.multiply(new java.math.BigDecimal("10000"));
        System.out.println("Total gross value (BigDecimal): " + grossTotalBD);

        java.math.BigDecimal totalNetBD = grossTotalBD.divide(java.math.BigDecimal.ONE.add(vatBD), 2, java.math.RoundingMode.HALF_UP);
        System.out.println("Total net value (BigDecimal): " + totalNetBD);

        System.out.println("\n\nDifference between double and BigDecimal total net: " + (totalNetPrice - totalNetBD.doubleValue()));
    }
}
