package com.stack.csci235botprogrammer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.stack.csci235botprogrammer.fsaDataTypes.Flag;
import com.stack.csci235botprogrammer.fsaDataTypes.Mode;
import com.stack.csci235botprogrammer.fsaDataTypes.TempInfoHolder;
import com.stack.csci235botprogrammer.fsaDataTypes.TransitionTable;
import com.stack.csci235botprogrammer.tablesRecycler.TablesAdapter;
import com.stack.csci235botprogrammer.util.Duple;

import java.util.ArrayList;

public class TablesFragment extends Fragment { //https://www.google.com/search?q=setting+up+a+navigation+activity+android&rlz=1C1AVNE_enUS678US678&oq=setting+up+a+navigation+activity+android&aqs=chrome..69i57.11803j0j7&sourceid=chrome&ie=UTF-8#kpvalbx=1
    View myView;
    TablesAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.tables, container, false);

        RecyclerView recyclerView = (RecyclerView) myView.findViewById(R.id.tables_recycler_view);
        adapter = new TablesAdapter(this.getActivity());
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        setUpTableSpinner();
        setUpNewRowAction();

        return myView;
    }

    private void setUpTableSpinner() {
        ArrayList<String> tables = new ArrayList<String>();
        for (TransitionTable t : TempInfoHolder.getTables()) {
            tables.add(t.getName());
        }

        Spinner tableSpinner = (Spinner) myView.findViewById(R.id.spinner2);
        tableSpinner.setAdapter(makeSpinnerAdapter(tables));
    }

    private ArrayAdapter<String> makeSpinnerAdapter(ArrayList<String> names) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_dropdown_item, names);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        return adapter;
    }

    private void setUpNewRowAction() {
        final Button newRowButton = myView.findViewById(R.id.button3);
        newRowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TempInfoHolder.getTables().get(0).getTriggerList().add(new Duple<Flag, Mode>(null, null));
                adapter.notifyDataSetChanged();
            }
        });
    }
}
