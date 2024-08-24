class Addition{
    static int  Add(int a, int b) {
        return a+b;
    }   
     double  Add(int a, double b) {
        
        return a+b;
    }
    static double  Add(double  a, int b) {
        return a+b;
        
    }  
    static double  Add(double  a, double b) {
        
        return a+b;
    }

}

public class Over {
    public static void main(String[] args) {
//        System.out.println(Addition.Add(5, 10.5));
        Addition obj = new Addition();
    System.out.println(obj.Add(10.9,50.50));
    }
}
