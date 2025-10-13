package e.c.b.d.a.b;

import android.os.IBinder;

/* loaded from: classes.dex */
final /* synthetic */ class h implements IBinder.DeathRecipient {
    private final p a;

    h(p pVar) {
        this.a = pVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.a.n();
    }
}