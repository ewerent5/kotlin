package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class qj implements rj {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    static boolean f8395b = false;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    static boolean f8396c = false;

    /* renamed from: d, reason: collision with root package name */
    zu1 f8397d;

    @Override // com.google.android.gms.internal.ads.rj
    public final void H(e.c.b.b.b.b bVar) {
        synchronized (a) {
            if (((Boolean) c.c().b(w3.i3)).booleanValue() && f8395b) {
                try {
                    this.f8397d.zzf(bVar);
                } catch (RemoteException | NullPointerException e2) {
                    er.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b I(String str, WebView webView, String str2, String str3, String str4, String str5, tj tjVar, sj sjVar, String str6) throws Throwable {
        synchronized (a) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (((Boolean) c.c().b(w3.i3)).booleanValue() && f8395b) {
                    if (!((Boolean) c.c().b(w3.m3)).booleanValue()) {
                        return K(str, webView, "", "javascript", str4, str5);
                    }
                    try {
                        return this.f8397d.f0(str, e.c.b.b.b.d.m4(webView), "", "javascript", str4, str5, tjVar.toString(), sjVar.toString(), str6);
                    } catch (RemoteException | NullPointerException e2) {
                        er.zzl("#007 Could not call remote method.", e2);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b J(String str, WebView webView, String str2, String str3, String str4) {
        return K(str, webView, "", "javascript", str4, "Google");
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b K(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (a) {
            if (((Boolean) c.c().b(w3.i3)).booleanValue() && f8395b) {
                try {
                    return this.f8397d.h3(str, e.c.b.b.b.d.m4(webView), "", "javascript", str4, str5);
                } catch (RemoteException | NullPointerException e2) {
                    er.zzl("#007 Could not call remote method.", e2);
                    return null;
                }
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b L(String str, WebView webView, String str2, String str3, String str4, tj tjVar, sj sjVar, String str5) throws Throwable {
        synchronized (a) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (((Boolean) c.c().b(w3.i3)).booleanValue() && f8395b) {
                    if (!((Boolean) c.c().b(w3.l3)).booleanValue()) {
                        return K(str, webView, "", "javascript", str4, "Google");
                    }
                    try {
                        return this.f8397d.d4(str, e.c.b.b.b.d.m4(webView), "", "javascript", str4, "Google", tjVar.toString(), sjVar.toString(), str5);
                    } catch (RemoteException | NullPointerException e2) {
                        er.zzl("#007 Could not call remote method.", e2);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final void M(e.c.b.b.b.b bVar, View view) {
        synchronized (a) {
            if (((Boolean) c.c().b(w3.i3)).booleanValue() && f8395b) {
                try {
                    this.f8397d.S1(bVar, e.c.b.b.b.d.m4(view));
                } catch (RemoteException | NullPointerException e2) {
                    er.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final void N(e.c.b.b.b.b bVar, View view) {
        synchronized (a) {
            if (((Boolean) c.c().b(w3.i3)).booleanValue() && f8395b) {
                try {
                    this.f8397d.E3(bVar, e.c.b.b.b.d.m4(view));
                } catch (RemoteException | NullPointerException e2) {
                    er.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    final void a(Context context) {
        synchronized (a) {
            if (((Boolean) c.c().b(w3.i3)).booleanValue() && !f8396c) {
                try {
                    f8396c = true;
                    this.f8397d = (zu1) ir.a(context, "com.google.android.gms.ads.omid.DynamiteOmid", pj.a);
                } catch (hr e2) {
                    er.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final void m(e.c.b.b.b.b bVar) {
        synchronized (a) {
            if (((Boolean) c.c().b(w3.i3)).booleanValue() && f8395b) {
                try {
                    this.f8397d.m(bVar);
                } catch (RemoteException | NullPointerException e2) {
                    er.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final String n(Context context) {
        if (!((Boolean) c.c().b(w3.i3)).booleanValue()) {
            return null;
        }
        try {
            a(context);
            String strValueOf = String.valueOf(this.f8397d.zzh());
            return strValueOf.length() != 0 ? "a.".concat(strValueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final boolean zza(Context context) {
        synchronized (a) {
            if (!((Boolean) c.c().b(w3.i3)).booleanValue()) {
                return false;
            }
            if (f8395b) {
                return true;
            }
            try {
                a(context);
                boolean zI = this.f8397d.i(e.c.b.b.b.d.m4(context));
                f8395b = zI;
                return zI;
            } catch (RemoteException e2) {
                e = e2;
                er.zzl("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e3) {
                e = e3;
                er.zzl("#007 Could not call remote method.", e);
                return false;
            }
        }
    }
}