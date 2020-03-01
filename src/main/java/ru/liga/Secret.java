package ru.liga;

public class Secret {
    private final String branch1;
    private final String branch2;

    public Secret(String branch1, String branch2) {
        this.branch1 = branch1;
        this.branch2 = branch2;
    }

    public String generate() {
        return branch1Secret(branch1) + branch2Secret(branch2);
    }

    private String branch1Secret(String branch1) {
        return branch1;
    }

    private String branch2Secret(String branch2) {
        return branch2;
    }
}
