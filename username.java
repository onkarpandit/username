import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.*;
import javax.swing.JOptionPane;
class make extends JFrame
{

    public void input()throws IOException           //takes input for username and password
    {
        String u = JOptionPane.showInputDialog("Enter userId");//dialog box
        String p = JOptionPane.showInputDialog("Enter Password");
        FileOutputStream fout = new FileOutputStream("myproject.txt");
        int n1 = u.length();
        int n2 = p.length();
        char ch1,ch2;
        for (int i =0;i<n1;i++)             //file input code
        {
            ch1 = u.charAt(i);
            fout.write(ch1);
        }
            fout.write('\n');
        for (int i=0;i<n2;i++)
        {
            ch2 = p.charAt(i);
            fout.write(ch2);
        }

        fout.close();
    }

};
/*class frame extends JFrame
{
	private JLabel item1;
   	private JLabel item2;
		public frame()
		{

  		 super ("Welcome");
      		 setLayout(new FlowLayout());
        	 item1 = new JLabel("Welcome to JARVIS.co");
       		 item1.setToolTipText("Please login to continue");
       		 add(item1);

    		}
}*/

class myproject
{
    public static void main(String arg[])throws IOException
    {
        frame obj = new frame();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(275,180);
        obj.setVisible(true);
	 make obj1 = new make();
        obj1.input();
    };
};
