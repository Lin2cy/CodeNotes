package println;

import java.io.*;

public class ReloadPrintLnToFile {



    public static void main(String[] args){
        PrintStream ps = null;
        try {
            ps = new PrintStream("/Users/lincy/Desktop/log.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(ps);
        System.out.println("6666我写进来了！！！");
    }

}
