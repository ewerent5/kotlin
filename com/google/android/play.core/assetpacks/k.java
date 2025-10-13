package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
final class k extends j<ParcelFileDescriptor> {
    k(o oVar, e.c.b.d.a.f.p<ParcelFileDescriptor> pVar) {
        super(oVar, pVar);
    }

    @Override // com.google.android.play.core.assetpacks.j, e.c.b.d.a.b.q0
    public final void O3(Bundle bundle, Bundle bundle2) {
        super.O3(bundle, bundle2);
        this.f12044e.e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}