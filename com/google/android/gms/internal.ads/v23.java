package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzs;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
@TargetApi(14)
/* loaded from: classes.dex */
public final class v23 extends Thread {

    /* renamed from: e, reason: collision with root package name */
    private boolean f9626e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9627f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f9628g;

    /* renamed from: h, reason: collision with root package name */
    private final l23 f9629h;

    /* renamed from: i, reason: collision with root package name */
    private final int f9630i;

    /* renamed from: j, reason: collision with root package name */
    private final int f9631j;

    /* renamed from: k, reason: collision with root package name */
    private final int f9632k;

    /* renamed from: l, reason: collision with root package name */
    private final int f9633l;

    /* renamed from: m, reason: collision with root package name */
    private final int f9634m;
    private final int n;
    private final int o;
    private final int p;
    private final String q;
    private final boolean r;
    private final boolean s;
    private final boolean t;

    public v23() {
        l23 l23Var = new l23();
        this.f9626e = false;
        this.f9627f = false;
        this.f9629h = l23Var;
        this.f9628g = new Object();
        this.f9631j = e5.f5584d.e().intValue();
        this.f9632k = e5.a.e().intValue();
        this.f9633l = e5.f5585e.e().intValue();
        this.f9634m = e5.f5583c.e().intValue();
        this.n = ((Integer) c.c().b(w3.N)).intValue();
        this.o = ((Integer) c.c().b(w3.O)).intValue();
        this.p = ((Integer) c.c().b(w3.P)).intValue();
        this.f9630i = e5.f5586f.e().intValue();
        this.q = (String) c.c().b(w3.R);
        this.r = ((Boolean) c.c().b(w3.S)).booleanValue();
        this.s = ((Boolean) c.c().b(w3.T)).booleanValue();
        this.t = ((Boolean) c.c().b(w3.U)).booleanValue();
        setName("ContentFetchTask");
    }

    public final void a() {
        synchronized (this.f9628g) {
            if (this.f9626e) {
                er.zzd("Content hash thread already started, quiting...");
            } else {
                this.f9626e = true;
                start();
            }
        }
    }

    final void b(View view) {
        try {
            k23 k23Var = new k23(this.f9631j, this.f9632k, this.f9633l, this.f9634m, this.n, this.o, this.p, this.s);
            Context contextE = zzs.zzf().e();
            if (contextE != null && !TextUtils.isEmpty(this.q)) {
                String str = (String) view.getTag(contextE.getResources().getIdentifier((String) c.c().b(w3.Q), "id", contextE.getPackageName()));
                if (str != null && str.equals(this.q)) {
                    return;
                }
            }
            u23 u23VarC = c(view, k23Var);
            k23Var.k();
            if (u23VarC.a == 0 && u23VarC.f9361b == 0) {
                return;
            }
            if (u23VarC.f9361b == 0 && k23Var.o() == 0) {
                return;
            }
            if (u23VarC.f9361b == 0 && this.f9629h.b(k23Var)) {
                return;
            }
            this.f9629h.d(k23Var);
        } catch (Exception e2) {
            er.zzg("Exception in fetchContentOnUIThread", e2);
            zzs.zzg().g(e2, "ContentFetchTask.fetchContent");
        }
    }

    final u23 c(View view, k23 k23Var) {
        if (view == null) {
            return new u23(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new u23(this, 0, 0);
            }
            k23Var.i(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new u23(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof ew)) {
            WebView webView = (WebView) view;
            if (!com.google.android.gms.common.util.n.f()) {
                return new u23(this, 0, 0);
            }
            k23Var.g();
            webView.post(new t23(this, k23Var, webView, globalVisibleRect));
            return new u23(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new u23(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            u23 u23VarC = c(viewGroup.getChildAt(i4), k23Var);
            i2 += u23VarC.a;
            i3 += u23VarC.f9361b;
        }
        return new u23(this, i2, i3);
    }

    final void d(k23 k23Var, WebView webView, String str, boolean z) {
        k23Var.f();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (this.r || TextUtils.isEmpty(webView.getTitle())) {
                    k23Var.h(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    k23Var.h(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (k23Var.a()) {
                this.f9629h.c(k23Var);
            }
        } catch (JSONException unused) {
            er.zzd("Json string may be malformed.");
        } catch (Throwable th) {
            er.zze("Failed to get webview content.", th);
            zzs.zzg().g(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final k23 e() {
        return this.f9629h.a(this.t);
    }

    public final void f() {
        synchronized (this.f9628g) {
            this.f9627f = false;
            this.f9628g.notifyAll();
            er.zzd("ContentFetchThread: wakeup");
        }
    }

    public final void g() {
        synchronized (this.f9628g) {
            this.f9627f = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            er.zzd(sb.toString());
        }
    }

    public final boolean h() {
        return this.f9627f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzs.zzf().d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        com.google.android.gms.internal.ads.er.zzd("ContentFetchThread: no activity. Sleeping.");
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (r0.getWindow() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        com.google.android.gms.ads.internal.zzs.zzg().g(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.er.zzd("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        com.google.android.gms.internal.ads.er.zzg("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzs.zzg().g(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        com.google.android.gms.internal.ads.er.zzg("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:65:0x00dc->B:70:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            r6 = this;
        L0:
            com.google.android.gms.internal.ads.q23 r0 = com.google.android.gms.ads.internal.zzs.zzf()     // Catch: java.lang.Throwable -> La8
            android.content.Context r0 = r0.e()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> La8
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            if (r2 == 0) goto Lb2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La8
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> La8
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La8
            int r5 = r3.pid     // Catch: java.lang.Throwable -> La8
            if (r4 != r5) goto L2a
            int r1 = r3.importance     // Catch: java.lang.Throwable -> La8
            r3 = 100
            if (r1 != r3) goto Lb2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto Lb2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isScreenOn()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            com.google.android.gms.internal.ads.q23 r0 = com.google.android.gms.ads.internal.zzs.zzf()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            android.app.Activity r0 = r0.d()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            if (r0 != 0) goto L6d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.er.zzd(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r6.g()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Lba
        L6d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L8e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch: java.lang.Exception -> L8e
            goto L9d
        L8e:
            r0 = move-exception
            com.google.android.gms.internal.ads.oq r2 = com.google.android.gms.ads.internal.zzs.zzg()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.g(r0, r3)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.er.zzd(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        L9d:
            if (r1 == 0) goto Lba
            com.google.android.gms.internal.ads.r23 r0 = new com.google.android.gms.internal.ads.r23     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r0.<init>(r6, r1)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r1.post(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Lba
        La8:
            r0 = move-exception
            com.google.android.gms.internal.ads.oq r1 = com.google.android.gms.ads.internal.zzs.zzg()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.g(r0, r2)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        Lb2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.er.zzd(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r6.g()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        Lba:
            int r0 = r6.f9630i     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Ld9
        Lc3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.er.zzg(r1, r0)
            com.google.android.gms.internal.ads.oq r1 = com.google.android.gms.ads.internal.zzs.zzg()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.g(r0, r2)
            goto Ld9
        Ld3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.er.zzg(r1, r0)
        Ld9:
            java.lang.Object r0 = r6.f9628g
            monitor-enter(r0)
        Ldc:
            boolean r1 = r6.f9627f     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto Leb
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.er.zzd(r1)     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            java.lang.Object r1 = r6.f9628g     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            r1.wait()     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            goto Ldc
        Leb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
            goto L0
        Lee:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v23.run():void");
    }
}