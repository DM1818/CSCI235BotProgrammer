package com.stack.csci235botprogrammer.fsaDataTypes;

import com.stack.csci235botprogrammer.util.Duple;

import java.util.ArrayList;

public class TransitionTable {

    private String name;
    private ArrayList<Duple<Flag, Mode>> triggerList;

    public TransitionTable(String name) {
        this.name = name;

        triggerList = new ArrayList<Duple<Flag, Mode>>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Duple<Flag, Mode>> getTriggerList() {
        return triggerList;
    }

    public void setTriggerList(ArrayList<Duple<Flag, Mode>> triggerList) {
        this.triggerList = triggerList;
    }

    @Override
    public String toString() {
        return name + " " + triggerList.toString();
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return (other instanceof TransitionTable) && (toString().equals(other.toString()));
    }
}
