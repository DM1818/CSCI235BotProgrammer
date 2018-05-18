package com.stack.csci235botprogrammer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.stack.csci235botprogrammer.fsaDataTypes.Mode;
import com.stack.csci235botprogrammer.fsaDataTypes.TempInfoHolder;
import com.stack.csci235botprogrammer.modesRecycler.ModesAdapter;

public class ModesFragment extends Fragment {  //https://www.google.com/search?q=setting+up+a+navigation+activity+android&rlz=1C1AVNE_enUS678US678&oq=setting+up+a+navigation+activity+android&aqs=chrome..69i57.11803j0j7&sourceid=chrome&ie=UTF-8#kpvalbx=1
    View myView;
    ModesAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.modes, container, false);

        RecyclerView recyclerView = (RecyclerView) myView.findViewById(R.id.modes_recycler_view);
        adapter = new ModesAdapter(this.getActivity());
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        setUpNewModeAction();

        return myView;
    }

    private void setUpNewModeAction() {
        final Button newModeButton = myView.findViewById(R.id.button2);
        newModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TempInfoHolder.getModes().add(new Mode("Mode" + TempInfoHolder.getModes().size(), null, null));
                adapter.notifyDataSetChanged();
            }
        });
    }

}
