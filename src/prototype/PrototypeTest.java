package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mzcsh on 2019/3/12.
 */
public class PrototypeTest {
    public static void main(String[] args) {
        //创建一个需要克隆的对象
        StudentPrototype studentPrototype = new StudentPrototype();

        //配置属性
        studentPrototype.setName("张三");
        studentPrototype.setAge(18);
        List teacher =new ArrayList();
        studentPrototype.setTeacher(teacher);
        System.out.println(studentPrototype);


        //创建克隆对象
        Client client = new Client(studentPrototype);
        StudentPrototype studentPrototype1= (StudentPrototype) client.startClone(studentPrototype);
        System.out.println(studentPrototype1);
        System.out.println("克隆对象中的引用类型地址值:"+studentPrototype1.getTeacher());
        System.out.println("原对象中的引用类型地址值:"+studentPrototype.getTeacher());
        System.out.println("对象地址值比较"+(studentPrototype.getName()==studentPrototype1.getName()));
    }
}
