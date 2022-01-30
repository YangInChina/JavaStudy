package base;
public class Demo03 {
    public static void main(String[] args) {
        //整数扩展
        int i = 10;         //十进制
        int i2 = 010;       //八进制（0开头）
        int i3 = 0x10;      //十六进制（0x开头）

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("==========================");
        
        //浮点数扩展
        float f = 0.1f;
        double d = 0.1;
        System.out.println(f==d);   //false
        //float表示字长有限 离散的存在，舍入误差 结果是大约数
        System.out.println(f);
        System.out.println(d);
        //避免使用float类型
        //BigDecimal  数学工具类 之后使用这个类表示

        //字符串拓展
        System.out.println("==========================");
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c1);    //强制转换

        System.out.println(c2);
        System.out.println((int)c2);
        //编码 Unicode 表示：91 = a 65 = A 2字节  0-65536
        char c3 = '\u0061'; //a
        System.out.println(c3);

        /**
         *  \t  制表符
         *  \n  换行符
         */
        System.out.println("Hello\tworld!");
        System.out.println("==========================");

        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa==sb);         //false

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc==sd);         //true
        //内存角度

        //bool值扩展
        boolean flag = true;
        if(flag == true){}
        if(flag){}          //两个方式相同
        // less is more    代码要精简易读
    }
}
