package windowBuilder.views;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.border.CompoundBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;

public class startFrame extends JFrame {

	//COMPONENTS
	private JPanel cards;
	private JPanel ctpStart;
	private JButton btnStartGame;
	private JButton btnRules;
	private JButton btnQuit;
	private JPanel ctpMain;
	private JPanel ctpRules;
	private JButton btnBack;
	private CardLayout cl;
	private JComboBox comboBox;
	private JTextField txt3;
	private JTextField txt2;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txt8;
	private JTextField txt1;
	private JLabel lblP1;
	private JLabel lblP2;
	private JLabel lblP3;
	private JLabel lblP4;
	private JLabel lblP5;
	private JLabel lblP6;
	private JLabel lblP7;
	private JLabel lblP8;
	private JButton btnStart;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startFrame frame = new startFrame();
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
	public startFrame() {
		cards = new JPanel(new CardLayout());
		cl = (CardLayout)cards.getLayout();
		setResizable(false);
		initComponents();
		createEvents();
	}
	
	/**
	 * Create and initialize components.
	 */
	private void initComponents() {
		setTitle("Illuminati: The Game of Conspiracy");
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(startFrame.class.getResource("/windowBuilder/resources/pyramid_icon_32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1145, 753);
		ctpStart = new JPanel();
		ctpStart.setBackground(new Color(255, 250, 240));
		ctpStart.setBorder(null);
		//setContentPane(ctpStart);
		cards.add(ctpStart, "ctpStart");
		getContentPane().add(cards);
		
		//ILLUMINATI TITLE IMAGE
		JLabel lblTitle = new JLabel("");
		lblTitle.setIcon(new ImageIcon(startFrame.class.getResource("/windowBuilder/resources/Illuminati_title_600x211.png")));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		//ILLUMINATI SUBTITLE
		JLabel lblSubtitle = new JLabel("T H E  G A M E  O F  C O N S P I R A C Y");
		lblSubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubtitle.setFont(new Font("Times New Roman", Font.BOLD, 28));
		
		//START BUTTON
		btnStartGame = new JButton("START GAME");
		btnStartGame.setHideActionText(true);
		btnStartGame.setFocusable(false);
		btnStartGame.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnStartGame.setBorder(null);
		btnStartGame.setBackground(new Color(255, 250, 240));
		btnStartGame.setAlignmentX(0.5f);
		btnStartGame.setHorizontalTextPosition(SwingConstants.CENTER);
		
		//RULES BUTTON
		btnRules = new JButton("RULES");
		btnRules.setFocusable(false);
		btnRules.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRules.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnRules.setBorder(null);
		btnRules.setBackground(new Color(255, 250, 240));
		btnRules.setAlignmentX(0.5f);
		
		//QUIT BUTTON
		btnQuit = new JButton("QUIT");
		btnQuit.setFocusable(false);
		btnQuit.setHorizontalTextPosition(SwingConstants.CENTER);
		btnQuit.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnQuit.setBorder(null);
		btnQuit.setBackground(new Color(255, 250, 240));
		btnQuit.setAlignmentX(0.5f);
		
		//APPLY GROUP LAYOUT
		GroupLayout gl_ctpStart = new GroupLayout(ctpStart);
		gl_ctpStart.setHorizontalGroup(
			gl_ctpStart.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpStart.createSequentialGroup()
					.addGap(310)
					.addComponent(lblSubtitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(311))
				.addGroup(gl_ctpStart.createSequentialGroup()
					.addGap(265)
					.addComponent(lblTitle)
					.addContainerGap(278, Short.MAX_VALUE))
				.addGroup(gl_ctpStart.createSequentialGroup()
					.addGap(497)
					.addComponent(btnStartGame, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(507, Short.MAX_VALUE))
				.addGroup(gl_ctpStart.createSequentialGroup()
					.addGap(535)
					.addComponent(btnRules, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(536, Short.MAX_VALUE))
				.addGroup(gl_ctpStart.createSequentialGroup()
					.addGap(539)
					.addComponent(btnQuit, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(539, Short.MAX_VALUE))
		);
		gl_ctpStart.setVerticalGroup(
			gl_ctpStart.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpStart.createSequentialGroup()
					.addGap(168)
					.addComponent(lblTitle)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSubtitle)
					.addGap(58)
					.addComponent(btnStartGame)
					.addGap(18)
					.addComponent(btnRules, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnQuit, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGap(155))
		);
		ctpStart.setLayout(gl_ctpStart);
		
		ctpMain = new JPanel();
		ctpMain.setBackground(new Color(255, 250, 240));
		cards.add(ctpMain, "ctpMain");
		
		comboBox = new JComboBox();
		comboBox.setRequestFocusEnabled(false);
		
		comboBox.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox.setFocusable(false);
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8"}));
		comboBox.setSelectedIndex(2);
		
		JLabel lblNumberOfPlayers = new JLabel("NUMBER OF PLAYERS:");
		lblNumberOfPlayers.setFont(new Font("Lucida Sans", Font.BOLD, 15));
		
		btnBack = new JButton("");
		
		btnBack.setBorder(null);
		btnBack.setBackground(new Color(255, 250, 240));
		btnBack.setIcon(new ImageIcon(startFrame.class.getResource("/windowBuilder/resources/back_arrow_32.png")));
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Arial", Font.PLAIN, 11));
		txt1.setColumns(10);
		txt1.setVisible(true);
		txt2 = new JTextField();
		txt2.setFont(new Font("Arial", Font.PLAIN, 11));
		txt2.setColumns(10);
		txt2.setVisible(true);
		txt3 = new JTextField();
		txt3.setFont(new Font("Arial", Font.PLAIN, 11));
		txt3.setColumns(10);
		txt3.setVisible(true);
		txt4 = new JTextField();
		txt4.setFont(new Font("Arial", Font.PLAIN, 11));
		txt4.setColumns(10);
		txt4.setVisible(true);
		txt5 = new JTextField();
		txt5.setFont(new Font("Arial", Font.PLAIN, 11));
		txt5.setVisible(false);
		txt5.setColumns(10);
		txt6 = new JTextField();
		txt6.setFont(new Font("Arial", Font.PLAIN, 11));
		txt6.setVisible(false);
		txt6.setColumns(10);
		txt7 = new JTextField();
		txt7.setFont(new Font("Arial", Font.PLAIN, 11));
		txt7.setVisible(false);
		txt7.setColumns(10);
		txt8 = new JTextField();
		txt8.setFont(new Font("Arial", Font.PLAIN, 11));
		txt8.setVisible(false);
		txt8.setColumns(10);
		
		lblP1 = new JLabel("P1");
		lblP1.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblP2 = new JLabel("P2");
		lblP2.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblP3 = new JLabel("P3");
		lblP3.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblP4 = new JLabel("P4");
		lblP4.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblP5 = new JLabel("P5");
		lblP5.setVisible(false);
		lblP5.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblP6 = new JLabel("P6");
		lblP6.setVisible(false);
		lblP6.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblP7 = new JLabel("P7");
		lblP7.setVisible(false);
		lblP7.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblP8 = new JLabel("P8");
		lblP8.setVisible(false);
		lblP8.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		
		btnStart = new JButton("START GAME");
		btnStart.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		btnStart.setBorder(null);
		btnStart.setBackground(new Color(255, 250, 240));
		
		
		GroupLayout gl_ctpMain = new GroupLayout(ctpMain);
		gl_ctpMain.setHorizontalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ctpMain.createSequentialGroup()
							.addGap(368)
							.addComponent(lblNumberOfPlayers)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ctpMain.createSequentialGroup()
							.addGap(434)
							.addGroup(gl_ctpMain.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_ctpMain.createSequentialGroup()
									.addGroup(gl_ctpMain.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblP8, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblP7, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblP6, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblP5, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblP4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblP3, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
										.addComponent(txt4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txt5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txt6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txt7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txt8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txt3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_ctpMain.createSequentialGroup()
									.addComponent(lblP1)
									.addGap(18)
									.addComponent(txt1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_ctpMain.createSequentialGroup()
									.addComponent(lblP2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(txt2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_ctpMain.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnBack)))
					.addContainerGap(548, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_ctpMain.createSequentialGroup()
					.addContainerGap(998, Short.MAX_VALUE)
					.addComponent(btnStart)
					.addContainerGap())
		);
		gl_ctpMain.setVerticalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(227)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumberOfPlayers, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblP1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblP2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblP3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblP4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblP5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblP6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblP7, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblP8, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
					.addComponent(btnStart)
					.addContainerGap())
		);
		ctpMain.setLayout(gl_ctpMain);
	
		ctpRules = new JPanel();
		ctpRules.setBackground(new Color(255, 250, 240));
		cards.add(ctpRules, "ctpRules");
		
		JLabel lblTest = new JLabel("");
		lblTest.setIcon(new ImageIcon(startFrame.class.getResource("/windowBuilder/resources/rules_p1.png")));
		GroupLayout gl_ctpRules = new GroupLayout(ctpRules);
		gl_ctpRules.setHorizontalGroup(
			gl_ctpRules.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpRules.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTest)
					.addContainerGap(204, Short.MAX_VALUE))
		);
		gl_ctpRules.setVerticalGroup(
			gl_ctpRules.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_ctpRules.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTest)
					.addContainerGap(199, Short.MAX_VALUE))
		);
		ctpRules.setLayout(gl_ctpRules);
	}
	
