package fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gerardomonreal.petagram.R;

import java.nio.file.AtomicMoveNotSupportedException;
import java.util.ArrayList;

import adapter.MascotaAdaptador;
import pojo.Mascota;

/**
 * Created by Gerardo Monreal on 17/09/2017.
 */

public class MascotasFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    RecyclerView rvMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mascotas,container,false);
        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        LinearLayoutManager Llm = new LinearLayoutManager(getActivity());

        Llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(Llm);

        inicializaAdaptador();
        return  v;
    }

    public ArrayList<Mascota> llenaMascotas()
    {
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.labradorgolden,0,"Newton"));
        mascotas.add(new Mascota(R.drawable.schnauzer,2,"chock"));
        mascotas.add(new Mascota(R.drawable.dalmata,2,"dalmata"));
        mascotas.add(new Mascota(R.drawable.sharpei,3,"shar"));

        return mascotas;
    }

    public void inicializaAdaptador()
    {
        MascotaAdaptador adaptador = new MascotaAdaptador(llenaMascotas(),getActivity());

        rvMascotas.setAdapter(adaptador);
    }
}
