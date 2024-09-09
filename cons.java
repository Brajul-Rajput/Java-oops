class P{
    String name;
     int age;
    P(){

    }
    void disp(){
System.out.println(name+"   "+age);
    }
}
public class cons {
    public static void main(String[] args) {
        P pr=new P();
        pr.disp();
    }
}
