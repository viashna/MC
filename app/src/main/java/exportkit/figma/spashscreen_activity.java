
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		homescreen
	 *	@date 		Friday 09th of December 2022 02:51:48 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class spashscreen_activity extends Activity {

	
	private View _bg__spashscreen_ek2;
	private ImageView rectangle_6;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.spashscreen);

		
		rectangle_6 = (ImageView) findViewById(R.id.rectangle_6);
	
		
		//custom code goes here
		new Handler().postDelayed(new Runnable() {


			@Override
			public void run() {
				// This method will be executed once the timer is over
				Intent i = new Intent(spashscreen_activity.this, homescreen_activity.class);
				startActivity(i);
				finish();
			}
		}, 3000);
	}
}
	
	