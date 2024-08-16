package Section_4.TheObjectClass;

public class Main extends  Object {

    public static void main(String[] args) {

        Student max = new Student("max",21);

        System.out.println(max.toString());
    }
}
class Student {
    private String Name;
    private int age;

    Student(String name,int age){
        Name =name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}