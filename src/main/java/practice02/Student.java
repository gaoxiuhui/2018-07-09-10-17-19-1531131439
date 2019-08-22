package practice02;

public class Student extends  Person{
    private  String klass;

    public Student()  {
        super();

    }

    public  void introduce(String str){
        System.out.println("I am a Student. I am at "+str);
    }

    public static void main(String[] args) {
        Student stu=new Student();
        stu.introduce("Class 2");
    }
}
