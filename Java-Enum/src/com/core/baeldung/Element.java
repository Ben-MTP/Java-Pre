package com.core.baeldung;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 11/25/2022
 * @project Java-Enum
 * -----
 * Element: Định nghĩa kiểu Enum chứa thông tin nhãn hóa học
 * ??? Tại sao không có kiểu setter cho label này
 *
 * Tham khảo: https://www.baeldung.com/java-enum-values
 */
public enum Element {
    H("Hydrogen"), HE("Helium"), LI("LI"),
    BE("BE"), B("B"), C("C");

    private static final Map<String, Element> BY_LABEL = new HashMap<>();

    static {
        for (Element e : values()){
            BY_LABEL.put(e.label, e);
        }
    }

    public final String label;

    Element(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static Element valueOfLabel(String label){
        return BY_LABEL.get(label);
    }
}
