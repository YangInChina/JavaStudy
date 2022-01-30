package operator;   //package必须放在最上面

public class demo08 {
    //三元运算符
    public static void main(String[] args) {
        //x ? y :z
        //x为真，输出y，x为假，输出z
        int score = 80;
        String type =  score < 60 ? "不及格" : "及格";
        System.out.println(type);
    }
    
}
