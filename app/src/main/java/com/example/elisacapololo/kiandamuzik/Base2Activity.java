package com.example.elisacapololo.kiandamuzik;


import android.app.FragmentManager;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Ray Thony on 04/01/2018.
 */

public class Base2Activity extends AppCompatActivity {
    public  class initNowPlayingControls extends AsyncTask<String, Void, String>{

        @Override
        protected String doInBackground(String... strings) {
            NowPlayingCard nowplaying = new NowPlayingCard();
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.quick_controls_container,nowplaying).commitAllowingStateLoss();
            return "Executed";
        }
    }

}
