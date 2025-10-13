package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import e.c.b.b.c.e.ec;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class y8 extends q9 {

    /* renamed from: d, reason: collision with root package name */
    private String f11358d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11359e;

    /* renamed from: f, reason: collision with root package name */
    private long f11360f;

    y8(t9 t9Var) {
        super(t9Var);
    }

    @Deprecated
    private final Pair<String, Boolean> u(String str) {
        d();
        long jC = zzl().c();
        if (this.f11358d != null && jC < this.f11360f) {
            return new Pair<>(this.f11358d, Boolean.valueOf(this.f11359e));
        }
        this.f11360f = jC + i().w(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzm());
            if (advertisingIdInfo != null) {
                this.f11358d = advertisingIdInfo.getId();
                this.f11359e = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f11358d == null) {
                this.f11358d = "";
            }
        } catch (Exception e2) {
            zzq().H().b("Unable to get advertising id", e2);
            this.f11358d = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f11358d, Boolean.valueOf(this.f11359e));
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ t3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ da g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ i4 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ c i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ z9 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ y8 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ oa l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ g m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ u4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.q9
    protected final boolean r() {
        return false;
    }

    final Pair<String, Boolean> s(String str, d dVar) {
        return (ec.a() && i().o(t.L0) && !dVar.o()) ? new Pair<>("", Boolean.FALSE) : u(str);
    }

    @Deprecated
    final String t(String str) throws NoSuchAlgorithmException {
        d();
        String str2 = (String) u(str).first;
        MessageDigest messageDigestE0 = da.E0();
        if (messageDigestE0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestE0.digest(str2.getBytes())));
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.f zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ w4 zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ v3 zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ ta zzt() {
        return super.zzt();
    }
}