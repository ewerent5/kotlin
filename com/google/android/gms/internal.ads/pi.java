package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pi extends vi {

    /* renamed from: c, reason: collision with root package name */
    static final Set<String> f8159c = com.google.android.gms.common.util.g.g("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: d, reason: collision with root package name */
    private String f8160d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8161e;

    /* renamed from: f, reason: collision with root package name */
    private int f8162f;

    /* renamed from: g, reason: collision with root package name */
    private int f8163g;

    /* renamed from: h, reason: collision with root package name */
    private int f8164h;

    /* renamed from: i, reason: collision with root package name */
    private int f8165i;

    /* renamed from: j, reason: collision with root package name */
    private int f8166j;

    /* renamed from: k, reason: collision with root package name */
    private int f8167k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f8168l;

    /* renamed from: m, reason: collision with root package name */
    private final ew f8169m;
    private final Activity n;
    private vx o;
    private ImageView p;
    private LinearLayout q;
    private final wi r;
    private PopupWindow s;
    private RelativeLayout t;
    private ViewGroup u;

    public pi(ew ewVar, wi wiVar) {
        super(ewVar, "resize");
        this.f8160d = "top-right";
        this.f8161e = true;
        this.f8162f = 0;
        this.f8163g = 0;
        this.f8164h = -1;
        this.f8165i = 0;
        this.f8166j = 0;
        this.f8167k = -1;
        this.f8168l = new Object();
        this.f8169m = ewVar;
        this.n = ewVar.zzj();
        this.r = wiVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0257 A[Catch: all -> 0x0482, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:126:0x0257, B:128:0x0277, B:130:0x027b, B:132:0x0288, B:134:0x02c4, B:166:0x037d, B:173:0x03ac, B:174:0x03c4, B:175:0x03e5, B:177:0x03ed, B:178:0x03f4, B:179:0x041b, B:182:0x041e, B:184:0x042e, B:186:0x0438, B:188:0x0448, B:189:0x045d, B:185:0x0433, B:167:0x0384, B:168:0x038b, B:169:0x0392, B:170:0x0399, B:171:0x039f, B:172:0x03a6, B:133:0x02c1, B:191:0x045f, B:192:0x0464, B:194:0x0466, B:195:0x046b, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:97:0x01dc, B:99:0x01e7, B:101:0x01ea, B:103:0x01ed, B:105:0x01f1, B:108:0x01f7, B:90:0x0197, B:92:0x01ad, B:94:0x01b8, B:91:0x01a2, B:93:0x01b0, B:95:0x01bd, B:96:0x01d1, B:98:0x01df, B:109:0x0208, B:115:0x0232, B:121:0x0242, B:118:0x0238, B:120:0x0240, B:112:0x022a, B:114:0x0230, B:122:0x0249, B:123:0x024f, B:197:0x046d, B:198:0x0472, B:200:0x0474, B:201:0x0479, B:203:0x047b, B:204:0x0480), top: B:209:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0466 A[Catch: all -> 0x0482, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:126:0x0257, B:128:0x0277, B:130:0x027b, B:132:0x0288, B:134:0x02c4, B:166:0x037d, B:173:0x03ac, B:174:0x03c4, B:175:0x03e5, B:177:0x03ed, B:178:0x03f4, B:179:0x041b, B:182:0x041e, B:184:0x042e, B:186:0x0438, B:188:0x0448, B:189:0x045d, B:185:0x0433, B:167:0x0384, B:168:0x038b, B:169:0x0392, B:170:0x0399, B:171:0x039f, B:172:0x03a6, B:133:0x02c1, B:191:0x045f, B:192:0x0464, B:194:0x0466, B:195:0x046b, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:97:0x01dc, B:99:0x01e7, B:101:0x01ea, B:103:0x01ed, B:105:0x01f1, B:108:0x01f7, B:90:0x0197, B:92:0x01ad, B:94:0x01b8, B:91:0x01a2, B:93:0x01b0, B:95:0x01bd, B:96:0x01d1, B:98:0x01df, B:109:0x0208, B:115:0x0232, B:121:0x0242, B:118:0x0238, B:120:0x0240, B:112:0x022a, B:114:0x0230, B:122:0x0249, B:123:0x024f, B:197:0x046d, B:198:0x0472, B:200:0x0474, B:201:0x0479, B:203:0x047b, B:204:0x0480), top: B:209:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.Map<java.lang.String, java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pi.h(java.util.Map):void");
    }

    public final void i(boolean z) {
        synchronized (this.f8168l) {
            PopupWindow popupWindow = this.s;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.t.removeView((View) this.f8169m);
                ViewGroup viewGroup = this.u;
                if (viewGroup != null) {
                    viewGroup.removeView(this.p);
                    this.u.addView((View) this.f8169m);
                    this.f8169m.p0(this.o);
                }
                if (z) {
                    f("default");
                    wi wiVar = this.r;
                    if (wiVar != null) {
                        wiVar.zzb();
                    }
                }
                this.s = null;
                this.t = null;
                this.u = null;
                this.q = null;
            }
        }
    }

    public final void j(int i2, int i3, boolean z) {
        synchronized (this.f8168l) {
            this.f8162f = i2;
            this.f8163g = i3;
        }
    }

    public final boolean k() {
        boolean z;
        synchronized (this.f8168l) {
            z = this.s != null;
        }
        return z;
    }

    public final void l(int i2, int i3) {
        this.f8162f = i2;
        this.f8163g = i3;
    }
}