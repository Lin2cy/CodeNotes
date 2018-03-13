package println;

import java.io.PrintStream;

public class PrintLn {

    public static void main(String[] args){
        reloadPrintln();
        System.out.println("IN");
    }

    static void reloadPrintln(){
        System.setOut(new PrintStream(System.out){
            public void println(String s){
                super.println("在这里："+ s);
            }
        });
    }





}
