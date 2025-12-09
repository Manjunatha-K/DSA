package com.logic.DSA.career.Basic;

public class Test {
    public static void main(String[] args) {
      Employee emp1 = new Employee(101,"A");
        Employee emp2 = new Employee(101,"A");
   Boolean isTrue = emp1.equals(null);
        System.out.println(isTrue);
    }


}

class Employee{
    private int id;
    private String employeName;

    Employee(){

    }
    Employee(int id, String employeName){
        this.id = id;
        this.employeName = employeName;
    }

    public Boolean equals(Employee obj){
        if(this.id  == obj.id && this.employeName == obj.employeName)
            return true;
        else
            return  false;
    }
}
