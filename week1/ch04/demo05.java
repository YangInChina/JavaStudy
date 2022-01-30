package operator;

public class demo05 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b:"+(a&&b));
        System.out.println("a || b:"+(a||b));
        System.out.println("!(a && b):"+!(a&&b));

        //短路运算
        System.out.println("=========");
        int c = 5;
        boolean d = (c<4)&&(c++<4); //(c<4)为错，则后面就不执行了，直接返回false
        System.out.println(c);
        System.out.println(d);
    }
}
