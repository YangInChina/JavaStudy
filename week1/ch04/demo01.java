package operator;

public class demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a+b);    //30
        System.out.println(a-b);    //-10
        System.out.println(a*b);    //200
        System.out.println(a/b);    //0 (int，四舍五入了)
        System.out.println(a/(double)b);    //0.5
    }
}
