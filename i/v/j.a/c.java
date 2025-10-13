package i.v.j.a;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public final class c implements i.v.d<Object> {

    /* renamed from: e, reason: collision with root package name */
    public static final c f15867e = new c();

    private c() {
    }

    @Override // i.v.d
    public void e(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // i.v.d
    public i.v.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}