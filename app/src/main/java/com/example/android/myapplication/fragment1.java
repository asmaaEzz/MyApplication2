package com.example.android.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


public class fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        TextView general = (TextView) view.findViewById(R.id.about);
        int color = this.getResources().getColor(android.R.color.holo_blue_light);
        String string = this.getString(R.string.aboutContent, color);
        general.setText(Html.fromHtml(string));
        general.setMovementMethod(new ScrollingMovementMethod());

        return view;


    }
}
