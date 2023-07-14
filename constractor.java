package Oops;

public class constractor {
    public static void main(String[] args) {
        Employee e1=new Employee();

        System.out.println(e1.name+" "+e1.id);
        
    }
    
}

class Employee{
    String name;
    int id;

    Employee(){                              //constractor

    }

    // Employee(String ename, int eid){              //constractor overloding
    //     name=ename;
    //     id=eid;

       
    //}
    Employee(String name, int id){              //constractor overloding
       
        this.name=name;                         //this keyword
        this.id=id;

       
    }
}