package com.example.yout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    private List<Video> videoList;
    private OnVideoClickListener onVideoClickListener;

    public interface OnVideoClickListener {
        void onVideoClick(Video video);
    }

    public VideoAdapter(List<Video> videoList, OnVideoClickListener onVideoClickListener) {
        this.videoList = videoList;
        this.onVideoClickListener = onVideoClickListener;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video, parent, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        Video video = videoList.get(position);
        holder.tvTitle.setText(video.getTitle());
        holder.tvDescription.setText(video.getChannelName() + " • " + video.getViews() + " • " + video.getUploadedDate());
        
        Glide.with(holder.itemView.getContext())
                .load(video.getThumbnailUrl())
                .placeholder(android.R.color.darker_gray)
                .into(holder.ivThumbnail);

        holder.itemView.setOnClickListener(v -> onVideoClickListener.onVideoClick(video));
    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }

    public static class VideoViewHolder extends RecyclerView.ViewHolder {
        ImageView ivThumbnail;
        TextView tvTitle, tvDescription;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            ivThumbnail = itemView.findViewById(R.id.ivThumbnail);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDescription = itemView.findViewById(R.id.tvDescription);
        }
    }
}