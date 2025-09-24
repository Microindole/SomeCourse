package learn.ex2025.ex7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class CountNum {
    public static void countText(String filename){
        long charCount = 0;
        long wordCount = 0;
        long lineCount = 0;
        int longestLineLength = 0;
        long aTimes = 0, eTimes = 0, iTimes = 0, oTimes = 0, uTimes = 0;
        try(Scanner scanner = new Scanner(new File(filename))){
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;
                charCount += line.length();
                String[] words = line.split("[ \\t\\n]+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                    }
                }
                if (line.length() > longestLineLength) {
                    longestLineLength = line.length();
                }
                for(char c: line.toCharArray()){
                    switch (Character.toLowerCase(c)){
                        case 'a':
                            aTimes++;
                            break;
                        case 'e':
                            eTimes++;
                            break;
                        case 'i':
                            iTimes++;
                            break;
                        case 'o':
                            oTimes++;
                            break;
                        case 'u':
                            uTimes++;
                            break;
                    }
                }
            }
            System.out.println("文件名: " + filename);
            System.out.println("字符总数 (排除换行符和回车符): " + charCount);
            System.out.println("单词总数: " + wordCount);
            System.out.println("行数: " + lineCount);
            System.out.println("最长行的长度: " + longestLineLength);
            System.out.println("元音字母统计 (不区分大小写):");
            System.out.println("a: " + aTimes);
            System.out.println("e: " + eTimes);
            System.out.println("i: " + iTimes);
            System.out.println("o: " + oTimes);
            System.out.println("u: " + uTimes);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("请在命令行传入文件路径！");
            return;
        }
        String filename = args[0];
        countText(filename);
    }
}
