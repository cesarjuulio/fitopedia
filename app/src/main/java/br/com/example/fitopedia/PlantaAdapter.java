package br.com.example.fitopedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PlantaAdapter extends RecyclerView.Adapter<PlantaAdapter.PlantaViewHolder> {

    private Context context;
    private List<Planta> listaPlantas;

    // Construtor com lista e contexto
    public PlantaAdapter(Context context, List<Planta> listaPlantas) {
        this.context = context;
        this.listaPlantas = listaPlantas;
    }

    @NonNull
    @Override
    public PlantaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_plantas, parent, false);
        return new PlantaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlantaViewHolder holder, int position) {
        Planta planta = listaPlantas.get(position);

        holder.txtNomePopular.setText(planta.getNomePopular());
        holder.txtNomeCientifico.setText(planta.getNomeCientifico());

        // Carrega imagem (se tiver link na planilha)
        if (planta.getImagemDemonstracao1() != null && !planta.getImagemDemonstracao1().isEmpty()) {
            Glide.with(context).load(planta.getImagemDemonstracao1()).into(holder.imgPlanta);
        } else {
            holder.imgPlanta.setImageResource(R.drawable.ic_launcher_foreground); // imagem padrão
        }
    }

    @Override
    public int getItemCount() {
        return listaPlantas.size();
    }

    // ViewHolder
    public static class PlantaViewHolder extends RecyclerView.ViewHolder {
        TextView txtNomePopular, txtNomeCientifico;
        ImageView imgPlanta;

        public PlantaViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNomePopular = itemView.findViewById(R.id.txtNomePopular);
            txtNomeCientifico = itemView.findViewById(R.id.txtNomeCientifico);
            imgPlanta = itemView.findViewById(R.id.imgPlanta);
        }
    }
}
