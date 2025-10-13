package androidx.work;

import ch.qos.logback.core.CoreConstants;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkInfo.java */
/* loaded from: classes.dex */
public final class n {
    private UUID a;

    /* renamed from: b, reason: collision with root package name */
    private a f2407b;

    /* renamed from: c, reason: collision with root package name */
    private e f2408c;

    /* renamed from: d, reason: collision with root package name */
    private Set<String> f2409d;

    /* renamed from: e, reason: collision with root package name */
    private int f2410e;

    /* compiled from: WorkInfo.java */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public n(UUID uuid, a aVar, e eVar, List<String> list, int i2) {
        this.a = uuid;
        this.f2407b = aVar;
        this.f2408c = eVar;
        this.f2409d = new HashSet(list);
        this.f2410e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f2410e == nVar.f2410e && this.a.equals(nVar.a) && this.f2407b == nVar.f2407b && this.f2408c.equals(nVar.f2408c)) {
            return this.f2409d.equals(nVar.f2409d);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.f2407b.hashCode()) * 31) + this.f2408c.hashCode()) * 31) + this.f2409d.hashCode()) * 31) + this.f2410e;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", mState=" + this.f2407b + ", mOutputData=" + this.f2408c + ", mTags=" + this.f2409d + CoreConstants.CURLY_RIGHT;
    }
}