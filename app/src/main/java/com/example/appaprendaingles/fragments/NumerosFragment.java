package com.example.appaprendaingles.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.appaprendaingles.R;


public class NumerosFragment extends Fragment implements View.OnClickListener{

    private ImageButton imgUm, imgDois, imgTres, imgQuatro, imgCinco, imgSeis;
    private MediaPlayer mediaPlayer;


    public NumerosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);
        imgUm = view.findViewById(R.id.imageButtonUm);
        imgDois = view.findViewById(R.id.imageButtonDois);
        imgTres = view.findViewById(R.id.imageButtonTres);
        imgQuatro = view.findViewById(R.id.imageButtonQuatro);
        imgCinco = view.findViewById(R.id.imageButtonCinco);
        imgSeis = view.findViewById(R.id.imageButtonSeis);

        imgUm.setOnClickListener(this);
        imgDois.setOnClickListener(this);
        imgTres.setOnClickListener(this);
        imgQuatro.setOnClickListener(this);
        imgCinco.setOnClickListener(this);
        imgSeis.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Log.i("Elemento clicado", "Item" + v.getId());
        switch (v.getId()){
            case R.id.imageButtonUm:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.one);
                tocarSom();
                break;

            case R.id.imageButtonDois:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.two);
                tocarSom();
                break;

            case R.id.imageButtonTres:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.three);
                tocarSom();
                break;

            case R.id.imageButtonQuatro:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.four);
                tocarSom();
                break;

            case R.id.imageButtonCinco:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.five);
                tocarSom();
                break;

            case R.id.imageButtonSeis:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.six);
                tocarSom();
                break;
        }

    }

    public void tocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer = null;
        }

    }
}
