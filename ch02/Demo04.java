package base;

public class Demo04 {
    public static void main(String[] args) {
        //注意大数的溢出问题
        int money = 10_0000_0000;   //10亿
        System.out.println(money);
        System.out.println("==============");
        int years = 20;
        int total = money * years;  
        long total2 = money * years;
        System.out.println(total);  //计算结果溢出
        System.out.println(total2); //计算前结果就溢出了

        long total3 = (long)money*years;
        System.out.println(total3); //计算前进行转换
    }
}
