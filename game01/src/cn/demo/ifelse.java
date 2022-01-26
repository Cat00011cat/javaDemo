package cn.demo;

public class ifelse {
    public static void main(String[] args) {

        double r = Math.random()*4;     //生成0-4的一个随机数

        double area = Math.PI*r*r;
        double circle = 2*Math.PI*r;

        System.out.println("半径："+r);
        System.out.println("面积："+area);
        System.out.println("周长："+circle);

        if(area>=circle){
            System.out.println("面积的数值大于等于周长");
        }else {
            System.out.println("面积的数值小于周长");
        }

    }
}
