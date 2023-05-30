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

        String imageUrl = "https://ik.imagekit.io/tvlk/blog/2021/04/The-Legian-Bali.jpg?tr=dpr-2,w-675";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}