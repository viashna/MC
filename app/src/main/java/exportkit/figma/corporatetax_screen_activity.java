
	 
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
import android.net.Uri;
import android.os.Bundle;


import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;

public class corporatetax_screen_activity extends Activity {

	
//	private View _bg__corporatetax_screen_ek2;
//	private TextView count_on_us_to_ensure_your_business_fulfills_all_its_legal_cra_obligations__including_corporate_tax_filing__hst_filing__payroll_remittance__wsib_and_t4_filing___this_is_a_sample_content_;
//	private TextView our_professional_services_include__ek1;
//	private TextView electronically_tax_filing__e_file__instant_tax_refunds__personal_tax_returns_preparation__students_and_seniors_tax_services__tax_adjustment__t_1_adjustment__returns__tax_planning_advisory_services__multiyear_tax_returns___up_to_10_years___additional_tax_related_services_this_is_a_sample___we_want_add_like_this__ek1;
//	private ImageView rectangle;
//	private TextView let_s_talk_ek1;
//	private TextView get_in_touch__ek1;
//	private TextView schedule_an_appointment_ek1;
//	private TextView contact_us_ek8;
//	private ImageView vector_ek40;
//	private ImageView vector_ek41;
//	private ImageView vector_ek42;
//	private TextView inquiries_mercurytaxmccowan_ca_ek3;
//	private ImageView vector_ek43;
//	private TextView __416__265_3346_ek3;
//	private ImageView vector_ek44;
//	private ImageView vector_ek45;
//	private TextView _212_2900_eglinton_avenue_east__scarborough__on_ek3;
//	private ImageView vector_ek46;
//	private TextView m_f__10am_4pm__s_s__closed_ek3;
//	private ImageView vector_ek47;
//	private TextView https___www_mercurytaxmccowan_ca_ek1;
//	private TextView corporate_tax_services_ek1;
//	private ImageView vector_ek48;
//	private TextView welcome_to_mercurytax_mccowan_ek3;
	private ImageButton homebuttonnew;
	private RelativeLayout schedule_appointment_layout;
	private ImageView menubar;


	String[] mobileArray = {"Tax Management Services.\n",
			"Audit and Compilation.\n",
			"Financial Projections.\n",
			"Book keeping.\n"

	};
	int imageicon [] = {R.drawable.stop24,R.drawable.stop24, R.drawable.stop24,R.drawable.stop24};

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.corporatetax_screen);
		menubar =(ImageView) findViewById(R.id.vector_ek30);
		menubar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				menubar_Annimation(menubar);
			}
		});

