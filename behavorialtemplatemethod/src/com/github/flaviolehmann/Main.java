package com.github.flaviolehmann;

import com.github.flaviolehmann.interactions.CoolGuyInteraction;
import com.github.flaviolehmann.interactions.GuyInteractor;
import com.github.flaviolehmann.interactions.NotThatCoolGuyInteraction;

public class Main {

    public static void main(String ...args) {
        GuyInteractor coolGuyInteraction = new CoolGuyInteraction();
        System.out.println(coolGuyInteraction.getWholeSentence());

        GuyInteractor dumbassInteraction = new NotThatCoolGuyInteraction();
        System.out.println(dumbassInteraction.getWholeSentence());
    }
}
