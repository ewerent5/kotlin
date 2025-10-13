package org.greenrobot.eventbus;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;

/* compiled from: SubscriberMethod.java */
/* loaded from: classes3.dex */
public class o {
    final Method a;

    /* renamed from: b */
    final ThreadMode f17238b;

    /* renamed from: c */
    final Class<?> f17239c;

    /* renamed from: d */
    final int f17240d;

    /* renamed from: e */
    final boolean f17241e;

    /* renamed from: f */
    String f17242f;

    public o(Method method, Class<?> cls, ThreadMode threadMode, int i2, boolean z) {
        this.a = method;
        this.f17238b = threadMode;
        this.f17239c = cls;
        this.f17240d = i2;
        this.f17241e = z;
    }

    private synchronized void a() {
        if (this.f17242f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.a.getName());
            sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(this.f17239c.getName());
            this.f17242f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        a();
        o oVar = (o) obj;
        oVar.a();
        return this.f17242f.equals(oVar.f17242f);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}