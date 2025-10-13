package com.parizene.netmonitor.m0.b0;

/* compiled from: DbmAdjustType.java */
/* loaded from: classes.dex */
public enum c {
    DEFAULT("default"),
    DBM("dbm"),
    MINUS_113("-113"),
    MINUS_116("-116"),
    MINUS_140("-140");


    /* renamed from: k, reason: collision with root package name */
    private String f13271k;

    c(String str) {
        this.f13271k = str;
    }

    public static int a(int i2) {
        return (i2 * 2) - 113;
    }

    public static int b(int i2) {
        return i2 - 113;
    }

    public static int c(int i2) {
        return i2 - 116;
    }

    public static int d(int i2) {
        return i2 - 140;
    }

    public String e() {
        return this.f13271k;
    }
}