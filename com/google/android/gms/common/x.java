package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.f1;
import com.google.android.gms.common.internal.g1;
import com.google.android.gms.common.internal.p;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
abstract class x extends f1 {

    /* renamed from: e, reason: collision with root package name */
    private final int f4780e;

    protected x(byte[] bArr) {
        p.a(bArr.length == 25);
        this.f4780e = Arrays.hashCode(bArr);
    }

    protected static byte[] m4(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    abstract byte[] Y();

    public final boolean equals(Object obj) {
        e.c.b.b.b.b bVarZzd;
        if (obj != null && (obj instanceof g1)) {
            try {
                g1 g1Var = (g1) obj;
                if (g1Var.zze() == this.f4780e && (bVarZzd = g1Var.zzd()) != null) {
                    return Arrays.equals(Y(), (byte[]) e.c.b.b.b.d.Y(bVarZzd));
                }
                return false;
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4780e;
    }

    @Override // com.google.android.gms.common.internal.g1
    public final e.c.b.b.b.b zzd() {
        return e.c.b.b.b.d.m4(Y());
    }

    @Override // com.google.android.gms.common.internal.g1
    public final int zze() {
        return this.f4780e;
    }
}