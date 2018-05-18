package com.stack.csci235botprogrammer.tablesRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.stack.csci235botprogrammer.R;
import com.stack.csci235botprogrammer.TablesFragment;
import com.stack.csci235botprogrammer.fsaDataTypes.Flag;
import com.stack.csci235botprogrammer.fsaDataTypes.Mode;
import com.stack.csci235botprogrammer.fsaDataTypes.TempInfoHolder;

import java.util.ArrayList;

public class TablesAdapter extends RecyclerView.Adapter<TablesViewHolder> {

    Context context;

    public TablesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public TablesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.tables_cardview, parent, false);
        return new TablesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TablesViewHolder holder, int position) {
        //todo: populate spinners
        setUpFlagSpinner(holder);
        setUpModeSpinner(holder);
    }

    @Override
    public int getItemCount() {
        return TempInfoHolder.getTables().get(0).getTriggerList().size(); //todo: figure out exactly what this is supposed to do
    }

    private void setUpFlagSpinner(TablesViewHolder holder) {
        ArrayList<String> flags = new ArrayList<String>();
        for (Flag f : TempInfoHolder.getFlags()) {
            flags.add(f.getName());
        }

        holder.getFlagSelect().setAdapter(makeSpinnerAdapter(flags));
    }

    private void setUpModeSpinner(TablesViewHolder holder) {
        ArrayList<String> modes = new ArrayList<String>();
        for (Mode m : TempInfoHolder.getModes()) {
            modes.add(m.getName());
        }

        holder.getModeSelect().setAdapter(makeSpinnerAdapter(modes));
    }

    private ArrayAdapter<String> makeSpinnerAdapter(ArrayList<String> names) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, names);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        return adapter;
    }
}