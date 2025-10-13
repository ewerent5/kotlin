package e.c.b.c.z;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback.java */
/* loaded from: classes.dex */
public final class a extends f {
    private final Typeface a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0185a f15319b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15320c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: e.c.b.c.z.a$a, reason: collision with other inner class name */
    public interface InterfaceC0185a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0185a interfaceC0185a, Typeface typeface) {
        this.a = typeface;
        this.f15319b = interfaceC0185a;
    }

    private void d(Typeface typeface) {
        if (this.f15320c) {
            return;
        }
        this.f15319b.a(typeface);
    }

    @Override // e.c.b.c.z.f
    public void a(int i2) {
        d(this.a);
    }

    @Override // e.c.b.c.z.f
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.f15320c = true;
    }
}