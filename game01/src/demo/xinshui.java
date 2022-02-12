package demo;

import java.util.Scanner;

public class xinshui {
    public static void main(String[] args) {
        System.out.println("===年薪计算器===");
        Scanner scanner = new Scanner(System.in);

//        计算完一次不结束，继续执行下一个计算
        while (true){
            System.out.println("请输入月薪");
            int yx = scanner.nextInt();
            System.out.println("请输入每年是几个月的薪水");
            int yer = scanner.nextInt();
//            nextLine接收一行字符串
            scanner.nextLine(); //执行缓冲区的第一个回车
            System.out.println("命令：exit-退出，next-重置，computer-计算");
            String command = scanner.nextLine(); //接收用户输入的命令

//            判断用户输入的命令
//            equals方法 === ==
            if("exit".equals(command)){
                System.out.println("退出成功");
                break;
            }
            if ("next".equals(command)){
                continue;
            }

//            计算
            if ("computer".equals(command)){
                int nx = yx * yer;
                System.out.println("您的年薪为：" + nx);
                if (nx>100000 && nx<200000){
                    System.out.println("恭喜,超过了90%的国人");
                }
                if (nx>=200000){
                    System.out.println("恭喜,超过了98%的国人");
                }
                if (nx<100000){
                    System.out.println("暂无排名");
                }
            }
        }
    }
}
