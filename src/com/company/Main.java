package com.company;

import com.company.interfaces.SpeekInArmenian;
import com.company.interfaces.SpeekInEnglish;
import com.company.interfaces.SpeekInNoLanguage;

public class Main {

    public static void main(String[] args) {

        Person englishMan = new EnglishMan();
        englishMan.setSpeekBehavior(new SpeekInEnglish());
        englishMan.performSpeek();

        Person swedishMan = new SwedishMan();
        swedishMan.setSpeekBehavior(new SpeekInNoLanguage());
        swedishMan.performSpeek();

        Person armenian = new Armenian(new SpeekInArmenian());
    }
}
