package ca.bell.eside.client.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TokenManager {

	long expirationTime;
	long safeTime;
	
	public void tokenizer() {
		Timer timer = new Timer();
		TimerTask timerTask = new Task();
		expirationTime = getToken();
		safeTime = getSafeTime(expirationTime);
		timer.schedule(timerTask, new Date(safeTime));
	}
	
	public long getToken() {
		long currentTime = System.currentTimeMillis();
		System.out.println("\n>---Current Time :: "+currentTime+"---<");
		return System.currentTimeMillis() + 10000;
	}
	
	public long getSafeTime(long expirationTime) {
		long safeTime = 0;
		System.out.println(">---Initial Time :: "+expirationTime+"---<");
		safeTime = expirationTime - System.currentTimeMillis();
		safeTime = (safeTime * 3) / 4;
		safeTime += System.currentTimeMillis();
		System.out.println(">---Safe time 	 :: "+safeTime+"---<");
		return safeTime;
	}
	
}
