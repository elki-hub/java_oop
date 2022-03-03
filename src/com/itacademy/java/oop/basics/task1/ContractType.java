package com.itacademy.java.oop.basics.task1;

public enum ContractType {
    FULL_TIME("FT"),
    PART_TIME("PT");
    public final String type;

    ContractType(String type) {
        this.type= type;
    }

    public static ContractType valueOfCode(String type) {
        for (ContractType e : values()) {
            if (e.type.equals(type)) {
                return e;
            }
        }
        return null;
    }


}
