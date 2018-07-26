package com.example.gema.fragmentgojek;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_order:
                    fragment = new OrderFragment();
                    break;
                case R.id.navigation_history:
                    fragment = new HistoryFragment();
                    break;
                case R.id.navigation_wallet:
                    fragment = new WalletFragment();
                    break;
                case R.id.navigation_settings:
                    fragment = new SettingFragment();
                    break;
            }

            //  Jika User click Order maka Fragment Order yg akan di show
            return loadFragment(fragment);
        }
    };

    //  function untuk men set Fragment yang dipakai
    //  params ex(new WalletFragment())
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

//  Fragment Yang Pertama di Load
        loadFragment(new OrderFragment());

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

//  Bottom Navigation Pertama Yg di Load
        navigation.setSelectedItemId(R.id.navigation_order);

    }

}
