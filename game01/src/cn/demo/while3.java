package cn.demo;
//计算1-100之间所有数字的和所有总数的和
public class while3 {
    public static void main(String[] args) {
        int i = 1;
        int sum  = 0;
        int jishu = 0;
        int oushu = 0;
        while (i<=100){
            sum  += i;
//            判断是否能够整除  偶数是能够被整除的数
            if (i%2==0){
                oushu += i;
            }else {
//                奇数不能被整除
                jishu += i;
            }
            i++;
        }
        System.out.println("1-100总和："+sum);
        System.out.println("1-100偶数："+oushu);
        System.out.println("1-100奇数："+jishu);
    }
}
