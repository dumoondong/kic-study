package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JFrameEx03 extends JFrame {

	private JPanel contentPane;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx03 frame = new JFrameEx03();
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
	public JFrameEx03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			}
		});
		SpinnerNumberModel model = (new SpinnerNumberModel(50, 0, 100, 10));
		spinner.setModel(model);
		spinner.setBounds(12, 10, 229, 22);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		String[] items = new String[] {"사과", "참외", "수박", "딸기"};
		SpinnerListModel listModel = new SpinnerListModel(items);
		spinner_1.setModel(listModel);
		spinner_1.setBounds(12, 42, 229, 22);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerDateModel(new Date(1620918000000L), new Date(1620572400000L), new Date(1621436400000L), Calendar.HOUR));
		spinner_2.setBounds(12, 74, 229, 22);
		contentPane.add(spinner_2);
		
		JButton btn = new JButton("New button");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println((Integer)spinner.getValue());
			}
		});
		btn.setBounds(317, 9, 97, 23);
		contentPane.add(btn);
	}
}
