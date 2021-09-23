package net.ivanvega.fragmentosdinamicos;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class MiAdaptadorPersonalizado
        extends RecyclerView.Adapter<MiAdaptadorPersonalizado.ViewHolder> {


    private final Vector<Libro> libros;
    private final Context contexto;

    public  MiAdaptadorPersonalizado(Context ctx,
                                     Vector<Libro> libros){
        this.libros = libros;
        this.contexto = ctx;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return libros.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
