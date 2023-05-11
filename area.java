package HworkClass19;

class area {
    /*
    Create 1 class in which create a methods that will calculate the area of Method name must be called calculateArea
Rectangle
Square

Use separate class to test your code
     */
    static void calculateArea (int a, int b){
        System.out.println("The area of rectangle is "+(a*b));
    }
    static void calculateArea(double a){
        System.out.println("The area of square is "+(a*a));
    }}

    class AreaTester{
        public static void main(String[] args) {
            area obj=new area();
            obj.calculateArea(2,6);
            obj.calculateArea(4);
        }
    }

