package com.google.firebase.crashlytics.d.m;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* compiled from: ClsFileOutputStream.java */
/* loaded from: classes.dex */
public class b extends FileOutputStream {

    /* renamed from: e, reason: collision with root package name */
    public static final FilenameFilter f12681e = new a();

    /* renamed from: f, reason: collision with root package name */
    private final String f12682f;

    /* renamed from: g, reason: collision with root package name */
    private File f12683g;

    /* renamed from: h, reason: collision with root package name */
    private File f12684h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12685i;

    /* compiled from: ClsFileOutputStream.java */
    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public b(File file, String str) {
        super(new File(file, str + ".cls_temp"));
        this.f12685i = false;
        String str2 = file + File.separator + str;
        this.f12682f = str2;
        this.f12683g = new File(str2 + ".cls_temp");
    }

    public void b() throws IOException {
        if (this.f12685i) {
            return;
        }
        this.f12685i = true;
        super.flush();
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f12685i) {
            return;
        }
        this.f12685i = true;
        super.flush();
        super.close();
        File file = new File(this.f12682f + ".cls");
        if (this.f12683g.renameTo(file)) {
            this.f12683g = null;
            this.f12684h = file;
            return;
        }
        String str = "";
        if (file.exists()) {
            str = " (target already exists)";
        } else if (!this.f12683g.exists()) {
            str = " (source does not exist)";
        }
        throw new IOException("Could not rename temp file: " + this.f12683g + " -> " + file + str);
    }
}