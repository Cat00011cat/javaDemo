//public class demo2 {
//    public  static void main(String[] ages){
//        int a = 1;
//        System.out.println(a);
//    }
//}

//局部变量 变量需要先声明赋初值在使用


////测试常量
//public class demo2{
//    public static void main(String[] ages){
//        final double PI=3.14;   //常量智能初始化一次
//        double r=3;
//        double mianji = PI*r*r;
//        double zhouchang = 2*PI*r;
//
//        System.out.println("面积："+mianji);
//        System.out.println("周长："+zhouchang);
//    }
//}





//字符串类型测试
//public class demo2{
//    public static void main(String[] ages){
//       char c = 'a';
//       char c1 = '中';
//       char c2 = '\u0061';
//        System.out.println(c);
//        System.out.println(c1);
//        System.out.println(c2);


//        java中的字符串不是基本数据类型，而是一个独立定义的类。
//        String str = "哈\n哈\n哈";
//        System.out.println(str);
//
//
//    }
//}




//Boolean类型测试
//public class demo2{
//    public static void main(String[] ages){
//        boolean flag1 = true;
//        boolean flag2 = false;
//        if (flag1){
//            System.out.println('1');
//        }else {
//            System.out.println('0');
//        }
//    }
//}




//算数运算符测试
public class demo2{
    public static void main(String[] ages){
        int a = 3;
        long b= 5;
        long c = a+b;
        System.out.println(c);
//        +_*/

        double d = 31/3;
        System.out.println(d);

//        取余数(模运算)
        int e = 10%3;
        System.out.println(e);

//        测试自增自减
        int g = 30;
        g++;    //相当于g = g+1
        g--;    //相当于g = g-1


        g = 10;
        int h = g++;        //h=10，g++先赋值在自增。
        int i = ++g;        //++g，先自增，在赋值。

        System.out.println("h="+h);
        System.out.println("i="+i);
        System.out.println("g="+g);






    }
}








