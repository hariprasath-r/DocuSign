package ca.bell.eside.client.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TaskMain {

	public static void main(String[] args) {
//		Timer timer = new Timer();
//		TimerTask task = new Task();
		
//		timer.scheduleAtFixedRate(task, 2000, 5000);
		
		TokenManager tokenMgr = new TokenManager();
		tokenMgr.tokenizer();
	}

}
