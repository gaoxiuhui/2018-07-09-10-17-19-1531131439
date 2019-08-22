package practice03;

public class Worker extends  Person{
 

    public Worker()  {
        super();

    }

    public  void introduce(){
        System.out.println("I am a Worker. I have a job.");
    }

    public static void main(String[] args) {
        Worker worker=new Worker();
        worker.introduce();
    }
}