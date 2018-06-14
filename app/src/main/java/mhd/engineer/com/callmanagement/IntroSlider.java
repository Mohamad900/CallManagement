package mhd.engineer.com.callmanagement;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroSlider extends AppIntro {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSliders();//add sliders pages frgaments
        addIntroSliderFeatures();
    }

    private void addSliders() {
        addSlide(AppIntroFragment.newInstance("Block Calls","No more unwanted calls",R.drawable.intro_slider1_image, getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Automatically SMS","No more missed opportunities",R.drawable.intro_slider2_image, getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Call Recording","No more forget  information",R.drawable.intro_slider3_image, getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Call history","check calls statistics",R.drawable.intro_slider4_image, getResources().getColor(R.color.colorPrimary)));
    }
    private void addIntroSliderFeatures() {
        showStatusBar(false);
        setColorDoneText(getResources().getColor(R.color.colorPrimary));
        setColorSkipButton(getResources().getColor(R.color.colorPrimary));
        setNextArrowColor(getResources().getColor(R.color.colorPrimary));
        setIndicatorColor(getResources().getColor(R.color.colorPrimary),Color.BLACK); //color of bullets - indicators - circles
        setBarColor(Color.WHITE);
        setSeparatorColor(getResources().getColor(R.color.colorPrimary)); // between barcolor and slider
    }
    @Override
    public void onDonePressed(Fragment currentFragment) {
        //startActivity(new Intent(this,MainPage.class));
    }
    @Override
    public void onSkipPressed(Fragment currentFragment) {
       //startActivity(new Intent(this,MainPage.class));
    }
}
