package cn.demo;

public class testMethod1 {


    /*
    * 1、输入参数：员工姓名，员工迟到时长，员工月薪
    * 2、处理逻辑：
     *           迟到1-10分钟 警告
     *           迟到11-20分钟 罚款100
     *           迟到21-30分钟 罚款200
     *           迟到30分钟以上 扣除半日工资
     *           迟到60分钟以上 矿工扣三日工资
     *
     *           3、输出罚款金额和处理意见
    * */

//迟到 late
    public static int late(String name, int lateMinute, double gz){
        int fk = 0; //  罚款

        if (lateMinute<11){
            System.out.println("警告");
        }
        else if (lateMinute<21){
            fk = 100;
        }
        else if (lateMinute<31){
            fk = 200;
        }
        else if (lateMinute<61){
            fk = (int) (gz/(21.75*2));  //21.75月平均工作日

        }
        else {
            fk = (int)(gz*3/(21.75));
        }

        System.out.println(name+"，迟到"+lateMinute+"分钟，"+"罚款"+fk+"元！");

        return fk;

    }

    public static void main(String[] args) {
        late("菜菜",88,30000);
    }
}
