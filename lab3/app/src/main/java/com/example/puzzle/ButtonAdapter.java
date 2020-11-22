package com.example.puzzle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class ButtonAdapter extends BaseAdapter {
    private ArrayList<PuzzleButton> buttons;
    private Context context;
    private LayoutInflater inflater;
    public ButtonAdapter(Context context) {
        this.buttons = MainActivity.getButtons();
        this.context = context;
        this.inflater= LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return this.buttons.size();
    }

    @Override
    public Object getItem(int position) {
        return this.buttons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.button_layout, null);
        ImageButton button=(ImageButton)convertView.findViewById(R.id.imageButton);
        button.setImageResource(this.buttons.get(position).getImage());
        return convertView;
    }
}
