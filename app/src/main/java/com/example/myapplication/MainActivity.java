package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public ImageButton btnA,btnB;
   public MediaPlayer mp2;

private WebView portalito;



    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.btnportal, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        btnA = (ImageButton) findViewById(R.id.btnA);
        btnB = (ImageButton) findViewById(R.id.btnB);

        mp2 = MediaPlayer.create(this, R.raw.b2);






        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();

            }

        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp2.isPlaying()){
                    mp2.pause();
                }

            }

        });

        {


        }
    }


}



