package com.adapter;

import com.DList.DList;
import com.Stack.Stack;

public class DListImpStack extends DList implements Stack {
    @Override
    public void push(int value) {
        insertTail(value);
    }

    @Override
    public Object pop() {
        return removeTail();
    }

    @Override
    public Object top() {
        return getTail();
    }


}
