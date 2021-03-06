package edu.kis.vh.nursery;

public interface IIntStack {

    int EMPTY_RETURN_CODE = -1;

    void push(int in);

    boolean isFull();

    int pop();

    int peek();
}
