package com.example.exe1;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {

	private int[] cores = { Color.BLACK, Color.BLUE, Color.GREEN, Color.RED, Color.MAGENTA, Color.YELLOW, Color.WHITE, Color.GRAY };
	private int qtPM, qtCM = 0;
	 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final Button pushMe = (Button) findViewById(R.id.bt_PM);
		final Button clickMe = (Button) findViewById(R.id.bt_CM);

		final TextView qtPushMe = (TextView) findViewById(R.id.qtClickPM);
		final TextView qtClickMe = (TextView) findViewById(R.id.qtClickCM);

		pushMe.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				pushMe.setTextColor(cores[numAleatorio()]);
				qtPM += 1;
				qtPushMe.setText(String.valueOf(qtPM));

			}
		});

		clickMe.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {				
				clickMe.setTextColor(cores[numAleatorio()]);
				qtCM += 1;
				qtClickMe.setText(String.valueOf(qtCM));

			}
		});

	}

	// Gera números aleatórios
	public int numAleatorio() {
		Random aleatorio = new Random();
		int i = aleatorio.nextInt(cores.length);
		return i;
	}

}
