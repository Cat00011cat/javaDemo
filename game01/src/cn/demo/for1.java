package cn.demo;

public class for1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 99; i++){
            System.out.print(i + "\t" + "love" + "\t");
            if ((i+1)%9==0){
                System.out.print("\n");
            }
        }
    }
}
