package com.google.firebase.crashlytics.d.h;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
final /* synthetic */ class j implements FilenameFilter {
    private static final j a = new j();

    private j() {
    }

    public static FilenameFilter a() {
        return a;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith(".ae");
    }
}