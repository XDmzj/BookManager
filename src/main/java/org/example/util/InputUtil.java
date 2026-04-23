package org.example.util;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputUtil {
    public static final Scanner scanner = new Scanner(System.in);

    public static int nextInt(String prompt){
        while(true){
            try {
                System.out.println(prompt);
                return scanner.nextInt();
            }catch (Exception e){
                System.err.println("请输入合法数字！");
                continue;
            }finally {
                scanner.nextLine();//nextInt尾部会有一个\n，不清理的话下一个循环会直接读取\n导致死循环
            }
        }

    }

    public static String nextLine(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();

    }
    //重载方法，处理需要限制输入的情况
    public static String nextLine(String prompt,String...Values){
        List<String> list = Arrays.asList(Values);
        while(true){
            System.out.println(prompt);
            String input = scanner.nextLine();
            if(list.contains(input)){
                return input;
            }
            System.err.println("你的输入不合法，请重新输入！");
        }
    }
}
