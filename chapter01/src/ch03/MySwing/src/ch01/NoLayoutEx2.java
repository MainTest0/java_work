package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
public NoLayoutEx2() {

	setInitLayout();
	initData();
	
}
	
	private void initData() {

		setTitle("NoLayoutEx2");
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("버튼1");
		button1.setSize(100, 300);
		button2 = new JButton("버튼2");
		button2.setSize(300, 500);
		button3 = new JButton("버튼3");
		button3.setSize(500, 700);
	
}
	
	private void setInitLayout() {
		setLayout(null);
		setVisible(true);
		
		button1.setLocation(100,200);
		add(button1);
		
		button2.setLocation(200,300);
		add(button2);
		
		button3.setLocation(300,400);
		add(button3);
	
}

	public static void main(String[] args) {
		new NoLayoutEx2();
	}

}
