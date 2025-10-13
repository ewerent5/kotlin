package com.parizene.netmonitor.ui;

import android.content.DialogInterface;
import java.io.File;

/* compiled from: lambda */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements DialogInterface.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ File f14009f;

    /* renamed from: g */
    public final /* synthetic */ String[] f14010g;

    public /* synthetic */ p(File file, String[] strArr) {
        fileB = file;
        list = strArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f14008e.A3(fileB, list, dialogInterface, i2);
    }
}