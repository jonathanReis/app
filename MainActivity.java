package com.example.calc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	//Variaveis
	Button somar;
	EditText texto1;
	EditText texto2;
	TextView tv;
	double soma;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Metodos de ação
		somar = (Button) findViewById(R.id.btn1);
		tv = (TextView) findViewById(R.id.tv1);
		texto1 = (EditText) findViewById(R.id.txt1);
		texto2 = (EditText) findViewById(R.id.txt2);
		
		somar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
					soma = Double.parseDouble(texto1.getText().toString()) + Double.parseDouble(texto2.getText().toString());
					tv.setText(soma + "");
				}catch(Exception e)
				{
					tv.setText("ERROR");
				}
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
