package Day4;

abstract class vehicle{
    //abstract method only declare method
    abstract void start();
    void fuel(){
        System.out.println("need fuel to run");
    }
}
//subclass or child class extending abstract class:-
class truck extends vehicle{
    //override
    void start(){
        System.out.println("truck is on");
    }
}
//another subclass
class  bike extends vehicle {
    void start() {
        System.out.println("bike start with kick");
    }
}
public class Abstractt {
    public static void main(String[] args){
        vehicle v1=new truck(); //using reference of abstract class.
        v1.start(); //calls truck ka start
        v1.fuel(); //calls vehicle ka fuel
        vehicle v2=new bike();
        v2.start();
        v2.fuel();
    }
}
