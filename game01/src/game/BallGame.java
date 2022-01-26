package game;
//导入包
import com.sun.prism.paint.Gradient;
import sun.awt.image.ToolkitImage;

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{

//    加载图片
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");

//    球的位置
    double x = 200;
    double y = 200;

    boolean right = true;   //控制小球的水平位移方向


//    绘制图片窗口
    public void paint(Graphics g){
        System.out.println("窗口被画了一次");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int) x,(int)y,null);

//        水平
        if (right){
            x = x + 10;
        }else {
            x = x - 10;
        }

//        边界判断
        if (x>856-30-40){
            right =false;
        }

//        边界判断
        if (x<0+40){
            right = true;
        }

    }

    //创建窗口
    void launchFrame(){
        setSize(856,501);
        setLocation(500,300);
        setVisible(true);

        //实现台球动画,每秒绘制窗口25此
        while (true){
            repaint();

            try {
                Thread.sleep(40);   //1s=1000ms 1000/40=25次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }


    public static void main(String[] ages){
        System.out.println("我的小游戏开始了!");

        //调用窗口
        BallGame game = new BallGame();
        game.launchFrame();
    }

}
