package com.uwjx.litepal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.uwjx.litepal.model.Album;
import com.uwjx.litepal.model.Song;
import com.uwjx.litepal.util.L;

import org.litepal.LitePal;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;
import lombok.extern.slf4j.Slf4j;

public class FirstFragment extends Fragment {

    @OnClick(R.id.button_save)
    public void button_save(){
        L.d("保存数据");
        Album album = new Album();
        album.setName("album");
        album.setPrice(10.99f);
        album.save();
//        Song song1 = new Song();
//        song1.setName("song1");
//        song1.setDuration(320);
//        song1.setAlbum(album);
//        song1.save();
//        Song song2 = new Song();
//        song2.setName("song2");
//        song2.setDuration(356);
//        song2.setAlbum(album);
//        song2.save();
    }

    @OnClick(R.id.button_query)
    public void button_query(){
        L.d("查询数据");
        List<Album> albums = LitePal.findAll(Album.class);
        for (Album album : albums) {
            L.d("查询到的结果:" + album.toString());
        }
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        ButterKnife.bind(this , view);
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }
}