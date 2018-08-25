package com.company;

import com.company.interfaces.SpeekBehavior;

public class Armenian extends Person {

    public Armenian(SpeekBehavior speekBehavior) {
        speekBehavior.speek();
    }

    @Override
    void eat() {

    }

    @Override
    void sleep() {

    }
}
