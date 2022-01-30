package method;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
//        Demo05 demo05 = new Demo05();
//        demo05.test();
        /*
         * 这个递归没有结束的条件，即没有“递归头”，可能会引起
         * 系统栈溢出，最好不要这么写
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要计算的阶乘数的值：");
        int n = scanner.nextInt();
        System.out.println(Factorial(n));
        scanner.close();

        //这样的递归调用，很浪费资源，我们只能算到31的阶乘。
    }
//    public void test(){
//        test();
//    }

    public static int Factorial(int n){
        if(n==1){
            return 1;
        }
        else {
            return n*Factorial(n-1);
        }
    }
}
