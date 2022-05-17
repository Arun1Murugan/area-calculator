public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Area of circle "+area(5.0)); // circle.
        System.out.println("Area of rectangle "+area(3.8,4.9)); // rectangle.
    }
    // area of circle.
    public static double area(double radius){
        if(radius < 0){
            return 0.0;
        }else{
            return(Math.PI *radius *radius);
        }
    }
    // area of rectangle.
    public static double area(double x, double y){
        if (x < 0.0 || y < 0.0){
            return 0.0;
        }else{
            return(x * y);
        }
    }
}