package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class ao2 implements zm2 {

    /* renamed from: e, reason: collision with root package name */
    protected static volatile gq2 f4957e;

    /* renamed from: f, reason: collision with root package name */
    protected MotionEvent f4958f;
    protected double o;
    private double p;
    private double q;
    protected float r;
    protected float s;
    protected float t;
    protected float u;
    protected DisplayMetrics x;

    /* renamed from: g, reason: collision with root package name */
    protected final LinkedList<MotionEvent> f4959g = new LinkedList<>();

    /* renamed from: h, reason: collision with root package name */
    protected long f4960h = 0;

    /* renamed from: i, reason: collision with root package name */
    protected long f4961i = 0;

    /* renamed from: j, reason: collision with root package name */
    protected long f4962j = 0;

    /* renamed from: k, reason: collision with root package name */
    protected long f4963k = 0;

    /* renamed from: l, reason: collision with root package name */
    protected long f4964l = 0;

    /* renamed from: m, reason: collision with root package name */
    protected long f4965m = 0;
    protected long n = 0;
    private boolean v = false;
    protected boolean w = false;

    protected ao2(Context context) {
        try {
            if (((Boolean) c.c().b(w3.J1)).booleanValue()) {
                uz1.a();
            } else {
                hq2.a(f4957e);
            }
            this.x = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final void f() {
        this.f4964l = 0L;
        this.f4960h = 0L;
        this.f4961i = 0L;
        this.f4962j = 0L;
        this.f4963k = 0L;
        this.f4965m = 0L;
        this.n = 0L;
        if (this.f4959g.size() > 0) {
            Iterator<MotionEvent> it = this.f4959g.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.f4959g.clear();
        } else {
            MotionEvent motionEvent = this.f4958f;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f4958f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008d A[PHI: r8 r9
  0x008d: PHI (r8v6 int) = (r8v3 int), (r8v3 int), (r8v7 int), (r8v8 int) binds: [B:36:0x0091, B:37:0x0093, B:33:0x008c, B:29:0x0086] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r9v5 com.google.android.gms.internal.ads.eu0) = 
  (r9v2 com.google.android.gms.internal.ads.eu0)
  (r9v2 com.google.android.gms.internal.ads.eu0)
  (r9v8 com.google.android.gms.internal.ads.eu0)
  (r9v8 com.google.android.gms.internal.ads.eu0)
 binds: [B:36:0x0091, B:37:0x0093, B:33:0x008c, B:29:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb A[Catch: Exception -> 0x0101, TRY_LEAVE, TryCatch #3 {Exception -> 0x0101, blocks: (B:47:0x00bc, B:50:0x00c9, B:58:0x00eb, B:59:0x00fb), top: B:79:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String g(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ao2.g(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    protected abstract eu0 a(Context context, vk0 vk0Var);

    protected abstract eu0 b(Context context, View view, Activity activity);

    protected abstract eu0 c(Context context, View view, Activity activity);

    protected abstract iq2 d(MotionEvent motionEvent);

    protected abstract long e(StackTraceElement[] stackTraceElementArr);

    @Override // com.google.android.gms.internal.ads.zm2
    public void zzf(MotionEvent motionEvent) {
        Long l2;
        if (this.v) {
            f();
            this.v = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.o = 0.0d;
            this.p = motionEvent.getRawX();
            this.q = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d2 = rawX - this.p;
            double d3 = rawY - this.q;
            this.o += Math.sqrt((d2 * d2) + (d3 * d3));
            this.p = rawX;
            this.q = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.f4958f = motionEventObtain;
                    this.f4959g.add(motionEventObtain);
                    if (this.f4959g.size() > 6) {
                        this.f4959g.remove().recycle();
                    }
                    this.f4962j++;
                    this.f4964l = e(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.f4961i += motionEvent.getHistorySize() + 1;
                    iq2 iq2VarD = d(motionEvent);
                    Long l3 = iq2VarD.f6575e;
                    if (l3 != null && iq2VarD.f6578h != null) {
                        this.f4965m += l3.longValue() + iq2VarD.f6578h.longValue();
                    }
                    if (this.x != null && (l2 = iq2VarD.f6576f) != null && iq2VarD.f6579i != null) {
                        this.n += l2.longValue() + iq2VarD.f6579i.longValue();
                    }
                } else if (action2 == 3) {
                    this.f4963k++;
                }
            } catch (wp2 unused) {
            }
        } else {
            this.r = motionEvent.getX();
            this.s = motionEvent.getY();
            this.t = motionEvent.getRawX();
            this.u = motionEvent.getRawY();
            this.f4960h++;
        }
        this.w = true;
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public void zzg(int i2, int i3, int i4) {
        MotionEvent motionEventObtain;
        if (this.f4958f != null) {
            if (((Boolean) c.c().b(w3.x1)).booleanValue()) {
                f();
            } else {
                this.f4958f.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.x;
        if (displayMetrics != null) {
            float f2 = displayMetrics.density;
            motionEventObtain = MotionEvent.obtain(0L, i4, 1, i2 * f2, i3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEventObtain = null;
        }
        this.f4958f = motionEventObtain;
        this.w = false;
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public String zzh(Context context, String str, View view, Activity activity) {
        return g(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public final String zzi(Context context, String str, View view) {
        return zzh(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public String zzk(Context context, View view, Activity activity) {
        return g(context, null, 2, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zm2
    public String zzl(Context context) {
        if (jq2.d()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return g(context, null, 1, null, null, null);
    }
}