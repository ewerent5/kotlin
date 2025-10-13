package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class b12 {
    private static boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5044b;

    /* renamed from: c, reason: collision with root package name */
    private final a12 f5045c;

    /* renamed from: d, reason: collision with root package name */
    private a12 f5046d;

    /* synthetic */ b12(String str, z02 z02Var) {
        a12 a12Var = new a12(null);
        this.f5045c = a12Var;
        this.f5046d = a12Var;
        if (!a) {
            synchronized (b12.class) {
                if (!a) {
                    a = true;
                }
            }
        }
        Objects.requireNonNull(str);
        this.f5044b = str;
    }

    public final b12 a(@NullableDecl Object obj) {
        a12 a12Var = new a12(null);
        this.f5046d.f4807b = a12Var;
        this.f5046d = a12Var;
        a12Var.a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f5044b);
        sb.append(CoreConstants.CURLY_LEFT);
        a12 a12Var = this.f5045c.f4807b;
        String str = "";
        while (a12Var != null) {
            Object obj = a12Var.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            a12Var = a12Var.f4807b;
            str = ", ";
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}