package com.google.firebase.crashlytics.d.l;

import java.io.File;
import java.io.FileFilter;

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes.dex */
final /* synthetic */ class b implements FileFilter {
    private final String a;

    private b(String str) {
        this.a = str;
    }

    public static FileFilter a(String str) {
        return new b(str);
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return g.t(this.a, file);
    }
}