package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class o {

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static final class a {
        private final List<String> a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f4711b;

        /* synthetic */ a(Object obj, j0 j0Var) {
            p.j(obj);
            this.f4711b = obj;
            this.a = new ArrayList();
        }

        @RecentlyNonNull
        public a a(@RecentlyNonNull String str, Object obj) {
            List<String> list = this.a;
            p.j(str);
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + strValueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(strValueOf);
            list.add(sb.toString());
            return this;
        }

        @RecentlyNonNull
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f4711b.getClass().getSimpleName());
            sb.append(CoreConstants.CURLY_LEFT);
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(this.a.get(i2));
                if (i2 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(CoreConstants.CURLY_RIGHT);
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(@RecentlyNonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @RecentlyNonNull
    public static a c(@RecentlyNonNull Object obj) {
        return new a(obj, null);
    }
}