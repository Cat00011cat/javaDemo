import java.util.Scanner;

public class demo3 {
    public static void main(String[] ages){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入您的用户名：");
        String user = s.nextLine();
        System.out.println("请输入您的年龄：");
        int age = s.nextInt();
        System.out.println("请输入您的薪水：");
        double xinsui = s.nextInt();
        System.out.println("用户名："+user+"\t年龄："+age+"\t月薪："+xinsui+"\t年薪："+(12*xinsui));
    }
}
