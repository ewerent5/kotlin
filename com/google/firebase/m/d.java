package com.google.firebase.m;

/* compiled from: HeartBeatInfo.java */
/* loaded from: classes.dex */
public interface d {

    /* compiled from: HeartBeatInfo.java */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: j, reason: collision with root package name */
        private final int f12890j;

        a(int i2) {
            this.f12890j = i2;
        }

        public int a() {
            return this.f12890j;
        }
    }

    a a(String str);
}