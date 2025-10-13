package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final class e implements DynamiteModule.b {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final n a(Context context, String str, m mVar) {
        n nVar = new n();
        int iB = mVar.b(context, str);
        nVar.a = iB;
        if (iB != 0) {
            nVar.f4797c = -1;
        } else {
            int iA = mVar.a(context, str, true);
            nVar.f4796b = iA;
            if (iA != 0) {
                nVar.f4797c = 1;
            }
        }
        return nVar;
    }
}