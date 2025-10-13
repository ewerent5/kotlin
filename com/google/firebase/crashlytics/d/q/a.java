package com.google.firebase.crashlytics.d.q;

/* compiled from: MiddleOutFallbackStrategy.java */
/* loaded from: classes.dex */
public class a implements d {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f12766b;

    /* renamed from: c, reason: collision with root package name */
    private final b f12767c;

    public a(int i2, d... dVarArr) {
        this.a = i2;
        this.f12766b = dVarArr;
        this.f12767c = new b(i2);
    }

    @Override // com.google.firebase.crashlytics.d.q.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f12766b) {
            if (stackTraceElementArrA.length <= this.a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.a ? this.f12767c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}