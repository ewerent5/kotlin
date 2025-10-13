package com.bumptech.glide.load.n.b0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import j$.util.Spliterator;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes.dex */
public final class i {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3691b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3692c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3693d;

    /* compiled from: MemorySizeCalculator.java */
    public static final class a {
        static final int a;

        /* renamed from: b, reason: collision with root package name */
        final Context f3694b;

        /* renamed from: c, reason: collision with root package name */
        ActivityManager f3695c;

        /* renamed from: d, reason: collision with root package name */
        c f3696d;

        /* renamed from: f, reason: collision with root package name */
        float f3698f;

        /* renamed from: e, reason: collision with root package name */
        float f3697e = 2.0f;

        /* renamed from: g, reason: collision with root package name */
        float f3699g = 0.4f;

        /* renamed from: h, reason: collision with root package name */
        float f3700h = 0.33f;

        /* renamed from: i, reason: collision with root package name */
        int f3701i = 4194304;

        static {
            a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f3698f = a;
            this.f3694b = context;
            this.f3695c = (ActivityManager) context.getSystemService("activity");
            this.f3696d = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f3695c)) {
                return;
            }
            this.f3698f = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    private static final class b implements c {
        private final DisplayMetrics a;

        b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.n.b0.i.c
        public int a() {
            return this.a.heightPixels;
        }

        @Override // com.bumptech.glide.load.n.b0.i.c
        public int b() {
            return this.a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f3692c = aVar.f3694b;
        int i2 = e(aVar.f3695c) ? aVar.f3701i / 2 : aVar.f3701i;
        this.f3693d = i2;
        int iC = c(aVar.f3695c, aVar.f3699g, aVar.f3700h);
        float fB = aVar.f3696d.b() * aVar.f3696d.a() * 4;
        int iRound = Math.round(aVar.f3698f * fB);
        int iRound2 = Math.round(fB * aVar.f3697e);
        int i3 = iC - i2;
        int i4 = iRound2 + iRound;
        if (i4 <= i3) {
            this.f3691b = iRound2;
            this.a = iRound;
        } else {
            float f2 = i3;
            float f3 = aVar.f3698f;
            float f4 = aVar.f3697e;
            float f5 = f2 / (f3 + f4);
            this.f3691b = Math.round(f4 * f5);
            this.a = Math.round(f5 * aVar.f3698f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.f3691b));
            sb.append(", pool size: ");
            sb.append(f(this.a));
            sb.append(", byte array size: ");
            sb.append(f(i2));
            sb.append(", memory class limited? ");
            sb.append(i4 > iC);
            sb.append(", max size: ");
            sb.append(f(iC));
            sb.append(", memoryClass: ");
            sb.append(aVar.f3695c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.f3695c));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f2, float f3) {
        float memoryClass = activityManager.getMemoryClass() * Spliterator.IMMUTABLE * Spliterator.IMMUTABLE;
        if (e(activityManager)) {
            f2 = f3;
        }
        return Math.round(memoryClass * f2);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    private String f(int i2) {
        return Formatter.formatFileSize(this.f3692c, i2);
    }

    public int a() {
        return this.f3693d;
    }

    public int b() {
        return this.a;
    }

    public int d() {
        return this.f3691b;
    }
}