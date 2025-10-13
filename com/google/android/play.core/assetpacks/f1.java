package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
final /* synthetic */ class f1 implements FilenameFilter {
    private final String a;

    f1(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.a).concat("-")) && str.endsWith(".apk");
    }
}