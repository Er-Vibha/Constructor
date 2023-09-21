//Constructor overloading
public class OverloadCons {
    OverloadCons(String name, int age){ //Passing parameters in the Constructor
        System.out.println("Name:"+name+" "+"Age:"+age);
    }
    OverloadCons(String name, int age, String org){ //Constructor overloading perform here  
        System.out.println("Name:"+ name+" "+"Age:"+ age+" "+"Org:"+org);
    }

    public static void main(String[] args) {
       OverloadCons obj=new OverloadCons("John",25);
        OverloadCons obj1 = new OverloadCons("Ram", 24, "IT");

    }
}
