package com.company;

public class Main {

    public static class OwnLinkedList<O> {
        private OwnListItem head;
        public OwnLinkedList() {
        }

        public void addItem(OwnListItem newItem) {
            if (this.head == null) {
                this.head = newItem;
            } else if (this.head.getNext() == null) {
                Integer i = 1;
                OwnListItem nextNode = new OwnListItem(i);
                while()
            }
        }
    }

    public static void main(String[] args) {
        OwnLinkedList<OwnListItem> ll = new OwnLinkedList<OwnListItem>();


    }
}
