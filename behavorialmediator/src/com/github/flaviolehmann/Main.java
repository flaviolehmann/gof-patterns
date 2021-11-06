package com.github.flaviolehmann;

import com.github.flaviolehmann.mediator.TitleLabel;
import com.github.flaviolehmann.mediator.components.Checkbox;
import com.github.flaviolehmann.mediator.components.FrameView;

public class Main {

    public static void main(String ...args) {
        Checkbox checkbox = new Checkbox();
        TitleLabel titleLabel = new TitleLabel();
        FrameView frameView = new FrameView(checkbox, titleLabel);

        System.out.println("Title Label content: " + titleLabel.getContent());

        checkbox.setValue(Boolean.FALSE);
        System.out.println("Title Label content: " + titleLabel.getContent());

        checkbox.setValue(Boolean.TRUE);
        System.out.println("Title Label content: " + titleLabel.getContent());
    }
}
