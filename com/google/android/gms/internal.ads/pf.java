package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class pf extends sf {

    /* renamed from: e */
    private static final xh f8148e = new xh();

    /* renamed from: f */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f8149f;

    public final void J4(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f8149f = map;
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final boolean O(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, pf.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + SyslogConstants.LOG_AUDIT);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            er.zzi(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final th b(String str) {
        return new ei((RtbAdapter) Class.forName(str, false, xh.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final wf c(String str) throws RemoteException {
        wf ygVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, pf.class.getClassLoader());
                if (com.google.ads.mediation.b.class.isAssignableFrom(cls)) {
                    com.google.ads.mediation.b bVar = (com.google.ads.mediation.b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    return new yg(bVar, (com.google.ads.mediation.f) this.f8149f.get(bVar.getAdditionalParametersType()));
                }
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new tg((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new tg((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                er.zzi(sb.toString());
                throw new RemoteException();
            } catch (Throwable unused) {
                er.zzd("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    ygVar = new tg(new AdMobAdapter());
                } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                    ygVar = new tg(new AdUrlAdapter());
                } else {
                    if (!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                            CustomEventAdapter customEventAdapter = new CustomEventAdapter();
                            ygVar = new yg(customEventAdapter, (CustomEventExtras) this.f8149f.get(customEventAdapter.getAdditionalParametersType()));
                        }
                        throw new RemoteException();
                    }
                    ygVar = new tg(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
                }
                return ygVar;
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            er.zzj(sb2.toString(), th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final boolean d(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, pf.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            er.zzi(sb.toString());
            return false;
        }
    }
}