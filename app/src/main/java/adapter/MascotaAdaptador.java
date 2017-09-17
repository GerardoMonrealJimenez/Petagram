package adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gerardomonreal.petagram.R;

import java.util.ArrayList;

import pojo.Mascota;

/**
 * Created by Gerardo Monreal on 17/09/2017.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder holder, int position) {
        final  Mascota mascota = mascotas.get(position);
        holder.imgMascota.setImageResource(mascota.getImage());
        holder.raiting.setText(String.valueOf(mascota.getRaiting()));
        holder.tvNombre.setText(mascota.getName());
        holder.imgBtnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mascota.setRaiting(mascota.getRaiting() + 1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        ImageView   imgMascota;
        ImageButton imgBtnLike;
        TextView    tvNombre;
        TextView    raiting;
        public MascotaViewHolder(View itemView) {
            super(itemView);

            imgMascota  =   (ImageView)     itemView.findViewById(R.id.imgMascota);
            imgBtnLike  =   (ImageButton)   itemView.findViewById(R.id.imgBtnLike);
            tvNombre    =   (TextView)      itemView.findViewById(R.id.tvNombre);
            raiting     =   (TextView)      itemView.findViewById(R.id.raiting);
        }
    }
}
