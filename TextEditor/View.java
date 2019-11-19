package TextEditor;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class View extends JFrame {
	TopBar topBar;
	Editor editor;
	
	public View() {
		super("Text Editor");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(500, 500);
		
		topBar = new TopBar();
		setJMenuBar(topBar);
	}
	
	public void addEditor() {
		if	(editor != null) remove(editor);
		editor = new Editor();
		add(editor);
		revalidate();
		repaint();
	}
	
	public TopBar getTopBar() {
		return topBar;
	}
	
	public Editor getEditor() {
		return editor;
	}
}
