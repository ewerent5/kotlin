package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.p;
import java.util.Set;

/* loaded from: classes.dex */
public final class a<O extends d> {
    private final AbstractC0109a<?, O> a;

    /* renamed from: b */
    private final g<?> f4536b;

    /* renamed from: c */
    private final String f4537c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class AbstractC0109a<T extends f, O> extends e<T, O> {
        public abstract T a(Context context, Looper looper, com.google.android.gms.common.internal.c cVar, O o, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar);
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface InterfaceC0110a extends d {
            Account b();
        }

        public interface b extends d {
            GoogleSignInAccount a();
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void connect(b.c cVar);

        void disconnect();

        com.google.android.gms.common.d[] getAvailableFeatures();

        String getEndpointPackageName();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.k kVar, Set<Scope> set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(b.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public interface h<T extends IInterface> extends b {
        T createServiceInterface(IBinder iBinder);

        String getServiceDescriptor();

        String getStartServiceAction();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0109a<C, O> abstractC0109a, g<C> gVar) {
        p.k(abstractC0109a, "Cannot construct an Api with a null ClientBuilder");
        p.k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f4537c = str;
        this.a = abstractC0109a;
        this.f4536b = gVar;
    }

    public final String a() {
        return this.f4537c;
    }

    public final AbstractC0109a<?, O> b() {
        p.n(this.a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }
}