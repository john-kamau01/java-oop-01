public class Methods{
    static void myMethod(String name){
        System.out.println("Hello " + name);
    }

    static int sum(int x, int y){
        return x + y;
    }

    static double sum(double i, double j){
        return i + j;
    }

    public static void main(String[] args){
        myMethod("John");
        System.out.println(sum(5, 10));
        System.out.println(sum(10.10, 20.20));
    }
}