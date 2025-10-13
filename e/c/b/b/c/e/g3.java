package e.c.b.b.c.e;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final /* synthetic */ class g3 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: e */
    private final d3 f14540e;

    g3(d3 d3Var) {
        this.f14540e = d3Var;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f14540e.c(sharedPreferences, str);
    }
}