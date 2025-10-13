package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: g */
    @GuardedBy("DynamiteModule.class")
    private static Boolean f4789g = null;

    /* renamed from: h */
    @GuardedBy("DynamiteModule.class")
    private static String f4790h = null;

    /* renamed from: i */
    @GuardedBy("DynamiteModule.class")
    private static int f4791i = -1;

    @GuardedBy("DynamiteModule.class")
    private static o n;

    @GuardedBy("DynamiteModule.class")
    private static p o;
    private final Context p;

    /* renamed from: j */
    private static final ThreadLocal<k> f4792j = new ThreadLocal<>();

    /* renamed from: k */
    private static final ThreadLocal<Long> f4793k = new com.google.android.gms.dynamite.b();

    /* renamed from: l */
    private static final m f4794l = new c();

    @RecentlyNonNull
    public static final b a = new d();

    /* renamed from: b */
    @RecentlyNonNull
    public static final b f4784b = new e();

    /* renamed from: c */
    @RecentlyNonNull
    public static final b f4785c = new f();

    /* renamed from: d */
    @RecentlyNonNull
    public static final b f4786d = new g();

    /* renamed from: e */
    @RecentlyNonNull
    public static final b f4787e = new h();

    /* renamed from: f */
    @RecentlyNonNull
    public static final b f4788f = new i();

    /* renamed from: m */
    @RecentlyNonNull
    public static final b f4795m = new j();

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @RecentlyNullable
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class a extends Exception {
        /* synthetic */ a(String str, com.google.android.gms.dynamite.b bVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, com.google.android.gms.dynamite.b bVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface b {
        n a(Context context, String str, m mVar);
    }

    private DynamiteModule(Context context) {
        com.google.android.gms.common.internal.p.j(context);
        this.p = context;
    }

    public static int a(@RecentlyNonNull Context context, @RecentlyNonNull String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (com.google.android.gms.common.internal.o.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String strValueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", strValueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(strValueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int c(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return f(context, str, false);
    }

    @RecentlyNonNull
    public static DynamiteModule e(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull String str) {
        Boolean bool;
        e.c.b.b.b.b bVarY;
        DynamiteModule dynamiteModule;
        p pVar;
        Boolean boolValueOf;
        e.c.b.b.b.b bVarY2;
        ThreadLocal<k> threadLocal = f4792j;
        k kVar = threadLocal.get();
        k kVar2 = new k(null);
        threadLocal.set(kVar2);
        ThreadLocal<Long> threadLocal2 = f4793k;
        long jLongValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            n nVarA = bVar.a(context, str, f4794l);
            int i2 = nVarA.a;
            int i3 = nVarA.f4796b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            int i4 = nVarA.f4797c;
            if (i4 == 0 || ((i4 == -1 && nVarA.a == 0) || (i4 == 1 && nVarA.f4796b == 0))) {
                int i5 = nVarA.a;
                int i6 = nVarA.f4796b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i5);
                sb2.append(" and remote version is ");
                sb2.append(i6);
                sb2.append(".");
                throw new a(sb2.toString(), null);
            }
            if (i4 == -1) {
                DynamiteModule dynamiteModuleI = i(context, str);
                if (jLongValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(jLongValue));
                }
                Cursor cursor = kVar2.a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(kVar);
                return dynamiteModuleI;
            }
            if (i4 != 1) {
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(0);
                throw new a(sb3.toString(), null);
            }
            try {
                int i7 = nVarA.f4796b;
                try {
                    synchronized (DynamiteModule.class) {
                        bool = f4789g;
                    }
                    if (bool == null) {
                        throw new a("Failed to determine which loading route to use.", null);
                    }
                    if (bool.booleanValue()) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                        sb4.append("Selected remote version of ");
                        sb4.append(str);
                        sb4.append(", version >= ");
                        sb4.append(i7);
                        Log.i("DynamiteModule", sb4.toString());
                        synchronized (DynamiteModule.class) {
                            pVar = o;
                        }
                        if (pVar == null) {
                            throw new a("DynamiteLoaderV2 was not cached.", null);
                        }
                        k kVar3 = threadLocal.get();
                        if (kVar3 == null || kVar3.a == null) {
                            throw new a("No result cursor", null);
                        }
                        Context applicationContext = context.getApplicationContext();
                        Cursor cursor2 = kVar3.a;
                        e.c.b.b.b.d.m4(null);
                        synchronized (DynamiteModule.class) {
                            boolValueOf = Boolean.valueOf(f4791i >= 2);
                        }
                        if (boolValueOf.booleanValue()) {
                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                            bVarY2 = pVar.m4(e.c.b.b.b.d.m4(applicationContext), str, i7, e.c.b.b.b.d.m4(cursor2));
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                            bVarY2 = pVar.Y(e.c.b.b.b.d.m4(applicationContext), str, i7, e.c.b.b.b.d.m4(cursor2));
                        }
                        Context context2 = (Context) e.c.b.b.b.d.Y(bVarY2);
                        if (context2 == null) {
                            throw new a("Failed to get module context", null);
                        }
                        dynamiteModule = new DynamiteModule(context2);
                    } else {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 51);
                        sb5.append("Selected remote version of ");
                        sb5.append(str);
                        sb5.append(", version >= ");
                        sb5.append(i7);
                        Log.i("DynamiteModule", sb5.toString());
                        o oVarK = k(context);
                        if (oVarK == null) {
                            throw new a("Failed to create IDynamiteLoader.", null);
                        }
                        int iZzi = oVarK.zzi();
                        if (iZzi >= 3) {
                            k kVar4 = threadLocal.get();
                            if (kVar4 == null) {
                                throw new a("No cached result cursor holder", null);
                            }
                            bVarY = oVarK.L4(e.c.b.b.b.d.m4(context), str, i7, e.c.b.b.b.d.m4(kVar4.a));
                        } else if (iZzi == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            bVarY = oVarK.I4(e.c.b.b.b.d.m4(context), str, i7);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            bVarY = oVarK.Y(e.c.b.b.b.d.m4(context), str, i7);
                        }
                        if (e.c.b.b.b.d.Y(bVarY) == null) {
                            throw new a("Failed to load remote module.", null);
                        }
                        dynamiteModule = new DynamiteModule((Context) e.c.b.b.b.d.Y(bVarY));
                    }
                    if (jLongValue == 0) {
                        threadLocal2.remove();
                    } else {
                        threadLocal2.set(Long.valueOf(jLongValue));
                    }
                    Cursor cursor3 = kVar2.a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    threadLocal.set(kVar);
                    return dynamiteModule;
                } catch (RemoteException e2) {
                    throw new a("Failed to load remote module.", e2, null);
                } catch (a e3) {
                    throw e3;
                } catch (Throwable th) {
                    com.google.android.gms.common.util.h.a(context, th);
                    throw new a("Failed to load remote module.", th, null);
                }
            } catch (a e4) {
                String strValueOf = String.valueOf(e4.getMessage());
                Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to load remote module: ".concat(strValueOf) : new String("Failed to load remote module: "));
                int i8 = nVarA.a;
                if (i8 == 0 || bVar.a(context, str, new l(i8, 0)).f4797c != -1) {
                    throw new a("Remote load failed. No local fallback found.", e4, null);
                }
                DynamiteModule dynamiteModuleI2 = i(context, str);
                if (jLongValue == 0) {
                    f4793k.remove();
                } else {
                    f4793k.set(Long.valueOf(jLongValue));
                }
                Cursor cursor4 = kVar2.a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                f4792j.set(kVar);
                return dynamiteModuleI2;
            }
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                f4793k.remove();
            } else {
                f4793k.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = kVar2.a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f4792j.set(kVar);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x014f A[Catch: all -> 0x01af, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x01af, blocks: (B:136:0x0002, B:184:0x00d0, B:187:0x00d7, B:196:0x00fd, B:213:0x0141, B:217:0x014f, B:241:0x01a8, B:242:0x01ab, B:238:0x01a2, B:190:0x00dd, B:192:0x00ef, B:194:0x00f9, B:193:0x00f4, B:245:0x01ae, B:137:0x0003, B:140:0x0008, B:141:0x0024, B:182:0x00cd, B:165:0x0093, B:168:0x0096, B:175:0x00a5, B:183:0x00cf, B:181:0x00ab), top: B:255:0x0002, inners: #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(@androidx.annotation.RecentlyNonNull android.content.Context r9, @androidx.annotation.RecentlyNonNull java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int g(android.content.Context r9, java.lang.String r10, boolean r11) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.f4793k     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r9 = "api_force_staging"
            java.lang.String r4 = "api"
            r5 = 1
            if (r5 == r11) goto L19
            r9 = r4
        L19:
            android.net.Uri$Builder r11 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r11.<init>()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r4 = "content"
            android.net.Uri$Builder r11 = r11.scheme(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r11 = r11.authority(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri$Builder r9 = r11.path(r9)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri$Builder r9 = r9.appendPath(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r10 = "requestStartTime"
            java.lang.String r11 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r10, r11)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri r4 = r9.build()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r9 == 0) goto L81
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            if (r10 == 0) goto L81
            r10 = 0
            int r10 = r9.getInt(r10)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            if (r10 <= 0) goto L7a
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r11 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r11)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            r1 = 2
            java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.dynamite.DynamiteModule.f4790h = r1     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = "loaderVersion"
            int r1 = r9.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L77
            if (r1 < 0) goto L6f
            int r1 = r9.getInt(r1)     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.dynamite.DynamiteModule.f4791i = r1     // Catch: java.lang.Throwable -> L77
        L6f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L77
            boolean r11 = h(r9)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            if (r11 == 0) goto L7a
            goto L7b
        L77:
            r10 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L77
            throw r10     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
        L7a:
            r0 = r9
        L7b:
            if (r0 == 0) goto L80
            r0.close()
        L80:
            return r10
        L81:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = "Failed to retrieve remote module version."
            android.util.Log.w(r10, r11)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            java.lang.String r11 = "Failed to connect to dynamite module ContentResolver."
            r10.<init>(r11, r0)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            throw r10     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
        L90:
            r10 = move-exception
            goto L98
        L92:
            r9 = move-exception
            r10 = r9
            goto La7
        L95:
            r9 = move-exception
            r10 = r9
            r9 = r0
        L98:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch: java.lang.Throwable -> La5
            if (r11 == 0) goto L9d
            throw r10     // Catch: java.lang.Throwable -> La5
        L9d:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = "V2 version check failed"
            r11.<init>(r1, r10, r0)     // Catch: java.lang.Throwable -> La5
            throw r11     // Catch: java.lang.Throwable -> La5
        La5:
            r10 = move-exception
            r0 = r9
        La7:
            if (r0 == 0) goto Lac
            r0.close()
        Lac:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean):int");
    }

    private static boolean h(Cursor cursor) {
        k kVar = f4792j.get();
        if (kVar == null || kVar.a != null) {
            return false;
        }
        kVar.a = cursor;
        return true;
    }

    private static DynamiteModule i(Context context, String str) {
        String strValueOf = String.valueOf(str);
        Log.i("DynamiteModule", strValueOf.length() != 0 ? "Selected local version of ".concat(strValueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    private static void j(ClassLoader classLoader) throws a {
        p pVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                pVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                pVar = iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new p(iBinder);
            }
            o = pVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, null);
        }
    }

    private static o k(Context context) {
        o oVar;
        synchronized (DynamiteModule.class) {
            o oVar2 = n;
            if (oVar2 != null) {
                return oVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    oVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    oVar = iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new o(iBinder);
                }
                if (oVar != null) {
                    n = oVar;
                    return oVar;
                }
            } catch (Exception e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(strValueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    @RecentlyNonNull
    public Context b() {
        return this.p;
    }

    @RecentlyNonNull
    public IBinder d(@RecentlyNonNull String str) throws a {
        try {
            return (IBinder) this.p.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String strValueOf = String.valueOf(str);
            throw new a(strValueOf.length() != 0 ? "Failed to instantiate module class: ".concat(strValueOf) : new String("Failed to instantiate module class: "), e2, null);
        }
    }
}