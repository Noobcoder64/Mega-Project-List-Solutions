package AlarmClock.Components;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import AlarmClock.GUI.AlarmTimerPanel;

public class AlarmTimer extends Timer {
	private BoundedCounter seconds = new BoundedCounter(60);
	private BoundedCounter minutes = new BoundedCounter(60);
	private AlarmTimerPanel alarmTimerPanel;
	
	private MediaPlayer mediaPlayer;
	
	public AlarmTimer() {
		createMediaPlayer();
	}
	
	public void setSeconds(int seconds) {
		this.seconds.setValue(seconds);
	}
	
	public void setMinutes(int minutes) {
		this.minutes.setValue(minutes);
	}
	
	public String getSeconds() {
		return seconds.toString();
	}
	
	public String getMinutes() {
		return minutes.toString();
	}
	
	public void tick() {
		if (this.seconds.valueIsZero()) this.minutes.decrement();
		this.seconds.decrement();
		alarmTimerPanel.updateDisplay();
	}
	
	public TimerTask tickTimerTask() {
		TimerTask tickTimerTask = new TimerTask() { 
			@Override 
			public void run() {
				tick(); 
				if (seconds.valueIsZero() && minutes.valueIsZero()) {
					mediaPlayer.play();
					stopTimer();
				}
			}
		};	
		return tickTimerTask;
	}
	
	public void startTimer() {
		scheduleAtFixedRate(tickTimerTask(), 1000, 1000);
	}
	
	public void stopTimer() {
		cancel();
	}
	
	public void setAlarmTimerPanel(AlarmTimerPanel alarmTimerPanel) {
		this.alarmTimerPanel = alarmTimerPanel;
	}
	
	public void createMediaPlayer() {
		JFXPanel jfxPanel = new JFXPanel();
		
		String fileName = "src\\AlarmClock\\short_message.mp3";
		
		javafx.scene.media.Media ringtone = new Media(new File(fileName).toURI().toString());
		this.mediaPlayer = new MediaPlayer(ringtone);
		this.mediaPlayer.setOnEndOfMedia(() -> mediaPlayer.seek(Duration.ZERO));
	}
	
}
