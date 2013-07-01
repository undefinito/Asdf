import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Dialog.ModalityType;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalExclusionType;

@SuppressWarnings("serial")
public class Syanad_proto extends JFrame implements ActionListener{
	
	//Variable declarations
	//Frame for interface
	private JFrame Syanad_Frame;
	//Labels
    private JLabel lblCourseCode;
    private JLabel lblDate;
    private JLabel lblProf;
    private JLabel lblSection;
    //Constant Tags
    private JLabel lblCourseCode_tag;
    private JLabel lblDate_tag;
    private JLabel lblProf_tag;
    private JLabel lblSection_tag;
    
    
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Syanad_proto window = new Syanad_proto(); //creates the window
					window.Syanad_Frame.setVisible(true);//shows the window
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
    
    
	public Syanad_proto() { //Starts the frame constructor for window and initiates values
		init();
	}
	
	public void init() {						//Initiates the Frame for the GUI
		Syanad_Frame = new JFrame();
		Syanad_Frame.setTitle("Anti Truancy System");
//		Syanad_Frame.setIconImage(Toolkit.getDefaultToolkit().getImage("image file name"));
		//Above line sets the icon when running
		Syanad_Frame.setBounds(100, 100, 582, 344); //Size of frame
		Syanad_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Syanad_Frame.getContentPane().setLayout(null);
		draw(); 								//Draws the GUI
	
	}
    

	public void draw() {					//draws the interface
		//Constant Labels
		//TAGS
		//"Course Code : " sets the placement and adds to the content pane
		this.lblCourseCode_tag = new JLabel("Course Code : ");
		lblCourseCode_tag.setBounds(10, 10, 600, 30);
		Syanad_Frame.getContentPane().add(lblCourseCode_tag);

		//"Section : " sets the placement and adds to the content pane
		this.lblSection_tag = new JLabel("Section : ");
		lblSection_tag.setBounds(10, 30, 630, 30);
		Syanad_Frame.getContentPane().add(lblSection_tag);
		
		//"Professor : " sets the placement and adds to the content pane
		this.lblProf_tag = new JLabel("Professor : ");
		lblProf_tag.setBounds(300, 10, 400, 30);
		Syanad_Frame.getContentPane().add(lblProf_tag);

		//"Date : " sets the placement and adds to the content pane
		//Is this a button?
		this.lblDate_tag = new JLabel("Date : ");
		lblDate_tag.setBounds(300, 30, 400, 30);
		Syanad_Frame.getContentPane().add(lblDate_tag);
		
		//VALUES
		//"<Course Code> " sets the placement and adds to the content pane
		//Query for Label text
		this.lblCourseCode = new JLabel("<Course Code>");
		lblCourseCode.setBounds(100, 10, 552, 30);
		Syanad_Frame.getContentPane().add(lblCourseCode);
		
		//"<Section>" sets the placement and adds to the content pane
		//Query for Label text
		this.lblSection = new JLabel("<Section number>");
		lblSection.setBounds(100, 30, 582, 30);
		Syanad_Frame.getContentPane().add(lblSection);
		
		//"<Professor name> " sets the placement and adds to the content pane
		//Query for Label text
		this.lblProf = new JLabel("<Professor name>");
		lblProf.setBounds(390, 10, 582, 30); //Fix positioning
		Syanad_Frame.getContentPane().add(lblProf);
		
		//"<Date_today>" sets the placement and adds to the content pane
		//Query for Label text
		this.lblDate = new JLabel("<Date today>");
		lblDate.setBounds(390, 30, 582, 30);
		Syanad_Frame.getContentPane().add(lblDate);
						
		
		/*
		//**constructs and initiates the buttons**/		
		//**for New Game**//
		/*
		this.btnNewGame = new JButton("New Game");															
		btnNewGame.addActionListener(this);
		btnNewGame.setBounds(420, 22, 120, 35);
		frmBlackjack.getContentPane().add(btnNewGame);
		//**for Bet**/
		/*
		this.btnBet = new JButton("Bet");							
		btnBet.setEnabled(false);
		btnBet.addActionListener(this);
		btnBet.setBounds(420, 68, 120, 35);
		frmBlackjack.getContentPane().add(btnBet);
		//**for Hit**/
		/*
		this.btnHit = new JButton("Hit");							
		btnHit.setEnabled(false);
		btnHit.addActionListener(this);
		btnHit.setBounds(420, 160, 120, 35);
		frmBlackjack.getContentPane().add(btnHit);
		//**for Stand**/
		/*
		this.btnStand = new JButton("Stand");						
		btnStand.setEnabled(false);
		btnStand.addActionListener(this);
		btnStand.setBounds(420, 206, 120, 35);
		frmBlackjack.getContentPane().add(btnStand);
		//**for Leave**/
		/*
		this.btnLeave = new JButton("Leave");						
		btnLeave.addActionListener(this);
		btnLeave.setBounds(420, 252, 120, 35);
		frmBlackjack.getContentPane().add(btnLeave);
		//**end initiation of buttons**/
		
		//**initiates the labels and text fields**//
		//**Cash label**//
		/*
		JLabel lblCash = new JLabel("Cash");
		lblCash.setBounds(10, 237, 32, 14);
		frmBlackjack.getContentPane().add(lblCash);
		
		//**text feild of actual cash**/
		/*
		this.CashInHand = new JTextField("0");
		CashInHand.setEditable(false);									//you cannot input in the text field
		CashInHand.setBounds(49, 234, 86, 20);
		frmBlackjack.getContentPane().add(CashInHand);
		CashInHand.setColumns(10);
		
		//**bet Label**/
		/*
		JLabel lblBet = new JLabel("Bet");
		lblBet.setBounds(282, 237, 32, 14);
		frmBlackjack.getContentPane().add(lblBet);
		
		//**text field for the bet amount**/
		/*
		this.Bet = new JTextField();
		Bet.setEditable(false);											//you cannot input in the text field
		Bet.setBounds(324, 234, 86, 20);
		frmBlackjack.getContentPane().add(Bet);
		Bet.setColumns(10);
		
		
		//**This label indicates what is happening in the game**/
		/*
		this.lblMessage = new JLabel("Welcome to BlackJack");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(49, 275, 367, 20);
		frmBlackjack.getContentPane().add(lblMessage);

		*/
	}																	//end draw		

	
    
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
