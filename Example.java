public 
class Example{
    int a;
    int b;
    int c;
    public Example() {
        a=5;
        b=10;
    }

    public Example(int x, int y) {
        this.a = x;
        this.b = y;
    }
    public Example(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void display(){
        System.out.println(a + b + c);
    }

    
}
public class Const {
    public static void main(String[] args) {
        Example obj_1 = new Example();
        // Example obj_2 = new Example(25,30);
        // Example obj_3 = new Example(25,50,30);
        obj_1.display();
        // System.out.println("\n");
        // obj_2.display();
        // obj_3.display();
    }    
} {
    
}
