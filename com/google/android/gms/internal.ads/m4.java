package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class m4 {
    private final List<j4> a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f7415b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f7416c;

    public m4(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f7415b = linkedHashMap;
        this.f7416c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final j4 f() {
        return new j4(zzs.zzj().c(), null, null);
    }

    public final void a(m4 m4Var) {
        synchronized (this.f7416c) {
        }
    }

    public final boolean b(j4 j4Var, long j2, String... strArr) {
        synchronized (this.f7416c) {
            for (String str : strArr) {
                this.a.add(new j4(j2, str, j4Var));
            }
        }
        return true;
    }

    public final l4 c() {
        l4 l4Var;
        boolean zBooleanValue = ((Boolean) c.c().b(w3.j1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f7416c) {
            for (j4 j4Var : this.a) {
                long jA = j4Var.a();
                String strB = j4Var.b();
                j4 j4VarC = j4Var.c();
                if (j4VarC != null && jA > 0) {
                    long jA2 = jA - j4VarC.a();
                    sb.append(strB);
                    sb.append(CoreConstants.DOT);
                    sb.append(jA2);
                    sb.append(CoreConstants.COMMA_CHAR);
                    if (zBooleanValue) {
                        if (map.containsKey(Long.valueOf(j4VarC.a()))) {
                            StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(j4VarC.a()));
                            sb2.append('+');
                            sb2.append(strB);
                        } else {
                            map.put(Long.valueOf(j4VarC.a()), new StringBuilder(strB));
                        }
                    }
                }
            }
            this.a.clear();
            String string = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (zBooleanValue) {
                for (Map.Entry entry : map.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append(CoreConstants.DOT);
                    sb3.append(zzs.zzj().a() + (((Long) entry.getKey()).longValue() - zzs.zzj().c()));
                    sb3.append(CoreConstants.COMMA_CHAR);
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                string = sb3.toString();
            }
            l4Var = new l4(sb.toString(), string);
        }
        return l4Var;
    }

    public final void d(String str, String str2) {
        b4 b4VarA;
        if (TextUtils.isEmpty(str2) || (b4VarA = zzs.zzg().a()) == null) {
            return;
        }
        synchronized (this.f7416c) {
            i4 i4VarD = b4VarA.d(str);
            Map<String, String> map = this.f7415b;
            map.put(str, i4VarD.a(map.get(str), str2));
        }
    }

    public final Map<String, String> e() {
        Map<String, String> map;
        synchronized (this.f7416c) {
            zzs.zzg().a();
            map = this.f7415b;
        }
        return map;
    }
}