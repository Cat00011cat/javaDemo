package cn.demo;

public class digui {

    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果为%s%n",10,factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归耗时：%s%n",d2-d1);
    }

    static long factorial(int n) {
        if (n==1){  //递归头
            return 1;
        }else {     //递归体
            return n*factorial(n-1);    //n!= n * (n-1)
        }
    }

}
