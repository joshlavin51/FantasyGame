package window;

import game.Bandit;
import game.Character;
import game.Cyclops;
import game.Demon;
import game.Dwarf;
import game.Knight;
import game.Pirate;
import game.Skill;
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
import java.util.*;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;

import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class GameWindow {
	private JFrame frame;
	private final Action action = new SwingAction();
	private JPanel panelGame;
	private JPanel panelWelcome;
	private JButton btnStart;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Character dummy = new Bandit();
	private Character dummy1;
	private Character dummy2;
	private Character ch1;
	private Character ch2;
	private Skill skl1;
	private Skill skl2;
	private JPanel panelChooseCharacter;
	private int chooser = 1;
	private int chooser1 = 1;
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
	private JLabel lblBattleText;
	private JButton btnConfirmMove;
	private JLabel lblCh1Health;
	private JLabel lblCh2Health;
	
	

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
		frame.setResizable(false);
		frame.setBounds(100, 100, 711, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panelWelcome = new JPanel();
		frame.getContentPane().add(panelWelcome, "name_1786937010059022");
		
		btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelWelcome.setVisible(false);
				panelChooseCharacter.setVisible(true);
			}
		});
		GroupLayout gl_panelWelcome = new GroupLayout(panelWelcome);
		gl_panelWelcome.setHorizontalGroup(
			gl_panelWelcome.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelWelcome.createSequentialGroup()
					.addGap(266)
					.addComponent(btnStart, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
					.addGap(266))
		);
		gl_panelWelcome.setVerticalGroup(
			gl_panelWelcome.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelWelcome.createSequentialGroup()
					.addGap(233)
					.addComponent(btnStart, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
					.addGap(113))
		);
		panelWelcome.setLayout(gl_panelWelcome);
		
		panelGame = new JPanel();
		frame.getContentPane().add(panelGame, "name_1786947344248301");
		panelGame.setLayout(null);
		
		rdbtnSkill1 = new JRadioButton(dummy.SK1().getSkillName());
		buttonGroup.add(rdbtnSkill1);
		rdbtnSkill1.setBounds(6, 235, 161, 23);
		panelGame.add(rdbtnSkill1);
		
		rdbtnSkill2 = new JRadioButton(dummy.SK2().getSkillName());
		buttonGroup.add(rdbtnSkill2);
		rdbtnSkill2.setBounds(6, 355, 161, 23);
		panelGame.add(rdbtnSkill2);
		
		rdbtnSkill3 = new JRadioButton(dummy.SK3().getSkillName());
		buttonGroup.add(rdbtnSkill3);
		rdbtnSkill3.setBounds(6, 315, 161, 23);
		panelGame.add(rdbtnSkill3);
		
		rdbtnSkill4 = new JRadioButton(dummy.SK4().getSkillName());
		buttonGroup.add(rdbtnSkill4);
		rdbtnSkill4.setBounds(6, 195, 161, 23);
		panelGame.add(rdbtnSkill4);
		
		rdbtnSkill5 = new JRadioButton(dummy.SK5().getSkillName());
		buttonGroup.add(rdbtnSkill5);
		rdbtnSkill5.setBounds(6, 275, 161, 23);
		panelGame.add(rdbtnSkill5);
		
		btnConfirmMove = new JButton("Select");
		btnConfirmMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chooser1 == 1){
					lblBattleText.setText("Player 2, select a move.");
					setSkill1();
					rdbtnSkill1.setText(ch2.SK1().getSkillName());
					rdbtnSkill2.setText(ch2.SK2().getSkillName());
					rdbtnSkill3.setText(ch2.SK3().getSkillName());
					rdbtnSkill4.setText(ch2.SK4().getSkillName());
					rdbtnSkill5.setText(ch2.SK5().getSkillName());
					rdbtnSkill1.setToolTipText(ch2.SK1().getSkillDescription());
					rdbtnSkill2.setToolTipText(ch2.SK2().getSkillDescription());
					rdbtnSkill3.setToolTipText(ch2.SK3().getSkillDescription());
					rdbtnSkill4.setToolTipText(ch2.SK4().getSkillDescription());
					rdbtnSkill5.setToolTipText(ch2.SK5().getSkillDescription());
					chooser1++;
				} else {
					setSkill2();
					
					rdbtnSkill1.setVisible(false);
					rdbtnSkill2.setVisible(false);
					rdbtnSkill3.setVisible(false);
					rdbtnSkill4.setVisible(false);
					rdbtnSkill5.setVisible(false);
					btnConfirmMove.setVisible(false);
					battleStart();
					
				}
				
			}
		});
		btnConfirmMove.setBounds(6, 385, 161, 37);
		panelGame.add(btnConfirmMove);
		
		lblBattleText = new JLabel("Text goes here");
		lblBattleText.setBounds(199, 386, 442, 34);
		panelGame.add(lblBattleText);
		
		lblCh1Health = new JLabel("P1 Health:");
		lblCh1Health.setBounds(199, 11, 161, 14);
		panelGame.add(lblCh1Health);
		
		lblCh2Health = new JLabel("P2 Health:");
		lblCh2Health.setBounds(434, 11, 161, 14);
		panelGame.add(lblCh2Health);
		
		
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
		rdbtnWarrior.setBounds(6, 100, 109, 23);
		panelChooseCharacter.add(rdbtnWarrior);
		
		rdbtnKnight = new JRadioButton("Knight");
		buttonGroup.add(rdbtnKnight);
		rdbtnKnight.setBounds(6, 205, 109, 23);
		panelChooseCharacter.add(rdbtnKnight);
		
		rdbtnDwarf = new JRadioButton("Dwarf");
		buttonGroup.add(rdbtnDwarf);
		rdbtnDwarf.setBounds(590, 7, 109, 23);
		panelChooseCharacter.add(rdbtnDwarf);
		
		rdbtnDemon = new JRadioButton("Demon");
		buttonGroup.add(rdbtnDemon);
		rdbtnDemon.setBounds(590, 205, 109, 23);
		panelChooseCharacter.add(rdbtnDemon);
		
		rdbtnWerewolf = new JRadioButton("Werewolf");
		buttonGroup.add(rdbtnWerewolf);
		rdbtnWerewolf.setBounds(590, 100, 109, 23);
		panelChooseCharacter.add(rdbtnWerewolf);
		
		rdbtnRandom = new JRadioButton("Random");
		buttonGroup.add(rdbtnRandom);
		rdbtnRandom.setBounds(590, 403, 109, 23);
		panelChooseCharacter.add(rdbtnRandom);
		
		rdbtnWizard = new JRadioButton("Wizard");
		buttonGroup.add(rdbtnWizard);
		rdbtnWizard.setBounds(6, 403, 109, 23);
		panelChooseCharacter.add(rdbtnWizard);
		
		rdbtnCyclops = new JRadioButton("Dwayde");
		buttonGroup.add(rdbtnCyclops);
		rdbtnCyclops.setBounds(6, 302, 109, 23);
		panelChooseCharacter.add(rdbtnCyclops);
		
		rdbtnPirate = new JRadioButton("Argh");
		buttonGroup.add(rdbtnPirate);
		rdbtnPirate.setBounds(590, 302, 109, 23);
		panelChooseCharacter.add(rdbtnPirate);
		
		JButton btnConfirm = new JButton("Confirm!");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chooser == 1){
					setCharacter1();
					dummy1 = ch1;
					chooser++;
					lblP1P2.setText("Player " + chooser + ": Choose your character");
				} else {
					setCharacter2();
					dummy2 = ch2;
					rdbtnSkill1.setText(ch1.SK1().getSkillName());
					rdbtnSkill2.setText(ch1.SK2().getSkillName());
					rdbtnSkill3.setText(ch1.SK3().getSkillName());
					rdbtnSkill4.setText(ch1.SK4().getSkillName());
					rdbtnSkill5.setText(ch1.SK5().getSkillName());
					rdbtnSkill1.setToolTipText(ch1.SK1().getSkillDescription());
					rdbtnSkill2.setToolTipText(ch1.SK2().getSkillDescription());
					rdbtnSkill3.setToolTipText(ch1.SK3().getSkillDescription());
					rdbtnSkill4.setToolTipText(ch1.SK4().getSkillDescription());
					rdbtnSkill5.setToolTipText(ch1.SK5().getSkillDescription());
					
					
					panelChooseCharacter.setVisible(false);
					panelGame.setVisible(true);
					lblBattleText.setText("Player 1, select a move.");
					lblCh1Health.setText("P1 Health: " + (int) ch1.getHealth()+ "/" + (int) ch1.getMaxHealth());
					lblCh2Health.setText("P2 Health: " + (int) ch2.getHealth()+ "/" + (int) ch1.getMaxHealth());
				}
			}
		});
		btnConfirm.setBounds(266, 375, 173, 51);
		panelChooseCharacter.add(btnConfirm);
		
		lblP1P2 = new JLabel("Player " + chooser + ": Choose your character");
		lblP1P2.setHorizontalAlignment(SwingConstants.CENTER);
		lblP1P2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblP1P2.setBounds(256, 324, 193, 14);
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
	public void setSkill1(){
		if (rdbtnSkill1.isSelected() == true){
			skl1 = ch1.SK1();
		}
		if (rdbtnSkill2.isSelected() == true){
			skl1 = ch1.SK2();
		}
		if (rdbtnSkill3.isSelected() == true){
			skl1 = ch1.SK3();
		}
		if (rdbtnSkill4.isSelected() == true){
			skl1 = ch1.SK4();
		}
		if (rdbtnSkill5.isSelected() == true){
			skl1 = ch1.SK5();
		}
	}
	public void setSkill2(){
		if (rdbtnSkill1.isSelected() == true){
			skl2 = ch2.SK1();
		}
		if (rdbtnSkill2.isSelected() == true){
			skl2 = ch2.SK2();
		}
		if (rdbtnSkill3.isSelected() == true){
			skl2 = ch2.SK3();
		}
		if (rdbtnSkill4.isSelected() == true){
			skl2 = ch2.SK4();
		}
		if (rdbtnSkill5.isSelected() == true){
			skl2 = ch2.SK5();
		}
	}
	public void battleStart(){
		if (skl1.getGoesFirst() == true &&  skl2.getGoesFirst() == false){
			battle1();
			battle2();
		}	
		else if (skl2.getGoesFirst() == true && skl1.getGoesFirst() == false){
			battle2();
			battle1();
		} else {
			determineFirst();
		}
	}
	
	// Determines which character goes first in combat
	public void determineFirst(){
		Random rand = new Random(100);
		int speedRatio = 50;
		speedRatio += ch1.getSpeed() - ch2.getSpeed();
		int randNum = rand.nextInt();
		if(speedRatio <= randNum){
			// P2 goes first
			battle1();
			battle2();
		} else {
			// P1 goes first.
			battle2();
			battle1();
		}
		
	}
	public void battle1(){
		// Character Specifics
		int forgeCount1 = 0;
		if (skl1.getSkillName().equals("Forge Armor")){
			forgeCount1++;
		}
		if (skl1.getSkillName().equals("Critical Strike")){
			Random rnd = new Random(3);
			if (rnd.nextInt() == 0){
				skl1.setDM(1.6);
			} else {
				skl1.setDM(.7);
			}
		}
		if (skl1.getSkillName().equals("Feed the fire")){
			skl1.setDM(skl1.getDamageMultiplier() + .3 * forgeCount1);
			forgeCount1 = 0;
			ch1.setDefense(dummy1.getDefense());
		}
		
		/*
		 * 
		 * 
		 * 
		 */
		if (skl1.getFullHealth() == true && ch2.getHealth() == ch2.getMaxHealth()){
			skl1.setDM(skl1.getDamageMultiplier() + skl1.getFullHealthBonus());
		}
		
		ch2.takeDamage(200 * ch1.getPower() / ch2.getDefense() * skl1.getDamageMultiplier());
		
		// Removes negative stats
		if (skl1.getRemoveNegStatus() == true){
			if (dummy1.getPower() > ch1.getPower()){
				ch1.setPower(dummy1.getPower());
			}
			if (dummy1.getSpeed() > ch1.getSpeed()){
				ch1.setSpeed(dummy1.getSpeed());
			}
			if (dummy1.getDefense() > ch1.getDefense()){
				ch1.setDefense(dummy1.getDefense());
			}
				
		}
		
		// Stat alterations
		ch2.alterPower(skl1.getAltersPower());
		ch2.alterDefense(skl1.getAltersDefense());
		ch2.alterSpeed(skl1.getAltersSpeed());
		ch1.alterPower(skl1.getAltersOwnPower());
		ch1.alterDefense(skl1.getAltersOwnDefense());
		ch1.alterSpeed(skl1.getAltersOwnSpeed());
		
		if (skl1.getRestoresHealth() == true){
			ch1.restoreHealth(skl1.getHealthRestore());
		}

	}
	
	private void battle2() {
		// Character specifics
		int forgeCount2 = 0;
		if (skl2.getSkillName().equals("Forge Armor")){
			forgeCount2++;
		}
		if (skl2.getSkillName().equals("Critical Strike")){
			Random rnd = new Random(3);
			if (rnd.nextInt() == 0){
				skl2.setDM(1.6);
			} else {
				skl2.setDM(.7);
			}
		}
		if (skl2.getSkillName().equals("Feed the fire")){
			skl2.setDM(skl2.getDamageMultiplier() + .3 * forgeCount2);
			forgeCount2 = 0;
			ch2.setDefense(dummy2.getDefense());
		}
		
		/*
		 * 
		 * 
		 * 
		 */
		
		ch1.takeDamage(200 * ch2.getPower() / ch1.getDefense() * skl2.getDamageMultiplier());
		
		// Removes negative Stats
		if (skl2.getRemoveNegStatus() == true){
			if (dummy2.getPower() > ch2.getPower()){
				ch2.setPower(dummy2.getPower());
			}
			if (dummy2.getSpeed() > ch2.getSpeed()){
				ch2.setSpeed(dummy2.getSpeed());
			}
			if (dummy2.getDefense() > ch2.getDefense()){
				ch2.setDefense(dummy2.getDefense());
			}
				
		}
		
		ch1.alterPower(skl2.getAltersPower());
		ch1.alterDefense(skl2.getAltersDefense());
		ch1.alterSpeed(skl2.getAltersSpeed());
		ch2.alterPower(skl2.getAltersOwnPower());
		ch2.alterDefense(skl2.getAltersOwnDefense());
		ch2.alterSpeed(skl2.getAltersOwnSpeed());
		
		if (skl1.getRestoresHealth() == true){
			ch1.restoreHealth(skl1.getHealthRestore());
		}
	}
}
