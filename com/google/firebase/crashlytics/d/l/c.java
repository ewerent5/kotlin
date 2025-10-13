package com.google.firebase.crashlytics.d.l;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes.dex */
final /* synthetic */ class c implements FilenameFilter {
    private static final c a = new c();

    private c() {
    }

    public static FilenameFilter a() {
        return a;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return g.s(file, str);
    }
}