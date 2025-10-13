package com.google.firebase.crashlytics.d.l;

import android.content.Context;
import java.io.File;

/* compiled from: FileStoreImpl.java */
/* loaded from: classes.dex */
public class i implements h {
    private final Context a;

    public i(Context context) {
        this.a = context;
    }

    @Override // com.google.firebase.crashlytics.d.l.h
    public String a() {
        return new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics").getPath();
    }

    @Override // com.google.firebase.crashlytics.d.l.h
    public File b() {
        return c(new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics"));
    }

    File c(File file) {
        if (file == null) {
            com.google.firebase.crashlytics.d.b.f().b("Null File");
            return null;
        }
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        com.google.firebase.crashlytics.d.b.f().i("Couldn't create file");
        return null;
    }
}