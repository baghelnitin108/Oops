package Oops;

public class Inheritance {
    public static void main(String[] args) {
        GrandParent g1=new GrandParent();
        g1.money=100;
        g1.display();

        parent p1=new parent();
        p1.money=200;
        p1.Knowlage=100;
        p1.display();
        
        child c1=new child();
        c1.money=100;
        c1.Knowlage=100;
        c1.time=24;
        c1.display();


    }
}

class GrandParent{
    int money;

    void display(){
        System.out.println("This is form GrandParent");
    }
}

class parent extends GrandParent{        //Single level
    int Knowlage;

    void display(){
        System.out.println("This is from parent");
    }
}

class child extends parent{               //Multi level
    int time;

    void display(){
        System.out.println("This is form Child");
    }
}



// Multipal inheritance is not allow in java