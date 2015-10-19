/**
 *   File Name: Visualuse.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 19, 2015
 *   
 */

package com.java.ao.collections.visualuse;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 * Visualuse class. Purpose is demonstrate java collections
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Visualuse {

	public static String inEditableArea = "in editable area";

	public static String labelBtn1 = "Button1"; // Button's Label
	public static String labelBtn2 = "Button2"; // Button's Label
	public static String labelBtn3 = "Button3"; // Button's Label

	public static String onTitleBar = "on title bar";
	private static int btn1DimensionX = 80;
	private static int btn1DimensionY = 25;
	private static int btn1LocationX = 575;
	private static int btn1LocationY = 30;
	private static int btn2DimensionX = 80;
	private static int btn2DimensionY = 25;
	private static int btn2LocationX = 575;
	private static int btn2LocationY = 70;
	private static int btn3DimensionX = 80;
	private static int btn3DimensionY = 25;
	private static int btn3LocationX = 575;
	private static int btn3LocationY = 110;

	private static int frameDimensionX = 700;
	private static int frameDimensionY = 500;
	private static int frameLocationX = 400;
	private static int frameLocationY = 200;

	public static void main(String[] args) {
		running1();

	}

	/**
	 * 
	 */
	public static void running1() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// on title bar
				JFrame frame = new JFrame(onTitleBar);
				// in editable area
				JTextArea text = new JTextArea(inEditableArea);

				// frame.setLayout(new FlowLayout());
				frame.setLayout(null);

				frame.setPreferredSize(new Dimension(frameDimensionX, frameDimensionY));
				frame.setLocation(frameLocationX, frameLocationY);
				frame.add(text);
				frame.pack();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);

				// frame.setLayout(new BorderLayout());

				JButton button1 = new JButton(labelBtn1);
				button1.setPreferredSize(new Dimension(btn1DimensionX, btn1DimensionY));
				button1.setBounds(btn1LocationX, btn1LocationY, btn1DimensionX, btn1DimensionY);
				frame.add(button1);

				JButton button2 = new JButton(labelBtn2);
				button2.setPreferredSize(new Dimension(btn2DimensionX, btn2DimensionY));
				button2.setBounds(btn2LocationX, btn2LocationY, btn2DimensionX, btn2DimensionY);
				frame.add(button2, BorderLayout.PAGE_START);

				JButton button3 = new JButton(labelBtn3);
				button3.setPreferredSize(new Dimension(btn3DimensionX, btn3DimensionY));
				button3.setBounds(btn3LocationX, btn3LocationY, btn3DimensionX, btn3DimensionY);
				frame.add(button3, BorderLayout.PAGE_START);

				button1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// execute when button is pressed
						// frame.getContentPane().add(button1);
						// frame.pack();
						// frame.setVisible(true);
					}
				});
			}
		});

	}

}