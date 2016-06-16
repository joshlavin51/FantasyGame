package window;

import game.Bandit;
import game.Character;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;

import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class GameWindow {
	private JFrame frame;
	private final Action action = new SwingAction();
	private JPanel panelGame;
	private JPanel panelWelcome;
	private JButton btnStart;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Character ch1 = new Bandit();
	private JPanel panelChooseCharacter;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow window = new GameWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panelWelcome = new JPanel();
		frame.getContentPane().add(panelWelcome, "name_1786937010059022");
		panelWelcome.setLayout(null);
		
		btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelWelcome.setVisible(false);
				panelChooseCharacter.setVisible(true);
			}
		});
		btnStart.setBounds(167, 141, 91, 23);
		panelWelcome.add(btnStart);
		
		JLabel label = new JLabel("");
		label.setBounds(189, 65, 46, 14);
		panelWelcome.add(label);
		
		panelGame = new JPanel();
		frame.getContentPane().add(panelGame, "name_1786947344248301");
		panelGame.setLayout(null);
		
		JRadioButton rdbtnSkill1 = new JRadioButton(ch1.SK1().getSkillName());
		buttonGroup.add(rdbtnSkill1);
		rdbtnSkill1.setBounds(6, 206, 109, 23);
		panelGame.add(rdbtnSkill1);
		
		JRadioButton rdbtnSkill2 = new JRadioButton(ch1.SK2().getSkillName());
		buttonGroup.add(rdbtnSkill2);
		rdbtnSkill2.setBounds(6, 232, 109, 23);
		panelGame.add(rdbtnSkill2);
		
		JRadioButton rdbtnSkill3 = new JRadioButton(ch1.SK3().getSkillName());
		buttonGroup.add(rdbtnSkill3);
		rdbtnSkill3.setBounds(175, 232, 109, 23);
		panelGame.add(rdbtnSkill3);
		
		JRadioButton rdbtnSkill4 = new JRadioButton(ch1.SK4().getSkillName());
		buttonGroup.add(rdbtnSkill4);
		rdbtnSkill4.setBounds(335, 232, 109, 23);
		panelGame.add(rdbtnSkill4);
		
		JRadioButton rdbtnSkill5 = new JRadioButton(ch1.SK5().getSkillName());
		buttonGroup.add(rdbtnSkill5);
		rdbtnSkill5.setBounds(335, 206, 109, 23);
		panelGame.add(rdbtnSkill5);
		
		JButton btnConfirmMove = new JButton("Select");
		btnConfirmMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConfirmMove.setBounds(165, 206, 91, 23);
		panelGame.add(btnConfirmMove);
		rdbtnSkill1.setToolTipText(ch1.SK1().getSkillDescription());
		rdbtnSkill2.setToolTipText(ch1.SK2().getSkillDescription());
		rdbtnSkill3.setToolTipText(ch1.SK3().getSkillDescription());
		rdbtnSkill4.setToolTipText(ch1.SK4().getSkillDescription());
		rdbtnSkill5.setToolTipText(ch1.SK5().getSkillDescription());
		
		panelChooseCharacter = new JPanel();
		frame.getContentPane().add(panelChooseCharacter, "name_631367793784");
		panelChooseCharacter.setLayout(null);
		
		JRadioButton rdbtnBandit = new JRadioButton("Bandit");
		rdbtnBandit.setSelected(true);
		buttonGroup.add(rdbtnBandit);
		rdbtnBandit.setBounds(6, 7, 109, 23);
		panelChooseCharacter.add(rdbtnBandit);
		
		JRadioButton rdbtnWarrior = new JRadioButton("Warrior");
		buttonGroup.add(rdbtnWarrior);
		rdbtnWarrior.setBounds(6, 33, 109, 23);
		panelChooseCharacter.add(rdbtnWarrior);
		
		JRadioButton rdbtnKnight = new JRadioButton("Knight");
		buttonGroup.add(rdbtnKnight);
		rdbtnKnight.setBounds(6, 59, 109, 23);
		panelChooseCharacter.add(rdbtnKnight);
		
		JRadioButton rdbtnDwarf = new JRadioButton("Dwarf");
		buttonGroup.add(rdbtnDwarf);
		rdbtnDwarf.setBounds(319, 33, 109, 23);
		panelChooseCharacter.add(rdbtnDwarf);
		
		JRadioButton rdbtnDemon = new JRadioButton("Demon");
		buttonGroup.add(rdbtnDemon);
		rdbtnDemon.setBounds(319, 7, 109, 23);
		panelChooseCharacter.add(rdbtnDemon);
		
		JRadioButton rdbtnWerewolf = new JRadioButton("Werewolf");
		buttonGroup.add(rdbtnWerewolf);
		rdbtnWerewolf.setBounds(319, 59, 109, 23);
		panelChooseCharacter.add(rdbtnWerewolf);
		
		JRadioButton rdbtnRandom = new JRadioButton("Random");
		buttonGroup.add(rdbtnRandom);
		rdbtnRandom.setBounds(325, 232, 109, 23);
		panelChooseCharacter.add(rdbtnRandom);
		
		JRadioButton rdbtnWizard = new JRadioButton("Wizard");
		buttonGroup.add(rdbtnWizard);
		rdbtnWizard.setBounds(6, 232, 109, 23);
		panelChooseCharacter.add(rdbtnWizard);
		
		JRadioButton rdbtnCyclops = new JRadioButton("Dwayde");
		buttonGroup.add(rdbtnCyclops);
		rdbtnCyclops.setBounds(6, 206, 109, 23);
		panelChooseCharacter.add(rdbtnCyclops);
		
		JRadioButton rdbtnPirate = new JRadioButton("Argh");
		buttonGroup.add(rdbtnPirate);
		rdbtnPirate.setBounds(325, 206, 109, 23);
		panelChooseCharacter.add(rdbtnPirate);
		
		JButton btnConfirm = new JButton("Confirm!");
		btnConfirm.setBounds(173, 206, 91, 23);
		panelChooseCharacter.add(btnConfirm);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(190, 118, 46, 14);
		panelChooseCharacter.add(lblNewLabel);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
