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
import java.util.concurrent.TimeUnit;
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
import javax.swing.ImageIcon;
import java.awt.Color;

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
	private int forgeCount1 = 0;
	private int forgeCount2 = 0;
	
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
	private JPanel panelRestart;
	private JLabel lblWinner;
	private JButton btnPlayAgain;
	private JLabel lblGameOver;
	private JLabel lblP1Icon;
	private JLabel lblP2Icon;
	private JLabel lblRandomSprite;
	private JLabel lblCh2Name;
	private JLabel lblCh1Name;
	
	

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
		panelWelcome.setBackground(new Color(255, 255, 204));
		frame.getContentPane().add(panelWelcome, "name_1786937010059022");
		
		btnStart = new JButton("Start");
		btnStart.setFont(new Font("High Tower Text", Font.BOLD, 24));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelWelcome.setVisible(false);
				panelChooseCharacter.setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/Title-Logo.png")));
		GroupLayout gl_panelWelcome = new GroupLayout(panelWelcome);
		gl_panelWelcome.setHorizontalGroup(
			gl_panelWelcome.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelWelcome.createSequentialGroup()
					.addGroup(gl_panelWelcome.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelWelcome.createSequentialGroup()
							.addGap(270)
							.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelWelcome.createSequentialGroup()
							.addGap(146)
							.addComponent(lblNewLabel)))
					.addContainerGap(161, Short.MAX_VALUE))
		);
		gl_panelWelcome.setVerticalGroup(
			gl_panelWelcome.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelWelcome.createSequentialGroup()
					.addContainerGap(35, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(29)
					.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(46))
		);
		panelWelcome.setLayout(gl_panelWelcome);
		
		panelGame = new JPanel();
		panelGame.setBackground(new Color(255, 255, 204));
		frame.getContentPane().add(panelGame, "name_1786947344248301");
		panelGame.setLayout(null);
		
		rdbtnSkill1 = new JRadioButton(dummy.SK1().getSkillName());
		rdbtnSkill1.setFont(new Font("High Tower Text", Font.PLAIN, 14));
		rdbtnSkill1.setBackground(new Color(255, 255, 204));
		rdbtnSkill1.setSelected(true);
		buttonGroup.add(rdbtnSkill1);
		rdbtnSkill1.setBounds(6, 195, 161, 23);
		panelGame.add(rdbtnSkill1);
		
		rdbtnSkill2 = new JRadioButton(dummy.SK2().getSkillName());
		rdbtnSkill2.setFont(new Font("High Tower Text", Font.PLAIN, 14));
		rdbtnSkill2.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnSkill2);
		rdbtnSkill2.setBounds(6, 235, 161, 23);
		panelGame.add(rdbtnSkill2);
		
		rdbtnSkill3 = new JRadioButton(dummy.SK3().getSkillName());
		rdbtnSkill3.setFont(new Font("High Tower Text", Font.PLAIN, 14));
		rdbtnSkill3.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnSkill3);
		rdbtnSkill3.setBounds(6, 275, 161, 23);
		panelGame.add(rdbtnSkill3);
		
		rdbtnSkill4 = new JRadioButton(dummy.SK4().getSkillName());
		rdbtnSkill4.setFont(new Font("High Tower Text", Font.PLAIN, 14));
		rdbtnSkill4.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnSkill4);
		rdbtnSkill4.setBounds(6, 315, 161, 23);
		panelGame.add(rdbtnSkill4);
		
		rdbtnSkill5 = new JRadioButton(dummy.SK5().getSkillName());
		rdbtnSkill5.setFont(new Font("High Tower Text", Font.PLAIN, 14));
		rdbtnSkill5.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnSkill5);
		rdbtnSkill5.setBounds(6, 355, 161, 23);
		panelGame.add(rdbtnSkill5);
		
		btnConfirmMove = new JButton("Select");
		btnConfirmMove.setFont(new Font("High Tower Text", Font.PLAIN, 16));
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
		btnConfirmMove.setBounds(6, 385, 131, 37);
		panelGame.add(btnConfirmMove);
		
		lblBattleText = new JLabel("Text goes here");
		lblBattleText.setFont(new Font("High Tower Text", Font.PLAIN, 16));
		lblBattleText.setBounds(147, 386, 548, 34);
		panelGame.add(lblBattleText);
		
		lblCh1Health = new JLabel("P1 Health:");
		lblCh1Health.setForeground(new Color(255, 0, 0));
		lblCh1Health.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 18));
		lblCh1Health.setBounds(98, 11, 262, 23);
		panelGame.add(lblCh1Health);
		
		lblCh2Health = new JLabel("P2 Health:");
		lblCh2Health.setForeground(new Color(255, 0, 0));
		lblCh2Health.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 18));
		lblCh2Health.setBounds(370, 11, 261, 23);
		panelGame.add(lblCh2Health);
		
		lblP1Icon = new JLabel("");
		lblP1Icon.setBackground(new Color(255, 255, 255));
		lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/CyclopsLeft.png")));
		lblP1Icon.setBounds(173, 126, 172, 150);
		panelGame.add(lblP1Icon);
		
		lblP2Icon = new JLabel("");
		lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/CyclopsRight.png")));
		lblP2Icon.setBounds(402, 126, 167, 150);
		panelGame.add(lblP2Icon);
		
		lblCh1Name = new JLabel("P1 Name");
		lblCh1Name.setHorizontalAlignment(SwingConstants.CENTER);
		lblCh1Name.setFont(new Font("High Tower Text", Font.PLAIN, 20));
		lblCh1Name.setEnabled(true);
		lblCh1Name.setBounds(160, 81, 172, 37);
		panelGame.add(lblCh1Name);
		
		lblCh2Name = new JLabel("P2 Name");
		lblCh2Name.setHorizontalAlignment(SwingConstants.CENTER);
		lblCh2Name.setFont(new Font("High Tower Text", Font.PLAIN, 20));
		lblCh2Name.setEnabled(true);
		lblCh2Name.setBounds(385, 81, 192, 37);
		panelGame.add(lblCh2Name);
		
		
		panelChooseCharacter = new JPanel();
		panelChooseCharacter.setBackground(new Color(255, 255, 204));
		frame.getContentPane().add(panelChooseCharacter, "name_631367793784");
		panelChooseCharacter.setLayout(null);
		
		rdbtnBandit = new JRadioButton("Bandit");
		rdbtnBandit.setBackground(new Color(255, 255, 204));
		rdbtnBandit.setSelected(true);
		buttonGroup.add(rdbtnBandit);
		rdbtnBandit.setBounds(6, 7, 109, 23);
		panelChooseCharacter.add(rdbtnBandit);
		
		rdbtnWarrior = new JRadioButton("Orc Warrior");
		rdbtnWarrior.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnWarrior);
		rdbtnWarrior.setBounds(6, 100, 109, 23);
		panelChooseCharacter.add(rdbtnWarrior);
		
		rdbtnKnight = new JRadioButton("Knight");
		rdbtnKnight.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnKnight);
		rdbtnKnight.setBounds(6, 205, 109, 23);
		panelChooseCharacter.add(rdbtnKnight);
		
		rdbtnDwarf = new JRadioButton("Dwarf");
		rdbtnDwarf.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnDwarf);
		rdbtnDwarf.setBounds(590, 7, 109, 23);
		panelChooseCharacter.add(rdbtnDwarf);
		
		rdbtnDemon = new JRadioButton("Demon");
		rdbtnDemon.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnDemon);
		rdbtnDemon.setBounds(590, 205, 109, 23);
		panelChooseCharacter.add(rdbtnDemon);
		
		rdbtnWerewolf = new JRadioButton("Werewolf");
		rdbtnWerewolf.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnWerewolf);
		rdbtnWerewolf.setBounds(590, 100, 109, 23);
		panelChooseCharacter.add(rdbtnWerewolf);
		
		rdbtnRandom = new JRadioButton("Random");
		rdbtnRandom.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnRandom);
		rdbtnRandom.setBounds(590, 403, 109, 23);
		panelChooseCharacter.add(rdbtnRandom);
		
		rdbtnWizard = new JRadioButton("Wizard");
		rdbtnWizard.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnWizard);
		rdbtnWizard.setBounds(6, 403, 109, 23);
		panelChooseCharacter.add(rdbtnWizard);
		
		rdbtnCyclops = new JRadioButton("Cyclops");
		rdbtnCyclops.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnCyclops);
		rdbtnCyclops.setBounds(6, 302, 109, 23);
		panelChooseCharacter.add(rdbtnCyclops);
		
		rdbtnPirate = new JRadioButton("Pirate");
		rdbtnPirate.setBackground(new Color(255, 255, 204));
		buttonGroup.add(rdbtnPirate);
		rdbtnPirate.setBounds(590, 302, 109, 23);
		panelChooseCharacter.add(rdbtnPirate);
		
		JButton btnConfirm = new JButton("Confirm!");
		btnConfirm.setFont(new Font("High Tower Text", Font.PLAIN, 18));
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
					chooser = 1;
					
					panelChooseCharacter.setVisible(false);
					panelGame.setVisible(true);
					lblBattleText.setText("Player 1, select a move.");
					lblCh1Health.setText("P1 Health: " + (int) ch1.getHealth()+ "/" + (int) ch1.getMaxHealth());
					lblCh2Health.setText("P2 Health: " + (int) ch2.getHealth()+ "/" + (int) ch2.getMaxHealth());
				}
			}
		});
		btnConfirm.setBounds(266, 375, 173, 51);
		panelChooseCharacter.add(btnConfirm);
		
		lblP1P2 = new JLabel("Player " + chooser + ": Choose your character");
		lblP1P2.setHorizontalAlignment(SwingConstants.CENTER);
		lblP1P2.setFont(new Font("High Tower Text", Font.PLAIN, 18));
		lblP1P2.setBounds(218, 315, 268, 23);
		panelChooseCharacter.add(lblP1P2);
		
		lblRandomSprite = new JLabel("");
		lblRandomSprite.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/RandomSprite.png")));
		lblRandomSprite.setBounds(277, 75, 150, 150);
		panelChooseCharacter.add(lblRandomSprite);
		
		panelRestart = new JPanel();
		panelRestart.setBackground(new Color(255, 255, 204));
		frame.getContentPane().add(panelRestart, "name_1501485201390914");
		panelRestart.setLayout(null);
		
		btnPlayAgain = new JButton("Play Again?");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelRestart.setVisible(false);
				panelChooseCharacter.setVisible(true);
				lblP1P2.setText("Player " + chooser + ": Choose your character");
			}
		});
		btnPlayAgain.setFont(new Font("High Tower Text", Font.PLAIN, 18));
		btnPlayAgain.setBounds(283, 279, 138, 49);
		panelRestart.add(btnPlayAgain);
		
		lblWinner = new JLabel("Winner goes here");
		lblWinner.setFont(new Font("High Tower Text", Font.PLAIN, 26));
		lblWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner.setBounds(175, 181, 354, 36);
		panelRestart.add(lblWinner);
		
		lblGameOver = new JLabel("Game Over!");
		lblGameOver.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameOver.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 22));
		lblGameOver.setBounds(258, 89, 188, 36);
		panelRestart.add(lblGameOver);
		
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
			lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DesertBanditRight.png")));
			lblCh1Name.setText(ch1.getName());
			
		}
		else if (rdbtnWarrior.isSelected() == true){
			ch1 = new Warrior();
			lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/OrcRight.png")));
			lblCh1Name.setText(ch1.getName());
		}
		else if (rdbtnKnight.isSelected() == true){
			ch1 = new Knight();
			lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/KnightRight.png")));
			lblCh1Name.setText(ch1.getName());
		}
		else if (rdbtnCyclops.isSelected() == true){
			ch1 = new Cyclops();
			lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/CyclopsRight.png")));
			lblCh1Name.setText(ch1.getName());
		}
		else if (rdbtnWizard.isSelected() == true){
			ch1 = new Wizard();
			lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/WizardRight.png")));
			lblCh1Name.setText(ch1.getName());
		}
		else if (rdbtnDemon.isSelected() == true){
			ch1 = new Demon();
			lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DemonRight.png")));
			lblCh1Name.setText(ch1.getName());
		}
		else if (rdbtnDwarf.isSelected() == true){
			ch1 = new Dwarf();
			lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DwarfRight.png")));
			lblCh1Name.setText(ch1.getName());
		}
		else if (rdbtnWerewolf.isSelected() == true){
			ch1 = new Werewolf();
			lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/WerewolfRight.png")));
			lblCh1Name.setText(ch1.getName());
		}
		else if (rdbtnPirate.isSelected() == true){
			ch1 = new Pirate();
			lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/PirateRight.png")));
			lblCh1Name.setText(ch1.getName());
		}
		else {
			Random rando = new Random();
			int in = rando.nextInt(9); 
			if (in == 0){
				ch1 = new Bandit();
				lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DesertBanditRight.png")));
				lblCh1Name.setText(ch1.getName());
				
			}
			else if (in == 1){
				ch1 = new Warrior();
				lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/OrcRight.png")));
				lblCh1Name.setText(ch1.getName());
				
			}
			else if (in == 2){
				ch1 = new Knight();
				lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/KnightRight.png")));
				lblCh1Name.setText(ch1.getName());
			}
			else if (in == 3){
				ch1 = new Cyclops();
				lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/CyclopsRight.png")));
				lblCh1Name.setText(ch1.getName());
			}
			else if (in == 4){
				ch1 = new Wizard();
				lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/WizardRight.png")));
				lblCh1Name.setText(ch1.getName());
			}
			else if (in == 5){
				ch1 = new Demon();
				lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DemonRight.png")));
				lblCh1Name.setText(ch1.getName());
			}
			else if (in == 6){
				ch1 = new Dwarf();
				lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DwarfRight.png")));
				lblCh1Name.setText(ch1.getName());
			}
			else if (in == 7){
				ch1 = new Werewolf();
				lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/WerewolfRight.png")));
				lblCh1Name.setText(ch1.getName());
			}
			else if (in == 8){
				ch1 = new Pirate();
				lblP1Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/PirateRight.png")));
				lblCh1Name.setText(ch1.getName());
			}
			
		}
	}
	private void setCharacter2(){
		if (rdbtnBandit.isSelected() == true){
			ch2 = new Bandit();
			lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DesertBanditLeft.png")));
			lblCh2Name.setText(ch2.getName());
		}
		else if (rdbtnWarrior.isSelected() == true){
			ch2 = new Warrior();
			lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/OrcLeft.png")));
			lblCh2Name.setText(ch2.getName());
		}
		else if (rdbtnKnight.isSelected() == true){
			ch2 = new Knight();
			lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/KnightLeft.png")));
			lblCh2Name.setText(ch2.getName());
		}
		else if (rdbtnCyclops.isSelected() == true){
			ch2 = new Cyclops();
			lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/CyclopsLeft.png")));
			lblCh2Name.setText(ch2.getName());
		}
		else if (rdbtnWizard.isSelected() == true){
			ch2 = new Wizard();
			lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/WizardLeft.png")));
			lblCh2Name.setText(ch2.getName());
		}
		else if (rdbtnDemon.isSelected() == true){
			ch2 = new Demon();
			lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DemonLeft.png")));
			lblCh2Name.setText(ch2.getName());
		}
		else if (rdbtnDwarf.isSelected() == true){
			ch2 = new Dwarf();
			lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DwarfLeft.png")));
			lblCh2Name.setText(ch2.getName());
			
		}
		else if (rdbtnWerewolf.isSelected() == true){
			ch2 = new Werewolf();
			lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/WerewolfLeft.png")));
			lblCh2Name.setText(ch2.getName());
		}
		else if (rdbtnPirate.isSelected() == true){
			ch2 = new Pirate();
			lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/PirateLeft.png")));
			lblCh2Name.setText(ch2.getName());
		}
		else {
			Random rando = new Random();
			int in = rando.nextInt(9); 
			if (in == 0){
				ch2 = new Bandit();
				lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DesertBanditLeft.png")));
				lblCh2Name.setText(ch2.getName());
				
			}
			else if (in == 1){
				ch2 = new Warrior();
				lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/OrcLeft.png")));;
				lblCh2Name.setText(ch2.getName());
			}
			else if (in == 2){
				ch2 = new Knight();
				lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/KnightLeft.png")));
				lblCh2Name.setText(ch2.getName());
			}
			else if (in == 3){
				ch2 = new Cyclops();
				lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/CyclopsLeft.png")));
				lblCh2Name.setText(ch2.getName());
			}
			else if (in == 4){
				ch2 = new Wizard();
				lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/WizardLeft.png")));
				lblCh2Name.setText(ch2.getName());
			}
			else if (in == 5){
				ch2 = new Demon();
				lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DemonLeft.png")));
				lblCh2Name.setText(ch2.getName());
			}
			else if (in == 6){
				ch2 = new Dwarf();
				lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/DwarfLeft.png")));
				lblCh2Name.setText(ch2.getName());
			}
			else if (in == 7){
				ch2 = new Werewolf();
				lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/WerewolfLeft.png")));
				lblCh2Name.setText(ch2.getName());
			}
			else if (in == 8){
				ch2 = new Pirate();
				lblP2Icon.setIcon(new ImageIcon(GameWindow.class.getResource("/resources/PirateLeft.png")));
				lblCh2Name.setText(ch2.getName());
			}
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
			
			checkStun1();
			new java.util.Timer().schedule( 
			        new java.util.TimerTask() {
			            @Override
			            public void run() {
			            	checkStun2();
			            }
			        }, 
			        5000 
			); if (ch1.getHealth() == 0 || ch2.getHealth() == 0){
				
			}
			
		}	
		else if (skl2.getGoesFirst() == true && skl1.getGoesFirst() == false){
			checkStun2();
			new java.util.Timer().schedule( 
			        new java.util.TimerTask() {
			            @Override
			            public void run() {
			            	checkStun1();
			            }
			        }, 
			        5000 
			); 
			
		} else {
			determineFirst();
		}
		new java.util.Timer().schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		            	rdbtnSkill1.setVisible(true);
		        		rdbtnSkill2.setVisible(true);
		        		rdbtnSkill3.setVisible(true);
		        		rdbtnSkill4.setVisible(true);
		        		rdbtnSkill5.setVisible(true);
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
		        		btnConfirmMove.setVisible(true);
		        		chooser1 = 1;
		        		lblBattleText.setText("Player 1, select your move.");
		        		
		            }
		        }, 
		        10000 
		);
		
	}
	
	// Determines which character goes first in combat
	public void determineFirst(){
		Random rand = new Random();
		int speedRatio = 50;
		speedRatio += ch1.getSpeed() - ch2.getSpeed();
		if(rand.nextInt(100) >= speedRatio){
			// P2 goes first
			checkStun2();
			new java.util.Timer().schedule( 
			        new java.util.TimerTask() {
			            @Override
			            public void run() {
			            	checkStun1();
			            }
			        }, 
			        5000 
			);
			
			
		} else {
			checkStun1();
			new java.util.Timer().schedule( 
			        new java.util.TimerTask() {
			            @Override
			            public void run() {
			            	checkStun2();
			            }
			        }, 
			        5000 
			);
			
		}
		
	}
	public void battle1(){
		// Character Specifics
		if (skl1.getSkillName().equals("Forge Armor")){
			forgeCount1++;
		}
		if (skl1.getSkillName().equals("Critical Strike")){
			Random rnd = new Random();
			if (rnd.nextInt(3) == 0){
				skl1.setDM(1.7);
			} else {
				skl1.setDM(.75);
			}
		}
		if (skl1.getSkillName().equals("Feed the Fire")){
			skl1.setDM(skl1.getDamageMultiplier() + .3 * forgeCount1);
			forgeCount1 = 0;
			ch1.setDefense(dummy1.getDefense());
		}
		if (skl1.getSkillName().equals("Momentous Slam")){
			skl1.setDM(.37 + ch1.getSpeed() / 100.0);
		}
		if (skl1.getSkillName().equals("Outmaneuver")){
			skl1.setDM(.40 + ch2.getSpeed() / 100.0);
		}
		if (skl1.getSkillName().equals("Dragon Slayer") ||
				skl1.getSkillName().equals("Giant Slayer")){
			skl1.setDM(.9 * ch2.getPower());
		}
		if (skl1.getSkillName().equals("Decimate")){
			skl1.setDM(.7 + (((double)ch2.getMaxHealth()- (double)ch2.getHealth())/850.0));
		}
		if (skl1.getStuns() == true){
			Random rn = new Random();
			if (rn.nextBoolean() == true){
				ch2.setStun(true);
			}
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
		
		lblBattleText.setText(skl1.getUsedSkill());
		lblCh1Health.setText("P1 Health: " + (int) ch1.getHealth()+ "/" + (int) ch1.getMaxHealth());
		lblCh2Health.setText("P2 Health: " + (int) ch2.getHealth()+ "/" + (int) ch2.getMaxHealth());
		if (ch1.getHealth() == 0 || ch2.getHealth() == 0){
		new java.util.Timer().schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		            	
		        			restart();
		

		            }
		        }, 
		        5000 
		);
		}
	}
	
	private void battle2() {
		// Character specifics
		
		if (skl2.getSkillName().equals("Forge Armor")){
			forgeCount2++;
		}
		if (skl2.getSkillName().equals("Critical Strike")){
			Random rnd = new Random();
			if (rnd.nextInt(3) == 0){
				skl2.setDM(1.7);
			} else {
				skl2.setDM(.75);
			}
		}
		if (skl2.getSkillName().equals("Feed the fire")){
			skl2.setDM(skl2.getDamageMultiplier() + .3 * forgeCount2);
			forgeCount2 = 0;
			ch2.setDefense(dummy2.getDefense());
		}
		if (skl2.getSkillName().equals("Momentous Slam")){
			skl2.setDM(.37 + ch2.getSpeed() / 100.0);
		}
		if (skl2.getSkillName().equals("Outmaneuver")){
			skl2.setDM(.40 + ch1.getSpeed() / 100.0);
		}
		if (skl2.getSkillName().equals("Dragon Slayer")||
				skl2.getSkillName().equals("Giant Slayer")){
			skl2.setDM(.9 * ch1.getPower());
		}
		if (skl2.getSkillName().equals("Decimate")){
			skl2.setDM(.7 + ((double)ch2.getMaxHealth()- (double)ch2.getHealth())/850);
		}
		if (skl2.getStuns() == true){
			Random rn = new Random();
			if (rn.nextBoolean() == true){
				ch1.setStun(true);
			}
		}
		/*
		 * 
		 * 
		 * 
		 */
		if (skl2.getFullHealth() == true && ch1.getHealth() == ch1.getMaxHealth()){
			skl2.setDM(skl2.getDamageMultiplier() + skl2.getFullHealthBonus());
		}
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
		
		if (skl2.getRestoresHealth() == true){
			ch2.restoreHealth(skl2.getHealthRestore());
		}
		lblBattleText.setText(skl2.getUsedSkill());
		lblCh1Health.setText("P1 Health: " + (int) ch1.getHealth()+ "/" + (int) ch1.getMaxHealth());
		lblCh2Health.setText("P2 Health: " + (int) ch2.getHealth()+ "/" + (int) ch2.getMaxHealth());
		if (ch1.getHealth() == 0 || ch2.getHealth() == 0){
		new java.util.Timer().schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		            	
		        			restart();

		            }
		        }, 
		        5000 
		);
		}
	}
	public void restart(){
		panelGame.setVisible(false);
		panelRestart.setVisible(true);
		if (ch1.getHealth() > ch2.getHealth()){
			lblWinner.setText("Player 1 wins!");
		} else if (ch2.getHealth() > ch1.getHealth()){
			lblWinner.setText("Player 2 wins!");
		} else if (ch1.getHealth() == 0 && ch2.getHealth() == 0){
			lblWinner.setText("Draw!");
		}
	}
	public void checkStun1(){
		if (ch1.getStunned() == true){
			lblBattleText.setText(ch1.getName() + " is stunned and cannot move!");
			ch1.setStun(false);
		} else {
			battle1();
		}
		
	}
	public void checkStun2(){
		if (ch2.getStunned() == true){
			lblBattleText.setText(ch2.getName() + " is stunned and cannot move!");
			ch2.setStun(false);
		} 
		else {
			battle2();
		}
	}
}
