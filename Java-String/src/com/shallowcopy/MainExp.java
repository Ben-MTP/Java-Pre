package com.shallowcopy;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-String
 */
public class MainExp {
    public static void main(String[] args) throws Exception{
        ObjExp o1 = new ObjExp("123", new ObjExp("child 123"));
        ObjExp o2 = new ObjExp("abc", new ObjExp("child abc"));
        System.out.println("Init: " + o1 + " | " + o2);
        o2=(ObjExp)o1.clone();
        System.out.println("After assign: " + o1 + " | " + o2);
        o2.setContent("456");
        o2.getChild().setContent("child 456");
        System.out.println("After set o2: " + o1 + " | " + o2);
        o1.setContent("789");
        o1.getChild().setContent("child 789");
        System.out.println("After set o1: " + o1 + " | " + o2);
    }
}
