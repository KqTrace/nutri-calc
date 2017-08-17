package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import net.miginfocom.swing.MigLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridBagConstraints;

public class FrameApplication extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameApplication frame = new FrameApplication();
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
	public FrameApplication() {
		setResizable(false);
		setTitle("NutriCalc  V. 0.0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 448);
		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit().getImage(
						FrameApplication.class.getResource("/imagens/bg.jpg"));
						//g.drawImage(img, -40, -50, this.getWidth()*2, this.getHeight()*2, this);
						g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		//panel.setBackground(new Color(215,233,207));
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 448, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 298, Short.MAX_VALUE)
					.addContainerGap())
		);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{92, 263, 0};
		gbl_panel_1.rowHeights = new int[]{37, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		//ImageIcon imgI = new ImageIcon(getClass().getResource("imagens/bg_button.png"));
		JButton btnAlimentos = new JButton("");
		btnAlimentos.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAlimentos.setBorder(null);
		btnAlimentos.setBorderPainted(false);
		btnAlimentos.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
		
		btnAlimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		btnAlimentos.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {
				btnAlimentos.setIcon(new ImageIcon(FrameApplication.class.getResource("/imagens/bg_button_clicked.png")));
			}
			public void mouseEntered(MouseEvent arg0) {
				btnAlimentos.setIcon(new ImageIcon(FrameApplication.class.getResource("/imagens/bg_button_hover.png")));
			}
			public void mouseExited(MouseEvent arg0) {
				btnAlimentos.setIcon(new ImageIcon(FrameApplication.class.getResource("/imagens/bg_button.png")));
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseReleased(MouseEvent arg0) {
			}
			
		});
		btnAlimentos.setIcon(new ImageIcon(FrameApplication.class.getResource("/imagens/bg_button.png")));
		GridBagConstraints gbc_btnAlimentos = new GridBagConstraints();
		gbc_btnAlimentos.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnAlimentos.gridx = 1;
		gbc_btnAlimentos.gridy = 1;
		panel_1.add(btnAlimentos, gbc_btnAlimentos);
		
		JLabel lblNewLabel = new JLabel("Nutri Calc");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 30));
		
		JLabel lblVerso = new JLabel("Vers\u00E3o 0.0.1");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(111)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
					.addGap(101))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(193, Short.MAX_VALUE)
					.addComponent(lblVerso)
					.addGap(189))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblVerso)
					.addGap(21))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
