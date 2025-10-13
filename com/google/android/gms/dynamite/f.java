package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final n a(Context context, String str, m mVar) {
        n nVar = new n();
        int iA = mVar.a(context, str, false);
        nVar.f4796b = iA;
        if (iA == 0) {
            nVar.f4797c = 0;
        } else {
            nVar.f4797c = 1;
        }
        return nVar;
    }
}