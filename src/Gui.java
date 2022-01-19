import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui extends JFrame {
private JLabel label;
private JButton button;
private JTextField textfield;


	public Gui() {
	super("Odysseia");
	setSize(300, 150);
label=new JLabel("Parakalo epilexte epipedo ! [1] [2] or [3] ");
button = new JButton("Next");
button.addActionListener(new ActionListener() {//ti ta ginei otan patithei to button
	@Override
	public void actionPerformed(ActionEvent ae) {
	String choice = textfield.getText();
	if(choice.equals("1")||choice.equals("2")||choice.equals("3")){
	Maingui maing= new Maingui(choice);
		dispose(); //katestrepse to login frame
	}else {
		System.out.println("ERROR 1,2,3 πρεπει να βάλεις");
		
	}
		
	}

});
textfield = new JTextField();
setLayout(new GridLayout(3, 1)); 
	add(label);
	add(textfield);
	add(button);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//otan patietai to x stamataei to programma
	setVisible(true); //emfanise to login frame
	
	}
	}