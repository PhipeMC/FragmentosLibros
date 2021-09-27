package net.ivanvega.fragmentosdinamicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.contenedor_pequeno)!=null
        ) {

            getSupportFragmentManager().beginTransaction().
                    setReorderingAllowed(true)
            .add(
                    R.id.contenedor_pequeno,
                    SelectorFragment.class, null).commit();

        }

        
    }

    public void mostrarDetalle(int pos) {

        if (findViewById(R.id.contenedor_pequeno)!=null
        ) {

            DetalleFragment detalleFragment =
                    new DetalleFragment();
            Bundle bundle = new Bundle();

            bundle.putInt(DetalleFragment.ARG_INDEX_LIBRO,
                    pos
            );

            detalleFragment.setArguments(
                    bundle
                    );

            getSupportFragmentManager().beginTransaction().
                    setReorderingAllowed(true)
                    .replace(R.id.contenedor_pequeno,detalleFragment)
                    .commit();


        }

        /*

        DetalleFragment getSupportFragmentManager().
                findFragmentById(R.id.detalle_fragment)
                */


    }
}