//Parameterized Constructor
public class ParameterizedConstruct {
    ParameterizedConstruct(String name, int age){ //Passing parameters in the Constructor
        System.out.println("Name:"+name+"Age:"+age);
    }

    public static void main(String[] args) {
        ParameterizedConstruct obj=new ParameterizedConstruct("John",25);
    }
}
