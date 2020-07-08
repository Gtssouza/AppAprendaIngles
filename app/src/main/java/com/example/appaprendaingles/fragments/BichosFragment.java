package com.example.appaprendaingles.fragments;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.appaprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BichosFragment extends Fragment implements View.OnClickListener{

    private ImageButton imgCao, imgGato, imgLeao, imgOvelha, imgMacaco, imgVaca;
    private MediaPlayer mediaPlayer;

    public BichosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bichos, container, false);
        imgCao = view.findViewById(R.id.imageButtonCao);
        imgGato = view.findViewById(R.id.imageButtonGato);
        imgOvelha = view.findViewById(R.id.imageButtonOvelha);
        imgMacaco = view.findViewById(R.id.imageButtonMacaco);
        imgLeao = view.findViewById(R.id.imageButtonLeao);
        imgVaca = view.findViewById(R.id.imageButtonVaca);

        imgCao.setOnClickListener(this);
        imgGato.setOnClickListener(this);
        imgOvelha.setOnClickListener(this);
        imgMacaco.setOnClickListener(this);
        imgLeao.setOnClickListener(this);
        imgVaca.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        Log.i("Elemento clicado","Item"+ view.getId());
        switch (view.getId()){
            case R.id.imageButtonCao:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.dog);
                tocarSom();
                break;
            case R.id.imageButtonGato:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.cat);
                tocarSom();
                break;
            case R.id.imageButtonOvelha:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.sheep);
                tocarSom();
                break;
            case R.id.imageButtonMacaco:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.monkey);
                tocarSom();
                break;
            case R.id.imageButtonLeao:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.lion);
                tocarSom();
                break;
            case R.id.imageButtonVaca:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.cow);
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
}

