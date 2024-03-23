package com.example.examfinalappauth;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Contact extends AppCompatActivity {
    public BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.action_contact);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemmenu = item.getItemId();
                if ( itemmenu == R.id.action_home)
                {
                    startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                    overridePendingTransition(0,0);
                    finish();
                    return true;
                }
                else if ( itemmenu == R.id.action_news)
                {
                    startActivity(new Intent(getApplicationContext(),NewsActivity.class));
                    overridePendingTransition(0,0);
                    finish();
                    return true;
                }
                else if ( itemmenu == R.id.action_contact)
                {
                    startActivity(new Intent(getApplicationContext(),Contact.class));
                    overridePendingTransition(0,0);
                    finish();
                    return true;
                }

                return false;
            }
        });
    }
}