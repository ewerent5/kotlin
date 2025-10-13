package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.j.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AbtComponent.java */
/* loaded from: classes.dex */
public class a {
    private final Map<String, c> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f12231b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.analytics.a.a f12232c;

    protected a(Context context, com.google.firebase.analytics.a.a aVar) {
        this.f12231b = context;
        this.f12232c = aVar;
    }

    protected c a(String str) {
        return new c(this.f12231b, this.f12232c, str);
    }

    public synchronized c b(String str) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, a(str));
        }
        return this.a.get(str);
    }
}