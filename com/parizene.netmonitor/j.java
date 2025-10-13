package com.parizene.netmonitor;

import com.parizene.netmonitor.f0;
import java.util.concurrent.ThreadFactory;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ThreadFactory {
    public final /* synthetic */ String a;

    /* renamed from: b */
    public final /* synthetic */ int f13199b;

    public /* synthetic */ j(String str, int i2) {
        str = str;
        i2 = i2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return f0.a.c(str, i2, runnable);
    }
}