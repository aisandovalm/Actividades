package com.example.creandoactividades;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Actividad1 extends Activity {
	
	private Button btn_regresar;
	private Button btn_actividad2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad1);
		
		btn_regresar = (Button) findViewById(R.id.button2);
		btn_regresar.setOnClickListener(new  OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		btn_actividad2 = (Button) findViewById(R.id.button3);
		btn_actividad2.setOnClickListener(new  OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent2 = new Intent(getApplicationContext(), Actividad2.class);
				startActivity(intent2);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actividad1, menu);
		return true;
	}

}
