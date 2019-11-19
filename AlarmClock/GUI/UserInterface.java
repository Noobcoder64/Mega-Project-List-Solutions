package AlarmClock.GUI;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import AlarmClock.Components.AlarmTimer;

public class UserInterface implements Runnable {
	private JFrame frame;
	
	private AlarmTimer alarmTimer;
	
	public UserInterface(AlarmTimer alarmTimer) {
		this.alarmTimer = alarmTimer;
	}
	
	@Override
	public void run() {
		frame = new JFrame("Alarm Timer");
		frame.setPreferredSize(new Dimension(400, 200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(Container container) {
		AlarmTimerPanel alarmTimerPanel = new AlarmTimerPanel(this.alarmTimer);
		alarmTimer.setAlarmTimerPanel(alarmTimerPanel);
		
		container.add(alarmTimerPanel);
	}
	
}
