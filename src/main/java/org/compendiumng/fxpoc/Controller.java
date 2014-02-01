package org.compendiumng.fxpoc;

import javafx.event.ActionEvent;
import javafx.event.Event;

public class Controller {
    public void dosomething(ActionEvent actionEvent) {
        System.out.println("did something");

    }

    public void tabchanged(Event event) {
        System.out.println("tab changed");
    }

    public void firsttabchanged(Event event) {
    }
}
