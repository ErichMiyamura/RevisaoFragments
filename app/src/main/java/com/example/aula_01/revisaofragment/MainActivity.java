package com.example.aula_01.revisaofragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.aula_01.revisaofragment.fragments.InfoDoisFragment;
import com.example.aula_01.revisaofragment.fragments.InfoUmFragment;
import com.example.aula_01.revisaofragment.help.Comunicador;

public class MainActivity extends AppCompatActivity implements Comunicador {

    private FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*container = findViewById(R.id.container);*/

        replaceFragment(new InfoUmFragment());
    }

    //Implementar o método de replaceFragment
    public void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack("fragmento");    // recarrega o fragmento anterior // Ex: botão de voltar
        transaction.commit();
    }

    @Override
    public void receber(String mensagem) {

        Fragment fragment = InfoDoisFragment.newInstance(mensagem);

        replaceFragment(fragment);

    }
}
