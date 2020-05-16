package com.example.testappilmuro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.example.testappilmuro.Adapter.ViewPagerAdapter;
import com.example.testappilmuro.Fragments.CollabFragment;
import com.example.testappilmuro.Fragments.FragmentPortfolio;
import com.example.testappilmuro.Fragments.LifestyleFragment;
import com.example.testappilmuro.Fragments.VideosFragment;
import com.google.android.material.tabs.TabLayout;

public class Profile extends AppCompatActivity {

    ImageView BackButton,MenuIcon;
    Button follow,message;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profile);

        BackButton = findViewById(R.id.back);
        follow = findViewById(R.id.follow_button);
        message = findViewById(R.id.msg_button);
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        MenuIcon = findViewById(R.id.imageView2);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentPortfolio(),"PORTFOLIO");
        adapter.addFragment(new VideosFragment(),"VIDEOS");
        adapter.addFragment(new LifestyleFragment(),"LIFESTYLE");
        adapter.addFragment(new CollabFragment(),"COLLAB");

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Profile.this,"Follow button pressed",Toast.LENGTH_SHORT).show();
            }
        });

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Profile.this,"Message button pressed",Toast.LENGTH_SHORT).show();
            }
        });

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        MenuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Profile.this,"Menu icon pressed",Toast.LENGTH_SHORT).show();
            }
        });

//        tabLayout.addTab(tabLayout.newTab().setText("PORTFOLIO"));
//        tabLayout.addTab(tabLayout.newTab().setText("VIDEOS"));
//        tabLayout.addTab(tabLayout.newTab().setText("LIFESTYLE"));
//        tabLayout.addTab(tabLayout.newTab().setText("COLLABORATION"));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
