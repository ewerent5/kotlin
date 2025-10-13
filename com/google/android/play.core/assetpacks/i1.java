package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i1 {
    private static d a;

    static String a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int i2;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream(it.next());
            do {
                try {
                    i2 = fileInputStream.read(bArr);
                    if (i2 > 0) {
                        messageDigest.update(bArr, 0, i2);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        e.c.b.d.a.b.d0.a(th, th2);
                    }
                    throw th;
                }
            } while (i2 != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    static long b(byte[] bArr, int i2) {
        return ((c(bArr, i2 + 2) << 16) | c(bArr, i2)) & 4294967295L;
    }

    static int c(byte[] bArr, int i2) {
        return ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    public static boolean d(int i2) {
        return i2 == 1 || i2 == 7 || i2 == 2 || i2 == 3;
    }

    public static boolean e(int i2) {
        return i2 == 5 || i2 == 6 || i2 == 4;
    }

    public static boolean f(int i2) {
        return i2 == 2 || i2 == 7 || i2 == 3;
    }

    static boolean g(int i2, int i3) {
        if (i2 == 5) {
            if (i3 != 5) {
                return true;
            }
            i2 = 5;
        }
        if (i2 == 6 && i3 != 6 && i3 != 5) {
            return true;
        }
        if (i2 == 4 && i3 != 4) {
            return true;
        }
        if (i2 == 3 && (i3 == 2 || i3 == 7 || i3 == 1 || i3 == 8)) {
            return true;
        }
        if (i2 == 2) {
            return i3 == 1 || i3 == 8;
        }
        return false;
    }

    static synchronized d h(Context context) {
        if (a == null) {
            g0 g0Var = new g0(null);
            g0Var.b(new j2(e.c.b.d.a.d.a.b(context)));
            a = g0Var.a();
        }
        return a;
    }
}