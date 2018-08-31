package com.regionaltolima.worldskills.turistapp.Fragments;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.regionaltolima.worldskills.turistapp.AdaptadorSitios;
import com.regionaltolima.worldskills.turistapp.Database.Database;
import com.regionaltolima.worldskills.turistapp.R;
import com.regionaltolima.worldskills.turistapp.S;
import com.regionaltolima.worldskills.turistapp.Sitios;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SitiosFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SitiosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SitiosFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    RecyclerView recyclerView;
    AdaptadorSitios adapter;
    ArrayList<Sitios> listaSitios;

    SQLiteOpenHelper net;
    SQLiteDatabase db;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SitiosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SitiosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SitiosFragment newInstance(String param1, String param2) {
        SitiosFragment fragment = new SitiosFragment();
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
        View view = inflater.inflate(R.layout.fragment_sitios, container, false);

        net = new Database(getContext(), "Sitios", null, 1);
        db = net.getReadableDatabase();
        recyclerView = view.findViewById(R.id.recycler_Sitios);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));

        llenarReciclerView();

        adapter = new AdaptadorSitios(listaSitios);
        recyclerView.setAdapter(adapter);

        return view;
    }

    public void llenarReciclerView(){
        listaSitios = new ArrayList();
        String tipoSitio = "", imagen = "", nombreSitio = "", desccSitio = "", ubicacionSitio = "", desclSitio = "";
        double latSitio = 0, lonSitio = 0;
        int imagenSitio = 0;

        Cursor cursor = db.rawQuery(sitiosEscogidos(),null);

        while (cursor.moveToNext()){
            tipoSitio = cursor.getString(0);
            imagen = cursor.getString(1);
            imagenSitio = getContext().getResources().getIdentifier(imagen,null, getContext().getPackageName());
            nombreSitio = cursor.getString(2);
            desccSitio = cursor.getString(3);
            ubicacionSitio = cursor.getString(4);
            desclSitio = cursor.getString(5);
            latSitio = cursor.getDouble(6);
            lonSitio = cursor.getDouble(5);

        }

        listaSitios.add(new Sitios(tipoSitio,imagenSitio,nombreSitio,desccSitio,ubicacionSitio,desclSitio,latSitio,lonSitio));
    }

    private String sitiosEscogidos() {
        if (S.CONTEXTO == S.CENTROS){
            return "SELECT * FROM Sitios WHERE tipoSitio = 'Sitios'";
        }
        if (S.CONTEXTO == S.HOTELES){
            return "SELECT * FROM Sitios WHERE tipoSitio = 'Hotel'";
        }
        else{
            return "SELECT * FROM Sitios WHERE tipoSitio = 'Rest'";
        }
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
