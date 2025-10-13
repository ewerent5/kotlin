package c.c.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.a.a.a;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public class b {
    private final b.a.a.b a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f2643b;

    /* compiled from: CustomTabsClient.java */
    class a extends a.AbstractBinderC0039a {

        /* renamed from: e, reason: collision with root package name */
        private Handler f2644e = new Handler(Looper.getMainLooper());

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.c.b.a f2645f;

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$a$a, reason: collision with other inner class name */
        class RunnableC0046a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f2647e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f2648f;

            RunnableC0046a(int i2, Bundle bundle) {
                this.f2647e = i2;
                this.f2648f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.c.b.a aVar = a.this.f2645f;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$a$b, reason: collision with other inner class name */
        class RunnableC0047b implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f2650e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f2651f;

            RunnableC0047b(String str, Bundle bundle) {
                this.f2650e = str;
                this.f2651f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.c.b.a aVar = a.this.f2645f;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        class c implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Bundle f2653e;

            c(Bundle bundle) {
                this.f2653e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.c.b.a aVar = a.this.f2645f;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        class d implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f2655e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f2656f;

            d(String str, Bundle bundle) {
                this.f2655e = str;
                this.f2656f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.c.b.a aVar = a.this.f2645f;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        class e implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f2658e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Uri f2659f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f2660g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Bundle f2661h;

            e(int i2, Uri uri, boolean z, Bundle bundle) {
                this.f2658e = i2;
                this.f2659f = uri;
                this.f2660g = z;
                this.f2661h = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.c.b.a aVar = a.this.f2645f;
                throw null;
            }
        }

        a(c.c.b.a aVar) {
        }

        @Override // b.a.a.a
        public void X2(String str, Bundle bundle) {
            if (this.f2645f == null) {
                return;
            }
            this.f2644e.post(new RunnableC0047b(str, bundle));
        }

        @Override // b.a.a.a
        public void b4(String str, Bundle bundle) {
            if (this.f2645f == null) {
                return;
            }
            this.f2644e.post(new d(str, bundle));
        }

        @Override // b.a.a.a
        public void g4(Bundle bundle) {
            if (this.f2645f == null) {
                return;
            }
            this.f2644e.post(new c(bundle));
        }

        @Override // b.a.a.a
        public void r4(int i2, Uri uri, boolean z, Bundle bundle) {
            if (this.f2645f == null) {
                return;
            }
            this.f2644e.post(new e(i2, uri, z, bundle));
        }

        @Override // b.a.a.a
        public void z3(int i2, Bundle bundle) {
            if (this.f2645f == null) {
                return;
            }
            this.f2644e.post(new RunnableC0046a(i2, bundle));
        }
    }

    b(b.a.a.b bVar, ComponentName componentName) {
        this.a = bVar;
        this.f2643b = componentName;
    }

    public static boolean a(Context context, String str, d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    public e b(c.c.b.a aVar) {
        a aVar2 = new a(aVar);
        try {
            if (this.a.O2(aVar2)) {
                return new e(this.a, aVar2, this.f2643b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean c(long j2) {
        try {
            return this.a.K1(j2);
        } catch (RemoteException unused) {
            return false;
        }
    }
}