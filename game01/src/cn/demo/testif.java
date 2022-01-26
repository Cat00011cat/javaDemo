package cn.demo;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/*
* 测试if语句 一个简单的骰子游戏
* */
public class testif {
    public static void main(String[] arg){

        System.out.println("***掷骰子小游戏***");

        double d = Math.random();       //Math.random()方法生成一个0-1的随机数，，包含0不包含1
//        三个随机数 表示扔了三次筛子
        int a = 1 + (int)(Math.random()*6);     //生成1-6之间的随机整数
        int b = 1 + (int)(Math.random()*6);     //生成1-6之间的随机整数
        int c = 1 + (int)(Math.random()*6);     //生成1-6之间的随机整数

//        统计个数
        int count = a + b + c;

        if(count>15){
            System.out.println("手气不错，继续玩！");
        }

        if(10<=count&&count<=15){       //不能写成 10<count<15
            System.out.println("手气一般，撒个尿，换风水");
        }

        if(count<10){
            System.out.println("手气不怎么样，找个接口溜了");
        }

        if(count>9){
            System.out.println("建议押大");
        }

        if(count<9){
            System.out.println("建议押小");
        }

        if (count==9){
            System.out.println("建议不押");
        }

        System.out.println("第一个骰子"+a+"分"+"\t第二个骰子"+b+"分"+"\t第三个骰子"+c+"分");
        System.out.println("三次共计"+count+"分");

    }
}

