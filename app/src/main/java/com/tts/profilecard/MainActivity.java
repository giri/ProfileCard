package com.tts.profilecard;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        String fontPath = "fonts/opensans-light.ttf";

        TextView txtName = (TextView) findViewById(R.id.name);
        TextView txtDesigination = (TextView) findViewById(R.id.desigination);

        TextView txtAboutUs = (TextView) findViewById(R.id.about_us);

        TextView txtViewsValue = (TextView) findViewById(R.id.views_value);
        TextView txtProjectsValue = (TextView) findViewById(R.id.projects_value);
        TextView txtFollowersValue = (TextView) findViewById(R.id.followers_value);

        TextView txtProjects = (TextView) findViewById(R.id.projects);
        TextView txtFollowers = (TextView) findViewById(R.id.followers);
        TextView txtViews = (TextView) findViewById(R.id.views);

        AssetManager manager = this.getAssets();

        Typeface tf = Typeface.createFromAsset(manager, fontPath);
        txtAboutUs.setTypeface(tf);
        txtName.setTypeface(tf);
        txtDesigination.setTypeface(tf);


        txtViewsValue.setTypeface(tf);
        txtProjectsValue.setTypeface(tf);
        txtFollowersValue.setTypeface(tf);

        txtViews.setTypeface(tf);
        txtProjects.setTypeface(tf);
        txtFollowers.setTypeface(tf);

    }
}
