package org.greenrobot.eventbus.r;

import android.util.Log;
import java.util.logging.Level;
import org.greenrobot.eventbus.g;

/* compiled from: AndroidLogger.java */
/* loaded from: classes3.dex */
public class a implements g {
    private static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17256b;

    static {
        boolean z;
        try {
            Class.forName("android.util.Log");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
    }

    public a(String str) {
        this.f17256b = str;
    }

    public static boolean c() {
        return a;
    }

    private int d(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue < 800) {
            return iIntValue < 500 ? 2 : 3;
        }
        if (iIntValue < 900) {
            return 4;
        }
        return iIntValue < 1000 ? 5 : 6;
    }

    @Override // org.greenrobot.eventbus.g
    public void a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(d(level), this.f17256b, str);
        }
    }

    @Override // org.greenrobot.eventbus.g
    public void b(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            Log.println(d(level), this.f17256b, str + "\n" + Log.getStackTraceString(th));
        }
    }
}