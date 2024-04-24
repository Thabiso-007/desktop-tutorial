package com.InterfaceSegregationPrinciple;

// Class that implements both Document and Print interfaces
class PrintableDocument implements Document, Print {
    @Override
    public void open() {
        System.out.println("PrintableDocument opened.");
    }

    @Override
    public void close() {
        System.out.println("PrintableDocument closed.");
    }

    @Override
    public void save() {
        System.out.println("PrintableDocument saved.");
    }

    @Override
    public void print() {
        System.out.println("PrintableDocument printed.");
    }
}
