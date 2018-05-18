package com.stack.csci235botprogrammer.util;

public enum Actions {
    R_FORWARD {
        @Override
        public String getName() {
            return "R forward";
        }

    }, L_FORWARD {
        @Override
        public String getName() {
            return "L forward";
        }

    }, FORWARD {
        @Override
        public String getName() {
            return "Forward";
        }

    }, R_BACK {
        @Override
        public String getName() {
            return "R back";
        }

    }, L_BACK {
        @Override
        public String getName() {
            return "L back";
        }

    }, BACK {
        @Override
        public String getName() {
            return "Back";
        }
    };

    public abstract String getName();
}
