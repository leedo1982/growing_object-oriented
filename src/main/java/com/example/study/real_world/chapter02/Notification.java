package com.example.study.real_world.chapter02;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    private final List<String> errors = new ArrayList<>();

    public void addError(final String message) {
        errors.add(message);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public String errorMessae() {
        return errors.toString();
    }

    public List<String> getErrors() {
        return this.errors;
    }

}
