package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qq {

    @GuardedBy("this")
    private BigInteger a = BigInteger.ONE;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private String f8437b = "0";

    public final synchronized String a() {
        String string;
        string = this.a.toString();
        this.a = this.a.add(BigInteger.ONE);
        this.f8437b = string;
        return string;
    }

    public final synchronized String b() {
        return this.f8437b;
    }
}