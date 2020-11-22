package com.example.puzzle;

import android.widget.ImageButton;

import java.util.ArrayList;

public class PuzzleButton {
    private int image;
    private int id;

    public PuzzleButton(int image, int id) {
        this.image = image;
        this.id=id;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id;
    }
}

