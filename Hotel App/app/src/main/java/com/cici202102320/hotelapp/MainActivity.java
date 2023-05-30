package com.cici202102320.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fhoneymoonbaliku.com%2Fvilla-pemandangan-laut-di-bali%2F&psig=AOvVaw3Y3VE582mAlQuhMkpV1dqS&ust=1685505190341000&source=images&cd=vfe&ved=0CA4QjRxqFwoTCLiemqaSnP8CFQAAAAAdAAAAABAD";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}