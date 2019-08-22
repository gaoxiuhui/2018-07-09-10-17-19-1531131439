package practice01;

public class Person {
    private  String name;
    private  int age;

    public Person(String name,int age) {
        this.name=name;
        this.age=age;
    }

    public  void introduce(){

        System.out.println("My name is "+name+". "+"I am "+age+" years old.");
    }

    public static void main(String[] args) {
        Person person=new Person("Tom",21);
        person.introduce();
    }
}
