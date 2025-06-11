package com.example.project1;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new ToDoFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selected = null;
              bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selected = null;

        int id = item.getItemId();

        if (id == R.id.nav_todo) {
            selected = new ToDoFragment();
        } else if (id == R.id.nav_upload) {
            selected = new UploadFragment();
        } else if (id == R.id.nav_profile) {
            selected = new ProfileFragment();
        }

        if (selected != null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, selected)
                .commit();
            return true;
        }

        return false;
    }
});

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, selected).commit();
                return true;
            }
        });
    }
}
