package com.google.android.play.core.install;

/* loaded from: classes.dex */
public abstract class InstallState {
    public static InstallState a(int i2, long j2, long j3, int i3, String str) {
        return new a(i2, j2, j3, i3, str);
    }

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract String e();

    public abstract long f();
}