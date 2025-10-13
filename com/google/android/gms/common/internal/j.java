package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class j {
    private final SparseIntArray a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.common.f f4706b;

    public j(com.google.android.gms.common.f fVar) {
        p.j(fVar);
        this.f4706b = fVar;
    }

    public void a() {
        this.a.clear();
    }

    public int b(Context context, a.f fVar) {
        p.j(context);
        p.j(fVar);
        int iH = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int i2 = this.a.get(minApkVersion, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.a.size()) {
                iH = i2;
                break;
            }
            int iKeyAt = this.a.keyAt(i3);
            if (iKeyAt > minApkVersion && this.a.get(iKeyAt) == 0) {
                break;
            }
            i3++;
        }
        if (iH == -1) {
            iH = this.f4706b.h(context, minApkVersion);
        }
        this.a.put(minApkVersion, iH);
        return iH;
    }
}