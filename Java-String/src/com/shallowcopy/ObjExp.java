package com.shallowcopy;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-String
 */
public class ObjExp implements Cloneable{

    private ObjExp child;
    private String content;

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public ObjExp(String content) {
        this.content = content;
    }

    public ObjExp(ObjExp child, String content) {
        this.child = child;
        this.content = content;
    }

    public ObjExp(String content, ObjExp child){
        this.content = content;
        this.child = child;
    }

    public ObjExp getChild() {
        return child;
    }

    public void setChild(ObjExp child) {
        this.child = child;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content + ((child!=null)?("->" + child):"");
    }
}
