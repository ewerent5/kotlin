package com.parizene.netmonitor.m0;

import android.content.Context;
import java.io.File;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ com.parizene.netmonitor.s f13325f;

    /* renamed from: g */
    public final /* synthetic */ Context f13326g;

    /* renamed from: h */
    public final /* synthetic */ File f13327h;

    public /* synthetic */ c(com.parizene.netmonitor.s sVar, Context context, File file) {
        sVar = sVar;
        context = context;
        fileE = file;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException {
        this.f13324e.f(sVar, context, fileE);
    }
}