package com.boyang_lambda;

/**
 * @Author: Boyang
 * @ClassName: com.boyang_lambda
 * @Description: lambda表达式
 * @Date: Created in 20:41 2022/1/26
 */

public class TestLambda2 {

    public static void main(String[] args) {
        new Instance(() -> System.out.println("这是来自主函数的")).Start();
    }
}

interface FuncInter {
    void run();
}

class Instance implements FuncInter{
    private FuncInter target;
    public Instance(FuncInter target){
        this.target = target;
    }

    @Override
    public void run() {
        saySomeThing();
    }

    public void Start(){
        this.target.run();
        saySomeThing();
    }

    private void saySomeThing(){
        System.out.println("这是来自代理类的一句话");
    }
}