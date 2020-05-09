package com.t3g.glideimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.master.glideimageview.GlideImageView;

public class MainActivity extends AppCompatActivity {

    GlideImageView glideImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        glideImageView = (GlideImageView)findViewById(R.id.glideImageView);
        glideImageView.loadImageUrl("https://www.ecopetit.cat/wpic/mpic/0-3033_amoled-dark-wallpapers-hd-phone-dark-wallpapers-for.jpg");
    }
}
