package br.com.example.fitopedia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;

import br.com.example.fitopedia.carrossel.Planta;
import br.com.example.fitopedia.carrossel.PlantaAdapter;

public class ExplorarPlantas extends AppCompatActivity {
    private ImageButton homeImageButton;
    private ArrayList<Planta> listaPlantas;
    private String nomePlanilha;
    private RecyclerView plantasRecyclerVIew;
    private MaterialToolbar toolbar;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_explorar_plantas);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new OnApplyWindowInsetsListener() { // from class: br.com.example.fitopedia.ExplorarPlantas$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ExplorarPlantas.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.homeImageButton = (ImageButton) findViewById(R.id.homeImageButton);
        this.homeImageButton.setOnClickListener(new View.OnClickListener() { // from class: br.com.example.fitopedia.ExplorarPlantas.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Intent intent = new Intent(ExplorarPlantas.this.getApplicationContext(), (Class<?>) MainActivity.class);
                ExplorarPlantas.this.startActivity(intent);
            }
        });
        this.listaPlantas = new ArrayList<>();
        SharedPreferences prefs = getSharedPreferences("app_dados", 0);
        String dadosPlanilha = prefs.getString("planilhaCategoria", null);
        if (dadosPlanilha != null) {
            Log.d("CSV", "Dados carregados: " + dadosPlanilha);
            String[] linhas = dadosPlanilha.split(" \\| ");
            int quantLinhas = linhas.length;
            for (int i = 0; i < quantLinhas; i++) {
                String[] colunas = linhas[i].split(",");
                if (i != 0) {
                    Planta planta = Planta.fromCSVColumns(colunas);
                    if (planta == null) {
                        Log.w("CSV", "Linha " + i + " ignorada por ter menos de 17 colunas.");
                    } else {
                        this.listaPlantas.add(planta);
                    }
                }
            }
        } else {
            Log.d("CSV", "Nenhum dado salvo encontrado.");
        }
        this.plantasRecyclerVIew = (RecyclerView) findViewById(R.id.plantasRecyclerView);
        this.toolbar = (MaterialToolbar) findViewById(R.id.toolbar);
        setSupportActionBar(this.toolbar);
        PlantaAdapter adapter = new PlantaAdapter(this, this.listaPlantas);
        this.plantasRecyclerVIew.setAdapter(adapter);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View v, WindowInsetsCompat insets) {
        Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        return insets;
    }
}
