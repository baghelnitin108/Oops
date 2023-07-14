package Oops;

public class Interfaces {
    public static void main(String[] args) {
        
    }
}

interface  WaterAnimal{                                            //Interface
     void eat();
     void drink();
     void breathe();
     void fins();
}

interface  landAnimal{
    void eat();
    void drink();
    void breathe();
    void limb();

}

class Amphibian implements landAnimal , WaterAnimal{                //implements


    public void eat(){

    }

    public void breathe(){

    }

    public void drink(){

    }

    public void limb(){

    }

    public void fins(){
        
    }
}

