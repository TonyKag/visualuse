package com.java.ao.collections.visualuse;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VisualUse extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String... args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VisualUse().setVisible(true);
			}
		});
	}

	private JButton button1;
	private long counter = 0;
	private FlowLayout layout;
	private javax.swing.Timer timer;

	private JButton uselesButton;

	public VisualUse() {
		super("Button");
		layout = new FlowLayout(FlowLayout.CENTER);
		setLayout(layout);
		setDefaultCloseOperation(3);
		setSize(300, 300);
		setLocationRelativeTo(null);

		// initialing swing timer
		timer = new javax.swing.Timer(100, getButtonAction());

		button1 = new JButton("Auto");
		add(button1);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!timer.isRunning()) {
					timer.start();
				} else {
					timer.stop();
				}
			}
		});
	}

	private ActionListener getButtonAction() {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button1.setText(String.format("Pressed %d times", ++counter));
				if (counter > 1000) {
					timer.stop();
				}
			}
		};
		return action;
	}
}