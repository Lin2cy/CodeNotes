package extend;

/**
 * @author jlzhang7@iflytek.com
 * @Description
 * @Date Created in 09:30 2018/1/23
 */

class Person{
     void eat(){
        System.out.println("Person.eat()");
    }
     void play(){
        System.out.println("Person.play()");
    }
}

public class TestMain extends Person{

     void eat(){
        System.out.println("main eat");
    }
     void play(){
        System.out.println("main play");
    }

    public  static void main(String[] args){
        Person person = new TestMain();
        person.eat();
    }

}

