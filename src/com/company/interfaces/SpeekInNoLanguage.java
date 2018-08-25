package com.company.interfaces;

public class SpeekInNoLanguage implements SpeekBehavior {
    @Override
    public void speek() {
        System.out.println("I don't speek in any language");
    }
}
