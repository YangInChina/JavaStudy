package operator;

public class demo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a += b; //a = a + b
        a -= b; //a = a - b
        System.out.println(a);

        //字符串连接符   +
        System.out.println(a+b);
        System.out.println(""+a+b);//只要有一方有string，那么就会把两端操作数变为字符串并连接
        System.out.println(a+b+"");

        
    }
}
