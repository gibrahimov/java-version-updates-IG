package com.cydeo;

public enum ProjectStatus {

    OPEN,CLOSED,PROGRESS("IN PROGRESS");

    String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    ProjectStatus() { // this is shortcut none constructor
        // we usually don't do this
        // if we don't this, OPEN and CLOSED will complain
    }

}

