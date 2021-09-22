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
}