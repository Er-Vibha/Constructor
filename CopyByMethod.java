//Copying the values of one object into another using Method
public class CopyByMethod {
    int id;
    String name;
    CopyByMethod(int i, String n) {
        id = i;
        name = n;
    }
    CopyByMethod() {
    }
    void Output() {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        CopyByMethod c1 = new CopyByMethod(234, "Gita");
        CopyByMethod c2 = new CopyByMethod();
        c2.id = c1.id;
        c2.name = c1.name;
        c1.Output();
        c2.Output();
    }
}
