package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ng2;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fg2<T_WRAPPER extends ng2<T_ENGINE>, T_ENGINE> {
    private static final Logger a = Logger.getLogger(fg2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final List<Provider> f5862b;

    /* renamed from: c, reason: collision with root package name */
    public static final fg2<gg2, Cipher> f5863c;

    /* renamed from: d, reason: collision with root package name */
    public static final fg2<kg2, Mac> f5864d;

    /* renamed from: e, reason: collision with root package name */
    public static final fg2<mg2, Signature> f5865e;

    /* renamed from: f, reason: collision with root package name */
    public static final fg2<lg2, MessageDigest> f5866f;

    /* renamed from: g, reason: collision with root package name */
    public static final fg2<hg2, KeyAgreement> f5867g;

    /* renamed from: h, reason: collision with root package name */
    public static final fg2<jg2, KeyPairGenerator> f5868h;

    /* renamed from: i, reason: collision with root package name */
    public static final fg2<ig2, KeyFactory> f5869i;

    /* renamed from: j, reason: collision with root package name */
    private final T_WRAPPER f5870j;

    /* renamed from: k, reason: collision with root package name */
    private final List<Provider> f5871k = f5862b;

    static {
        if (yg2.a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    a.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            f5862b = arrayList;
        } else {
            f5862b = new ArrayList();
        }
        f5863c = new fg2<>(new gg2());
        f5864d = new fg2<>(new kg2());
        f5865e = new fg2<>(new mg2());
        f5866f = new fg2<>(new lg2());
        f5867g = new fg2<>(new hg2());
        f5868h = new fg2<>(new jg2());
        f5869i = new fg2<>(new ig2());
    }

    public fg2(T_WRAPPER t_wrapper) {
        this.f5870j = t_wrapper;
    }

    public final T_ENGINE a(String str) {
        Iterator<Provider> it = this.f5871k.iterator();
        while (it.hasNext()) {
            try {
                return (T_ENGINE) this.f5870j.a(str, it.next());
            } catch (Exception unused) {
            }
        }
        return (T_ENGINE) this.f5870j.a(str, null);
    }
}