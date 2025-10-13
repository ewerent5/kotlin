package e.c.b.b.c.e;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class j2 extends ContentObserver {
    private final /* synthetic */ h2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j2(h2 h2Var, Handler handler) {
        super(null);
        this.a = h2Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.c();
    }
}