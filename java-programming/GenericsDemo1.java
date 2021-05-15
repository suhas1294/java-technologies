package java_collections;

class Student<T>{
    T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
        System.out.println("Name is set to : " + name);
    }
}
class Container<T>
{
    T value;
    Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class GenericsDemo1 {
    public static void main(String args[]){
        Container<Integer> i = new Container<Integer>();

        Student s = new Student();
        s.setName("suhas");
        i.setStudent(s);

        i.setValue(5);
        i.getStudent().setName("Sumanth");
    }
}
