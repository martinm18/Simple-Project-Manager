package com.spm.enums;

public enum SortField {
    ID("id"),
    NAME("name"),
    DEADLINE("deadline"),
    BUDGET("budget");

    private final String field;

    SortField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public static SortField fromString(String value) {
        for (SortField field : SortField.values()) {
            if (field.getField().equalsIgnoreCase(value)) {
                return field;
            }
        }
        throw new IllegalArgumentException("Invalid sort field: " + value);
    }
}
