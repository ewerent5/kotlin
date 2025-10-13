package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public abstract class b<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @RecentlyNonNull
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    @RecentlyNonNull
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private com.google.android.gms.common.b zzB;
    private boolean zzC;
    private volatile r0 zzD;
    c1 zza;
    final Handler zzb;

    @RecentlyNonNull
    protected c zzc;

    @RecentlyNonNull
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final i zzn;
    private final com.google.android.gms.common.f zzo;
    private final Object zzp;
    private final Object zzq;

    @GuardedBy("mServiceBrokerLock")
    private n zzr;

    @GuardedBy("mLock")
    private T zzs;
    private final ArrayList<m0<?>> zzt;

    @GuardedBy("mLock")
    private o0 zzu;

    @GuardedBy("mLock")
    private int zzv;
    private final a zzw;
    private final InterfaceC0113b zzx;
    private final int zzy;
    private final String zzz;
    private static final com.google.android.gms.common.d[] zze = new com.google.android.gms.common.d[0];

    @RecentlyNonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface a {
        void R(int i2);

        void Y(Bundle bundle);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    /* renamed from: com.google.android.gms.common.internal.b$b */
    public interface InterfaceC0113b {
        void U(@RecentlyNonNull com.google.android.gms.common.b bVar);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface c {
        void a(@RecentlyNonNull com.google.android.gms.common.b bVar);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    protected class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.b.c
        public final void a(@RecentlyNonNull com.google.android.gms.common.b bVar) {
            if (bVar.L()) {
                b bVar2 = b.this;
                bVar2.getRemoteService(null, bVar2.getScopes());
            } else if (b.this.zzx != null) {
                b.this.zzx.U(bVar);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface e {
        void a();
    }

    protected b(@RecentlyNonNull Context context, @RecentlyNonNull Handler handler, @RecentlyNonNull i iVar, @RecentlyNonNull com.google.android.gms.common.f fVar, int i2, a aVar, InterfaceC0113b interfaceC0113b) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        p.k(context, "Context must not be null");
        this.zzl = context;
        p.k(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        p.k(iVar, "Supervisor must not be null");
        this.zzn = iVar;
        p.k(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzy = i2;
        this.zzw = aVar;
        this.zzx = interfaceC0113b;
        this.zzz = null;
    }

    static /* synthetic */ void zzc(b bVar, int i2) {
        int i3;
        int i4;
        synchronized (bVar.zzp) {
            i3 = bVar.zzv;
        }
        if (i3 == 3) {
            bVar.zzC = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        Handler handler = bVar.zzb;
        handler.sendMessage(handler.obtainMessage(i4, bVar.zzd.get(), 16));
    }

    static /* synthetic */ boolean zzg(b bVar) throws ClassNotFoundException {
        if (bVar.zzC || TextUtils.isEmpty(bVar.getServiceDescriptor()) || TextUtils.isEmpty(bVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(bVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static /* synthetic */ boolean zzl(b bVar, int i2, int i3, IInterface iInterface) {
        synchronized (bVar.zzp) {
            if (bVar.zzv != i2) {
                return false;
            }
            bVar.zzp(i3, iInterface);
            return true;
        }
    }

    static /* synthetic */ void zzo(b bVar, r0 r0Var) {
        bVar.zzD = r0Var;
        if (bVar.usesClientTelemetry()) {
            com.google.android.gms.common.internal.e eVar = r0Var.f4728h;
            s.a().b(eVar == null ? null : eVar.M());
        }
    }

    public final void zzp(int i2, T t) {
        c1 c1Var;
        p.a((i2 == 4) == (t != null));
        synchronized (this.zzp) {
            this.zzv = i2;
            this.zzs = t;
            if (i2 == 1) {
                o0 o0Var = this.zzu;
                if (o0Var != null) {
                    i iVar = this.zzn;
                    String strA = this.zza.a();
                    p.j(strA);
                    iVar.c(strA, this.zza.b(), this.zza.c(), o0Var, zza(), this.zza.d());
                    this.zzu = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                o0 o0Var2 = this.zzu;
                if (o0Var2 != null && (c1Var = this.zza) != null) {
                    String strA2 = c1Var.a();
                    String strB = this.zza.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(strA2).length() + 70 + String.valueOf(strB).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(strA2);
                    sb.append(" on ");
                    sb.append(strB);
                    Log.e("GmsClient", sb.toString());
                    i iVar2 = this.zzn;
                    String strA3 = this.zza.a();
                    p.j(strA3);
                    iVar2.c(strA3, this.zza.b(), this.zza.c(), o0Var2, zza(), this.zza.d());
                    this.zzd.incrementAndGet();
                }
                o0 o0Var3 = new o0(this, this.zzd.get());
                this.zzu = o0Var3;
                c1 c1Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new c1(getStartServicePackage(), getStartServiceAction(), false, i.a(), getUseDynamicLookup()) : new c1(getContext().getPackageName(), getLocalStartServiceAction(), true, i.a(), false);
                this.zza = c1Var2;
                if (c1Var2.d() && getMinApkVersion() < 17895000) {
                    String strValueOf = String.valueOf(this.zza.a());
                    throw new IllegalStateException(strValueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(strValueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                i iVar3 = this.zzn;
                String strA4 = this.zza.a();
                p.j(strA4);
                if (!iVar3.d(new v0(strA4, this.zza.b(), this.zza.c(), this.zza.d()), o0Var3, zza())) {
                    String strA5 = this.zza.a();
                    String strB2 = this.zza.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strA5).length() + 34 + String.valueOf(strB2).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(strA5);
                    sb2.append(" on ");
                    sb2.append(strB2);
                    Log.e("GmsClient", sb2.toString());
                    zzb(16, null, this.zzd.get());
                }
            } else if (i2 == 4) {
                p.j(t);
                onConnectedLocked(t);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iH = this.zzo.h(this.zzl, getMinApkVersion());
        if (iH == 0) {
            connect(new d());
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(), iH, null);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(@RecentlyNonNull c cVar) {
        p.k(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, null);
    }

    @RecentlyNullable
    protected abstract T createServiceInterface(@RecentlyNonNull IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.zzt.get(i2).e();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void dump(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr) {
        int i2;
        T t;
        n nVar;
        synchronized (this.zzp) {
            i2 = this.zzv;
            t = this.zzs;
        }
        synchronized (this.zzq) {
            nVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (nVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(nVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.zzh;
            String str2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.zzf;
            if (i3 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i3 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i3 != 3) {
                printWriter.append((CharSequence) String.valueOf(i3));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.zzg;
            String str3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.d.a(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j4 = this.zzj;
            String str4 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    protected boolean enableLocalFallback() {
        return false;
    }

    @RecentlyNullable
    public Account getAccount() {
        return null;
    }

    @RecentlyNonNull
    public com.google.android.gms.common.d[] getApiFeatures() {
        return zze;
    }

    @RecentlyNullable
    public final com.google.android.gms.common.d[] getAvailableFeatures() {
        r0 r0Var = this.zzD;
        if (r0Var == null) {
            return null;
        }
        return r0Var.f4726f;
    }

    @RecentlyNullable
    public Bundle getConnectionHint() {
        return null;
    }

    @RecentlyNonNull
    public final Context getContext() {
        return this.zzl;
    }

    @RecentlyNonNull
    public String getEndpointPackageName() {
        c1 c1Var;
        if (!isConnected() || (c1Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c1Var.b();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    @RecentlyNonNull
    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    @RecentlyNullable
    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    @RecentlyNullable
    protected String getLocalStartServiceAction() {
        return null;
    }

    @RecentlyNonNull
    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return com.google.android.gms.common.f.a;
    }

    public void getRemoteService(k kVar, @RecentlyNonNull Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        g gVar = new g(this.zzy, this.zzA);
        gVar.f4693h = this.zzl.getPackageName();
        gVar.f4696k = getServiceRequestExtraArgs;
        if (set != null) {
            gVar.f4695j = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            gVar.f4697l = account;
            if (kVar != null) {
                gVar.f4694i = kVar.asBinder();
            }
        } else if (requiresAccount()) {
            gVar.f4697l = getAccount();
        }
        gVar.f4698m = zze;
        gVar.n = getApiFeatures();
        if (usesClientTelemetry()) {
            gVar.q = true;
        }
        try {
            synchronized (this.zzq) {
                n nVar = this.zzr;
                if (nVar != null) {
                    nVar.R0(new n0(this, this.zzd.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            triggerConnectionSuspended(3);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    @RecentlyNonNull
    protected Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    public final T getService() {
        T t;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            t = this.zzs;
            p.k(t, "Client is connected but service is null");
        }
        return t;
    }

    @RecentlyNullable
    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            n nVar = this.zzr;
            if (nVar == null) {
                return null;
            }
            return nVar.asBinder();
        }
    }

    protected abstract String getServiceDescriptor();

    @RecentlyNonNull
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected abstract String getStartServiceAction();

    @RecentlyNonNull
    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    @RecentlyNullable
    public com.google.android.gms.common.internal.e getTelemetryConfiguration() {
        r0 r0Var = this.zzD;
        if (r0Var == null) {
            return null;
        }
        return r0Var.f4728h;
    }

    protected boolean getUseDynamicLookup() {
        return false;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i2 = this.zzv;
            z = true;
            if (i2 != 2 && i2 != 3) {
                z = false;
            }
        }
        return z;
    }

    protected void onConnectedLocked(@RecentlyNonNull T t) {
        this.zzh = System.currentTimeMillis();
    }

    protected void onConnectionFailed(@RecentlyNonNull com.google.android.gms.common.b bVar) {
        this.zzi = bVar.c();
        this.zzj = System.currentTimeMillis();
    }

    protected void onConnectionSuspended(int i2) {
        this.zzf = i2;
        this.zzg = System.currentTimeMillis();
    }

    protected void onPostInitHandler(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new p0(this, i2, iBinder, bundle)));
    }

    public void onUserSignOut(@RecentlyNonNull e eVar) {
        eVar.a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(@RecentlyNonNull String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i2) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i2));
    }

    protected void triggerNotAvailable(@RecentlyNonNull c cVar, int i2, PendingIntent pendingIntent) {
        p.k(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i2, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    @RecentlyNonNull
    protected final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    protected final void zzb(int i2, Bundle bundle, int i3) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new q0(this, i2, null)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected b(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i2, a aVar, InterfaceC0113b interfaceC0113b, String str) {
        i iVarB = i.b(context);
        com.google.android.gms.common.f fVarF = com.google.android.gms.common.f.f();
        p.j(aVar);
        p.j(interfaceC0113b);
        this(context, looper, iVarB, fVarF, i2, aVar, interfaceC0113b, str);
    }

    public void disconnect(@RecentlyNonNull String str) {
        this.zzk = str;
        disconnect();
    }

    protected b(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull i iVar, @RecentlyNonNull com.google.android.gms.common.f fVar, int i2, a aVar, InterfaceC0113b interfaceC0113b, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        p.k(context, "Context must not be null");
        this.zzl = context;
        p.k(looper, "Looper must not be null");
        this.zzm = looper;
        p.k(iVar, "Supervisor must not be null");
        this.zzn = iVar;
        p.k(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new l0(this, looper);
        this.zzy = i2;
        this.zzw = aVar;
        this.zzx = interfaceC0113b;
        this.zzz = str;
    }
}