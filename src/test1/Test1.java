package test1;

import java.awt.EventQueue;
import java.io.IOException;
import javax.swing.JFrame;

public class Test1 {

	public static void main(String[] args)throws IOException  {
		EventQueue.invokeLater(new Runnable(){  //时间分派线程
			public void run()
			{
				SimpleFrame frame=new SimpleFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //关闭
				frame.setVisible(true); //显示框架
			}
		});
	}
}
