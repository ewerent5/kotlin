package com.parizene.netmonitor.ui;

import android.content.DialogInterface;

/* compiled from: lambda */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements DialogInterface.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ Runnable f13770e;

    public /* synthetic */ b0(Runnable runnable) {
        runnable = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        runnable.run();
    }
}