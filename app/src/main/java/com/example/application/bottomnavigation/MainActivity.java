package com.example.application.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottom_navigation;
    TextView main_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_navigation =(BottomNavigationView) findViewById(R.id.bottom_navigation);
        main_text =(TextView) findViewById(R.id.main_text);

        bottom_navigation.setOnNavigationItemSelectedListener(this);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int selected_item =item.getItemId();

        switch(selected_item){
            case R.id.bn_recents:changeText("Recents");break;
            case R.id.bn_favorites:changeText("Favorite");break;
            case R.id.bn_near:changeText("Near By");break;
        }

        return false;
    }

    public void changeText(String title){
        main_text.setText(title);
    }

}
