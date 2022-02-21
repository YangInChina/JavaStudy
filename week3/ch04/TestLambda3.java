package com.boyang_lambda;

/**
 * @Author: Boyang
 * @ClassName: com.boyang_lambda
 * @Description: 再写一个带参数的lambda
 * @Date: Created in 22:56 2022/1/26
 */

public class TestLambda3 {

    public static void main(String[] args) {
//        简化1：lambda表达式：
//        Ilove love = (int a)-> {
//                System.out.println("I love you-->"+a);
//            };

//        简化2：去掉参数类型（去掉 int）：
//        Ilove love = (a)-> {
//                System.out.println("I love you-->"+a);
//            };

//        简化3：简化括号
//        Ilove love = a-> {
//            System.out.println("I love you-->"+a);
//        };

//        简化4：去掉花括号（代码只有一行的时候才能用）
//        Ilove love = a-> System.out.println("I love you-->"+a);
//
//        love.love(511);

//        简化5:去掉Ilove的实例化
//        ((Ilove) a -> System.out.println("I love you-->" + a)).love(520);

//        简化6:直接输出不更快?!
//        System.out.println("I love you-->" + 520);

    }
}

interface Ilove {
    void love(int a);
}