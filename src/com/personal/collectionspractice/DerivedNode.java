package com.personal.collectionspractice;

public class DerivedNode {
    private Integer value;
    private DerivedNode address;

    public DerivedNode(Integer value) {
        this.value = value;
        this.address = null;
    }

    public DerivedNode() {
        this(null);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public DerivedNode getAddress() {
        return address;
    }

    public void setAddress(DerivedNode address) {
        this.address = address;
    }
}
