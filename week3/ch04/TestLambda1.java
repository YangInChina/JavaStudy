package com.boyang_lambda;

/**
 * @Author: Boyang
 * @ClassName: com.boyang_lambda
 * @Description: 推导lambda表达式
 * @Date: Created in 20:19 2022/1/26
 */

public class TestLambda1 {

    // 4. 静态内部类
    static class like2 implements Ilike{

        @Override
        public void lambda() {
            System.out.println("I like lambda2");
        }
    }


    public static void main(String[] args) {

        // 3. 在主函数中new实现对象，然后调用接口的实现函数。
        Ilike like = new like();
        like.lambda();

        like = new like2();
        like.lambda();

        // 5. 局部内部类
        class like3 implements Ilike{

            @Override
            public void lambda() {
                System.out.println("I like lambda3");
            }
        }

        like = new like3();
        like.lambda();

        // 6. 匿名内部类，没有类的名称，必须借助接口或者父类
        like = new Ilike() {
            @Override
            public void lambda() {
                System.out.println("I like lambda4");
            }
        };
        like.lambda();

        // 7. lambda
        like = ()->{
            System.out.println("I like lambda5");
        };
        like.lambda();
    }
}


// 1. 定义一个函数式接口（只有一个函数接口）
interface Ilike{
    void lambda();
}

// 2. 实现类
class like implements Ilike{

    @Override
    public void lambda() {
        System.out.println("I like lambda");
    }
}

/*喵啊， 所以有一个函数式 接口，现在要用lambda实现，我给大家看一下到底用多少行代码
* 参见TestLambda2
* */