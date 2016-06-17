package window;

import game.Bandit;
import game.Character;
import game.Cyclops;
import game.Demon;
import game.Dwarf;
import game.Knight;
import game.Pirate;
import game.Warrior;
import game.Werewolf;
import game.Wizard;

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

import javax.swing.JTextPane;

import java.awt.Font;

public class GameWindow {
	private JFrame frame;
	private final Action action = new SwingAction();
	private JPanel panelGame;
	private JPanel panelWelcome;
	private JButton btnStart;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Character dummy = new Bandit();
	private Character ch1;
	private Character ch2;
	private JPanel panelChooseCharacter;
	private int chooser = 1;
	private JLabel lblP1P2;
	
	private JRadioButton rdbtnBandit;
	private JRadioButton rdbtnWarrior;
	private JRadioButton rdbtnKnight;
	private JRadioButton rdbtnCyclops;
	private JRadioButton rdbtnWizard;
	private JRadioButton rdbtnDemon;
	private JRadioButton rdbtnDwarf;
	private JRadioButton rdbtnWerewolf;
	private JRadioButton rdbtnPirate;
	private JRadioButton rdbtnRandom;
	private JRadioButton rdbtnSkill1;
	private JRadioButton rdbtnSkill2;
	private JRadioButton rdbtnSkill3;
	private JRadioButton rdbtnSkill5;
	private JRadioButton rdbtnSkill4;
	
	

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
		ch1 = dummy;
		ch2 = dummy;
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
		
		rdbtnSkill1 = new JRadioButton(dummy.SK1().getSkillName());
		buttonGroup.add(rdbtnSkill1);
		rdbtnSkill1.setBounds(6, 206, 109, 23);
		panelGame.add(rdbtnSkill1);
		
		rdbtnSkill2 = new JRadioButton(dummy.SK2().getSkillName());
		buttonGroup.add(rdbtnSkill2);
		rdbtnSkill2.setBounds(6, 232, 109, 23);
		panelGame.add(rdbtnSkill2);
		
		rdbtnSkill3 = new JRadioButton(dummy.SK3().getSkillName());
		buttonGroup.add(rdbtnSkill3);
		rdbtnSkill3.setBounds(175, 232, 109, 23);
		panelGame.add(rdbtnSkill3);
		
		rdbtnSkill4 = new JRadioButton(dummy.SK4().getSkillName());
		buttonGroup.add(rdbtnSkill4);
		rdbtnSkill4.setBounds(335, 232, 109, 23);
		panelGame.add(rdbtnSkill4);
		
		rdbtnSkill5 = new JRadioButton(dummy.SK5().getSkillName());
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
		/*
		rdbtnSkill1.setToolTipText(ch1.SK1().getSkillDescription());
		rdbtnSkill2.setToolTipText(ch1.SK2().getSkillDescription());
		rdbtnSkill3.setToolTipText(ch1.SK3().getSkillDescription());
		rdbtnSkill4.setToolTipText(ch1.SK4().getSkillDescription());
		rdbtnSkill5.setToolTipText(ch1.SK5().getSkillDescription());
		*/
		
		panelChooseCharacter = new JPanel();
		frame.getContentPane().add(panelChooseCharacter, "name_631367793784");
		panelChooseCharacter.setLayout(null);
		
		rdbtnBandit = new JRadioButton("Bandit");
		rdbtnBandit.setSelected(true);
		buttonGroup.add(rdbtnBandit);
		rdbtnBandit.setBounds(6, 7, 109, 23);
		panelChooseCharacter.add(rdbtnBandit);
		
		rdbtnWarrior = new JRadioButton("Warrior");
		buttonGroup.add(rdbtnWarrior);
		rdbtnWarrior.setBounds(6, 33, 109, 23);
		panelChooseCharacter.add(rdbtnWarrior);
		
		rdbtnKnight = new JRadioButton("Knight");
		buttonGroup.add(rdbtnKnight);
		rdbtnKnight.setBounds(6, 59, 109, 23);
		panelChooseCharacter.add(rdbtnKnight);
		
		rdbtnDwarf = new JRadioButton("Dwarf");
		buttonGroup.add(rdbtnDwarf);
		rdbtnDwarf.setBounds(319, 33, 109, 23);
		panelChooseCharacter.add(rdbtnDwarf);
		
