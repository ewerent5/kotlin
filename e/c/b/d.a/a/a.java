package e.c.b.d.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import e.c.b.d.a.b.f;

/* loaded from: classes.dex */
public final class a extends e.c.b.d.a.c.c<InstallState> {
    public a(Context context) {
        super(new f("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // e.c.b.d.a.c.c
    protected final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.a.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        f fVar = this.a;
        fVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        fVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        fVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        InstallState installStateA = InstallState.a(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        this.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", installStateA);
        d(installStateA);
    }
}