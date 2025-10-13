package kotlinx.coroutines;

import ch.qos.logback.core.CoreConstants;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
final class w0 implements j1 {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17170e;

    public w0(boolean z) {
        this.f17170e = z;
    }

    @Override // kotlinx.coroutines.j1
    public boolean b() {
        return this.f17170e;
    }

    @Override // kotlinx.coroutines.j1
    public z1 e() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : "New");
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}