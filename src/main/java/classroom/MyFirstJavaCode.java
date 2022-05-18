package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {
        // One line coment

        /*
        Multi line coment

         */

        // nyte data type
        byte floorCount = 7;
                System.out.println("My house has " + floorCount + " floors");
        System.out.printf("My house has %d floors/n", floorCount);

        short salaryInEuros = 1000;
        System.out.println(salaryInEuros);
        System.out.println(1200);

        System.out.printf("Average salary for Junior QA Engineer is %d\n" , salaryInEuros);

        int chinaPopulation = 100000000;
        long currentWorldPopulation = 12000;
                System.out.printf("Current world population: %d people. In meanwhile china population: %d people\n" , currentWorldPopulation, chinaPopulation);
//floating numbers
        float myCurrencyWeight = 70.6f;
        System.out.printf("myCurrentWeight");

        double gasPriceInEur = 1.83445d;
        System.out.printf("gasPriceInEuros");

        // Primitive text (char)
        char firstLettersOfMyName = 'N';

        // Non-primitive String
        String myName = "Nikita";
        System.out.println(myName);

        String mySentence = "Hello, my name is Nikita. I am 27 years old";
        String mySecondSentence = "I live in Riga";
        System.out.println(mySentence);
        System.out.println(mySentence + mySecondSentence);
        System.out.println(mySentence + "" + mySecondSentence);
        System.out.printf("% %s\n", mySentence, mySecondSentence);

        // boolean
        // is / has
        // isSummer , hasItems

        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);

        if(isSummer) {
            System.out.println("Yes, it is summer");
        } else {
            System.out.println("No, it is not summer");
        }

        // Arithmetic operators + - / *
        int a = 10;
        int b = 20;
        int c = a + b;
System.out.println(c);
int x = b + 15;
System.out.println(x);

System.out.println(7 + 7); // 14
        System.out.println("7" + 7); // 77
        System.out.println("7" + "7"); // 77

        boolean isAGreaterThanB = a > b; // 10 > 20
        boolean isAGreaterThanB = a < b; // 10 > 20

        boolean isTrue = a != b;
        System.out.println(isTrue);






    }
}
