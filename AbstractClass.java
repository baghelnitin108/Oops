package Oops;

public class AbstractClass {
    public static void main(String[] args) {
          //Government g1 = new Government();   not allowed in java as it requires implementation of abstarct methods 

        sumsung s1=new sumsung();
        s1.call();
        s1.message();
        s1.music();
        s1.camera();

        nokia n1=new nokia();
        n1.call();
        n1.message();
        n1.music();
        n1.camera();
    }
    
}

abstract class Goverment{
    abstract void call();
    abstract  void message();

    void music(){
        System.out.println("Music playing");
    }

    void camera(){
        System.out.println("Camera");
    }
}

class sumsung extends Goverment{

    void call(){
        System.out.println("calling");
    }

    void message(){
        System.out.println("message");
    }
}

class nokia extends sumsung{

}