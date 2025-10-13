package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class op implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: e, reason: collision with root package name */
    private final String f7985e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ qp f7986f;

    public op(qp qpVar, String str) {
        this.f7986f = qpVar;
        this.f7985e = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f7986f) {
            Iterator it = this.f7986f.f8417b.iterator();
            while (it.hasNext()) {
                ((pp) it.next()).a(sharedPreferences, this.f7985e, str);
            }
        }
    }
}