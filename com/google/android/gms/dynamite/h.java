package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final class h implements DynamiteModule.b {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final n a(Context context, String str, m mVar) {
        int iA;
        n nVar = new n();
        int iB = mVar.b(context, str);
        nVar.a = iB;
        int i2 = 0;
        if (iB != 0) {
            iA = mVar.a(context, str, false);
            nVar.f4796b = iA;
        } else {
            iA = mVar.a(context, str, true);
            nVar.f4796b = iA;
        }
        int i3 = nVar.a;
        if (i3 == 0) {
            if (iA == 0) {
                nVar.f4797c = 0;
            }
            return nVar;
        }
        i2 = i3;
        if (i2 >= iA) {
            nVar.f4797c = -1;
        } else {
            nVar.f4797c = 1;
        }
        return nVar;
    }
}