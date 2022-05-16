package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {
        // One line cooment

        /*
        Multi line commnet

         */

        // nyte data type
        byte floorCount = 7;
                System.out.println("My house has " + floorCount + " floors");
        System.out.printf("My house has %d floors/n", floorCount);

        short salaryInEuros = 1000;
        System.out.println(salaryInEuros);
        System.out.println(1200);

        System.out.printf("Average salary for Junior QA Enfineer is %d\n" , salaryInEuros);

        int chinaPopulation = 100000000;
        long currentWorldPopulation = 12000;
                System.out.printf("Current world population: %d people. In meanwhile china population: %d people\n" , currentWorldPopulation, chinaPopulation);
//floating numbers
        float myCurrencyWeight = 70.6f;
        System.out.printf("myCurrentWeight");

        double gasPriceInEur = 1.83445d;
        System.out.printf("gasPriceInEuros");


    }
}
