package cn.demo;

public class while2 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100){
            sum += i;  //相当于：sum = sum+i;
            i++;    //i自增加1
        }
        System.out.println("1-100和："+sum);
    }
}
