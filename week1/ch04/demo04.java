package operator;

public class demo04 {
    public static void main(String[] args) {
        //自增自减
        int a = 3;
        int b = a++;    //先用后加，b=3， a=3+1
        int c = ++a;    //先加后用  a=4+1；c=a
        System.out.println(a);  //a=5
        System.out.println(b);  //b=3
        System.out.println(c);  //c=5

        //幂运算，使用工具类，这里是Math类的pow方法
        double pow = Math.pow(2, 3);
        System.out.println(pow);
    }
    
}
