package AlarmClock.GUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import AlarmClock.Components.AlarmTimer;

public class AlarmTimerPanel extends JPanel {
	private AlarmTimer alarmTimer;
	
	JTextField secondsTextField;
	JTextField minutesTextField;
	
	JButton button;
	
	public AlarmTimerPanel(AlarmTimer alarmTimer) {
		this.alarmTimer = alarmTimer;
		
		setLayout(new GridLayout(2, 1));
		
		createDisplay();
		createStartButton();
	}
	
	private void createDisplay() {
		this.secondsTextField = new JTextField();
		this.minutesTextField = new JTextField();
		
		JPanel display = new JPanel();
		display.setLayout(new GridLayout(1, 3));
		
		display.add(minutesTextField);
		display.add(new JLabel(":"));
		display.add(secondsTextField);
		
		this.add(display);
	}
	
	private void createStartButton() {
		this.button = new JButton("Start");
		button.addActionListener((event) -> startTimer());
		this.add(button);
	}
	
	public void startTimer() {
		alarmTimer.setSeconds(getSeconds());
		alarmTimer.setMinutes(getMinutes());
		
		disableTextFields();
		changeButton();
		
		alarmTimer.startTimer();
	}
	
	private void disableTextFields() {
		this.secondsTextField.setEditable(false);
		this.minutesTextField.setEditable(false);
	}
	
	private void changeButton() {
		this.button.setText("Stop");
		this.button.removeActionListener(button.getActionListeners()[0]);
		this.button.addActionListener((event) -> alarmTimer.stopTimer());
	}
	
	private int getSeconds() {
		return Integer.parseInt(this.secondsTextField.getText());
	}
	
	private int getMinutes() {
		return Integer.parseInt(this.minutesTextField.getText());
	}
	
	public void updateDisplay() {
		this.secondsTextField.setText(alarmTimer.getSeconds());
		this.minutesTextField.setText(alarmTimer.getMinutes());
	}
	
}
