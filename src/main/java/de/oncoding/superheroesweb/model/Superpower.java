package de.oncoding.superheroesweb.model;

import java.util.UUID;

public class Superpower {

    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final String actionDescription;

    public Superpower(String name, String actionDescription) {
        this.name = name;
        this.actionDescription = actionDescription;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getActionDescription() {
        return actionDescription;
    }
}
