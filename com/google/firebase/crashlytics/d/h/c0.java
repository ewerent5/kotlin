package com.google.firebase.crashlytics.d.h;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* compiled from: NativeSessionFileGzipper.java */
/* loaded from: classes.dex */
class c0 {
    private static void a(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i2 = inputStream.read(bArr);
                    if (i2 <= 0) {
                        gZIPOutputStream2.finish();
                        h.f(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i2);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    h.f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static void b(File file, List<b0> list) throws IOException {
        for (b0 b0Var : list) {
            InputStream inputStreamB = null;
            try {
                inputStreamB = b0Var.b();
                if (inputStreamB != null) {
                    a(inputStreamB, new File(file, b0Var.a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                h.f(null);
                throw th;
            }
            h.f(inputStreamB);
        }
    }
}