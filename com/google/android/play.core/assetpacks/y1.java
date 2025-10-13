package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
final /* synthetic */ class y1 implements FilenameFilter {
    static final FilenameFilter a = new y1();

    private y1() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return z1.a.matcher(str).matches();
    }
}