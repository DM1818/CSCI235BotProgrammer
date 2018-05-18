package com.stack.csci235botprogrammer.modesRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.stack.csci235botprogrammer.R;
import com.stack.csci235botprogrammer.fsaDataTypes.TempInfoHolder;
import com.stack.csci235botprogrammer.fsaDataTypes.TransitionTable;
import com.stack.csci235botprogrammer.util.Actions;

import java.util.ArrayList;

public class ModesAdapter extends RecyclerView.Adapter<ModesViewHolder> {

    Context context;
    public ModesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ModesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.modes_cardview, parent, false);
        return new ModesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ModesViewHolder holder, int position) {
        holder.getModeName().setText((CharSequence) TempInfoHolder.getModes().get(position).getName());
        setUpActionSpinner(holder);
        setUpTableSpinner(holder);
    }

    @Override
    public int getItemCount() {
        return TempInfoHolder.getModes().size(); //note: determines initial population
    }

    private void setUpActionSpinner(ModesViewHolder holder) {
        ArrayList<String> actions = new ArrayList<String>();
        for( Actions a : Actions.values()) {
            actions.add(a.getName());
        }

        holder.getActionSelect().setAdapter(makeSpinnerAdapter(actions));
    }

    private void setUpTableSpinner(ModesViewHolder holder) {
        ArrayList<String> tables = new ArrayList<String>();
        for (TransitionTable t : TempInfoHolder.getTables()) {
            tables.add(t.getName());
        }

        holder.getTableSelect().setAdapter(makeSpinnerAdapter(tables));
    }

    private ArrayAdapter<String> makeSpinnerAdapter(ArrayList<String> names) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, names);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        return adapter;
    }
}
