package cn.demo;

public class for7 {
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++){
            for(int i = 9; i >=a; i--){
                System.out.print(i + "*" + a + "=" + (i*a) + "\t");
            }
            System.out.println();
        }
    }
}
