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
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class NewsActivity extends AppCompatActivity {
    public BottomNavigationView bottomNavigationView;
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if("student@rmutt.ac.th".equals(user.getEmail())){
            //navigate to contact page
            startActivity(new Intent(getApplicationContext(), Contact.class));
            finish();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.action_news);
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