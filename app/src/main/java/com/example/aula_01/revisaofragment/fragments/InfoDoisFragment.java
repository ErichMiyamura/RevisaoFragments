package com.example.aula_01.revisaofragment.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aula_01.revisaofragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoDoisFragment extends Fragment {

    private String mensagem;

    public InfoDoisFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance(String mensagem) {

        InfoDoisFragment fragment = new InfoDoisFragment();

        // Criar um bundle
        Bundle bundle = new Bundle();
        bundle.putString("MENSAGEM", mensagem);

        fragment.setArguments(bundle);

        return fragment;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mensagem = getArguments().getString("MENSAGEM");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info_dois, container, false);
        // Setou para o componente a mensagem
        TextView txtInfoDois = view.findViewById(R.id.txt_fragment_dois);
        txtInfoDois.setText(mensagem);

        return view;
    }

}
