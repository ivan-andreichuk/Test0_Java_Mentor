package Test_0;


public class InputLineToNumbers {

    public static Number Number1;
    public static Number Number2;

    public InputLineToNumbers(){

        Number1=Arabic.getArabicNumberFromString(InputLineToStrNumbers.strNumber1);
        Number2=Arabic.getArabicNumberFromString(InputLineToStrNumbers.strNumber2);
        try {
            if ((Number1.value<1)|(Number1.value>10)) throw new NumberFormatException("Число вне диапазона");
            if ((Number2.value<1)|(Number2.value>10)) throw new NumberFormatException("Число вне диапазона");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(-2);
        }
    }
}
