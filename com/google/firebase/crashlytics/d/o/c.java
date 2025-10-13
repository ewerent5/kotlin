package com.google.firebase.crashlytics.d.o;

import android.content.Context;
import com.google.firebase.crashlytics.d.h.p;
import com.google.firebase.crashlytics.d.j.v;
import com.google.firebase.crashlytics.d.j.x.h;
import e.c.b.a.e;
import e.c.b.a.f;
import e.c.b.a.g;
import e.c.b.a.i.q;
import e.c.b.b.e.i;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* loaded from: classes.dex */
public class c {
    private static final h a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final String f12716b = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: c, reason: collision with root package name */
    private static final String f12717c = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: d, reason: collision with root package name */
    private static final e<v, byte[]> f12718d = b.a();

    /* renamed from: e, reason: collision with root package name */
    private final f<v> f12719e;

    /* renamed from: f, reason: collision with root package name */
    private final e<v, byte[]> f12720f;

    c(f<v> fVar, e<v, byte[]> eVar) {
        this.f12719e = fVar;
        this.f12720f = eVar;
    }

    public static c a(Context context) {
        q.f(context);
        g gVarG = q.c().g(new com.google.android.datatransport.cct.a(f12716b, f12717c));
        e.c.b.a.b bVarB = e.c.b.a.b.b("json");
        e<v, byte[]> eVar = f12718d;
        return new c(gVarG.a("FIREBASE_CRASHLYTICS_REPORT", v.class, bVarB, eVar), eVar);
    }

    static /* synthetic */ void b(i iVar, p pVar, Exception exc) {
        if (exc != null) {
            iVar.d(exc);
        } else {
            iVar.e(pVar);
        }
    }

    private static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public e.c.b.b.e.h<p> e(p pVar) {
        v vVarB = pVar.b();
        i iVar = new i();
        this.f12719e.a(e.c.b.a.c.d(vVarB), a.b(iVar, pVar));
        return iVar.a();
    }
}