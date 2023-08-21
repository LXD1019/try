package test.whatever;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.TimerTask;

import java.util.Timer;

public class chouQian1 {

    public static void main(String[] args) {
        PaintDraw pd = new PaintDraw();
        JFrame jf = new JFrame("随机抽签器");

        jf.setLocation(500, 200);
        jf.setSize(300, 300);
        jf.add(pd);
        pd.action();
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        jf.addMouseListener(new MouseAdapter() {//添加鼠标点击事件，如果点击，就让actionNumber的标记值取反为-1，执行changeText()方法，随机展示结果
            //并将结果绘制在窗口上;继续单击窗口，actionNumber的值恢复成1，继续执行滚动绘制程序，以便程序可以多次使用
            public void mousePressed(MouseEvent e) {
                pd.actionNumber = -pd.actionNumber;
                pd.changeText();
            }
        });
    }
    static class PaintDraw extends JPanel {

        /**
         *
         */
        private static final long serialVersionUID = 1L;

        String[] text = new String[9];//创建内容数组，容量自定义

        int actionNumber = 1;//进行标记

        int resultNumber = (int)(Math.random()*(text.length));//初始化抽签结果标记(随机)

        public PaintDraw() {//抽签内容
            text = new String[]{"方山","九凤谷","九畹溪","清江画廊","三峡大坝","三峡人家","屈原故里","三峡大瀑布","西陵峡口","百里荒","车溪","朝天吼","鸣翠谷"};
        }

        public void changeText() {//如果活动标记为-1，说明抽签结束，要产生一个随机结果下标
            if (actionNumber == -1) {
                resultNumber = (int)(Math.random()*(text.length));
            }
        }

        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(110, 100, 150, 30);
            g.drawString("点击窗口即可进行抽签...", 100, 170);

            if (actionNumber == -1) {//如果活动标记为-1，说明抽签结束，将changeText()方法随机生成的抽签结果下标进行展示
                g.setFont(new Font("华文新魏", Font.ITALIC,20));
                g.drawString(text[resultNumber], 120, 120);
            } else {
                //如果无变化，说明还没有进行抽签，继续展示滚动标签
                int index = (int)(Math.random()*(text.length));
                g.setFont(new Font("华文新魏",Font.ITALIC,20));
                g.drawString(text[index], 120, 120);
            }

        }

        //对窗体内容进行重绘
        Timer time = new Timer();
        public void action() {
            time.schedule(new TimerTask(){
                public void run() {
                    repaint();
                }
            },80,80);
        }

    }

}
