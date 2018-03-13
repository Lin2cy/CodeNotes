package deepCopy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeepCopy {

    /**
     *上图将list A浅拷贝给list B，由于进行的是浅拷贝，所以直接将A的内容复制给了B，java中相同内容的数组指向同一地址，
     * 即进行浅拷贝后A与B指向同一地址。造成的后果就是，改变B的同时也会改变A，因为改变B就是改变B所指向地址的内容，
     * 由于A也指向同一地址，所以A与B一起改变。
     *
     *
     *
     * 深拷贝就是将A复制给B的同时，给B创建新的地址，再将地址A的内容传递到地址B。ListA与ListB内容一致，但是由于所指向的
     * 地址不同，所以改变相互不受影响。
     */

    /**
     * 浅拷贝模块
     */
    public List<Object> forLoop(){
        /**
         * 方法一
         */
        List<Object> srcList = new ArrayList<>();
//        List<Object> destList = new ArrayList<>(srcList.size());
//        for(Object obj:srcList){
//            destList.add(obj);
//        }

        /**
         * 方法二
         */
//        List<Object> destList=new ArrayList<Object>(srcList);

        /**
         * 方法三
         */
        List<Object> destList=new ArrayList<Object>();
        destList.addAll(srcList);

        /**
         * 方法四
         */
//        Person[] srcPersons=srcList.toArray(new Person[0]);
//        Person[] destPersons=new Person[srcPersons.length];
//        System.arraycopy(srcPersons, 0, destPersons, 0, srcPersons.length);

        return destList;
    }

    /**
     * 深拷贝模块
     */
    public static <T> List<T> deepCopy(List<T> src) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        out.writeObject(src);

        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(byteIn);
        @SuppressWarnings("unchecked")
        List<T> dest = (List<T>) in.readObject();
        return dest;
    }
//调用方法
//    List<Person> destList=deepCopy(srcList);  //调用该方法



    public class A implements Cloneable {
        public String name[];

        public A(){
            name=new String[2];
        }

        public Object clone() {
            A o = null;
            try {
                o = (A) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return o;
        }
    }
}
