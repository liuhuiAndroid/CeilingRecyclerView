package com.enjoy.ceiling;

public class Star {

    private String name;
    private String groupName;

    public Star(String name, String groundName) {
        this.name = name;
        this.groupName = groundName;
    }

    public String getName() {
        return name;
    }

    public String getGroupName() {
        return groupName;
    }
}