	/**
	 * Event handler of components.
	 */
	private void createEvents() {
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object selected = comboBox.getSelectedItem();
				if(selected.toString().equals("2")) {
					txt3.setVisible(false);
					txt4.setVisible(false);
					txt5.setVisible(false);
					txt6.setVisible(false);
					txt7.setVisible(false);
					txt8.setVisible(false);
					lblP3.setVisible(false);
					lblP4.setVisible(false);
					lblP5.setVisible(false);
					lblP6.setVisible(false);
					lblP7.setVisible(false);
					lblP8.setVisible(false);
				} 
				if(selected.toString().equals("3")) {
					txt3.setVisible(true);
					txt4.setVisible(false);
					txt5.setVisible(false);
					txt6.setVisible(false);
					txt7.setVisible(false);
					txt8.setVisible(false);
					lblP3.setVisible(true);
					lblP4.setVisible(false);
					lblP5.setVisible(false);
					lblP6.setVisible(false);
					lblP7.setVisible(false);
					lblP8.setVisible(false);
				}
				if(selected.toString().equals("4")) {
					txt3.setVisible(true);
					txt4.setVisible(true);
					txt5.setVisible(false);
					txt6.setVisible(false);
					txt7.setVisible(false);
					txt8.setVisible(false);
					lblP3.setVisible(true);
					lblP4.setVisible(true);
					lblP5.setVisible(false);
					lblP6.setVisible(false);
					lblP7.setVisible(false);
					lblP8.setVisible(false);
				}
				if(selected.toString().equals("5")) {
					txt3.setVisible(true);
					txt4.setVisible(true);
					txt5.setVisible(true);
					txt6.setVisible(false);
					txt7.setVisible(false);
					txt8.setVisible(false);
					lblP3.setVisible(true);
					lblP4.setVisible(true);
					lblP5.setVisible(true);
					lblP6.setVisible(false);
					lblP7.setVisible(false);
					lblP8.setVisible(false);
				}
				if(selected.toString().equals("6")) {
					txt3.setVisible(true);
					txt4.setVisible(true);
					txt5.setVisible(true);
					txt6.setVisible(true);
					txt7.setVisible(false);
					txt8.setVisible(false);
					lblP3.setVisible(true);
					lblP4.setVisible(true);
					lblP5.setVisible(true);
					lblP6.setVisible(true);
					lblP7.setVisible(false);
					lblP8.setVisible(false);
				}
				if(selected.toString().equals("7")) {
					txt3.setVisible(true);
					txt4.setVisible(true);
					txt5.setVisible(true);
					txt6.setVisible(true);
					txt7.setVisible(true);
					txt8.setVisible(false);
					lblP3.setVisible(true);
					lblP4.setVisible(true);
					lblP5.setVisible(true);
					lblP6.setVisible(true);
					lblP7.setVisible(true);
					lblP8.setVisible(false);
				}
				if(selected.toString().equals("8")) {
					txt3.setVisible(true);
					txt4.setVisible(true);
					txt5.setVisible(true);
					txt6.setVisible(true);
					txt7.setVisible(true);
					txt8.setVisible(true);
					lblP3.setVisible(true);
					lblP4.setVisible(true);
					lblP5.setVisible(true);
					lblP6.setVisible(true);
					lblP7.setVisible(true);
					lblP8.setVisible(true);
				}
				
			}
		});
		

		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnStart.setForeground(new Color(50, 205, 50));
			}
			public void mouseExited(MouseEvent e) {
				btnStart.setForeground(new Color(0, 0, 0));
			}
		});
		
		btnStartGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnStartGame.setForeground(new Color(255, 0, 0));
			}
			public void mouseExited(MouseEvent e) {
				btnStartGame.setForeground(new Color(0, 0, 0));
			}
		});
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "ctpMain");
			}
		});
		
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "ctpStart");
			}
		});
		
		
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "ctpRules");
			}
		});
		btnRules.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRules.setForeground(new Color(255, 0, 0));
			}
			public void mouseExited(MouseEvent e) {
				btnRules.setForeground(new Color(0, 0, 0));
			}
		});
		
		
		btnQuit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnQuit.setForeground(new Color(255, 0, 0));
			}
			public void mouseExited(MouseEvent e) {
				btnQuit.setForeground(new Color(0, 0, 0));
			}
		});
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
