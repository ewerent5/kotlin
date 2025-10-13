package com.google.firebase.crashlytics.d.l;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes.dex */
final /* synthetic */ class a implements FilenameFilter {
    private final String a;

    private a(String str) {
        this.a = str;
    }

    public static FilenameFilter a(String str) {
        return new a(str);
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}