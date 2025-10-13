package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: Preferences.java */
/* loaded from: classes.dex */
public class e {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f2356b;

    public e(Context context) {
        this.a = context;
    }

    private SharedPreferences a() {
        SharedPreferences sharedPreferences;
        synchronized (e.class) {
            if (this.f2356b == null) {
                this.f2356b = this.a.getSharedPreferences("androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.f2356b;
        }
        return sharedPreferences;
    }

    public boolean b() {
        return a().getBoolean("reschedule_needed", false);
    }

    public void c(boolean z) {
        a().edit().putBoolean("reschedule_needed", z).apply();
    }
}