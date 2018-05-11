package kr.or.dgit.main;

import java.awt.EventQueue;


import kr.or.dgit.ui.StartUI;

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

