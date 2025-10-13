package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kr2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f7060i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f7061j = new Object();

    public kr2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        super(gq2Var, "w88K96a81QAqecEx1Be7xBZ71wBzgDzB2ncLUmmSbS5j5T72Nq0PXydpfnGU7CdX", "D/80jmR/TcKhAUNfNeJDLyFk2By/w+5wEIxKJGOZawI=", eu0Var, i2, 33);
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        if (f7060i == null) {
            synchronized (f7061j) {
                if (f7060i == null) {
                    f7060i = (Long) this.f8257f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f8256e) {
            this.f8256e.l0(f7060i.longValue());
        }
    }
}