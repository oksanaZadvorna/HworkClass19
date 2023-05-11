package HworkClass19;

import static HworkClass19.Task1.var;

public class Task1 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
    */
    static void var (int a, int b){
        System.out.println(a*b);
    }
    static void var(double a, double p){
        System.out.println(a*a);
    }
static void var(int f, double r){
    System.out.println(f+r);
}
}

class Task1Tester{
    public static void main(String[] args) {
      var(5, 7);
      var(4, 7.8);
      var(8, 9.7);

    }
}
