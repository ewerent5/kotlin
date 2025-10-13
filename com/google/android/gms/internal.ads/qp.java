package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qp {
    private final Map<String, op> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List<pp> f8417b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f8418c;

    /* renamed from: d, reason: collision with root package name */
    private final mo f8419d;

    qp(Context context, mo moVar) {
        this.f8418c = context;
        this.f8419d = moVar;
    }

    final synchronized void a(pp ppVar) {
        this.f8417b.add(ppVar);
    }

    final synchronized void b(String str) {
        if (this.a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.f8418c) : this.f8418c.getSharedPreferences(str, 0);
        op opVar = new op(this, str);
        this.a.put(str, opVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(opVar);
    }

    final /* synthetic */ void c(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f8419d.b();
        }
    }
}