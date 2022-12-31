
	 
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


import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BulletSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;

//* Income tax and benefits return (T1) for individuals , couple and self employment income\n
//		* Personal Tax Services for Students\n
//		* Personal tax services for individuals having investment income, rental income or foreign income\n
//		* Tax issues for residents, non-residents or dual residents of Canada\n
//		* Personal tax returns preparations\n
//		* Multiyear tax returns\n
//		* Electronically tax Filing (E-File) \n

public class personal_tax_screen_activity extends Activity {

	String[] mobileArray = {"Income tax and benefits return (T1) for individuals , couple and self employment income.\n",
			"Personal Tax Services for Students.\n",
			"Personal tax services for individuals having investment income, rental income or foreign income.\n",
			"Tax issues for residents, non-residents or dual residents of Canada.\n",
			"Personal tax returns preparations.\n",
			"Multiyear tax returns.\n",
			"Electronically tax Filing (E-File).\n",

			};
	int imageicon [] = {R.drawable.stop24,R.drawable.stop24, R.drawable.stop24,R.drawable.stop24,R.drawable.stop24,R.drawable.stop24,R.drawable.stop24};
	private RelativeLayout schedule_appointment_layout;
	private View _bg__personal_tax_screen_ek2;
	private TextView our_personal_tax_accountant_take_care_of_your_accounting_needs_and_ensure_____we_ensure_maximum_refunds_with_guaranteed_accuracy_and_confidentiality__we_prepare_and_file_your_tax_returns_electronically__ensuring_maximum_tax_benefits__kta_has_been_providing_these_services_for_over_a_decade__maintaining_a_good_reputation_and_professionalism_to_our_clients__we_provide_free_after_tax_return_services_to_our_valuable_clients_year_round__our_prices_are_very_reasonable__while_never_compromising_on_quality_;
	private TextView let_s_talk;
	private TextView get_in_touch_;
	private TextView contact_us_ek6;
	private ImageView vector_ek31;
	private ImageView vector_ek32;
	private ImageView vector_ek33;
	private TextView inquiries_mercurytaxmccowan_ca_ek2;
	private ImageView vector_ek34;
	private TextView __416__265_3346_ek2;
	private ImageView vector_ek35;
	private ImageView vector_ek36;
	private TextView _212_2900_eglinton_avenue_east__scarborough__on_ek2;
	private ImageView vector_ek37;
	private TextView m_f__10am_4pm__s_s__closed_ek2;
	private ImageView vector_ek38;
	private TextView https___www_mercurytaxmccowan_ca;
	private TextView schedule_an_appointment;
	private TextView personal_taxation_service_ek1;
	private TextView our_professional_services_include_;
	private TextView electronically_tax_filing__e_file__instant_tax_refunds__personal_tax_returns_preparation__students_and_seniors_tax_services__tax_adjustment__t_1_adjustment__returns__tax_planning_advisory_services__multiyear_tax_returns___up_to_10_years___additional_tax_related_services_this_is_a_sample___we_want_add_like_this_;
	private ImageView vector_ek39;
	private TextView welcome_to_mercurytax_mccowan_ek2;
	private ImageView menubar;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.personal_tax_screen);

		
		_bg__personal_tax_screen_ek2 = (View) findViewById(R.id._bg__personal_tax_screen_ek2);
		our_personal_tax_accountant_take_care_of_your_accounting_needs_and_ensure_____we_ensure_maximum_refunds_with_guaranteed_accuracy_and_confidentiality__we_prepare_and_file_your_tax_returns_electronically__ensuring_maximum_tax_benefits__kta_has_been_providing_these_services_for_over_a_decade__maintaining_a_good_reputation_and_professionalism_to_our_clients__we_provide_free_after_tax_return_services_to_our_valuable_clients_year_round__our_prices_are_very_reasonable__while_never_compromising_on_quality_ = (TextView) findViewById(R.id.our_personal_tax_accountant_take_care_of_your_accounting_needs_and_ensure_____we_ensure_maximum_refunds_with_guaranteed_accuracy_and_confidentiality__we_prepare_and_file_your_tax_returns_electronically__ensuring_maximum_tax_benefits__kta_has_been_providing_these_services_for_over_a_decade__maintaining_a_good_reputation_and_professionalism_to_our_clients__we_provide_free_after_tax_return_services_to_our_valuable_clients_year_round__our_prices_are_very_reasonable__while_never_compromising_on_quality_);
		let_s_talk = (TextView) findViewById(R.id.let_s_talk);
		get_in_touch_ = (TextView) findViewById(R.id.get_in_touch_);
//		contact_us_ek6 = (TextView) findViewById(R.id.contact_us_ek6);
//		vector_ek31 = (ImageView) findViewById(R.id.vector_ek31);
//		vector_ek32 = (ImageView) findViewById(R.id.vector_ek32);
//		vector_ek33 = (ImageView) findViewById(R.id.vector_ek33);
//		inquiries_mercurytaxmccowan_ca_ek2 = (TextView) findViewById(R.id.inquiries_mercurytaxmccowan_ca_ek2);
//		vector_ek34 = (ImageView) findViewById(R.id.vector_ek34);
//		__416__265_3346_ek2 = (TextView) findViewById(R.id.__416__265_3346_ek2);
//		vector_ek35 = (ImageView) findViewById(R.id.vector_ek35);
//		vector_ek36 = (ImageView) findViewById(R.id.vector_ek36);
//		_212_2900_eglinton_avenue_east__scarborough__on_ek2 = (TextView) findViewById(R.id._212_2900_eglinton_avenue_east__scarborough__on_ek2);
//		vector_ek37 = (ImageView) findViewById(R.id.vector_ek37);
//		m_f__10am_4pm__s_s__closed_ek2 = (TextView) findViewById(R.id.m_f__10am_4pm__s_s__closed_ek2);
//		vector_ek38 = (ImageView) findViewById(R.id.vector_ek38);
//		https___www_mercurytaxmccowan_ca = (TextView) findViewById(R.id.https___www_mercurytaxmccowan_ca);
		schedule_an_appointment = (TextView) findViewById(R.id.schedule_an_appointment);
		personal_taxation_service_ek1 = (TextView) findViewById(R.id.personal_taxation_service_ek1);
		our_professional_services_include_ = (TextView) findViewById(R.id.our_professional_services_include_);
		schedule_appointment_layout=(RelativeLayout) findViewById(R.id.sch_appoinmnt);
		menubar =(ImageView) findViewById(R.id.vector_ek30);
// code for menu screen

		menubar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				menubar_Annimation(menubar);
			}
		});

		//custom code goes here
		ListView listView = (ListView) findViewById(R.id.mobile_list);
		listView.setDivider(null);
		cutom_base_adapter customBaseAdapter = new cutom_base_adapter(getApplicationContext(),mobileArray,imageicon);
		listView.setAdapter(customBaseAdapter);
//		SpannableString string = new SpannableString("Text with\nBullet point");
//		string.setSpan(new BulletSpan(40, color, 20), 10, 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

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

	private void appointment_Annimation(RelativeLayout schedule_appointment_layout)

		{

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
	
	