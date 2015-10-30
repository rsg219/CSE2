public class Test1021{
    
    public static void overload1(int x) {
        System.out.println("x= " + x);
    }
    
    public static void overload1(double x) {
        System.out.println("x= " +x);
    }
    
       public static void overload2(int x) {
        System.out.println("x= " + x);
    }
    
       public static void overload2(int x, int y) {
        System.out.println("x= " + x + "y= " +y);
    }
    
        public static void overload3(int x, boolean y) {
        System.out.println("x= " + x + " y= " +y);
    }
    
        public static void overload3(boolean x, int y) {
        System.out.println("x= " + x + " y= " +y);
    }
    
    public static void main(String[] args)
    {
        overload1(5);
        overload1(6.4);
        overload2(3);
        overload2(5,10);
        overload3(3, false);
        overload3(true, 5);
    }
}