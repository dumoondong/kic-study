package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ColorPickerEx01 extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JSlider slider1;
	private JSlider slider2;
	private JSlider slider3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorPickerEx01 frame = new ColorPickerEx01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ColorPickerEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC0C9\uC0C1\uC120\uD0DD\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 17, 416, 267);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("Red");
		lbl1.setBounds(6, 17, 72, 51);
		panel.add(lbl1);
		
		slider1 = new JSlider();
		slider1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//red
				if(panel_1 != null) {
					int red = slider1.getValue();
					int green = slider2.getValue();
					int blue = slider3.getValue();
					panel_1.setBackground(new Color(red,green,blue));
				}
			}
		});
		slider1.setValue(0);
		slider1.setPaintTicks(true);
		slider1.setPaintLabels(true);
		slider1.setMajorTickSpacing(50);
		slider1.setMaximum(255);
		slider1.setBounds(79, 17, 323, 51);
		panel.add(slider1);
		
		JLabel lbl2 = new JLabel("Green");
		lbl2.setBounds(6, 89, 72, 47);
		panel.add(lbl2);
		
		slider2 = new JSlider();
		slider2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(panel_1 != null) {
					int red = slider1.getValue();
					int green = slider2.getValue();
					int blue = slider3.getValue();
					panel_1.setBackground(new Color(red,green,blue));
				}
			}
		});
		slider2.setValue(0);
		slider2.setPaintTicks(true);
		slider2.setPaintLabels(true);
		slider2.setMaximum(255);
		slider2.setMajorTickSpacing(50);
		slider2.setBounds(79, 89, 323, 47);
		panel.add(slider2);
		
		JLabel lbl3 = new JLabel("Blue");
		lbl3.setBounds(6, 172, 72, 62);
		panel.add(lbl3);
		
		slider3 = new JSlider();
		slider3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(panel_1 != null) {
					int red = slider1.getValue();
					int green = slider2.getValue();
					int blue = slider3.getValue();
					panel_1.setBackground(new Color(red,green,blue));
				}
			}
		});
		slider3.setValue(0);
		slider3.setPaintLabels(true);
		slider3.setPaintTicks(true);
		slider3.setMaximum(255);
		slider3.setMajorTickSpacing(50);
		slider3.setBounds(79, 172, 323, 62);
		panel.add(slider3);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(6, 294, 416, 65);
		contentPane.add(panel_1);
		
		JButton btn = new JButton("초기화");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				slider1.setValue(0);
				slider2.setValue(0);
				slider3.setValue(0);	
				panel_1.setBackground(new Color(0,0,0));
			}
		});
		btn.setBounds(6, 374, 416, 23);
		contentPane.add(btn);
	}
}
