import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(parse(text));
    }
    public static String parse(String text) throws Exception {
        int num1;
        int num2;
        boolean trueOrFalse;
        String oper;
        String result;
        String[] massive = text.split("[+\\-*/]"); //Поделить на одном из этих вырожении

        if (massive.length != 2) throw new Exception("Должно быть 2 операнда");
        oper = operation(text);
        if (Roman.isRoman(massive[0]) && Roman.isRoman(massive[1])){
            num1 = Roman.convertArabian(massive[0]);
            num2 = Roman.convertArabian(massive[1]);
            trueOrFalse = true;
        } else if (!Roman.isRoman(massive[0]) && !Roman.isRoman(massive[1])) {
            num1 = Integer.parseInt(massive[0]);
            num2 = Integer.parseInt(massive[1]);
            trueOrFalse = false;
        }
        else throw new Exception("Не правильный формат");

        if(num1 >= 11 || num2 >= 11){
            throw new Exception("Числа должны быть от 1 до 10");
        }
        int arabian = Roman.calc(num1,num2, oper);
        if (trueOrFalse){
            if (arabian <= 0){
                throw new Exception("Римское число должно быть больше нуля");
            }
            result = Roman.convertToArabian(arabian);
        }
        else {
            result = String.valueOf(arabian);
        }
        return result;
    }
    public static String operation(String text){
        if (text.contains("+")) return "+";
        else if (text.contains("-")) return "-";
        else if (text.contains("*")) return "*";
        else if (text.contains("/")) return "/";
        else return null;
    }
}
