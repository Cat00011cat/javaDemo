package cn.demo;

public class while4 {
    public static void main(String[] args) {
        int i = 0;
        while (i<=130){
            System.out.print(i+"\t");
            if ((i+1)%7==0){
//               打印换行符
                System.out.println("\n");
            }
            i++;
        }
    }
}
