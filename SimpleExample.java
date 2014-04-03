import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleExample extends JFrame {
	
	private JButton submit = new JButton("Submit");
	private JTextField input = new JTextField("", 15);
	private JLabel label = new JLabel("Your name:");
	private JLabel question = new JLabel("What is the approximate value of e?");
	private JRadioButton correct = new JRadioButton("Approx. 2,7");
	private JRadioButton incorrect1 = new JRadioButton("Approx. 2,8");
	private JRadioButton incorrect2 = new JRadioButton("Approx. 3,1");

	public SimpleExample() {
		super("Simple Example");
		
		this.setVisible(true);
		this.setTitle("A very simple test");
		int width = 300;
		int height = 150;
		this.setSize(width, height);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout());
	    container.add(label);
	    container.add(input);
	    container.add(question);
	    
	    ButtonGroup group = new ButtonGroup();
	    group.add(correct);
	    group.add(incorrect1);
	    group.add(incorrect2);
	    
	    container.add(correct);
	    container.add(incorrect1);
	    container.add(incorrect2);

	    submit.addActionListener(new ButtonEventListener());
	    container.add(submit);
	}

	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String message = "";
			message += input.getText() + ", your answer is ";
			message += (correct.isSelected()?"correct":"incorrect");
			JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.PLAIN_MESSAGE);
		}
	}

	public static void main(String[] args) {
		SimpleExample app = new SimpleExample();

	}
}