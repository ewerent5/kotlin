package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
class j<T> extends e.c.b.d.a.b.p0 {

    /* renamed from: e, reason: collision with root package name */
    final e.c.b.d.a.f.p<T> f12044e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ o f12045f;

    j(o oVar, e.c.b.d.a.f.p<T> pVar) {
        this.f12045f = oVar;
        this.f12044e = pVar;
    }

    j(o oVar, e.c.b.d.a.f.p pVar, byte[] bArr) {
        this(oVar, pVar);
    }

    j(o oVar, e.c.b.d.a.f.p pVar, char[] cArr) {
        this(oVar, pVar);
    }

    j(o oVar, e.c.b.d.a.f.p pVar, int[] iArr) {
        this(oVar, pVar);
    }

    @Override // e.c.b.d.a.b.q0
    public void E4() {
        this.f12045f.f12105e.b();
        o.a.d("onCancelDownloads()", new Object[0]);
    }

    @Override // e.c.b.d.a.b.q0
    public void F2() {
        this.f12045f.f12105e.b();
        o.a.d("onRemoveModule()", new Object[0]);
    }

    @Override // e.c.b.d.a.b.q0
    public void N3(Bundle bundle) {
        this.f12045f.f12105e.b();
        int i2 = bundle.getInt("error_code");
        o.a.b("onError(%d)", Integer.valueOf(i2));
        this.f12044e.d(new a(i2));
    }

    @Override // e.c.b.d.a.b.q0
    public void O3(Bundle bundle, Bundle bundle2) {
        this.f12045f.f12105e.b();
        o.a.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // e.c.b.d.a.b.q0
    public void Z3(List<Bundle> list) {
        this.f12045f.f12105e.b();
        o.a.d("onGetSessionStates", new Object[0]);
    }

    @Override // e.c.b.d.a.b.q0
    public void a1(Bundle bundle) {
        this.f12045f.f12105e.b();
        o.a.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // e.c.b.d.a.b.q0
    public final void d1(int i2) {
        this.f12045f.f12105e.b();
        o.a.d("onCancelDownload(%d)", Integer.valueOf(i2));
    }

    @Override // e.c.b.d.a.b.q0
    public void d3(Bundle bundle) {
        this.f12045f.f12105e.b();
        o.a.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // e.c.b.d.a.b.q0
    public final void j2(int i2) {
        this.f12045f.f12105e.b();
        o.a.d("onGetSession(%d)", Integer.valueOf(i2));
    }

    @Override // e.c.b.d.a.b.q0
    public void m3(Bundle bundle, Bundle bundle2) {
        this.f12045f.f12106f.b();
        o.a.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // e.c.b.d.a.b.q0
    public void n4(Bundle bundle, Bundle bundle2) {
        this.f12045f.f12105e.b();
        o.a.d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // e.c.b.d.a.b.q0
    public void t2(Bundle bundle) {
        this.f12045f.f12105e.b();
        o.a.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // e.c.b.d.a.b.q0
    public void z2(int i2, Bundle bundle) {
        this.f12045f.f12105e.b();
        o.a.d("onStartDownload(%d)", Integer.valueOf(i2));
    }
}