package HworkClass19;

public class Task2 {
    private void sub(int a, int b) {
        System.out.println(a - b);
    }

    private void sub(double c, double d) {
        System.out.println(c - d);
    }

    private void sub(long e, long f) {
        System.out.println(e - f);
    }

    public static void main(String[] args) {

        Task2 obj = new Task2();
        obj.sub(5,2);
        obj.sub(5.5, 2.2);
        obj.sub(555555l, 222222l);
    }
}

