//package com.boyang_DeathLock;
//
///**
// * @Author: Boyang
// * @ClassName: com.boyang_DeathLock
// * @Description: 死锁：多个线程互相抱着对方需要的资源，然后形成僵持。
// * @Date: Created in 1:21 2022/1/28
// */
//
//public class TestDeathLock {
//    public static void main(String[] args) {
//        MakeUp girl_1 = new MakeUp(0,"灰姑娘");
//        MakeUp girl_2 = new MakeUp(1,"白雪公主");
//
//        girl_1.start();
//        girl_2.start();
//    }
//}
//
//// 口红
//class Lipstick{
//
//}
//
////镜子
//class Mirror{
//
//}
//
//// 化妆
//class MakeUp extends Thread{
//    // 需要的资源只有一份，用static来保证只有一份
//    static Lipstick lipstick = new Lipstick();
//    static Mirror mirror = new Mirror();
//
//    int choice; // 选择
//    String girlName; //使用化妆品的人
//
//    MakeUp(int choice, String girlName){
//        this.choice = choice;
//        this.girlName = girlName;
//    }
//
//    @Override
//    public void run() {
//        //化妆
//        try {
//            makeup();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    //互相持有对方的锁，就是需要拿到对方的资源
//    private void makeup() throws InterruptedException {
//        if (choice == 0){
//            synchronized (lipstick){    // 获得口红的锁
//                System.out.println(this.girlName+"获得口红的锁");
//                Thread.sleep(1000);
//
//                synchronized (mirror){  //一秒后想获得镜子
//                    System.out.println(this.girlName+"获得镜子的锁");
//                }
//            }
//        } else {
//            synchronized (mirror){    // 获得镜子的锁
//                System.out.println(this.girlName+"获得镜子的锁");
//                Thread.sleep(2000);
//
//                synchronized (lipstick){  //一秒后想获得口红
//                    System.out.println(this.girlName+"获得口红的锁");
//                }
//            }
//        }
//    }
//}     同时抱两把锁导致死锁，下面代码解决问题

package com.boyang_DeathLock;

/**
 * @Author: Boyang
 * @ClassName: com.boyang_DeathLock
 * @Description: 死锁：多个线程互相抱着对方需要的资源，然后形成僵持。
 * @Date: Created in 1:21 2022/1/28
 */

public class TestDeathLock {
    public static void main(String[] args) {
        MakeUp girl_1 = new MakeUp(0,"灰姑娘");
        MakeUp girl_2 = new MakeUp(1,"白雪公主");

        girl_1.start();
        girl_2.start();
    }
}

// 口红
class Lipstick{

}

//镜子
class Mirror{

}

// 化妆
class MakeUp extends Thread{
    // 需要的资源只有一份，用static来保证只有一份
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice; // 选择
    String girlName; //使用化妆品的人

    MakeUp(int choice, String girlName){
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        //化妆
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //互相持有对方的锁，就是需要拿到对方的资源
    private void makeup() throws InterruptedException {
        if (choice == 0){
            synchronized (lipstick){    // 获得口红的锁
                System.out.println(this.girlName+"获得口红的锁");
                Thread.sleep(1000);
            }
            synchronized (mirror){  //一秒后想获得镜子
                System.out.println(this.girlName+"获得镜子的锁");
            }
        } else {
            synchronized (mirror){    // 获得镜子的锁
                System.out.println(this.girlName+"获得镜子的锁");
                Thread.sleep(2000);
            }

            synchronized (lipstick){  //一秒后想获得口红
                System.out.println(this.girlName+"获得口红的锁");
            }
        }
    }
}