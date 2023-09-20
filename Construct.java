//Default Constructor
class MyConstruct {
        MyConstruct(){ //Method name is same to Class name
            int a=10;
            int b=20;
           int c=a+b;
            System.out.println(c);
        }
        public static void main(String[] args) {
            MyConstruct obj = new MyConstruct(); //Called by only creating the object, no need to call
        }
}
