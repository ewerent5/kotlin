package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class vz2 extends IOException {

    /* renamed from: e, reason: collision with root package name */
    public final rz2 f9822e;

    public vz2(IOException iOException, rz2 rz2Var, int i2) {
        super(iOException);
        this.f9822e = rz2Var;
    }

    public vz2(String str, rz2 rz2Var, int i2) {
        super(str);
        this.f9822e = rz2Var;
    }

    public vz2(String str, IOException iOException, rz2 rz2Var, int i2) {
        super(str, iOException);
        this.f9822e = rz2Var;
    }
}