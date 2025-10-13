package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hr2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private final StackTraceElement[] f6371i;

    public hr2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(gq2Var, "sGTEC3E7f6YjHctdRy2hflBi3Pvsr/R7GPdiuAlLlHS4kSSM9HZZPJI60ut1Fh4f", "QQzVaaiH4oNrSQ4TH/x6dUQomR0+m9ZNGD4A6aa+nps=", eu0Var, i2, 45);
        this.f6371i = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.f6371i;
        if (stackTraceElementArr != null) {
            xp2 xp2Var = new xp2((String) this.f8257f.invoke(null, stackTraceElementArr));
            synchronized (this.f8256e) {
                this.f8256e.s(xp2Var.f10214b.longValue());
                if (xp2Var.f10215c.booleanValue()) {
                    this.f8256e.A(xp2Var.f10216d.booleanValue() ? ek1.ENUM_FALSE : ek1.ENUM_TRUE);
                } else {
                    this.f8256e.A(ek1.ENUM_FAILURE);
                }
            }
        }
    }
}