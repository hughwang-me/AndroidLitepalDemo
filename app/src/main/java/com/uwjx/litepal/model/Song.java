package com.uwjx.litepal.model;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import lombok.Data;

@Data
public class Song extends LitePalSupport {

    @Column(nullable = false)
    private String name;

    private int duration;

    @Column(ignore = true)
    private String uselessField;

    private Album album;
}
