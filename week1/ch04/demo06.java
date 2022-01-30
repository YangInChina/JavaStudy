package operator;

public class demo06 {
    public static void main(String[] args) {
        /**
         * A = 0011 1100
         * B = 0000 1101
         * 
         * A&B 0000 1100(每一位比较，都为1，则输出1)
         * A|B 0011 1101(每一位比较，有一个为1，则输出1)
         * A^B 0011 0001(每一位比较进行异或)
         * ~B  1111 0010(每一位取反)
         * 
         * 2乘以8怎么运算最快？
         * 位运算
         * <<   左移（*2）
         * >>   右移（/2）
         * 位运算效率极高
         * 
         * 0000 0000    0
         * 0000 0001    1
         * 0000 0010    2
         * 0000 0011    3
         * 0000 0100    4
         * 0000 1000    8
         * 0001 0000    16
         */
        System.out.println(2<<3);
    }
    
}
