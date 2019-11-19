package TextEditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		
		view.getTopBar().addMenuFilelistener(new menuFileListener());
	}
	
	private class menuFileListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "New") {
				createNewFile();
			} else if (e.getActionCommand() == "Open") {
				openFile();
			} else if (e.getActionCommand() == "Save") {
				saveFile();
			} else if (e.getActionCommand() == "Exit") {
				
			}
			
		}
	}
	
	private void createNewFile() {
		view.addEditor();
	}
	
	private void openFile() {
		try {
			view.addEditor();
			model.openFile();
			view.getEditor().setText(model.getText());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void saveFile() {
		try {
			model.setText(view.getEditor().getText());
			model.saveFile();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	
}
