package Test_0;

public class InputLineToStrNumbers {

    public static char sign;
    public static String strNumber1="";
    public static String strNumber2="";


    public InputLineToStrNumbers(String inputLine) {
        char[] InputLineToArray = inputLine.toCharArray();
        int lengthInputLine=inputLine.length();

        for(int i=0;i<lengthInputLine;i++){
            if (Separator(InputLineToArray[i])){
                int j=i;
                while (InputLineToArray[j]==' ') j++;//проходим все пробелы
                sign=InputLineToArray[j];//берем знак
                j++;
                while (InputLineToArray[j]==' ') j++;//проходим все пробелы

                for (;j<lengthInputLine;j++){
                    strNumber2+=InputLineToArray[j];//собираем второе число
                }
                break;//т.к. ервое число собрали
            }
            strNumber1 += InputLineToArray[i];//собираем первое число
        }

    }

    private static boolean Separator(char c){
        if (c==' ') return true;
        if (c=='+') return true;
        if (c=='-') return true;
        if (c=='*') return true;
        if (c=='/') return true;
        return false;
    }
}
