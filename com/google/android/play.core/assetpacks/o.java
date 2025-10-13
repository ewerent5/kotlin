package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class o implements s2 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("AssetPackServiceImpl");

    /* renamed from: b, reason: collision with root package name */
    private static final Intent f12102b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: c, reason: collision with root package name */
    private final String f12103c;

    /* renamed from: d, reason: collision with root package name */
    private final o0 f12104d;

    /* renamed from: e, reason: collision with root package name */
    private e.c.b.d.a.b.p<e.c.b.d.a.b.o0> f12105e;

    /* renamed from: f, reason: collision with root package name */
    private e.c.b.d.a.b.p<e.c.b.d.a.b.o0> f12106f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f12107g = new AtomicBoolean();

    o(Context context, o0 o0Var) {
        this.f12103c = context.getPackageName();
        this.f12104d = o0Var;
        if (e.c.b.d.a.b.t.a(context)) {
            Context contextB = e.c.b.d.a.d.a.b(context);
            e.c.b.d.a.b.f fVar = a;
            Intent intent = f12102b;
            this.f12105e = new e.c.b.d.a.b.p<>(contextB, fVar, "AssetPackService", intent, t2.f12149b);
            this.f12106f = new e.c.b.d.a.b.p<>(e.c.b.d.a.d.a.b(context), fVar, "AssetPackService-keepAlive", intent, t2.a);
        }
        a.a("AssetPackService initiated.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle h(int i2, String str) {
        Bundle bundleI = i(i2);
        bundleI.putString("module_name", str);
        return bundleI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle i(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i2);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11000);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    static /* synthetic */ ArrayList k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static /* synthetic */ Bundle m(Map map) {
        Bundle bundleJ = j();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleJ.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleJ;
    }

    static /* synthetic */ Bundle q(int i2, String str, String str2, int i3) {
        Bundle bundleH = h(i2, str);
        bundleH.putString("slice_id", str2);
        bundleH.putInt("chunk_number", i3);
        return bundleH;
    }

    static /* synthetic */ List u(o oVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = c.b((Bundle) it.next(), oVar.f12104d).e().values().iterator().next();
            if (next == null) {
                a.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (i1.d(next.h())) {
                arrayList.add(next.g());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int i2, String str, int i3) {
        if (this.f12105e == null) {
            throw new k0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        a.d("notifyModuleCompleted", new Object[0]);
        e.c.b.d.a.f.p pVar = new e.c.b.d.a.f.p();
        this.f12105e.a(new f(this, pVar, i2, str, pVar, i3));
    }

    private static <T> e.c.b.d.a.f.e<T> y() {
        a.b("onError(%d)", -11);
        return e.c.b.d.a.f.g.c(new a(-11));
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final synchronized void a() {
        if (this.f12106f == null) {
            a.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        e.c.b.d.a.b.f fVar = a;
        fVar.d("keepAlive", new Object[0]);
        if (!this.f12107g.compareAndSet(false, true)) {
            fVar.d("Service is already kept alive.", new Object[0]);
        } else {
            e.c.b.d.a.f.p pVar = new e.c.b.d.a.f.p();
            this.f12106f.a(new i(this, pVar, pVar));
        }
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void b(int i2) {
        if (this.f12105e == null) {
            throw new k0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        a.d("notifySessionFailed", new Object[0]);
        e.c.b.d.a.f.p pVar = new e.c.b.d.a.f.p();
        this.f12105e.a(new g(this, pVar, i2, pVar));
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void c(int i2, String str, String str2, int i3) {
        if (this.f12105e == null) {
            throw new k0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        a.d("notifyChunkTransferred", new Object[0]);
        e.c.b.d.a.f.p pVar = new e.c.b.d.a.f.p();
        this.f12105e.a(new e(this, pVar, i2, str, str2, i3, pVar));
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void d(int i2, String str) {
        x(i2, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final e.c.b.d.a.f.e<ParcelFileDescriptor> e(int i2, String str, String str2, int i3) {
        if (this.f12105e == null) {
            return y();
        }
        a.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i3), Integer.valueOf(i2));
        e.c.b.d.a.f.p pVar = new e.c.b.d.a.f.p();
        this.f12105e.a(new h(this, pVar, i2, str, str2, i3, pVar));
        return pVar.c();
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final e.c.b.d.a.f.e<List<String>> f(Map<String, Long> map) {
        if (this.f12105e == null) {
            return y();
        }
        a.d("syncPacks", new Object[0]);
        e.c.b.d.a.f.p pVar = new e.c.b.d.a.f.p();
        this.f12105e.a(new v2(this, pVar, map, pVar));
        return pVar.c();
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void g(List<String> list) {
        if (this.f12105e == null) {
            return;
        }
        a.d("cancelDownloads(%s)", list);
        e.c.b.d.a.f.p pVar = new e.c.b.d.a.f.p();
        this.f12105e.a(new u2(this, pVar, list, pVar));
    }
}