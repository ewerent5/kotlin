package com.google.firebase.crashlytics.d.q;

/* compiled from: TrimmedThrowableData.java */
/* loaded from: classes.dex */
public class e {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12768b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f12769c;

    /* renamed from: d, reason: collision with root package name */
    public final e f12770d;

    public e(Throwable th, d dVar) {
        this.a = th.getLocalizedMessage();
        this.f12768b = th.getClass().getName();
        this.f12769c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f12770d = cause != null ? new e(cause, dVar) : null;
    }
}