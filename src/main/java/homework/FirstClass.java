package homework;

import java.io.PrintStream;

public class FirstClass {
    public static void main(String[] args) {

        String countryName = "Sweden";
        System.out.println("Country name\t" + countryName);
        System.out.printf(countryName);

        String countryPopulation = "10402070";
        System.out.println("Population\t" + countryPopulation);
        System.out.printf(countryPopulation);

        String countryArea = "450295";
        System.out.println("Area" + countryArea);
        System.out.printf(countryArea);

        String countryCapital = "Stockholm";
        System.out.println("Capital\t" + countryCapital);
        System.out.printf(countryCapital);

        String countryLanguage = "Swedish";
       System.out.println("Language\t" + countryLanguage);
        System.out.printf(countryLanguage);

        String europeanUnion = "Yes";
        System.out.println("European Union member\t" + europeanUnion);
        System.out.printf(europeanUnion);

        String countryCurrency ="kr";
       System.out.println("Currency\t" + countryCurrency);
        System.out.printf(countryCurrency);

        // Es nevaru atrast, lai string nepārietu nākamajā rindā pie nākamā piemēra
// pie iedzivotaju skaita, es liku int, bet pati sistema lika likt string
        String mySentence = "Hello, my name is Edgars. I am 31 years old";
        String mySecondSentence = "I live in Riga";
        String myThirdSentence = "My hobby is basketball";
        String myFourthSentence = "I like traveling and exploring new places";
        System.out.println(mySentence);
        System.out.println(mySentence + mySecondSentence);
        System.out.println(mySentence + "" + mySecondSentence);
        System.out.println(mySentence + "" + mySecondSentence + "" + myThirdSentence);
        System.out.println(mySentence + "" + mySecondSentence + "" + myThirdSentence + "" + myFourthSentence);
        PrintStream printf = System.out.printf("", mySentence, mySecondSentence, myThirdSentence, myFourthSentence);
        //+


        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        int x = b + 15;
        System.out.println(x);

        int n = 2;
        int k = 6;
        int j = n + k;
        System.out.println(j);
        int t = k + 3;
        System.out.println(t);

        int s = 10;
        int z = 20;
        int l = s + z;
        System.out.println(l);
        int q = z + 15;
        System.out.println(q);

// -
        int w = 9;
        int r = 8;
        int u = w - r;
        System.out.println(u);
        int y = w - 6 ;
        System.out.println(y);

        int g = 5;
        int Z = 3;
        int S = g - Z;
        System.out.println(S);
        int H = Z - 1 ;
        System.out.println(H);

        int Q = 2;
        int R = 2;
        int M = Q - R;
        System.out.println(M);
        int X = R - 1 ;
        System.out.println(X);

        // *

        int C = 2;
        int V = 2;
        int B = C * V;
        System.out.println(B);
        int L = C * 1 ;
        System.out.println(L);

        int K = 7;
        int G = 6;
        int F = K * G;
        System.out.println(F);
        int D = K * 13 ;
        System.out.println(D);

        // /

        int P = 7;
        int I = 6;
        int T = P / I;
        System.out.println(T);
        int E = I / 3 ;
        System.out.println(E);
    }






}
