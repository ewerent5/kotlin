package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rw1 {
    private JSONObject a;

    /* renamed from: b, reason: collision with root package name */
    private final ax1 f8778b;

    public rw1(ax1 ax1Var) {
        this.f8778b = ax1Var;
    }

    public final void a(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f8778b.a(new dx1(this, hashSet, jSONObject, j2, null));
    }

    public final void b(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f8778b.a(new cx1(this, hashSet, jSONObject, j2, null));
    }

    public final void c() {
        this.f8778b.a(new bx1(this, null));
    }

    public final JSONObject d() {
        return this.a;
    }

    public final void e(JSONObject jSONObject) {
        this.a = jSONObject;
    }
}