package TextEditor;

import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TopBar extends JMenuBar {
	JMenu menuFile;
		JMenuItem[] menuFileItems;
	
	JMenu menuEdit;
		JMenuItem[] menuEditItems;
		
	public TopBar() {
		super();

		createMenuFile();
		menuEdit();
		add(new JMenu("Help"));
	}

	private void createMenuFile() {
		menuFile = new JMenu("File");
		String[] menuItemNames = new String[] {"New", "Open", "Save", "Exit"};
		menuFileItems = new JMenuItem[4];
		
		for (int i = 0; i < menuItemNames.length; i++) {
			JMenuItem menuItem = new JMenuItem(menuItemNames[i]);
			menuItem.setActionCommand(menuItemNames[i]);
			menuFileItems[i] = menuItem;
			menuFile.add(menuItem);
		}
		add(menuFile);
	}

	private void menuEdit() {
		JMenu menu = new JMenu("Edit");
		
		menu.add(new JMenuItem("Copy"));
		menu.add(new JMenuItem("Paste"));
		menu.add(new JMenuItem("Cut"));
		menu.add(new JMenuItem("Search"));
		add(menu);
	}
	
	public void addMenuFilelistener(ActionListener menuFilelistener) {
		for (JMenuItem menuItem : menuFileItems) {
			menuItem.addActionListener(menuFilelistener);
		}
	}
	
	public void addMenuEditlistener(ActionListener menuEditlistener) {
	}
	
}
