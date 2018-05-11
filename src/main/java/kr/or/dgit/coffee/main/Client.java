package kr.or.dgit.coffee.main;

import java.awt.EventQueue;

import kr.or.dgit.coffee.ui.StartUI;

public class Client {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartUI frame = new StartUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

