package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class l extends w5 {

    /* renamed from: c */
    private long f10998c;

    /* renamed from: d */
    private String f10999d;

    /* renamed from: e */
    private Boolean f11000e;

    /* renamed from: f */
    private AccountManager f11001f;

    /* renamed from: g */
    private Boolean f11002g;

    /* renamed from: h */
    private long f11003h;

    l(z4 z4Var) {
        super(z4Var);
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

    @Override // com.google.android.gms.measurement.internal.w5
    protected final boolean o() {
        Calendar calendar = Calendar.getInstance();
        this.f10998c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f10999d = sb.toString();
        return false;
    }

    public final boolean p(Context context) throws PackageManager.NameNotFoundException {
        if (this.f11000e == null) {
            this.f11000e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f11000e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f11000e.booleanValue();
    }

    public final long q() {
        l();
        return this.f10998c;
    }

    public final String r() {
        l();
        return this.f10999d;
    }

    final long s() {
        d();
        return this.f11003h;
    }

    final void t() {
        d();
        this.f11002g = null;
        this.f11003h = 0L;
    }

    final boolean u() throws OperationCanceledException, IOException, AuthenticatorException {
        Account[] result;
        d();
        long jA = zzl().a();
        if (jA - this.f11003h > 86400000) {
            this.f11002g = null;
        }
        Boolean bool = this.f11002g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (androidx.core.content.a.a(zzm(), "android.permission.GET_ACCOUNTS") != 0) {
            zzq().E().a("Permission error checking for dasher/unicorn accounts");
            this.f11003h = jA;
            this.f11002g = Boolean.FALSE;
            return false;
        }
        if (this.f11001f == null) {
            this.f11001f = AccountManager.get(zzm());
        }
        try {
            result = this.f11001f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            zzq().B().b("Exception checking account types", e2);
        }
        if (result != null && result.length > 0) {
            this.f11002g = Boolean.TRUE;
            this.f11003h = jA;
            return true;
        }
        Account[] result2 = this.f11001f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.f11002g = Boolean.TRUE;
            this.f11003h = jA;
            return true;
        }
        this.f11003h = jA;
        this.f11002g = Boolean.FALSE;
        return false;
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