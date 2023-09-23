//Copying the values of one object into another using Java constructor
public class CopyCons {
    int id;
    String  name;
    CopyCons(int i, String n){
        id=i;
        name=n;
    }
    CopyCons(CopyCons c){
        id=c.id;
        name=c.name;
    }
    void output(){
        System.out.println(id +","+name);
    }
    public static void main(String[] args) {
        CopyCons c1=new CopyCons(123, "Sita");
        CopyCons c2=new CopyCons(c1);
        c1.output();
        c2.output();
    }
}


