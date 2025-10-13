package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(16)
/* loaded from: classes.dex */
public final class g13 {
    private final f13 a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6008b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6009c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6010d;

    /* renamed from: e, reason: collision with root package name */
    private long f6011e;

    /* renamed from: f, reason: collision with root package name */
    private long f6012f;

    /* renamed from: g, reason: collision with root package name */
    private long f6013g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6014h;

    /* renamed from: i, reason: collision with root package name */
    private long f6015i;

    /* renamed from: j, reason: collision with root package name */
    private long f6016j;

    /* renamed from: k, reason: collision with root package name */
    private long f6017k;

    private g13(double d2) {
        long j2;
        boolean z = d2 != -1.0d;
        this.f6008b = z;
        if (z) {
            this.a = f13.a();
            long j3 = (long) (1.0E9d / d2);
            this.f6009c = j3;
            j2 = (j3 * 80) / 100;
        } else {
            this.a = null;
            j2 = -1;
            this.f6009c = -1L;
        }
        this.f6010d = j2;
    }

    private final boolean d(long j2, long j3) {
        return Math.abs((j3 - this.f6015i) - (j2 - this.f6016j)) > 20000000;
    }

    public final void a() {
        this.f6014h = false;
        if (this.f6008b) {
            this.a.b();
        }
    }

    public final void b() {
        if (this.f6008b) {
            this.a.c();
        }
    }

    public final long c(long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = 1000 * j2;
        if (this.f6014h) {
            if (j2 != this.f6011e) {
                this.f6017k++;
                this.f6012f = this.f6013g;
            }
            long j8 = this.f6017k;
            if (j8 >= 6) {
                j5 = this.f6012f + ((j7 - this.f6016j) / j8);
                if (d(j5, j3)) {
                    this.f6014h = false;
                } else {
                    j4 = (this.f6015i + j5) - this.f6016j;
                }
            } else if (d(j7, j3)) {
                this.f6014h = false;
            }
            j4 = j3;
            j5 = j7;
        } else {
            j4 = j3;
            j5 = j7;
        }
        if (!this.f6014h) {
            this.f6016j = j7;
            this.f6015i = j3;
            this.f6017k = 0L;
            this.f6014h = true;
        }
        this.f6011e = j2;
        this.f6013g = j5;
        f13 f13Var = this.a;
        if (f13Var == null || f13Var.f5768f == 0) {
            return j4;
        }
        long j9 = this.a.f5768f;
        long j10 = this.f6009c;
        long j11 = j9 + (((j4 - j9) / j10) * j10);
        if (j4 <= j11) {
            j6 = j11 - j10;
        } else {
            j11 = j10 + j11;
            j6 = j11;
        }
        if (j11 - j4 >= j4 - j6) {
            j11 = j6;
        }
        return j11 - this.f6010d;
    }

    public g13(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay() != null ? r3.getDefaultDisplay().getRefreshRate() : -1.0d);
    }
}