		rdbtnDemon = new JRadioButton("Demon");
		buttonGroup.add(rdbtnDemon);
		rdbtnDemon.setBounds(319, 7, 109, 23);
		panelChooseCharacter.add(rdbtnDemon);
		
		rdbtnWerewolf = new JRadioButton("Werewolf");
		buttonGroup.add(rdbtnWerewolf);
		rdbtnWerewolf.setBounds(319, 59, 109, 23);
		panelChooseCharacter.add(rdbtnWerewolf);
		
		rdbtnRandom = new JRadioButton("Random");
		buttonGroup.add(rdbtnRandom);
		rdbtnRandom.setBounds(325, 232, 109, 23);
		panelChooseCharacter.add(rdbtnRandom);
		
		rdbtnWizard = new JRadioButton("Wizard");
		buttonGroup.add(rdbtnWizard);
		rdbtnWizard.setBounds(6, 232, 109, 23);
		panelChooseCharacter.add(rdbtnWizard);
		
		rdbtnCyclops = new JRadioButton("Dwayde");
		buttonGroup.add(rdbtnCyclops);
		rdbtnCyclops.setBounds(6, 206, 109, 23);
		panelChooseCharacter.add(rdbtnCyclops);
		
		rdbtnPirate = new JRadioButton("Argh");
		buttonGroup.add(rdbtnPirate);
		rdbtnPirate.setBounds(325, 206, 109, 23);
		panelChooseCharacter.add(rdbtnPirate);
		
		JButton btnConfirm = new JButton("Confirm!");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chooser == 1){
					setCharacter1();
					chooser++;
					lblP1P2.setText("Player " + chooser + ": Choose your character");
				} else {
					
					rdbtnSkill1.setText(ch1.SK1().getSkillName());
					rdbtnSkill2.setText(ch1.SK2().getSkillName());
					rdbtnSkill3.setText(ch1.SK3().getSkillName());
					rdbtnSkill4.setText(ch1.SK4().getSkillName());
					rdbtnSkill5.setText(ch1.SK5().getSkillName());
					
					panelChooseCharacter.setVisible(false);
					panelGame.setVisible(true);
				}
			}
		});
		btnConfirm.setBounds(173, 206, 91, 23);
		panelChooseCharacter.add(btnConfirm);
		
		lblP1P2 = new JLabel("Player " + chooser + ": Choose your character");
		lblP1P2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblP1P2.setBounds(138, 179, 193, 14);
		panelChooseCharacter.add(lblP1P2);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	private void setCharacter1(){
		if (rdbtnBandit.isSelected() == true){
			ch1 = new Bandit();
		}
		else if (rdbtnWarrior.isSelected() == true){
			ch1 = new Warrior();
		}
		else if (rdbtnKnight.isSelected() == true){
			ch1 = new Knight();
		}
		else if (rdbtnCyclops.isSelected() == true){
			ch1 = new Cyclops();
		}
		else if (rdbtnWizard.isSelected() == true){
			ch1 = new Wizard();
		}
		else if (rdbtnDemon.isSelected() == true){
			ch1 = new Demon();
		}
		else if (rdbtnDwarf.isSelected() == true){
			ch1 = new Dwarf();
		}
		else if (rdbtnWerewolf.isSelected() == true){
			ch1 = new Werewolf();
		}
		else if (rdbtnPirate.isSelected() == true){
			ch1 = new Pirate();
		}
		else {
			ch1 = new Bandit();
		}
	}
	private void setCharacter2(){
		if (rdbtnBandit.isSelected() == true){
			ch2 = new Bandit();
		}
		else if (rdbtnWarrior.isSelected() == true){
			ch2 = new Warrior();
		}
		else if (rdbtnKnight.isSelected() == true){
			ch2 = new Knight();
		}
		else if (rdbtnCyclops.isSelected() == true){
			ch2 = new Cyclops();
		}
		else if (rdbtnWizard.isSelected() == true){
			ch2 = new Wizard();
		}
		else if (rdbtnDemon.isSelected() == true){
			ch2 = new Demon();
		}
		else if (rdbtnDwarf.isSelected() == true){
			ch2 = new Dwarf();
		}
		else if (rdbtnWerewolf.isSelected() == true){
			ch2 = new Werewolf();
		}
		else if (rdbtnPirate.isSelected() == true){
			ch2 = new Pirate();
		}
		else {
			ch2 = new Bandit();
		}
	}
}
