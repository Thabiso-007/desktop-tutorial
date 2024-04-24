package com.InterfaceSegregationPrinciple;

// Class that implements only the Document interface
class SimpleDocument implements Document {
    @Override
    public void open() {
        System.out.println("SimpleDocument opened.");
    }

    @Override
    public void close() {
        System.out.println("SimpleDocument closed.");
    }

    @Override
    public void save() {
        System.out.println("SimpleDocument saved.");
    }
}