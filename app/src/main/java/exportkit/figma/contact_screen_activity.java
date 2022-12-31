
	 
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

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;


import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

	public class contact_screen_activity extends Activity {

	private RelativeLayout schedule_layout;
	private RelativeLayout weblayout;
	private RelativeLayout calllayout;
	private View _bg__contact_screen_ek2;
	private TextView have_a_question_;
	private TextView we_can_help_find_the_answer_;
	private TextView visit_the_help_centre;
	private ImageView vector_ek58;
	private TextView book_an_appointment;
	private ImageButton appointmrntbutton;
	private ImageView vector_ek60;
	private ImageView vector_ek61;
	private TextView visit_our_website;
	private ImageView visitwebsitebutton;
	private ImageView vector_ek63;
	private TextView call_us;
	private ImageView callbtn;
	private ImageView vector_ek65;
	private TextView send_us_feedback;
	private ImageView vector_ek66;
	private String contact_number = "456";
	private static final int REQUEST_CALL=1;



		@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact_screen);

		
		have_a_question_ = (TextView) findViewById(R.id.have_a_question_);
		we_can_help_find_the_answer_ = (TextView) findViewById(R.id.we_can_help_find_the_answer_);
		vector_ek58 = (ImageView) findViewById(R.id.vector_ek58);
		book_an_appointment = (TextView) findViewById(R.id.book_an_appointment);
		schedule_layout =(RelativeLayout) findViewById(R.id.frame_86);
		weblayout=(RelativeLayout) findViewById(R.id.frame_87);
		calllayout=(RelativeLayout) findViewById(R.id.frame_88);
		vector_ek60 = (ImageView) findViewById(R.id.vector_ek60);
		vector_ek61 = (ImageView) findViewById(R.id.vector_ek61);
		visit_our_website = (TextView) findViewById(R.id.visit_our_website);
		vector_ek63 = (ImageView) findViewById(R.id.vector_ek63);
		call_us = (TextView) findViewById(R.id.call_us);
		callbtn = (ImageView) findViewById(R.id.vector_ek64);


	
		
		//custom code goes here
		visitwebsitebutton = (ImageView) findViewById(R.id.vector_ek62);
		visit_the_help_centre = (TextView) findViewById(R.id.visit_the_help_centre);
		appointmrntbutton = (ImageButton) findViewById(R.id.vector_ek59);



		schedule_layout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
			appointmtntAnnimation(schedule_layout);
			}
		});

		//code for call button

		calllayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				callbutton(calllayout);

			}
		});

		//code for visit website

		weblayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
			visitwebsiteAnnimation(weblayout);

			}
		});

		//code for visitt help center

		visit_the_help_centre.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				helpcenreAnnimation(visit_the_help_centre);
			}
		});



	}
// method for auto call

	private void callbutton(RelativeLayout calllayout) {
		Animation shake = AnimationUtils.loadAnimation(this, R.anim.blink_anim);
		calllayout.setAnimation(shake);
		calllayout.startAnimation(shake);

		shake.setAnimationListener(new Animation.AnimationListener() {

			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				contact_number = contact_number.toString();
				if (contact_number.trim().length() > 0) {
					if (ContextCompat.checkSelfPermission(contact_screen_activity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
						ActivityCompat.requestPermissions(contact_screen_activity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
					} else {
						String dial = "tel:" + contact_number;
						startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
					}

				}
			}

		});

	}

//code for visit website
private void visitwebsiteAnnimation(RelativeLayout weblayout) {

	Animation shake = AnimationUtils.loadAnimation(this, R.anim.blink_anim);
	weblayout.setAnimation(shake);
	weblayout.startAnimation(shake);

	shake.setAnimationListener(new Animation.AnimationListener() {

		@Override
		public void onAnimationStart(Animation animation) {

		}

		@Override
		public void onAnimationRepeat(Animation animation) {

		}

		@Override
		public void onAnimationEnd(Animation animation) {
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("https://www.mercurytaxmccowan.ca"));
			startActivity(intent);
			overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		}
	});
}

//code for book an appointment
private void appointmtntAnnimation(RelativeLayout schedule_layout) {

	Animation shake = AnimationUtils.loadAnimation(this, R.anim.blink_anim);
	schedule_layout.setAnimation(shake);
	schedule_layout.startAnimation(shake);

	shake.setAnimationListener(new Animation.AnimationListener() {

		@Override
		public void onAnimationStart(Animation animation) {

		}

		@Override
		public void onAnimationRepeat(Animation animation) {

		}

		@Override
		public void onAnimationEnd(Animation animation) {
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.addCategory(Intent.CATEGORY_BROWSABLE);
			intent.setData(Uri.parse("https://www.mercurytaxmccowan.ca/appointments/"));
			startActivity(intent);
			overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		}
	});
}

//code for view help centre
private void helpcenreAnnimation(TextView visit_the_help_centre) {

			Animation shake = AnimationUtils.loadAnimation(this, R.anim.blink_anim);
			visit_the_help_centre.setAnimation(shake);
			visit_the_help_centre.startAnimation(shake);

			shake.setAnimationListener(new Animation.AnimationListener() {

				@Override
				public void onAnimationStart(Animation animation) {

				}

				@Override
				public void onAnimationRepeat(Animation animation) {

				}

				@Override
				public void onAnimationEnd(Animation animation) {
					Intent intent = new Intent();
					intent.setAction(Intent.ACTION_VIEW);
					intent.addCategory(Intent.CATEGORY_BROWSABLE);
					intent.setData(Uri.parse("https://www.mercurytaxmccowan.ca/f-a-q/"));
					startActivity(intent);
					overridePendingTransition(R.anim.fadein, R.anim.fadeout);
				}
			});
		}


//	@Override
//	public void finish() {
//		super.finish();
//		overridePendingTransition(R.anim.fadein, R.anim.fadeout);
//	}

		@Override
		public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
			super.onRequestPermissionsResult(requestCode, permissions, grantResults);
			if (requestCode == REQUEST_CALL) {
				if (grantResults.length >= 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
					callbutton(calllayout);
				} else {
					Toast.makeText(this, "permission denied", Toast.LENGTH_SHORT).show();
				}
			}
		}
}
	
	