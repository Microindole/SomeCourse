package learn.ex2025.ex7;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PasswordCheck {

    public static boolean isValid(String password){
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digitalValid = false;
        boolean specialSymbol = false;
        boolean repeat3char = false;
        List<String> ezPassword = Arrays.asList("password", "123456", "abcdefg","abc123","111111");
        boolean isValid = true;
        if(password.length() < 10){
            System.out.println("密码长度至少10个字符");
            isValid = false;
        }
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                lowerCase = true;
            } else if (Character.isUpperCase(c)) {
                upperCase = true;
            }else if(Character.isDigit(c)){
                digitalValid = true;
            }else if("!@#$%^&*".contains(String.valueOf(c))){
                specialSymbol = true;
            }
        }
        if(!upperCase){
            System.out.println("密码必须包含至少一个大写字母");
            isValid = false;
        }if(!lowerCase){
            System.out.println("密码必须包含至少一个小写字母");
            isValid = false;
        }if(!digitalValid){
            System.out.println("密码必须包含至少一个数字");
            isValid = false;
        }if(!specialSymbol){
            System.out.println("密码知识包含一个特殊字符");
            isValid = false;
        }if (password.matches(".*(.)\\1{2,}.*")) {
            System.out.println("密码不能包含连续三个相同的字符");
            isValid = false;
        }if(ezPassword.contains(password)){
            System.out.println("该密码是常见的简单密码");
            isValid =false;
        }

        return isValid;
    }

    public static void main(String[] args) {
        System.out.println("请输入密码：");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean result = isValid(password);
        if(result){
            System.out.println("Valid Password");
        }

    }
}
