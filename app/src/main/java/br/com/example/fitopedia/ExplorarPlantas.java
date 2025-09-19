package br.com.example.fitopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExplorarPlantas extends AppCompatActivity {

    private ImageButton homeImageButton;
    private SearchView searchPlantas;
    private RecyclerView recyclerView;
    private List<Planta> listaPlantas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_explorar_plantas);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        homeImageButton = findViewById(R.id.homeImageButton);
        searchPlantas = findViewById(R.id.searchPlantas);
        recyclerView = findViewById(R.id.plantasRecyclerView);

//        // 🔹 Dados de exemplo (depois vamos puxar da planilha)
//        listaPlantas.add(new Planta("Hortelã", "Mentha spicata", "", "", "", "", "", "", "", "", "", "Horta", "https://upload.wikimedia.org/wikipedia/commons/7/70/Mentha_spicata.jpg", "", ""));
//        listaPlantas.add(new Planta("Camomila", "Matricaria chamomilla", "", "", "", "", "", "", "", "", "", "Campo", "https://upload.wikimedia.org/wikipedia/commons/4/42/Chamomile-02.jpg", "", ""));
//        adapter.notifyDataSetChanged();

        homeImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

        // 🔹 Filtro de pesquisa
//        searchPlantas.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                filtrarPlantas(newText);
//                return true;
//            }
//        });
    }

//    private void filtrarPlantas(String texto) {
//        List<Planta> filtrada = new ArrayList<>();
//        for (Planta planta : listaPlantas) {
//            if (planta.getNomePopular().toLowerCase().contains(texto.toLowerCase()) ||
//                    planta.getNomeCientifico().toLowerCase().contains(texto.toLowerCase())) {
//                filtrada.add(planta);
//            }
//        }
//        adapter = new PlantaAdapter(this, filtrada);
//        recyclerView.setAdapter(adapter);
//    }
}
