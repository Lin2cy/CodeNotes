package abstrac;

/**
 * @author jlzhang7@iflytek.com
 * @Description
 * @Date Created in 14:17 2018/1/23
 */

abstract class A{
    public void fun(){
        System.out.println("fun");
    }

    abstract void print();

}

public class AbstractTest extends A{

    @Override
    void print() {
        System.out.println("printAbst");
    }

    public static void main(String[] args){
        A a = new AbstractTest();
        a.print();
    }
}
