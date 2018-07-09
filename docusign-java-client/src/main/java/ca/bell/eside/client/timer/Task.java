package ca.bell.eside.client.timer;

import java.util.TimerTask;

public class Task extends TimerTask {

	@Override
	public void run() {
		TokenManager token = new TokenManager();
		token.tokenizer();
	}

	public void todo() {
		System.out.println(">---Task done at : "+System.currentTimeMillis()+"---<");
	}
	
}
