package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.TooltipCompat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.google.android.material.tooltip.TooltipDrawable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ToolTipWindow toolTipWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    toolTipWindow = new ToolTipWindow(MainActivity.this);
    }

    @Override
    public void onClick(View view) {

        if (!toolTipWindow.isTooltipShown()){
            toolTipWindow.showToolTip(view);
        }
    }
}