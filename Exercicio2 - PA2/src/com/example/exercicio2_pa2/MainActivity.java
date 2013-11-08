package com.example.exercicio2_pa2;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView mensagem;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		mensagem = (TextView) findViewById(R.id.mensagem);
		
		Button btnHello = (Button) findViewById(R.id.btn1);
		Button btnGoogBye = (Button) findViewById(R.id.btn2);
				
		btnHello.setOnClickListener(new setMsgAndToast("Hello"));
		btnGoogBye.setOnClickListener(new setMsgAndToast("GoodBye"));	
		
		
	}
	
	private void setMensagem(String msg){
		mensagem.setText(msg);
		
	}
	
	private class setMsgAndToast implements OnClickListener {
		
		private String mensagem;
		
		public setMsgAndToast(String msg){
			this.mensagem = msg;
		}

		@Override
		public void onClick(View v) {
			
			Toast toast = Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_SHORT);
			toast.show();
			
			setMensagem(mensagem);
			
						
		}
		
		
	}

}