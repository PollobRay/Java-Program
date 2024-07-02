import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.KeyStroke;

class Test extends JFrame
{
	JMenuBar menubar;
	JMenu file,edit, help;
	JMenuItem newItem, openItem, exitItem, cutItem, copyItem, pasteItem, selectAllItem;
	ImageIcon icon;

	Test()
	{
		init();
	}

	public void init()
	{
		this.setSize(500,500);
		menubar=new JMenuBar();
		this.setJMenuBar(menubar);
		file=new JMenu("File");
		edit=new JMenu("Edit");
		help=new JMenu("Help");

		icon=new ImageIcon("new.png");

		menubar.add(file);
		menubar.add(edit);
		menubar.add(help);

		newItem=new JMenuItem("New");
		openItem=new JMenuItem("Open");
		exitItem=new JMenuItem("Exit");
		cutItem=new JMenuItem("Cut");
		copyItem=new JMenuItem("Copy");
		pasteItem=new JMenuItem("Paste");
		selectAllItem=new JMenuItem("Select All");

		newItem.setIcon(icon);
		newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));; //adding keyboard shortcut
																// Ctrl+N

		file.add(newItem);
		file.add(copyItem);
		file.add(exitItem);

		edit.add(copyItem);
		edit.add(cutItem);
		edit.add(pasteItem);
		edit.add(selectAllItem);

		class Handler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==newItem)
				{
					JFrame newFrame=new JFrame();
					newFrame.setVisible(true);
					//newFrame.setDefaultCloseOPeration(JFrame.EXIT_ON_CLOSE);
					newFrame.setBounds(300,100,600,500);
					newFrame.setTitle("New Farme");
				}

				if(e.getSource()==exitItem)
				{
					System.exit(0);
				}
			}
		}

		Handler h=new Handler();
		newItem.addActionListener(h);
		exitItem.addActionListener(h);
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);

	}
}