package learn.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ex1 {
    /*
     * 1表示关键字
     * 2表示标识符
     * 3表示常数
     * 4表示运算符
     * 5表示界符
     * 6表示字符串
     * */

    //关键字
    static String []keyWord={"private","protected","public","abstract","class","extends","final","implements",
            "interface","native","new","static","strictfp","break","continue","return","do","while","if","else","for",
            "instanceof","switch","case","default","boolean","byte","char","double","float","int","long","short",
            "String","null","true","false","void","this","goto"};
    //运算符
    static String []operation={"+","-","*","/","%","++","--","-=","*=","/=","&","|","^","~","<<",">>",">>>","==","!=",
            ">","<","=",">=","<=","&&","||","!","."};
    //界符
    static String []symbol={",",";",":","(",")","{","}"};
    static ArrayList<String> keyWords=null;
    static ArrayList<String> operations=null;
    static ArrayList<String> symbols=null;

    //指向当前所读到字符串的位置的指针
    static int p,lines;

    public static void main(String []args) throws FileNotFoundException {
        init();
        File file=new File("input.txt");
        lines=1;
        try(Scanner input=new Scanner(file)) {
            while (input.hasNextLine()){
                String str=input.nextLine();
                analyze(str);
                lines++;
            }
        }

    }

    //初始化把数组转换为ArrayList
    public static void init(){
        keyWords=new ArrayList<>();
        operations=new ArrayList<>();
        symbols=new ArrayList<>();
        Collections.addAll(keyWords, keyWord);
        Collections.addAll(operations, operation);
        Collections.addAll(symbols, symbol);
    }

    public static void analyze(String str){
        p=0;
        char ch;
        str=str.trim();
        for (;p<str.length();p++){
            ch=str.charAt(p);
            if (Character.isDigit(ch)){//数字
                digitCheck(str);
            }else if (Character.isLetter(ch)||ch=='_'){//标识符、关键字
                letterCheck(str);
            }else if (ch=='"'){
                stringCheck(str);
            }
            else if (ch==' '){
                continue;
            }else {
                symbolCheck(str);
            }
        }
    }
    /********Beign********/
    /*数字的识别*/
    public static void digitCheck(String str){
        StringBuilder token= new StringBuilder(String.valueOf(str.charAt(p++)));
        char ch;
        for(;p < str.length(); p++){
            ch = str.charAt(p);
            if(Character.isDigit(ch)){
                token.append(ch);
            }
            else {
                break;
            }
        }
        p--;
        System.out.println("(" + 3 + "," + token + ")");
    }
    /********End********/

    /********Beign********/
    //标识符、关键字的识别
    public static void letterCheck(String str){
        StringBuilder token= new StringBuilder(String.valueOf(str.charAt(p++)));
        char ch;
        for(;p < str.length(); p++){
            ch = str.charAt(p);
            if(Character.isLetter(ch)||ch=='_'){
                token.append(ch);
            }
            else {
                break;
            }
        }
        p--;
        //此时的token中为一个完整的字符串
        if(keyWords.contains(token.toString())){//如果是一个关键字
            System.out.println("(" + 1 + "," + token + ")");
        }
        else {//是标识符
            System.out.println("(" + 2 + "," + token + ")");
        }
    }
    /********End********/

    /********Beign********/
    //符号的识别
    public static void symbolCheck(String str){//界限符号和运算符
        StringBuilder token= new StringBuilder(String.valueOf(str.charAt(p++)));
        if(symbols.contains(token.toString())){//如果是界限符号
            p--;
            System.out.println("(" + 5 + "," + token + ")");
        }
        else {//是运算符
            char ch;
            for(;p < str.length(); p++){
                ch = str.charAt(p);
                if(ch == ' ' || Character.isLetter(ch) || symbols.contains(String.valueOf(ch)) || Character.isDigit(ch)){
                    break;
                }
                else{
                    token.append(ch);
                }
            }
            p--;
            if(operations.contains(token.toString())){
                System.out.println("(" + 4 + "," + token  + ")");
            }else{
                for(int i = 0; i < token.length(); i++){
                    System.out.println(lines +"line: " + token.toString().charAt(i) + " is wrong");
                }
            }
        }
    }
    /********End********/

    //字符串检查
    public static void stringCheck(String str){
        StringBuilder token= new StringBuilder(String.valueOf(str.charAt(p++)));
        char ch;
        for (;p<str.length();p++){
            ch=str.charAt(p);
            token.append(ch);
            if (ch=='"'){
                break;
            }
        }
        if (token.charAt(token.length()-1)!='"'){
            System.out.println(lines+"line"+": "+token+" is wrong");
        }else {
            System.out.println("("+6+","+token+")");
        }
    }
}

