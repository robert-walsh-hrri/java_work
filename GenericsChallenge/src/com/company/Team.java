package com.company;

public class Team implements Comparable{
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if (this.getName() == ((Team) o).getName()) {
            return 0;
        }
        return 1;
    }
}
