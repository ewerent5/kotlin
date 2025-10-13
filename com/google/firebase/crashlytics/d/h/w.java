package com.google.firebase.crashlytics.d.h;

import com.google.firebase.crashlytics.d.j.v;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: FileBackedNativeSessionFile.java */
/* loaded from: classes.dex */
class w implements b0 {
    private final File a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12483b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12484c;

    w(String str, String str2, File file) {
        this.f12483b = str;
        this.f12484c = str2;
        this.a = file;
    }

    private byte[] d() throws IOException {
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamB = b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamB == null) {
                        byteArrayOutputStream.close();
                        if (inputStreamB != null) {
                            inputStreamB.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i2 = inputStreamB.read(bArr);
                            if (i2 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamB.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i2);
                        } finally {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (inputStreamB != null) {
                    try {
                        inputStreamB.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th2;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.d.h.b0
    public String a() {
        return this.f12484c;
    }

    @Override // com.google.firebase.crashlytics.d.h.b0
    public InputStream b() {
        if (this.a.exists() && this.a.isFile()) {
            try {
                return new FileInputStream(this.a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.d.h.b0
    public v.c.b c() throws IOException {
        byte[] bArrD = d();
        if (bArrD != null) {
            return v.c.b.a().b(bArrD).c(this.f12483b).a();
        }
        return null;
    }
}