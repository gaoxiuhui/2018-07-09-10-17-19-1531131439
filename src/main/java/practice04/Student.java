package practice04;




public class Student extends  Person{
    private  String klass;

    public Student()  {
        super();

    }

    public  void introduce(){
        System.out.println("My name is Tom. I am 21 years old. I am a Student. I am at Class 2.");
    }

    public static void main(String[] args) {
        Person stu=new Person();
        stu.introduce();
    }
}
