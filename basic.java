package Oops;

public class basic {
    public static void main(String[] args) {

        Stutent s1=new Stutent();                        //Object 

        s1.name="Nitin Baghel";
        s1.age=20;
        s1.course="B.tech";
        s1.gender='M';

        System.out.println(s1.name+" "+s1.age+" "+s1.course+" "+s1.gender);

        s1.detail();

        s1.tellCourse();

        s1.detail("Mpct");

        
    }
    
}

class Stutent{            //class
    String name;         //attributes
    int age;
    String course;
    char gender;

    public void detail(){        //Methods

        System.out.println("Name of the student"+name+" "+"Age is"+age+" "+"Course is"+course+" "+"Gender is"+gender);
    }

    public void tellCourse(){
        System.out.println(course);
    }

    public void detail(String collgeName){             //Method overloding

        System.out.println("Course is "+course+" "+"From Collage"+collgeName);
    }
}