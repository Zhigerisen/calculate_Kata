public class Roman {
    public static String[] roman = {
        "0" ,"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
    };
    public static boolean isRoman(String text){
        for (int i=0;i< roman.length;i++){
            if (text.equals(roman[i])){
                return true;
            }
        }
        return false;
    }
    public static int convertArabian(String text){
        //text равен : I ил IV
        //roman[1] == 1;
        for (int i=0;i<roman.length;i++){
            if (text.equals(roman[i])){
                return i;
            }
        }
        return 0;
        //нужно римские цифры: I, IV превратить в арабские цифры
    }
    public static String convertToArabian(int resultArabian){
        //text равен : 5
        //text нужно сделать : roman[5] == "V"
        for (int i=0;i<roman.length;i++){
            if (resultArabian == i){
                return roman[i];
            }
        }
        return null;
        //нужно римские цифры: I, IV превратить в арабские цифры
    }


    public static int calc(int num1, int num2, String oper){
        if (oper == "+"){
            int num = num1 + num2;
            return num;
        } else if (oper == "-") {
            int num = num1 - num2;
            return num;
        }
        else if (oper == "*") {
            int num = num1 * num2;
            return num;
        }
        else if (oper == "/") {
            int num = num1 / num2;
            return num;
        }
        return 0;
    }
}
