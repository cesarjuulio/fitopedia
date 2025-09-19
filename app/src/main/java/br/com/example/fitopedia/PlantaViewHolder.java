package br.com.example.fitopedia;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class PlantaViewHolder extends RecyclerView.ViewHolder {
    public TextView nomePopularTextView;
    public TextView nomeCientificoTextView;
    public ImageView plantaImageView;

    public PlantaViewHolder(View view) {
        super(view);
        nomePopularTextView = view.findViewById(R.id.nomePopularTextView);
        nomeCientificoTextView = view.findViewById(R.id.nomeCientificoTextView);
        plantaImageView = view.findViewById(R.id.plantaImageView);
    }
}