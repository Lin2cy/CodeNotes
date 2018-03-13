package test;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jlzhang7@iflytek.com
 * @Description
 * @Date Created in 15:37 2018/3/5
 */
public class Test {

    public static void main(String[] args){
        PrintStream out = System.out;
        PrintStream ps = null;
        try {
            ps = new PrintStream("/Users/lincy/Desktop/log.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(ps);
        System.out.println("年龄定义，初始值18");
        String sex = "女";
        System.out.println("性别定义，女");
        String info = "这是一个" + sex + "孩子" + "年龄为" + 11;
        System.out.println("整合了两个变量" + info);
        System.setOut(out);
        System.out.println("程序运行完毕");
    }

    static void exChange(int a, int b){
        System.setOut(new PrintStream(System.out){
            public void println(int s){
                super.println(100);
            }
        });
    }
}

