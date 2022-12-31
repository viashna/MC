package exportkit.figma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class accounting_and_other extends AppCompatActivity {
    private ImageView back;

    private RelativeLayout schedule_appointment_layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounting_and_other);
        back =(ImageView) findViewById(R.id.backbtn);
        schedule_appointment_layout=(RelativeLayout) findViewById(R.id.sch_appoinmnt);



//        code for menu button..

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menubar_Annimation(back);


            }
        });

        //code for schedula an appointment layout
        schedule_appointment_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appointment_Annimation(schedule_appointment_layout);
            }
        });


    }

    private void menubar_Annimation(ImageView back)
        {

            Animation shake = AnimationUtils.loadAnimation(this, R.anim.blink_anim);
            back.setAnimation(shake);
            back.startAnimation(shake);

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
//@Override
//    public void finish() {
//        super.finish();
//        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
//    }
}