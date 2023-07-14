package Oops;

public class constractor2 {
    public static void main(String[] args) {
        // GrandParent g1=new GrandParent();
        // g1.money=100;
        // g1.display();

        // parent p1=new parent();
        // p1.money=200;
        // p1.Knowlage=100;
        // p1.display();
        
        // child c1=new child();
        // c1.money=100;
        // c1.Knowlage=100;
        // c1.time=24;
        // c1.display();

        child c1=new child(100, 100, 24);
        System.out.println(c1.money+" "+c1.Knowlage+" "+c1.time);


    }
}

class GrandParent{
    int money;

    GrandParent(int Mymoney){           //constractor
        money=Mymoney;

    }

    void display(){
        System.out.println("This is form GrandParent");
    }
}

class parent extends GrandParent{        //Single level
    int Knowlage;

    parent(int Mymoney, int MyKnowlage){       //constractor
        super(Mymoney);                       //super keyword
        Knowlage=MyKnowlage;

    }

    void display(){
        System.out.println("This is from parent");
    }
}

class child extends parent{               //Multi level
    int time;

    child(int Mymoney, int MyKnowlage, int Mytime){      //constractor
        super(Mymoney,MyKnowlage);                       //super keyword
        time=Mytime;

    }

    void display(){
        System.out.println("This is form Child");
    }
}



// Multipal inheritance is not allow in java