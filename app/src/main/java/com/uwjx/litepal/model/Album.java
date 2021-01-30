package com.uwjx.litepal.model;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Album extends LitePalSupport {
    @Column(unique = true, defaultValue = "unknown")
    private String name;

    @Column(index = true)
    private float price;

    private List<Song> songs = new ArrayList<>();

}
