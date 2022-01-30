package method;

public class Demo02 {
    public static void main(String[] args) {
        int max = max(10,20);
        double max2 = max(1.1,2.2);
        System.out.println(max);
        System.out.println(max2);
    }

    public static int max(int num1, int num2){
        int result = -1;
        if(num1>num2){
            result = num1;
        }
        else if(num1<num2){
            result = num2;
        }else if(num1 == num2){
            System.out.println("num1==num2");
            return 0;
        }
        return result;
    }

    public static double max(double num1, double num2){
        double result = -1;
        if(num1>num2){
            result = num1;
        }
        else if(num1<num2){
            result = num2;
        }else if(num1==num2){
            System.out.println("num1==num2");
            return 0;
        }
        return result;
    }
}
