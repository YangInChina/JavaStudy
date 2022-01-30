package base;

public class Demo05 {
    //属性：变量
    //实例变量：从属于对象
    //布尔值：默认False
    //除了基本类型，其余的默认值都为null
    String name;
    int age;

    //类变量
    static double salary = 2500;


    //main方法
    public static void main(String[] args) {
        //局部变量
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println("=============");
        //变量类型 变量名字 = new Demo05();
        Demo05 demo05= new Demo05();
        System.out.println(demo05.age); //默认值：0
        System.out.println(demo05.name);//默认值：null

        //类变量 static
        System.out.println(salary);

        //常量

    }



    //其他方法
    public int add(int a, int b){
         return a+b;
    }
}
