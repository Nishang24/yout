package com.example.yout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.OptIn;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;

public class PlayerActivity extends AppCompatActivity {

    private ExoPlayer player;
    private PlayerView playerView;

    @OptIn(markerClass = UnstableApi.class)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        playerView = findViewById(R.id.playerView);
        TextView tvTitle = findViewById(R.id.tvVideoTitle);
        TextView tvDetails = findViewById(R.id.tvVideoDetails);
        TextView tvChannel = findViewById(R.id.tvChannelName);

        String title = getIntent().getStringExtra("title");
        String videoUrl = getIntent().getStringExtra("videoUrl");
        String channel = getIntent().getStringExtra("channel");
        String views = getIntent().getStringExtra("views");
        String date = getIntent().getStringExtra("date");

        tvTitle.setText(title);
        tvDetails.setText(views + " • " + date);
        tvChannel.setText(channel);

        initializePlayer(videoUrl);
    }

    private void initializePlayer(String videoUrl) {
        player = new ExoPlayer.Builder(this).build();
        playerView.setPlayer(player);

        MediaItem mediaItem = MediaItem.fromUri(videoUrl);
        player.setMediaItem(mediaItem);
        player.prepare();
        player.play();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (player != null) {
            player.release();
            player = null;
        }
    }
}