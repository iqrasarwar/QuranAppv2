package com.example.quranappv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    DrawerLayout dl;
    NavigationView nv;
    Toolbar tb;
//    Button surahs,parahs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dl = findViewById(R.id.navBarDrawer);
        nv = findViewById(R.id.navView);
        tb = findViewById(R.id.toolbar);

        setSupportActionBar(tb);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,dl,tb,R.string.open_drwaer,
                R.string.clode_drwaer);

        dl.addDrawerListener(toggle);
        toggle.syncState();
//        loadFragment(new mainFragment());
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id == R.id.nav_main)
                {
                    loadFragment(new mainFragment());
                }
                else if(id == R.id.nav_settings)
                {

                }
                else if(id == R.id.surahE)
                {

                }
                else if(id == R.id.surahU)
                {

                }
                else if(id == R.id.parahE)
                {

                }
                else
                {

                }
                return true;
            }


        });
        dl.closeDrawer(GravityCompat.START);


//        surahs = findViewById(R.id.button);
//        parahs = findViewById(R.id.button2);
//        surahs.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, AllSurahs.class);
//                startActivity(intent);
//            }
//        });
//        parahs.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, AllParahs.class);
//                startActivity(intent);
//            }
//        });
    }
     @Override
     public void onBackPressed() {
         if(dl.isDrawerOpen((GravityCompat.START)))
         {
             dl.closeDrawer(GravityCompat.START);
         }
         else
         {
             super.onBackPressed();
         }
     }
    private void loadFragment(Fragment f) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frame,f);
        ft.commit();
    }
}
