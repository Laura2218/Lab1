package test1;

import java.awt.EventQueue;
import java.io.IOException;
import javax.swing.JFrame;

public class Test1 {

	public static void main(String[] args)throws IOException  {
		EventQueue.invokeLater(new Runnable(){  //ʱ������߳�
			public void run()
			{
				SimpleFrame frame=new SimpleFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //�ر�
				frame.setVisible(true); //��ʾ���
			}
		});
	}
}
