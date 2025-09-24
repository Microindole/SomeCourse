package learn.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets; // 明确指定字符集是一个好习惯
import java.util.Scanner; // 导入 Scanner

public class ReplaceText {
    public static void main(String[] args) {
        // 检查命令行参数数量是否正确
        if (args.length != 3) {
            System.out.println("使用方法: java learn.test.ReplaceText <文件名> <要替换的旧字符串> <新的替换字符串>");
            System.out.println("例如: java learn.test.ReplaceText myFile.txt \"old text\" \"new text\"");
            System.exit(1); // 参数错误，退出程序
        }

        String fileName = args[0];
        String oldString = args[1];
        String newString = args[2];

        Path filePath = Paths.get(fileName);

        try {
            // 检查文件是否存在
            if (!Files.exists(filePath)) {
                System.err.println("错误: 文件 '" + fileName + "' 未找到。");
                System.exit(1);
            }

            // 检查文件是否可读写
            if (!Files.isReadable(filePath)) {
                System.err.println("错误: 文件 '" + fileName + "' 不可读。");
                System.exit(1);
            }
            if (!Files.isWritable(filePath)) {
                System.err.println("错误: 文件 '" + fileName + "' 不可写。");
                System.exit(1);
            }

            // 使用 StringBuilder 来构建新的文件内容
            StringBuilder newContentBuilder = new StringBuilder();

            // 使用 Scanner 逐行读取文件
            // try-with-resources 确保 Scanner 在使用完毕后自动关闭
            try (Scanner scanner = new Scanner(filePath, StandardCharsets.UTF_8)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    // 对每一行执行替换操作
                    String modifiedLine = line.replace(oldString, newString);
                    newContentBuilder.append(modifiedLine);
                    // 如果不是最后一行，则添加换行符 (Scanner.nextLine() 会消耗换行符)
                    if (scanner.hasNextLine()) {
                        newContentBuilder.append(System.lineSeparator());
                    }
                }
            } // Scanner 会在这里自动关闭

            // 获取最终的替换后内容
            String finalNewContent = newContentBuilder.toString();

            // 将修改后的内容写回文件
            Files.writeString(filePath, finalNewContent, StandardCharsets.UTF_8);

            System.out.println("文件 '" + fileName + "' 中的所有 \"" + oldString + "\" 已成功替换为 \"" + newString + "\"。");

        } catch (IOException e) {
            System.err.println("处理文件时发生错误: " + e.getMessage());
            e.printStackTrace();
        }
    }
}