package androidx.lifecycle;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.t1;

/* compiled from: ViewModel.kt */
/* loaded from: classes.dex */
public final class c implements Closeable, i0 {

    /* renamed from: e, reason: collision with root package name */
    private final i.v.g f1204e;

    public c(i.v.g gVar) {
        i.y.d.l.d(gVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f1204e = gVar;
    }

    @Override // kotlinx.coroutines.i0
    public i.v.g A() {
        return this.f1204e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        t1.d(A(), null, 1, null);
    }
}