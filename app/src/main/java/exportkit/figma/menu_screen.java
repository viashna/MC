package exportkit.figma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class menu_screen extends AppCompatActivity {
    private RelativeLayout homemenuframe;
    private RelativeLayout prmenuframe;
    private  RelativeLayout ctmenuframe;
    private  RelativeLayout cregmenuframe;
    private RelativeLayout bsAdviceframe;
    private RelativeLayout contactUsframe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        homemenuframe = (RelativeLayout) findViewById(R.id.home_menu_frame);
        prmenuframe=(RelativeLayout) findViewById(R.id.pt_menu_frame);
        ctmenuframe=(RelativeLayout)findViewById(R.id.ct_menu_frame);
        cregmenuframe=(RelativeLayout) findViewById(R.id.br_menu_frame);
        bsAdviceframe=(RelativeLayout) findViewById(R.id.ba_menu_frame);
        contactUsframe=(RelativeLayout) findViewById(R.id.contact_us_frame);


        homemenuframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(menu_screen.this,R.anim.blink_anim);

                homemenuframe.startAnimation(animation);

            }
        });

        //code for touch home menu
        homemenuframe.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent homeScreen = new Intent(getApplicationContext(),homescreen_activity.class);
                startActivity(homeScreen);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });


        //personal tax menu

        prmenuframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(menu_screen.this,R.anim.bounce);

                prmenuframe.startAnimation(animation);

            }
        });

        prmenuframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent personaltax_Screen = new Intent(getApplicationContext(),personal_tax_screen_activity.class);
                startActivity(personaltax_Screen);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


            }
        });

        // code for corporate tax

        ctmenuframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent corporateTax_Screen= new Intent(getApplicationContext(),corporatetax_screen_activity.class);
                startActivity(corporateTax_Screen);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });

        //code for bs registration
    cregmenuframe.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent corporateTaxReg_Screen= new Intent(getApplicationContext(),corporate_registration_activity.class);
            startActivity(corporateTaxReg_Screen);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        }
    });

    bsAdviceframe.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent business_advice_screen= new Intent(getApplicationContext(),accounting_and_other.class);
            startActivity(business_advice_screen);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);



        }
    });


    // code for contact us
   contactUsframe.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent contact_Screen= new Intent(getApplicationContext(),contact_screen_activity.class);
           startActivity(contact_Screen);
           overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

       }
   });

    }

//    @Override
//    public void finish() {
//        super.finish();
//        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
//    }
}