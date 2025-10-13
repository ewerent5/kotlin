package com.google.firebase.crashlytics.d.i;

import com.google.firebase.crashlytics.d.h.h;
import com.google.firebase.crashlytics.d.i.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes.dex */
class d implements com.google.firebase.crashlytics.d.i.a {
    private static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private final File f12508b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12509c;

    /* renamed from: d, reason: collision with root package name */
    private c f12510d;

    /* compiled from: QueueFileLogStore.java */
    class a implements c.d {
        final /* synthetic */ byte[] a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f12511b;

        a(byte[] bArr, int[] iArr) {
            this.a = bArr;
            this.f12511b = iArr;
        }

        @Override // com.google.firebase.crashlytics.d.i.c.d
        public void a(InputStream inputStream, int i2) throws IOException {
            try {
                inputStream.read(this.a, this.f12511b[0], i2);
                int[] iArr = this.f12511b;
                iArr[0] = iArr[0] + i2;
            } finally {
                inputStream.close();
            }
        }
    }

    /* compiled from: QueueFileLogStore.java */
    private class b {
        public final byte[] a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12513b;

        b(byte[] bArr, int i2) {
            this.a = bArr;
            this.f12513b = i2;
        }
    }

    d(File file, int i2) {
        this.f12508b = file;
        this.f12509c = i2;
    }

    private void f(long j2, String str) {
        if (this.f12510d == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i2 = this.f12509c / 4;
            if (str.length() > i2) {
                str = "..." + str.substring(str.length() - i2);
            }
            this.f12510d.i(String.format(Locale.US, "%d %s%n", Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(a));
            while (!this.f12510d.B() && this.f12510d.j0() > this.f12509c) {
                this.f12510d.Z();
            }
        } catch (IOException e2) {
            com.google.firebase.crashlytics.d.b.f().e("There was a problem writing to the Crashlytics log.", e2);
        }
    }

    private b g() {
        if (!this.f12508b.exists()) {
            return null;
        }
        h();
        c cVar = this.f12510d;
        if (cVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[cVar.j0()];
        try {
            this.f12510d.v(new a(bArr, iArr));
        } catch (IOException e2) {
            com.google.firebase.crashlytics.d.b.f().e("A problem occurred while reading the Crashlytics log file.", e2);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f12510d == null) {
            try {
                this.f12510d = new c(this.f12508b);
            } catch (IOException e2) {
                com.google.firebase.crashlytics.d.b.f().e("Could not open log file: " + this.f12508b, e2);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.d.i.a
    public void a() throws IOException {
        h.e(this.f12510d, "There was a problem closing the Crashlytics log file.");
        this.f12510d = null;
    }

    @Override // com.google.firebase.crashlytics.d.i.a
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, a);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.d.i.a
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i2 = bVarG.f12513b;
        byte[] bArr = new byte[i2];
        System.arraycopy(bVarG.a, 0, bArr, 0, i2);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.d.i.a
    public void d() throws IOException {
        a();
        this.f12508b.delete();
    }

    @Override // com.google.firebase.crashlytics.d.i.a
    public void e(long j2, String str) {
        h();
        f(j2, str);
    }
}