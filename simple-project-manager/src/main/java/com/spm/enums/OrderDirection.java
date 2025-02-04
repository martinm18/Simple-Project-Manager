package com.spm.enums;

public enum OrderDirection {
    ASC("asc"),
    DESC("desc");

    private final String direction;

    OrderDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public static OrderDirection fromString(String value) {
        for (OrderDirection order : OrderDirection.values()) {
            if (order.getDirection().equalsIgnoreCase(value)) {
                return order;
            }
        }
        throw new IllegalArgumentException("Invalid order direction: " + value);
    }
}
