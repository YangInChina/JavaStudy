package Array;

public class Demo01 {
    // 变量的类型 变量的名字 = 变量的值  ;
    // 数组类型
    public static void main(String[] args) {
//        int[] nums; //  第一种声明方式
////        int nums2[]; //  第二种定义方式
//        nums = new int[10]; //创建一个数组
//        //赋值
//        nums[0] = 1;
//        nums[1] = 2;
//        nums[2] = 3;
//        nums[3] = 4;
//        nums[4] = 5;
//        nums[5] = 6;
//        nums[6] = 7;
//        nums[7] = 8;
//        nums[8] = 9;
//        nums[9] = 10;
        //以上代码可以用下面这个语句来代替
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(nums[9]);
        //计算和
        int sum = sum(nums);
        System.out.println(sum);

    }
    public static int sum(int[] a){
        int sum1 = 0 ;
        for (int  x: a){
            sum1 = sum1 + x;
        }
        return sum1;
    }
}

//关于数组和其他的数据类型基本和C++一致，不再重复，ARRAY包就介绍这一个Demo吧。
