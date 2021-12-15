package PackageLighting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.Rectangle;
import java.awt.Window.Type;

public class TrafficLightSimulation {

	private JFrame frmTrafficlight;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrafficLightSimulation window = new TrafficLightSimulation();
					window.frmTrafficlight.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TrafficLightSimulation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrafficlight = new JFrame();
		frmTrafficlight.setTitle("Traffic_Light");
		frmTrafficlight.setBounds(100, 100, 450, 300);
		frmTrafficlight.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frmTrafficlight.getContentPane().add(panel, BorderLayout.CENTER);
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton.setText("STOP!!");
				rdbtnNewRadioButton.setForeground(Color.RED);
				rdbtnNewRadioButton_1.setText(null);			
				rdbtnNewRadioButton_2.setText(null);
			}
		});
		rdbtnNewRadioButton.setBackground(Color.BLACK);
		buttonGroup.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_1.setText("WAIT~");
				rdbtnNewRadioButton_1.setForeground(Color.YELLOW);
				rdbtnNewRadioButton.setText(null);			
				rdbtnNewRadioButton_2.setText(null);
			}
		});
		rdbtnNewRadioButton_1.setBackground(Color.BLACK);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		
		rdbtnNewRadioButton_2.setFont(new Font("Arial", Font.BOLD, 12));
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_2.setText("GO>>");
				rdbtnNewRadioButton_2.setForeground(Color.GREEN);
				rdbtnNewRadioButton.setText(null);			
				rdbtnNewRadioButton_1.setText(null);
			}
		});
		rdbtnNewRadioButton_2.setBackground(Color.BLACK);
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("TRAFFIC_LIGHT");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(176)
					.addComponent(lblNewLabel)
					.addContainerGap(120, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(223)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton_2)
							.addContainerGap())
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(rdbtnNewRadioButton_1, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(rdbtnNewRadioButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(190)))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(rdbtnNewRadioButton)
					.addGap(18)
					.addComponent(rdbtnNewRadioButton_1)
					.addGap(18)
					.addComponent(rdbtnNewRadioButton_2)
					.addGap(108))
		);
		panel.setLayout(gl_panel);
	}
}
