package Test_0;

public class Arabic {

    public static void PrintResult(int number1, char sign, int number2){
        switch (sign){
            case '+':
                System.out.println(number1+number2);
                break;
            case '-':
                System.out.println(number1-number2);
                break;
            case '*':
                System.out.println(number1*number2);
                break;
            case '/':
                try {
                    System.out.println(number1/number2);
                } catch (Exception e) {
                    System.out.println("DivByZero Exception: " + e.getMessage());
                    System.exit(-1);
                }

                break;
        }
    }
    public static Number getArabicNumberFromString(String strNumber){
        Number n = new Number();
        try{
            n.value = Integer.parseInt(strNumber);
            n.geographyNumber=true;
        }catch (NumberFormatException e){
            try {
                n.value=Roman.ParseInt(strNumber);
                n.geographyNumber=false;
            }catch (NumberFormatException e2){
                System.out.println("NumberFormatException: " + e.getMessage() + " "+e2.getMessage());
                System.exit(-1);
            }
        }
        return n;
    }
}
