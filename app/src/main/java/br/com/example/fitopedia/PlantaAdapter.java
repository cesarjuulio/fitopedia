package br.com.example.fitopedia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

import java.util.List;

public class PlantaAdapter extends RecyclerView.Adapter<PlantaViewHolder> {

    private List<Planta> plantasList;

    // Construtor do adapter
    public PlantaAdapter(List<Planta> plantasList) {
        this.plantasList = plantasList;
    }

    @Override
    public PlantaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Infla o layout para o item da lista
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_plantas, parent, false);
        return new PlantaViewHolder(itemView);
    }
    public void onBindViewHolder(PlantaViewHolder holder, int position) {
        // Obtém a planta da lista
        Planta planta = plantasList.get(position);

        // Preenche as views com os dados da planta
        holder.nomePopularTextView.setText(planta.getNomePopular());
        holder.nomeCientificoTextView.setText(planta.getNomeCientifico());

        // Carrega as imagens usando Glide (ou Picasso)
        Glide.with(holder.itemView.getContext())
                .load(planta.getImagemDemonstracao1())
                .into(holder.plantaImageView);
    }

    @Override
    public int getItemCount() {
        return plantasList.size();
    }
}