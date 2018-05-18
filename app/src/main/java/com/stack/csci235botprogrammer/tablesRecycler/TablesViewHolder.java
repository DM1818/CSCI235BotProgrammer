package com.stack.csci235botprogrammer.tablesRecycler;
import android.support.v7.widget.RecyclerView;
import android.widget.Spinner;
import android.view.View;
import android.widget.TextView;

import com.stack.csci235botprogrammer.R;

public class TablesViewHolder extends RecyclerView.ViewHolder {

    private Spinner  flagSelect, modeSelect;
    private TextView ifFlag, thenMode;

    public TablesViewHolder(View itemView) {
        super(itemView);

        flagSelect = (Spinner)  itemView.findViewById(R.id.spinner4);
        modeSelect = (Spinner)  itemView.findViewById(R.id.spinner3);
        ifFlag     = (TextView) itemView.findViewById(R.id.textView4);
        thenMode   = (TextView) itemView.findViewById(R.id.textView7);
    }

    public Spinner getFlagSelect() {
        return flagSelect;
    }

    public Spinner getModeSelect() {
        return modeSelect;
    }

    public TextView getIfFlag() {
        return ifFlag;
    }

    public TextView getThenMode() {
        return thenMode;
    }
}
