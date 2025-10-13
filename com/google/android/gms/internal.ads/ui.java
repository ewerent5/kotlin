package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ui extends vi implements ba<ew> {

    /* renamed from: c, reason: collision with root package name */
    private final ew f9455c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f9456d;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f9457e;

    /* renamed from: f, reason: collision with root package name */
    private final h3 f9458f;

    /* renamed from: g, reason: collision with root package name */
    DisplayMetrics f9459g;

    /* renamed from: h, reason: collision with root package name */
    private float f9460h;

    /* renamed from: i, reason: collision with root package name */
    int f9461i;

    /* renamed from: j, reason: collision with root package name */
    int f9462j;

    /* renamed from: k, reason: collision with root package name */
    private int f9463k;

    /* renamed from: l, reason: collision with root package name */
    int f9464l;

    /* renamed from: m, reason: collision with root package name */
    int f9465m;
    int n;
    int o;

    public ui(ew ewVar, Context context, h3 h3Var) {
        super(ewVar, "");
        this.f9461i = -1;
        this.f9462j = -1;
        this.f9464l = -1;
        this.f9465m = -1;
        this.n = -1;
        this.o = -1;
        this.f9455c = ewVar;
        this.f9456d = context;
        this.f9458f = h3Var;
        this.f9457e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(ew ewVar, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.f9459g = new DisplayMetrics();
        Display defaultDisplay = this.f9457e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f9459g);
        this.f9460h = this.f9459g.density;
        this.f9463k = defaultDisplay.getRotation();
        ta3.a();
        DisplayMetrics displayMetrics = this.f9459g;
        this.f9461i = xq.q(displayMetrics, displayMetrics.widthPixels);
        ta3.a();
        DisplayMetrics displayMetrics2 = this.f9459g;
        this.f9462j = xq.q(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZzj = this.f9455c.zzj();
        if (activityZzj == null || activityZzj.getWindow() == null) {
            this.f9464l = this.f9461i;
            this.f9465m = this.f9462j;
        } else {
            zzs.zzc();
            int[] iArrZzR = zzr.zzR(activityZzj);
            ta3.a();
            this.f9464l = xq.q(this.f9459g, iArrZzR[0]);
            ta3.a();
            this.f9465m = xq.q(this.f9459g, iArrZzR[1]);
        }
        if (this.f9455c.e().g()) {
            this.n = this.f9461i;
            this.o = this.f9462j;
        } else {
            this.f9455c.measure(0, 0);
        }
        g(this.f9461i, this.f9462j, this.f9464l, this.f9465m, this.f9460h, this.f9463k);
        ti tiVar = new ti();
        h3 h3Var = this.f9458f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        tiVar.b(h3Var.c(intent));
        h3 h3Var2 = this.f9458f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        tiVar.a(h3Var2.c(intent2));
        tiVar.c(this.f9458f.b());
        tiVar.d(this.f9458f.a());
        tiVar.e(true);
        boolean z = tiVar.a;
        boolean z2 = tiVar.f9141b;
        boolean z3 = tiVar.f9142c;
        boolean z4 = tiVar.f9143d;
        boolean z5 = tiVar.f9144e;
        ew ewVar2 = this.f9455c;
        try {
            jSONObjectPut = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e2) {
            er.zzg("Error occurred while obtaining the MRAID capabilities.", e2);
            jSONObjectPut = null;
        }
        ewVar2.a("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.f9455c.getLocationOnScreen(iArr);
        h(ta3.a().a(this.f9456d, iArr[0]), ta3.a().a(this.f9456d, iArr[1]));
        if (er.zzm(2)) {
            er.zzh("Dispatching Ready Event.");
        }
        c(this.f9455c.zzt().f7054e);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[PHI: r2
  0x006f: PHI (r2v4 int) = (r2v3 int), (r2v8 int) binds: [B:11:0x0046, B:17:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f9456d
            boolean r0 = r0 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L15
            com.google.android.gms.ads.internal.zzs.zzc()
            android.content.Context r0 = r6.f9456d
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = com.google.android.gms.ads.internal.util.zzr.zzT(r0)
            r0 = r0[r1]
            goto L16
        L15:
            r0 = 0
        L16:
            com.google.android.gms.internal.ads.ew r2 = r6.f9455c
            com.google.android.gms.internal.ads.vx r2 = r2.e()
            if (r2 == 0) goto L2a
            com.google.android.gms.internal.ads.ew r2 = r6.f9455c
            com.google.android.gms.internal.ads.vx r2 = r2.e()
            boolean r2 = r2.g()
            if (r2 != 0) goto L88
        L2a:
            com.google.android.gms.internal.ads.ew r2 = r6.f9455c
            int r2 = r2.getWidth()
            com.google.android.gms.internal.ads.ew r3 = r6.f9455c
            int r3 = r3.getHeight()
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.w3.M
            com.google.android.gms.internal.ads.u3 r5 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6f
            if (r2 != 0) goto L5c
            com.google.android.gms.internal.ads.ew r2 = r6.f9455c
            com.google.android.gms.internal.ads.vx r2 = r2.e()
            if (r2 == 0) goto L5b
            com.google.android.gms.internal.ads.ew r2 = r6.f9455c
            com.google.android.gms.internal.ads.vx r2 = r2.e()
            int r2 = r2.f9805c
            goto L5c
        L5b:
            r2 = 0
        L5c:
            if (r3 != 0) goto L6f
            com.google.android.gms.internal.ads.ew r3 = r6.f9455c
            com.google.android.gms.internal.ads.vx r3 = r3.e()
            if (r3 == 0) goto L70
            com.google.android.gms.internal.ads.ew r1 = r6.f9455c
            com.google.android.gms.internal.ads.vx r1 = r1.e()
            int r1 = r1.f9804b
            goto L70
        L6f:
            r1 = r3
        L70:
            com.google.android.gms.internal.ads.xq r3 = com.google.android.gms.internal.ads.ta3.a()
            android.content.Context r4 = r6.f9456d
            int r2 = r3.a(r4, r2)
            r6.n = r2
            com.google.android.gms.internal.ads.xq r2 = com.google.android.gms.internal.ads.ta3.a()
            android.content.Context r3 = r6.f9456d
            int r1 = r2.a(r3, r1)
            r6.o = r1
        L88:
            int r0 = r8 - r0
            int r1 = r6.n
            int r2 = r6.o
            r6.e(r7, r0, r1, r2)
            com.google.android.gms.internal.ads.ew r0 = r6.f9455c
            com.google.android.gms.internal.ads.tx r0 = r0.E0()
            r0.F0(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ui.h(int, int):void");
    }
}