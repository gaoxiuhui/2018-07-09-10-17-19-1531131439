package practice05;



public class Person {
    private  String name;
    private  int age;

    public Person() {

    }

    public  void introduce(){

        System.out.println("My name is Tom. I am 21 years old.");
    }
    public static void main(String[] args) {
        Person per=new Person();
        per.introduce();
    }
    
}