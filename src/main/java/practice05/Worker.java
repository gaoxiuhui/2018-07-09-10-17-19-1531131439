package practice05;

import practice04.Person;

public class Worker extends  Person{
    public Worker()  {
        super();
    }

    public  void introduce(){
        System.out.println("My name is Tom. I am 21 years old. I am a Worker. I have a job.");
    }

    public static void main(String[] args) {
        Person worker=new Person();
        worker.introduce();
    }
}
