import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
class making extends JFrame
{
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField item4;

	public making()
	{
		super("The title");
		setLayout(new FlowLayout());
		item1 = new JTextField(10);
		add(item1);
		item2 = new JTextField("Enter you first name");
		add(item2);
		item3 = new JTextField("Not Required",20);
		item3.setEditable(false);
		add(item3);

		item4 = new JPasswordField("Enter Password");
		add(item4);
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		item4.addActionListener(handler);

	}
private class thehandler implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		String st = "";
		if (event.getSource()==item1)
			st = String.format("field 1 = %s",event.getActionCommand());
		else if (event.getSource()==item2)
			st = String.format("field 2 = %s",event.getActionCommand());
		if (event.getSource()==item3)
			st = String.format("field 2 = %s",event.getActionCommand());
		if (event.getSource()==item4)
			st = String.format("password field is = %s",event.getActionCommand());
		JOptionPane.showMessageDialog(null,st);
	}
}
}
class events
{
	public static void main(String arg[])
	{
		making obj = new making();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(300,300);
		obj.setVisible(true);
	}
}
