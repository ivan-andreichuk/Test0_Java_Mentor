package Test_0;

public class Roman {
    public static java.lang.Number Number1;
    public static java.lang.Number Number2;

    public static void PrintResult(int number1, char sign, int number2) {

        switch (sign) {
            case '+':

                System.out.println(Roman.getDesytki(number1 + number2)+Roman.getEdinici(number1 + number2));
                break;
            case '-':
                if (number1 - number2<0){
                    System.out.print("-");
                }
                System.out.println(Roman.getDesytki(Math.abs(number1 - number2))+Roman.getEdinici(Math.abs(number1 - number2)));
                break;
            case '*':
                System.out.println(Roman.getDesytki(number1 * number2)+Roman.getEdinici(number1 * number2));

                break;
            case '/':
                System.out.println(Roman.getDesytki(number1 / number2)+Roman.getEdinici(number1 / number2));

                break;
            default:

        }

    }

    public static int ParseInt(String strNumber) {
         int n;
            switch (strNumber) {
                case "I":
                    n = 1;
                    break;
                case "II":
                    n = 2;
                break;
                case "III":
                    n = 3;
                break;
                case "IV":
                    n = 4;
                break;
                case "V":
                    n = 5;
                break;
                case "VI":
                    n = 6;
                break;
                case "VII":
                    n = 7;
                break;
                case "VIII":
                    n = 8;
                break;
                case "IX":
                    n = 9;
                break;
                case "X":
                    n = 10;
                break;
                default:
                throw new NumberFormatException("NumberFormatExp");
            }
        return n;
    }

    public static String getRomanFromArabic(int n){
        return getDesytki(n)+getEdinici(n);
    }
    public static String getDesytki(int n){
        String desytki="";
        if (n>100) {
            System.out.println("Результат арифметического действия > 100");
            System.exit(-2);
        }
        if (n/10 > 0){
            switch (n/10){
                case 1:
                    desytki="X";
                    break;
                case 2:
                    desytki="XX";
                    break;
                case 3:
                    desytki="XXX";
                    break;
                case 4:
                    desytki="XL";
                    break;
                case 5:
                    desytki="L";
                    break;
                case 6:
                    desytki="LX";
                    break;
                case 7:
                    desytki="LXX";
                    break;
                case 8:
                    desytki="LXXX";
                    break;
                case 9:
                    desytki="XC";
                    break;
            }
        }
        return desytki;
    }
    public static String getEdinici(int n){
        String edinici="";
        if (n>100) {
            System.out.println("Результат арифметического действия > 100");
            System.exit(-2);
        }
        if (n%10 > 0){
            switch (n%10){
                case 1:
                    edinici="I";
                    break;
                case 2:
                    edinici="II";
                    break;
                case 3:
                    edinici="III";
                    break;
                case 4:
                    edinici="IV";
                    break;
                case 5:
                    edinici="V";
                    break;
                case 6:
                    edinici="VI";
                    break;
                case 7:
                    edinici="VII";
                    break;
                case 8:
                    edinici="VIII";
                    break;
                case 9:
                    edinici="IX";
                    break;
            }
        }
        return edinici;
    }
}

