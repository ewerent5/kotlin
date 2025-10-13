package androidx.work;

import android.os.Build;
import androidx.work.p;

/* compiled from: OneTimeWorkRequest.java */
/* loaded from: classes.dex */
public final class j extends p {

    /* compiled from: OneTimeWorkRequest.java */
    public static final class a extends p.a<a, j> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f2421c.f2305f = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.p.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public j c() {
            if (this.a && Build.VERSION.SDK_INT >= 23 && this.f2421c.f2311l.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new j(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.p.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }

    j(a aVar) {
        super(aVar.f2420b, aVar.f2421c, aVar.f2422d);
    }
}