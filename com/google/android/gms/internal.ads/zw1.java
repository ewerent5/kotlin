package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class zw1 extends AsyncTask<Object, Void, String> {
    private ax1 a;

    /* renamed from: b, reason: collision with root package name */
    protected final rw1 f10651b;

    public zw1(rw1 rw1Var, byte[] bArr) {
        this.f10651b = rw1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        ax1 ax1Var = this.a;
        if (ax1Var != null) {
            ax1Var.b(this);
        }
    }

    public final void b(ax1 ax1Var) {
        this.a = ax1Var;
    }
}