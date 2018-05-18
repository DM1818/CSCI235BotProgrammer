package com.stack.csci235botprogrammer.fsaDataTypes;

public class Mode {

    private String name;
    private Enum   action;

    private TransitionTable nextLayer;

    public Mode(String name, Enum action, TransitionTable nextLayer) {

        this.name = name;
        this.action = action;
        this.nextLayer = nextLayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getAction() {
        return action;
    }

    public void setAction(Enum action) {
        this.action = action;
    }

    public TransitionTable getNextLayer() {
        return nextLayer;
    }

    public void setNextLayer(TransitionTable nextLayer) {
        this.nextLayer = nextLayer;
    }

    @Override
    public String toString() {
        return name + " " + action + " " + nextLayer.getName();
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return (other instanceof Mode) && (toString().equals(other.toString()));
    }
}
