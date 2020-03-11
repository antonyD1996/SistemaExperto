package com.antycode.sistemaexperto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentResultado#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentResultado extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentResultado() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ResultadoParkinson.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentResultado newInstance(String param1, String param2) {
        FragmentResultado fragment = new FragmentResultado();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_resultado, container, false);
        ImageView imagen = myInflatedView.findViewById(R.id.idImagenResultado);
        TextView t = myInflatedView.findViewById(R.id.idTxtEnfermedad);
        Utilidades.cargar();
        t.setText("De acuerdo a tus sintomas, la enfermedad neurologia que coincide es " + Utilidades.obtenerDiagnostico());

        if (Utilidades.obtenerDiagnostico().equals("Alzheimer")) {
            imagen.setPadding(30, 30, 30, 30);
            imagen.setImageResource(R.drawable.alzheimer);
        } else if (Utilidades.obtenerDiagnostico().equals("Migraña")) {
            imagen.setImageResource(R.drawable.migrana);
        } else if (Utilidades.obtenerDiagnostico().equals("Aneurisma Cerebral")) {
            imagen.setImageResource(R.drawable.aneurisma);
        } else if (Utilidades.obtenerDiagnostico().equals("Esclerosis Multiple")) {
            imagen.setImageResource(R.drawable.esclerosis);
        }
        return myInflatedView;
    }

    public void onClick(View view) {
    }
}
