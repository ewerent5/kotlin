package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class f72 {
    private static final Logger a = Logger.getLogger(f72.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, e72> f5813b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap<String, d72> f5814c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f5815d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap<String, c62<?>> f5816e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, x62<?, ?>> f5817f = new ConcurrentHashMap();

    private f72() {
    }

    @Deprecated
    public static c62<?> a(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentMap<String, c62<?>> concurrentMap = f5816e;
        Locale locale = Locale.US;
        c62<?> c62Var = concurrentMap.get(str.toLowerCase(locale));
        if (c62Var != null) {
            return c62Var;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tink")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(strConcat);
    }

    public static synchronized <P> void b(h62<P> h62Var, boolean z) {
        if (h62Var == null) {
            throw new IllegalArgumentException("key manager must be non-null.");
        }
        String strZzd = h62Var.zzd();
        o(strZzd, h62Var.getClass(), z);
        f5813b.putIfAbsent(strZzd, new a72(h62Var));
        f5815d.put(strZzd, Boolean.valueOf(z));
    }

    public static synchronized <KeyProtoT extends lk2> void c(n62<KeyProtoT> n62Var, boolean z) {
        String strB = n62Var.b();
        o(strB, n62Var.getClass(), true);
        ConcurrentMap<String, e72> concurrentMap = f5813b;
        if (!concurrentMap.containsKey(strB)) {
            concurrentMap.put(strB, new b72(n62Var));
            f5814c.put(strB, new d72(n62Var));
        }
        f5815d.put(strB, Boolean.TRUE);
    }

    public static synchronized <KeyProtoT extends lk2, PublicKeyProtoT extends lk2> void d(z62<KeyProtoT, PublicKeyProtoT> z62Var, n62<PublicKeyProtoT> n62Var, boolean z) {
        Class<?> clsZze;
        o("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", z62Var.getClass(), true);
        o("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", n62Var.getClass(), false);
        ConcurrentMap<String, e72> concurrentMap = f5813b;
        if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (clsZze = concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zze()) != null && !clsZze.equals(n62Var.getClass())) {
            a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", z62Var.getClass().getName(), clsZze.getName(), n62Var.getClass().getName()));
        }
        if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zze() == null) {
            concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new c72(z62Var, n62Var));
            f5814c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new d72(z62Var));
        }
        ConcurrentMap<String, Boolean> concurrentMap2 = f5815d;
        concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
        if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new b72(n62Var));
        }
        concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
    }

    public static synchronized <B, P> void e(x62<B, P> x62Var) {
        if (x62Var == null) {
            throw new IllegalArgumentException("wrapper must be non-null");
        }
        Class<P> clsZzb = x62Var.zzb();
        ConcurrentMap<Class<?>, x62<?, ?>> concurrentMap = f5817f;
        if (concurrentMap.containsKey(clsZzb)) {
            x62<?, ?> x62Var2 = concurrentMap.get(clsZzb);
            if (!x62Var.getClass().equals(x62Var2.getClass())) {
                Logger logger = a;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(clsZzb);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 56);
                sb.append("Attempted overwrite of a registered SetWrapper for type ");
                sb.append(strValueOf);
                logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsZzb.getName(), x62Var2.getClass().getName(), x62Var.getClass().getName()));
            }
        }
        concurrentMap.put(clsZzb, x62Var);
    }

    public static h62<?> f(String str) {
        return n(str).zzb();
    }

    public static synchronized qd2 g(wd2 wd2Var) {
        h62<?> h62VarF;
        h62VarF = f(wd2Var.D());
        if (!f5815d.get(wd2Var.D()).booleanValue()) {
            String strValueOf = String.valueOf(wd2Var.D());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return h62VarF.i(wd2Var.E());
    }

    public static synchronized lk2 h(wd2 wd2Var) {
        h62<?> h62VarF;
        h62VarF = f(wd2Var.D());
        if (!f5815d.get(wd2Var.D()).booleanValue()) {
            String strValueOf = String.valueOf(wd2Var.D());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return h62VarF.k(wd2Var.E());
    }

    public static <P> P i(String str, lk2 lk2Var, Class<P> cls) {
        return (P) p(str, cls).j(lk2Var);
    }

    public static <P> P j(String str, byte[] bArr, Class<P> cls) {
        return (P) q(str, ci2.H(bArr), cls);
    }

    public static <P> P k(qd2 qd2Var, Class<P> cls) {
        return (P) q(qd2Var.D(), qd2Var.E(), cls);
    }

    public static <B, P> P l(w62<B> w62Var, Class<P> cls) throws GeneralSecurityException {
        x62<?, ?> x62Var = f5817f.get(cls);
        if (x62Var == null) {
            String name = w62Var.e().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        }
        if (x62Var.zzc().equals(w62Var.e())) {
            return (P) x62Var.a(w62Var);
        }
        String strValueOf = String.valueOf(x62Var.zzc());
        String strValueOf2 = String.valueOf(w62Var.e());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 44 + strValueOf2.length());
        sb.append("Wrong input primitive class, expected ");
        sb.append(strValueOf);
        sb.append(", got ");
        sb.append(strValueOf2);
        throw new GeneralSecurityException(sb.toString());
    }

    public static Class<?> m(Class<?> cls) {
        x62<?, ?> x62Var = f5817f.get(cls);
        if (x62Var == null) {
            return null;
        }
        return x62Var.zzc();
    }

    private static synchronized e72 n(String str) {
        ConcurrentMap<String, e72> concurrentMap;
        concurrentMap = f5813b;
        if (!concurrentMap.containsKey(str)) {
            String strValueOf = String.valueOf(str);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "No key manager found for key type ".concat(strValueOf) : new String("No key manager found for key type "));
        }
        return concurrentMap.get(str);
    }

    private static synchronized void o(String str, Class<?> cls, boolean z) {
        ConcurrentMap<String, e72> concurrentMap = f5813b;
        if (concurrentMap.containsKey(str)) {
            e72 e72Var = concurrentMap.get(str);
            if (!e72Var.zzc().equals(cls)) {
                a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, e72Var.zzc().getName(), cls.getName()));
            }
            if (!z || f5815d.get(str).booleanValue()) {
            } else {
                throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
            }
        }
    }

    private static <P> h62<P> p(String str, Class<P> cls) throws GeneralSecurityException {
        e72 e72VarN = n(str);
        if (e72VarN.zzd().contains(cls)) {
            return e72VarN.a(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(e72VarN.zzc());
        Set<Class<?>> setZzd = e72VarN.zzd();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : setZzd) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String string = sb.toString();
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + strValueOf.length() + String.valueOf(string).length());
        sb2.append("Primitive type ");
        sb2.append(name);
        sb2.append(" not supported by key manager of type ");
        sb2.append(strValueOf);
        sb2.append(", supported primitives: ");
        sb2.append(string);
        throw new GeneralSecurityException(sb2.toString());
    }

    private static <P> P q(String str, ci2 ci2Var, Class<P> cls) {
        return (P) p(str, cls).l(ci2Var);
    }
}