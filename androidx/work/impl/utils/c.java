package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: IdGenerator.java */
/* loaded from: classes.dex */
public class c {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f2354b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2355c;

    public c(Context context) {
        this.a = context;
    }

    private void a() {
        if (this.f2355c) {
            return;
        }
        this.f2354b = this.a.getSharedPreferences("androidx.work.util.id", 0);
        this.f2355c = true;
    }

    private int c(String str) {
        int i2 = this.f2354b.getInt(str, 0);
        e(str, i2 != Integer.MAX_VALUE ? i2 + 1 : 0);
        return i2;
    }

    private void e(String str, int i2) {
        this.f2354b.edit().putInt(str, i2).apply();
    }

    public int b() {
        int iC;
        synchronized (c.class) {
            a();
            iC = c("next_alarm_manager_id");
        }
        return iC;
    }

    public int d(int i2, int i3) {
        synchronized (c.class) {
            a();
            int iC = c("next_job_scheduler_id");
            if (iC < i2 || iC > i3) {
                e("next_job_scheduler_id", i2 + 1);
            } else {
                i2 = iC;
            }
        }
        return i2;
    }
}