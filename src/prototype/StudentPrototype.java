package prototype;

import java.util.List;

/**
 * Created by mzcsh on 2019/3/12.
 */
public class StudentPrototype  implements  Prototype{

    private String name;
    private int age ;
    private List teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getTeacher() {
        return teacher;
    }

    public void setTeacher(List teacher) {
        this.teacher = teacher;
    }

    @Override
    public Prototype clone() {
        StudentPrototype studentPrototype=new StudentPrototype();
        studentPrototype.setName(this.name);
        studentPrototype.setAge(this.age);
        studentPrototype.setTeacher(this.teacher);
        return studentPrototype;
    }
}
