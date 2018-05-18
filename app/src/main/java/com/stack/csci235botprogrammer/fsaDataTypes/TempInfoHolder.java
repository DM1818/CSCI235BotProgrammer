package com.stack.csci235botprogrammer.fsaDataTypes;

import java.util.ArrayList;

public class TempInfoHolder {
    private static ArrayList<Mode> modes = new ArrayList<Mode>();
    private static ArrayList<Flag> flags = new ArrayList<Flag>();
    private static ArrayList<TransitionTable> tables = new ArrayList<TransitionTable>();

    public TempInfoHolder() {}

    public static ArrayList<Mode> getModes() {
        return modes;
    }

    public static ArrayList<Flag> getFlags() {
        return flags;
    }

    public static ArrayList<TransitionTable> getTables() {
        return tables;
    }

}
