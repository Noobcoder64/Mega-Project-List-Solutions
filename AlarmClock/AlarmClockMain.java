package AlarmClock;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.SwingUtilities;

import AlarmClock.Components.AlarmTimer;
import AlarmClock.GUI.UserInterface;

public class AlarmClockMain {

	public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		AlarmTimer alarmTimer = new AlarmTimer();
		
		UserInterface ui = new UserInterface(alarmTimer);
		SwingUtilities.invokeLater(ui);		
	}

}
