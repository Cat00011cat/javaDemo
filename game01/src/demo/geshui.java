package demo;

import java.util.Scanner;

public class geshui {
    public static void main(String[] args) {
        System.out.println("=======================================个税计算器============================================");
        Scanner scanner = new Scanner(System.in);




//        信息录入
        System.out.println("请输入本月工资：");
        double benyuegongzi = scanner.nextDouble();
        System.out.println("请输入各项社会保险费：");
        double baoxian = scanner.nextDouble();
        System.out.println("请输入专项附加扣除：");
        double zhuanxiangkouchu = scanner.nextDouble();


//        计算逻辑
        if(benyuegongzi<36000){
//            应纳税所得额=15000-5000（累计减除费用）-3000（累计专项扣除）-4000（累计专项附加扣除）-200（累计依法确定的其他扣除

        }





//        计算结果
        System.out.println("个人所得税计算结果-----------------------------------------------------------------------------------");
        System.out.println("应纳税所得额：" );
        System.out.println("适用税率：" );
        System.out.println("速算扣除数：" );
        System.out.println("累计应缴税款：" );
        System.out.println("已缴税款：" );
        System.out.println("应补（退）税款：" );
        System.out.println("本月税后收入：" );







//        关闭输入监听
        scanner.close();











    }
}
