package e.c.b.b.c.e;

import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class b5<T> extends n5<T> {

    /* renamed from: e, reason: collision with root package name */
    private boolean f14405e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Object f14406f;

    b5(Object obj) {
        this.f14406f = obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return !this.f14405e;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (this.f14405e) {
            throw new NoSuchElementException();
        }
        this.f14405e = true;
        return (T) this.f14406f;
    }
}