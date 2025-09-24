package learn.ex2025.ex2;

import java.util.Scanner;

public class ex0201 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串，输入以\"#\"结束");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int [] letterArray = new int[26];
        for (int index = 0;index<str.length();index++){
            switch (str.charAt(index)){
                case 'a', 'A':
                    letterArray[0]++;
                    break;
                case 'b', 'B':
                    letterArray[1]++;
                    break;
                case 'c', 'C':
                    letterArray[2]++;
                    break;
                case 'd', 'D':
                    letterArray[3]++;
                    break;
                case 'e','E':
                    letterArray[4]++;
                    break;
                case 'f', 'F':
                    letterArray[5]++;
                    break;
                case 'g','G':
                    letterArray[6]++;
                    break;
                case 'h','H':
                    letterArray[7]++;
                    break;
                case 'i','I':
                    letterArray[8]++;
                    break;
                case 'j','J':
                    letterArray[9]++;
                    break;
                case 'k','K':
                    letterArray[10]++;
                    break;
                case 'l','L':
                    letterArray[11]++;
                    break;
                case 'm','M':
                    letterArray[12]++;
                    break;
                case 'n','N':
                    letterArray[13]++;
                    break;
                case 'o','O':
                    letterArray[14]++;
                    break;
                case 'p','P':
                    letterArray[15]++;
                    break;
                case 'q','Q':
                    letterArray[16]++;
                    break;
                case 'r','R':
                    letterArray[17]++;
                    break;
                case 's','S':
                    letterArray[18]++;
                    break;
                case 't','T':
                    letterArray[19]++;
                    break;
                case 'u','U':
                    letterArray[20]++;
                    break;
                case 'v','V':
                    letterArray[21]++;
                    break;
                case 'w','W':
                    letterArray[22]++;
                    break;
                case 'x','X':
                    letterArray[23]++;
                    break;
                case 'y','Y':
                    letterArray[24]++;
                    break;
                case 'z','Z':
                    letterArray[25]++;
                    break;
                default:
                    break;
            }
        }
        for (int i = 0;i<26;i++){
            if(letterArray[i] != 0){
                char thisLetter = (char)( 'A' + i);
                System.out.println(thisLetter+"出现"+letterArray[i]+"次");
            }
        }
    }
}
