package com.google.firebase.crashlytics.d.l;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes.dex */
final /* synthetic */ class f implements FilenameFilter {
    private static final f a = new f();

    private f() {
    }

    public static FilenameFilter a() {
        return a;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith("event");
    }
}