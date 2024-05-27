import java.util.Random;

public class TestCalculator {
    public static void main(String[] args) {

        System.out.println("Test generise 10 random matematicka izraza sa jednom operatorom");
        for (int i=0; i<=10; i++) {
            System.out.println(testExpression());
        }
    }

    public static String testExpression (){
        float ExpectedResults;
        char operator = randomSymbol();
        Random rd = new Random(); // creating Random object

        // rd.nextInt(max - min) + min;
        // radi lakseg pracenja testa uzimamo opsege izmedju -1000 : 1000
        float a = (float) (rd.nextInt(2001) - 1000);
        float b = (float) rd.nextInt(1000) ;
        if (operator == '/' && b== 0) {
            while (b==0){b = (float) rd.nextInt(1000) ;}
        }

//        System.out.println("prvi broj je: " + a);
//        System.out.println("drugi broj je: " + b);
        
        // za date  brojeve i maticki operator izracunavamo vrednost izraza
        ExpectedResults = expectedResults(a, b, operator);
        
        // dati matematicki izraz pretvaramo u string
        String Expression = Float.toString(a) +operator + Float.toString(b);
        
        return (comparation(ExpectedResults, Expression));

    }
    public static char randomSymbol(){
        // Definišemo niz sa simbolima
        char[] symbols = {'+', '-', '*', '/'};

        // Generišemo nasumični broj između 0 i dužine niza
        int randomIndex = (int) (Math.random() * symbols.length);

        // Dobijamo simbol na nasumično odabranom indeksu
        return (symbols[randomIndex]);
    }

    // metoda za izracunavanje matematickog izraza
    public static float expectedResults(float a, float b, char op){
        switch(op) {
            case '+':
                return (a+b);
            case '-':
                return (a-b);
            case '*':
                return (a*b);
            case '/':
                return (a/b);
            default:
                System.out.println("operator je lose definisan");
        }
        return (1);
    }
    public static String comparation(float ExpRes, String Expr){

        // Ocekivanu vrednost izraza konvertujemo u string
        String ExpectedResultExpression = Float.toString(ExpRes);
        
        // prosledjujemo matematicki izraz u obliku stringa Calculatoru koji se testira
        String actualResult = Calculator.Run(Expr);

//        System.out.println("izracunata vrednost izraza je " + ExpectedResultExpression);
//        System.out.println("dobijena vrednost izraza je " + actualResult);

        return (ExpectedResultExpression.equals(actualResult) ? 
                "Test za matematicki izraz " + Expr + "=" + actualResult +" je PROSAO" :
                "Test za matematicki izraz" + Expr + " je PAO");
    }

}