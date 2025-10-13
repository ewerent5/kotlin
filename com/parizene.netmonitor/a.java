package com.parizene.netmonitor;

import android.os.Process;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: e */
    public static final /* synthetic */ a f13003e = ;

    private /* synthetic */ a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.killProcess(Process.myPid());
    }
}