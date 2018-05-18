package com.stack.csci235botprogrammer.modesRecycler;

import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.view.View;
import android.widget.TextView;

import com.stack.csci235botprogrammer.R;

public class ModesViewHolder extends RecyclerView.ViewHolder {

    private Spinner  actionSelect, tableSelect;
    private TextView modeName;
    private ImageButton deleteKey;

    public ModesViewHolder(View itemView) {
        super(itemView);

        actionSelect = (Spinner)  itemView.findViewById(R.id.m_spinner);
        tableSelect = (Spinner)  itemView.findViewById(R.id.m_spinner2);
        modeName  = (TextView) itemView.findViewById(R.id.m_textView);
        deleteKey = (ImageButton) itemView.findViewById(R.id.imageButton);
    }

    public Spinner getActionSelect() {
        return actionSelect;
    }

    public Spinner getTableSelect() {
        return tableSelect;
    }

    public TextView getModeName() {
        return modeName;
    }

    public ImageButton getDeleteKey() {
        return deleteKey;
    }
}