//
//		_bg__corporatetax_screen_ek2 = (View) findViewById(R.id._bg__corporatetax_screen_ek2);
//		count_on_us_to_ensure_your_business_fulfills_all_its_legal_cra_obligations__including_corporate_tax_filing__hst_filing__payroll_remittance__wsib_and_t4_filing___this_is_a_sample_content_ = (TextView) findViewById(R.id.count_on_us_to_ensure_your_business_fulfills_all_its_legal_cra_obligations__including_corporate_tax_filing__hst_filing__payroll_remittance__wsib_and_t4_filing___this_is_a_sample_content_);
//		our_professional_services_include__ek1 = (TextView) findViewById(R.id.our_professional_services_include__ek1);
//		electronically_tax_filing__e_file__instant_tax_refunds__personal_tax_returns_preparation__students_and_seniors_tax_services__tax_adjustment__t_1_adjustment__returns__tax_planning_advisory_services__multiyear_tax_returns___up_to_10_years___additional_tax_related_services_this_is_a_sample___we_want_add_like_this__ek1 = (TextView) findViewById(R.id.electronically_tax_filing__e_file__instant_tax_refunds__personal_tax_returns_preparation__students_and_seniors_tax_services__tax_adjustment__t_1_adjustment__returns__tax_planning_advisory_services__multiyear_tax_returns___up_to_10_years___additional_tax_related_services_this_is_a_sample___we_want_add_like_this__ek1);
//		rectangle = (ImageView) findViewById(R.id.rectangle);
//		let_s_talk_ek1 = (TextView) findViewById(R.id.let_s_talk_ek1);
//		get_in_touch__ek1 = (TextView) findViewById(R.id.get_in_touch__ek1);
//		schedule_an_appointment_ek1 = (TextView) findViewById(R.id.schedule_an_appointment_ek1);
//		contact_us_ek8 = (TextView) findViewById(R.id.contact_us_ek8);
//		vector_ek40 = (ImageView) findViewById(R.id.vector_ek40);
//		vector_ek41 = (ImageView) findViewById(R.id.vector_ek41);
//		vector_ek42 = (ImageView) findViewById(R.id.vector_ek42);
//		inquiries_mercurytaxmccowan_ca_ek3 = (TextView) findViewById(R.id.inquiries_mercurytaxmccowan_ca_ek3);
//		vector_ek43 = (ImageView) findViewById(R.id.vector_ek43);
//		__416__265_3346_ek3 = (TextView) findViewById(R.id.__416__265_3346_ek3);
//		vector_ek44 = (ImageView) findViewById(R.id.vector_ek44);
//		vector_ek45 = (ImageView) findViewById(R.id.vector_ek45);
//		_212_2900_eglinton_avenue_east__scarborough__on_ek3 = (TextView) findViewById(R.id._212_2900_eglinton_avenue_east__scarborough__on_ek3);
//		vector_ek46 = (ImageView) findViewById(R.id.vector_ek46);
//		m_f__10am_4pm__s_s__closed_ek3 = (TextView) findViewById(R.id.m_f__10am_4pm__s_s__closed_ek3);
//		vector_ek47 = (ImageView) findViewById(R.id.vector_ek47);
//		https___www_mercurytaxmccowan_ca_ek1 = (TextView) findViewById(R.id.https___www_mercurytaxmccowan_ca_ek1);
//		corporate_tax_services_ek1 = (TextView) findViewById(R.id.corporate_tax_services_ek1);
//		vector_ek48 = (ImageView) findViewById(R.id.vector_ek48);
//		welcome_to_mercurytax_mccowan_ek3 = (TextView) findViewById(R.id.welcome_to_mercurytax_mccowan_ek3);
//

		//custom code goes here
		schedule_appointment_layout=(RelativeLayout) findViewById(R.id.sch_appoinmnt);
		ListView listView = (ListView) findViewById(R.id.mobile_list_for_ct);
		listView.setDivider(null);
		cutom_base_adapter customBaseAdapter = new cutom_base_adapter(getApplicationContext(),mobileArray,imageicon);
		listView.setAdapter(customBaseAdapter);

//		homebuttonnew= (ImageButton) findViewById(R.id.homenewbutton);
//		homebuttonnew.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				Intent homenuscreen = new Intent(getApplicationContext(), homescreen_activity.class);
//				startActivity(homenuscreen);
//				overridePendingTransition(R.anim.fadein,R.anim.fadein);
//
//			}
//		});
		//code for schedula an appointment layout
		schedule_appointment_layout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				appointment_Annimation(schedule_appointment_layout);
			}
		});


	
	}

	private void menubar_Annimation(ImageView menubar) {

		Animation shake = AnimationUtils.loadAnimation(this, R.anim.blink_anim);
		menubar.setAnimation(shake);
		menubar.startAnimation(shake);

		shake.setAnimationListener(new Animation.AnimationListener() {

			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				startActivity(new Intent(getApplicationContext(), menu_screen.class));
				overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
			}
		});

	}

	private void appointment_Annimation(RelativeLayout schedule_appointment_layout) {
		Animation shake = AnimationUtils.loadAnimation(this, R.anim.blink_anim);
		schedule_appointment_layout.setAnimation(shake);
		schedule_appointment_layout.startAnimation(shake);

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

//	@Override
//	public void finish() {
//		super.finish();
//		overridePendingTransition(R.anim.fadein, R.anim.fadeout);
//	}
}
	
	