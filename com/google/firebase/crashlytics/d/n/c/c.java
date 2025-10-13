package com.google.firebase.crashlytics.d.n.c;

import java.io.File;
import java.util.Map;

/* compiled from: Report.java */
/* loaded from: classes.dex */
public interface c {

    /* compiled from: Report.java */
    public enum a {
        JAVA,
        NATIVE
    }

    Map<String, String> a();

    String b();

    File c();

    File[] d();

    String e();

    a getType();

    void remove();
}