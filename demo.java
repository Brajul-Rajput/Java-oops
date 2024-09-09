 class A{
    String name;
    int age;
    public void show(){
System.out.print("DEMO CLASS ARE FORMED \n"+"name is : "+ name +"  age is   "+ age);
    }
 }  
  class demo{
    public static void main(String[] args) {
        A demo1=new A();
        demo1.name="brajul";
        demo1.age=19;
        demo1.show();
    }
}