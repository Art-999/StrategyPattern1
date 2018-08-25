package com.company;

import com.company.interfaces.SpeekBehavior;

public abstract class Person {
    SpeekBehavior speekBehavior;

    abstract void eat();

    abstract void sleep();

    void performSpeek() {
        if (speekBehavior != null) {
            speekBehavior.speek();
        }
    }

    public void setSpeekBehavior(SpeekBehavior speekBehavior) {
        this.speekBehavior = speekBehavior;
    }
}
