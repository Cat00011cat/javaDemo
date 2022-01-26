package cn.demo;

public class for9 {
    public static void main(String[] args) {
        for (int c = 1; c<=5;c++){
            for (int i = 1; i <= 5; i++){
                if ((c+i)%2==0){
                    System.out.print("$\t");
                }else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
