package com.androidplot.ui;

/* loaded from: classes.dex */
public class Insets {
    private float bottom;
    private float left;
    private float right;
    private float top;

    public Insets() {
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getTop() {
        return this.top;
    }

    public void setBottom(float f2) {
        this.bottom = f2;
    }

    public void setLeft(float f2) {
        this.left = f2;
    }

    public void setRight(float f2) {
        this.right = f2;
    }

    public void setTop(float f2) {
        this.top = f2;
    }

    public Insets(float f2, float f3, float f4, float f5) {
        this.top = f2;
        this.bottom = f3;
        this.left = f4;
        this.right = f5;
    }
}