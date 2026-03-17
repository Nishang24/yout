package com.example.yout;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements VideoAdapter.OnVideoClickListener {

    private RecyclerView rvVideos;
    private VideoAdapter adapter;
    private List<Video> videoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvVideos = findViewById(R.id.rvVideos);
        rvVideos.setLayoutManager(new LinearLayoutManager(this));

        videoList = new ArrayList<>();
        loadSampleVideos();

        adapter = new VideoAdapter(videoList, this);
        rvVideos.setAdapter(adapter);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnItemSelectedListener(item -> {
            // Navigation logic can be added here
            return true;
        });
    }

    private void loadSampleVideos() {
        // Sample videos from public domain sources
        videoList.add(new Video("1", "Big Buck Bunny - Animated Short Film", 
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Big_Buck_Bunny_Main_Characters.jpg/800px-Big_Buck_Bunny_Main_Characters.jpg",
                "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
                "Blender Foundation", "10M views", "2 years ago"));
        
        videoList.add(new Video("2", "Elephant's Dream - Open Movie Project", 
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Elephants_Dream_s5_both.jpg/800px-Elephants_Dream_s5_both.jpg",
                "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4",
                "Blender Foundation", "5M views", "3 years ago"));

        videoList.add(new Video("3", "For Bigger Blazes - Google Sample", 
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Big_Buck_Bunny_thumbnail_vlc.png/800px-Big_Buck_Bunny_thumbnail_vlc.png",
                "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4",
                "Google", "1.2M views", "1 year ago"));
        
        videoList.add(new Video("4", "For Bigger Escapes - Action Highlights", 
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Elephants_Dream_teaser.jpg/800px-Elephants_Dream_teaser.jpg",
                "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4",
                "Google", "2.5M views", "6 months ago"));

        videoList.add(new Video("5", "Sintel - Official Trailer", 
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Sintel_poster.jpg/800px-Sintel_poster.jpg",
                "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4",
                "Blender", "8M views", "4 years ago"));
    }

    @Override
    public void onVideoClick(Video video) {
        Intent intent = new Intent(this, PlayerActivity.class);
        intent.putExtra("title", video.getTitle());
        intent.putExtra("videoUrl", video.getVideoUrl());
        intent.putExtra("channel", video.getChannelName());
        intent.putExtra("views", video.getViews());
        intent.putExtra("date", video.getUploadedDate());
        startActivity(intent);
    }
}