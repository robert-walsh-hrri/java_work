package com.company;

public abstract class OwnListItem {

    private OwnListItem previous = null;
    private OwnListItem next = null;
    private Object value;

    public OwnListItem(Object value) {
        this.value = value;
    }

    public OwnListItem getPrevious() {
        return previous;
    }

    public void setPrevious(OwnListItem previous) {
        this.previous = previous;
    }

    public OwnListItem getNext() {
        return next;
    }

    public void setNext(OwnListItem next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int compareTo(Object value) {
        if (value.equals(this.value)) {
            return 0;
        } else {
            return 1;
        }
    }
}
