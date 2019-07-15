package com.brianmarete.alcchallenge1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button aboutAlcButton;
    Button profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutAlcButton = findViewById(R.id.about_alc_button);
        profileButton = findViewById(R.id.profile_button);

        aboutAlcButton.setOnClickListener(v -> {
            String url = "https://andela.com/alc";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();

            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.launchUrl(this, Uri.parse(url));
        });

        profileButton.setOnClickListener(v ->
                startActivity(new Intent(this, ProfileActivity.class)));
    }
}
