package cn.demo;

public class dowhile {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do {
            sum += i;
            i++;
        }while (i <= 100);
        System.out.println("do-while\t1-100的累加：" + sum);
    }
}
