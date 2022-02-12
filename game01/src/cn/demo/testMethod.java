package cn.demo;


public class testMethod {
//    方法定义
//    形参 用于定义的时候
    public static void loveU(int num) {
        System.out.println("iloveyou"+"==="+num+"年");
    }


    public static int add(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }


    public static void main(String[] args) {
//        方法调用
//        实参 用于调用的时候
        loveU(10000);
        int a = add(100,200,300);
        System.out.println(a);
    }
}