package androidx.core.content.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import c.h.k.h;
import java.lang.reflect.Method;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: ResourcesCompat.java */
    public static abstract class a {

        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.c.f$a$a */
        class RunnableC0010a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ Typeface f901e;

            RunnableC0010a(Typeface typeface) {
                this.f901e = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.f901e);
            }
        }

        /* compiled from: ResourcesCompat.java */
        class b implements Runnable {

            /* renamed from: e */
            final /* synthetic */ int f903e;

            b(int i2) {
                this.f903e = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c(this.f903e);
            }
        }

        public final void a(int i2, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(i2));
        }

        public final void b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0010a(typeface));
        }

        public abstract void c(int i2);

        public abstract void d(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    public static final class b {

        /* compiled from: ResourcesCompat.java */
        static class a {
            private static final Object a = new Object();

            /* renamed from: b */
            private static Method f905b;

            /* renamed from: c */
            private static boolean f906c;

            /* JADX WARN: Removed duplicated region for block: B:62:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            static void a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = androidx.core.content.c.f.b.a.a
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.c.f.b.a.f906c     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    androidx.core.content.c.f.b.a.f905b = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3c
                L21:
                    androidx.core.content.c.f.b.a.f906c = r1     // Catch: java.lang.Throwable -> L3c
                L23:
                    java.lang.reflect.Method r1 = androidx.core.content.c.f.b.a.f905b     // Catch: java.lang.Throwable -> L3c
                    if (r1 == 0) goto L3a
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    goto L3a
                L2d:
                    r6 = move-exception
                    goto L30
                L2f:
                    r6 = move-exception
                L30:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
                    r6 = 0
                    androidx.core.content.c.f.b.a.f905b = r6     // Catch: java.lang.Throwable -> L3c
                L3a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    return
                L3c:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.c.f.b.a.a(android.content.res.Resources$Theme):void");
            }
        }

        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.c.f$b$b */
        static class C0011b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                C0011b.a(theme);
            } else if (i2 >= 23) {
                a.a(theme);
            }
        }
    }

    public static Drawable a(Resources resources, int i2, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i2, theme) : resources.getDrawable(i2);
    }

    public static Typeface b(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i2, new TypedValue(), 0, null, null, false);
    }

    public static Typeface c(Context context, int i2, TypedValue typedValue, int i3, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return e(context, i2, typedValue, i3, aVar, null, true);
    }

    public static void d(Context context, int i2, a aVar, Handler handler) {
        h.c(aVar);
        if (context.isRestricted()) {
            aVar.a(-4, handler);
        } else {
            e(context, i2, new TypedValue(), 0, aVar, handler, false);
        }
    }

    private static Typeface e(Context context, int i2, TypedValue typedValue, int i3, a aVar, Handler handler, boolean z) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface typefaceF = f(context, resources, typedValue, i2, i3, aVar, handler, z);
        if (typefaceF != null || aVar != null) {
            return typefaceF;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface f(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.c.f.a r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto La7
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.a(r14, r10)
        L25:
            return r13
        L26:
            android.graphics.Typeface r1 = c.h.d.d.f(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.b(r1, r10)
        L31:
            return r1
        L32:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L8c
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L8c
            if (r1 == 0) goto L65
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L8c
            androidx.core.content.c.c$a r2 = androidx.core.content.c.c.b(r1, r0)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L8c
            if (r2 != 0) goto L53
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L8c
            if (r9 == 0) goto L52
            r9.a(r14, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L8c
        L52:
            return r13
        L53:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = c.h.d.d.c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L8c
            return r0
        L65:
            r1 = r15
            android.graphics.Typeface r0 = c.h.d.d.d(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L8c
            if (r9 == 0) goto L75
            if (r0 == 0) goto L72
            r9.b(r0, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L8c
            goto L75
        L72:
            r9.a(r14, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L8c
        L75:
            return r0
        L76:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto La1
        L8c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        La1:
            if (r9 == 0) goto La6
            r9.a(r14, r10)
        La6:
            return r13
        La7:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.c.f.f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.c.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}