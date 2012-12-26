package com.demo.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Test extends JFrame implements ActionListener {

	public Test() {
		this.setBounds(300, 300, 300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Test");

		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem miOpen = new JMenuItem("Open");
		mnFile.add(miOpen);
		miOpen.setActionCommand("Open");
		// miOpen.addActionListener(new ActionListener(){
		// public void actionPerformed(ActionEvent e){
		// System.out.println(e.getActionCommand());
		// }
		// });
		miOpen.addActionListener(this);

		JButton jb = new JButton("1212");
		jb.setActionCommand("Button");
		jb.addActionListener(this);
		jb.setVisible(true);
		 this.getContentPane().add(jb);//	this.add(jb);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
	}

}
