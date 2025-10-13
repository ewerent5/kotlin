package com.google.firebase.crashlytics.d.h;

import com.google.firebase.crashlytics.d.j.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: BytesBackedNativeSessionFile.java */
/* loaded from: classes.dex */
class f implements b0 {
    private final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12349b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12350c;

    f(String str, String str2, byte[] bArr) {
        this.f12349b = str;
        this.f12350c = str2;
        this.a = bArr;
    }

    private byte[] d() throws IOException {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.d.h.b0
    public String a() {
        return this.f12350c;
    }

    @Override // com.google.firebase.crashlytics.d.h.b0
    public InputStream b() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }

    @Override // com.google.firebase.crashlytics.d.h.b0
    public v.c.b c() throws IOException {
        byte[] bArrD = d();
        if (bArrD == null) {
            return null;
        }
        return v.c.b.a().b(bArrD).c(this.f12349b).a();
    }
}