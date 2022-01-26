package cn.demo;

public class switchcase1 {
    public static void main(String[] args) {
        int month = 1;  //表示一月
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                System.out.println("开春猛如虎，拿下省二gogogo加油");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                System.out.println("尝试跑一场半马");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                System.out.println("秋季希望拿到满意的offer");
                break;
            default:
                System.out.println("冬季");
                System.out.println("希望能在冬天到来之前入门java");
                break;
        }
    }
}
