package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: ConfigGetParameterHandler.java */
/* loaded from: classes.dex */
public class m {
    public static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    static final Pattern f12957b = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: c, reason: collision with root package name */
    static final Pattern f12958c = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: d, reason: collision with root package name */
    private final Set<com.google.android.gms.common.util.d<String, f>> f12959d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Executor f12960e;

    /* renamed from: f, reason: collision with root package name */
    private final e f12961f;

    /* renamed from: g, reason: collision with root package name */
    private final e f12962g;

    public m(Executor executor, e eVar, e eVar2) {
        this.f12960e = executor;
        this.f12961f = eVar;
        this.f12962g = eVar2;
    }

    private void b(String str, f fVar) {
        if (fVar == null) {
            return;
        }
        synchronized (this.f12959d) {
            Iterator<com.google.android.gms.common.util.d<String, f>> it = this.f12959d.iterator();
            while (it.hasNext()) {
                this.f12960e.execute(l.a(it.next(), str, fVar));
            }
        }
    }

    private static f d(e eVar) {
        return eVar.d();
    }

    private static String f(e eVar, String str) {
        f fVarD = d(eVar);
        if (fVarD == null) {
            return null;
        }
        try {
            return fVarD.d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void h(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void a(com.google.android.gms.common.util.d<String, f> dVar) {
        synchronized (this.f12959d) {
            this.f12959d.add(dVar);
        }
    }

    public boolean c(String str) {
        String strF = f(this.f12961f, str);
        if (strF != null) {
            if (f12957b.matcher(strF).matches()) {
                b(str, d(this.f12961f));
                return true;
            }
            if (f12958c.matcher(strF).matches()) {
                b(str, d(this.f12961f));
                return false;
            }
        }
        String strF2 = f(this.f12962g, str);
        if (strF2 != null) {
            if (f12957b.matcher(strF2).matches()) {
                return true;
            }
            if (f12958c.matcher(strF2).matches()) {
                return false;
            }
        }
        h(str, "Boolean");
        return false;
    }

    public String e(String str) {
        String strF = f(this.f12961f, str);
        if (strF != null) {
            b(str, d(this.f12961f));
            return strF;
        }
        String strF2 = f(this.f12962g, str);
        if (strF2 != null) {
            return strF2;
        }
        h(str, "String");
        return "";
    }
}