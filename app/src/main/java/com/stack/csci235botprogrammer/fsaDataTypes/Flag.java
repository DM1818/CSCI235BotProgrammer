package com.stack.csci235botprogrammer.fsaDataTypes;

public class Flag {

    private String  name;
    private boolean state;

    public Flag(String name) {
        this.name  = name;
        this.state = false;
    }

    public String getName() {
        return name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return name + " " + state;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return (other instanceof Flag) && (toString().equals(other.toString()));
    }
}
