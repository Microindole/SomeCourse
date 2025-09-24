import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    //非终结符集
    static List<String> noTerminal = new ArrayList<>();
    //终结符集
    static List<String> terminal = new ArrayList<>();
    //语法规则存储
    static String[][] grammarRules;
    //消除左递归后语法规则存储
    static String[][] grammar_rules;
    static String[][] newGrammer;
    //文法开始符号
    static String init;
    //FIRST集
    static String[][] firstSet;
    //FOLLOW集
    static String[][] followSet;
    //LL(1)分析表
    static int[][] analysis;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //读入非终结符
        //System.out.println("请输入非终结符: ");
        String noTer = new String("ETF");
        for (int i = 0; i < noTer.length(); i++){
            noTerminal.add(String.valueOf(noTer.charAt(i)));
        }
        //读入终结符
        terminal.add("#");
        //System.out.println("请输入终结符: ");
        String ter = new String("+*()i");
        for (int i = 0; i < ter.length(); i++){
            terminal.add(String.valueOf(ter.charAt(i)));
        }
        //初始化
        grammarRules = new String[noTer.length()][2];
        grammar_rules = new String[noTer.length() * 2][2];
        newGrammer = new String[noTerminal.size() * 5][3];
        //输入语法规则
        //System.out.println("请输入语法规则：");
        String grammar = new String("E->E+T|T");
        init = String.valueOf(grammar.charAt(0));
        divide(grammar);
        eliminate(grammar);

        String grammar1 = new String("T->T*F|F");
        divide(grammar1);
        eliminate(grammar1);

        String grammar2 = new String("F->(E)|i");
        divide(grammar2);
        eliminate(grammar2);
        //请输入测试用例
        System.out.println("请输入测试用例：");
        String test = input.nextLine();
        //输出信息
        System.out.println("------------------基本信息-----------------------");
        System.out.println("产生式：");
        output(grammarRules);
        System.out.println("终结符：");
        for (int i = 0; i < terminal.size(); i++){
            System.out.print(terminal.get(i) + "     ");
        }
        System.out.println();
        System.out.println("非终结符：");
        for (int i = 0; i < noTerminal.size(); i++){
            System.out.print(noTerminal.get(i) + "     ");
        }
        System.out.println();
        System.out.println("读取测试：");
        System.out.println(test);
        System.out.println("-------------------消除左递归---------------------");
        System.out.println("产生式：");
        output(grammar_rules);
        System.out.println("----------------FIRST集和FOLLOW集-----------------");
        firstSet = new String[noTerminal.size()][terminal.size()];
        for (int i = 0; i < noTerminal.size(); i++){
            first(noTerminal.get(i));
            System.out.print("FIRST(" + noTerminal.get(i) + ") = " );
            for (int j = 0; j < terminal.size(); j++){
                if (firstSet[i][j] != null){
                    System.out.print(firstSet[i][j] + " ");
                }
            }
            System.out.println();
        }
        followSet = new String[noTerminal.size()][terminal.size()];
        for (int i = 0; i < noTerminal.size(); i++){
            follow(noTerminal.get(i));
            System.out.print("FOLLOW(" + noTerminal.get(i) + ") = ");
            for (int j = 0; j < terminal.size(); j++){
                if (followSet[i][j] != null){
                    System.out.print(followSet[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------LL(1)分析表-----------------");
        analysis = new int[noTerminal.size()][terminal.size()];
        table();
        System.out.print("      ");
        for (int i = 0; i < terminal.size(); i++){
            System.out.print(terminal.get(i) + "     ");
        }
        System.out.println();
        for (int i = 0; i < noTerminal.size(); i++){
            System.out.print(noTerminal.get(i) + "     ");
            for (int j = 0; j < terminal.size(); j++){
                if (analysis[i][j] != 0) {
                    System.out.print(analysis[i][j] + "     ");
                }else{
                    System.out.print("      ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------分析栈-------------------");
        System.out.println(String.format("%-10s","分析栈") + String.format("%-10s","剩余字符串"));
        analysisStack(test);
    }

    /********Beign********/
    /*** 划分出产生式*/
    static void divide(String grammar){
        int st=grammar.indexOf("|");
        int flag=grammar.indexOf(">");
        String str=String.valueOf(grammar.charAt(0));
        grammarRules[noTerminal.indexOf(str)][0]=grammar.substring(flag+1,st);
        grammarRules[noTerminal.indexOf(str)][1]=grammar.substring(st+1);
    }
    /********End********/

    /********Beign********/
    /*** 消除左递归*/
    static void eliminate(String grammar){
        int st=grammar.indexOf("|");
        int flag=grammar.indexOf(">");
        if(grammar.charAt(0)==grammar.charAt(flag+1)){
            String str=String.valueOf(Character.toLowerCase(grammar.charAt(0)));
            noTerminal.add(str);
            if(!terminal.contains("-")){
                terminal.add("-");
            }
            String s="";
            for(int i=flag;i<grammar.length();i++){
                s=String.valueOf(grammar.charAt(i));
                flag=terminal.indexOf(s);
                if(flag!=-1){
                    flag=grammar.indexOf(s);
                    break;
                }
            }
            s=s+grammar.substring(flag+1,st)+str;
            grammar_rules[noTerminal.indexOf(str)][0]=s;
            grammar_rules[noTerminal.indexOf(str)][1]="-";
            grammar_rules[noTerminal.indexOf(String.valueOf(grammar.charAt(0)))][0]=grammar.substring(st+1)+str;
        }else{
            grammar_rules[noTerminal.indexOf(String.valueOf(grammar.charAt(0)))][0]=grammarRules[noTerminal.indexOf(String.valueOf(grammar.charAt(0)))][0];
            grammar_rules[noTerminal.indexOf(String.valueOf(grammar.charAt(0)))][1]=grammarRules[noTerminal.indexOf(String.valueOf(grammar.charAt(0)))][1];
        }
    }
    /********End********/

    /*** 输出产生式*/
    static void output(String[][] array){
        int k = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] != null) {
                    newGrammer[k][0] = String.valueOf(k+1);
                    newGrammer[k][1] = noTerminal.get(i);
                    newGrammer[k][2] = array[i][j];
                    System.out.println(newGrammer[k][0] + "     " + newGrammer[k][1] + "     " + newGrammer[k][2]);
                    k++;
                }
            }
        }
    }

    /********Beign********/
    /*** 计算FIRST集*/
    static void first(String noTer){
        int flag=noTerminal.indexOf(noTer);
        for(int i=0;i<2;i++){
            if(grammar_rules[flag][i]!=null){
                String str=grammar_rules[flag][i];
                String s=String.valueOf(str.charAt(0));
                if(noTerminal.contains(s)){
                    first(s);
                    for(int j=0;j<terminal.size();j++){
                        int t=noTerminal.indexOf(s);
                        if(firstSet[t][j]!=null){
                            firstSet[flag][j]=firstSet[t][j];
                        }
                    }
                }else{
                    firstSet[flag][terminal.indexOf(s)]=String.valueOf(str.charAt(0));
                }
            }
        }
    }
    /********End********/

    /********Beign********/
    /*** 计算follow集*/
    static void follow(String noTer){
        for(int i=0;i<noTerminal.size();i++){
            for(int j=0;j<2;j++){
                if(grammar_rules[i][j]!=null){
                    String str=grammar_rules[i][j];
                    if(noTer.equals(init)){
                        followSet[noTerminal.indexOf(init)][terminal.indexOf("#")]="#";
                    }
                    int index=str.indexOf(noTer);
                    if(index!=-1&&index!=str.length()-1){
                        String ch=String.valueOf(str.charAt(index+1));
                        if(noTerminal.contains(ch)){
                            for(int k=0;k<terminal.size();k++){
                                if(firstSet[noTerminal.indexOf(ch)][k]!=null&&!firstSet[noTerminal.indexOf(ch)][k].equals("-")){
                                    followSet[noTerminal.indexOf(noTer)][k]=firstSet[noTerminal.indexOf(ch)][k];
                                    for(int l=0;l<terminal.size();l++){
                                        if(followSet[i][l]!=null){
                                            followSet[noTerminal.indexOf(noTer)][l]=followSet[i][l];
                                        }
                                    }
                                }
                            }
                        }else{
                            followSet[noTerminal.indexOf(noTer)][terminal.indexOf(ch)]=ch;
                        }
                    }else if(index>0&&index==str.length()-1){
                        if(!noTerminal.get(i).equals(noTer)){
                            follow(noTerminal.get(i));
                            for(int k=0;k<terminal.size();k++){
                                if(followSet[i][k]!=null){
                                    followSet[noTerminal.indexOf(noTer)][k]=followSet[i][k];
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    /********End********/

    /********Beign********/
    /*** 构建LL(1)分析表*/
    static void table(){
        int index=0;
        for(int i=0;i<noTerminal.size();i++){
            int num=0,t=0;
            int []flag=new int[terminal.size()];
            for(int j=index;j<newGrammer.length;j++){
                if(newGrammer[index][1].equals(newGrammer[j][1])){
                    flag[t]=Integer.valueOf(newGrammer[j][0]);
                    num++;
                    t++;
                }
            }
            index+=num;
            if(num==1){
                for(int j=0;j<firstSet[i].length;j++){
                    if(firstSet[i][j]!=null){
                        analysis[i][j]=flag[0];
                    }
                }
            }else{
                t=0;
                for(int j =0;j<firstSet[i].length;j++){
                    if(firstSet[i][j]!=null){
                        if(!firstSet[i][j].equals("-")){
                            analysis[i][j]=flag[t];
                            t++;
                        }else{
                            for(int k=0;k<followSet[i].length;k++){
                                if(followSet[i][k]!=null){
                                    analysis[i][k]=flag[t];
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    /********End********/

    /*** 输出分析栈*/
    static void analysisStack(String test){
        List<String> stack = new ArrayList<>();
        stack.add("#");
        stack.add("E");
        String outStack = test + "#";
        boolean flag = true;
        while (flag){
            String inStack = "";
            for (int i = 0; i < stack.size(); i++){
                inStack = inStack + stack.get(i);
            }
            System.out.println(String.format("%-10s",inStack) + String.format("%-10s",outStack));
            String NT = stack.get(stack.size()-1);
            String T = String.valueOf(outStack.charAt(0));
            if (NT.equals(T) && NT.equals("#")){
                System.out.println("分析成功");
                break;
            } else if (NT.equals(T)){
                stack.remove(stack.size()-1);
                outStack = outStack.substring(1);
            } else {
                if (analysis[noTerminal.indexOf(NT)][terminal.indexOf(T)] > 0){
                    int num = analysis[noTerminal.indexOf(NT)][terminal.indexOf(T)];
                    String s = newGrammer[num-1][2];
                    stack.remove(stack.size()-1);
                    for (int i = s.length()-1; i >= 0; i--){
                        if (!s.equals("-")) {
                            stack.add(String.valueOf(s.charAt(i)));
                        }
                    }
                }else {
                    System.out.println("ERROR: 分析出错");
                }
            }
        }
    }
}