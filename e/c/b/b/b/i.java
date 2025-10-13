package e.c.b.b.b;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
final class i implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Context f14354e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Intent f14355f;

    i(Context context, Intent intent) {
        this.f14354e = context;
        this.f14355f = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f14354e.startActivity(this.f14355f);
        } catch (ActivityNotFoundException e2) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e2);
        }
    }
}