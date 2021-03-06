package com.uoeracing.telemetrysystem;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RunsList extends ArrayAdapter<RunData> {
    private Activity context;
    List<RunData> tests;

    public RunsList(Activity context, List<RunData> tests) {
        super(context, R.layout.layout_tests, tests);
        this.context = context;
        this.tests = tests;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_tests, null, true);

        TextView textTotalTime = (TextView) listViewItem.findViewById(R.id.nameOfRun);
        TextView textTotalLaps = (TextView) listViewItem.findViewById(R.id.startDate);

        RunData run = tests.get(position);
        textTotalTime.setText(String.valueOf(run.getRunName()));
        textTotalLaps.setText(String.valueOf(run.getStartDate()));
        return listViewItem;
    }
}
