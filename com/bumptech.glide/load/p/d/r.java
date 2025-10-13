package com.bumptech.glide.load.p.d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.classic.Level;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HardwareConfigState.java */
/* loaded from: classes.dex */
public final class r {
    public static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f3996b;

    /* renamed from: c, reason: collision with root package name */
    private static final File f3997c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile r f3998d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f3999e;

    /* renamed from: g, reason: collision with root package name */
    private final int f4001g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4002h;

    /* renamed from: i, reason: collision with root package name */
    private int f4003i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4004j = true;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f4005k = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4000f = f();

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2 < 29;
        f3996b = i2 >= 26;
        f3997c = new File("/proc/self/fd");
        f3999e = -1;
    }

    r() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4001g = Level.INFO_INT;
            this.f4002h = 0;
        } else {
            this.f4001g = 700;
            this.f4002h = 128;
        }
    }

    private boolean a() {
        return a && !this.f4005k.get();
    }

    public static r b() {
        if (f3998d == null) {
            synchronized (r.class) {
                if (f3998d == null) {
                    f3998d = new r();
                }
            }
        }
        return f3998d;
    }

    private int c() {
        return f3999e != -1 ? f3999e : this.f4001g;
    }

    private synchronized boolean d() {
        boolean z = true;
        int i2 = this.f4003i + 1;
        this.f4003i = i2;
        if (i2 >= 50) {
            this.f4003i = 0;
            int length = f3997c.list().length;
            long jC = c();
            if (length >= jC) {
                z = false;
            }
            this.f4004j = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
            }
        }
        return this.f4004j;
    }

    private static boolean f() {
        return (g() || h()) ? false : true;
    }

    private static boolean g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    public boolean e(int i2, int i3, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.f4000f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!f3996b) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int i4 = this.f4002h;
        if (i2 < i4) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (i3 < i4) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    @TargetApi(26)
    boolean i(int i2, int i3, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zE = e(i2, i3, z, z2);
        if (zE) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zE;
    }
}