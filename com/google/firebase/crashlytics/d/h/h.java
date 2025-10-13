package com.google.firebase.crashlytics.d.h;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import j$.util.Comparator;
import j$.util.Spliterator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* compiled from: CommonUtils.java */
/* loaded from: classes.dex */
public class h {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    private static long f12357b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f12358c = new a();

    /* compiled from: CommonUtils.java */
    class a implements Comparator<File>, j$.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    /* compiled from: CommonUtils.java */
    enum b {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;

        private static final Map<String, b> o;

        static {
            b bVar = X86_32;
            b bVar2 = ARMV6;
            b bVar3 = ARMV7;
            b bVar4 = ARM64;
            HashMap map = new HashMap(4);
            o = map;
            map.put("armeabi-v7a", bVar3);
            map.put("armeabi", bVar2);
            map.put("arm64-v8a", bVar4);
            map.put("x86", bVar);
        }

        static b a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                com.google.firebase.crashlytics.d.b.f().b("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            b bVar = o.get(str.toLowerCase(Locale.US));
            return bVar == null ? UNKNOWN : bVar;
        }
    }

    public static boolean A(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str = Build.PRODUCT;
        return "sdk".equals(str) || "google_sdk".equals(str) || string == null;
    }

    public static boolean B(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean C(Context context) {
        boolean zA = A(context);
        String str = Build.TAGS;
        if ((zA || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zA && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String D(int i2) {
        if (i2 >= 0) {
            return String.format(Locale.US, "%1$10s", Integer.valueOf(i2)).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String E(Context context) throws Resources.NotFoundException {
        int iS = s(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iS == 0) {
            return null;
        }
        String string = context.getResources().getString(iS);
        com.google.firebase.crashlytics.d.b.f().b("Unity Editor version is: " + string);
        return string;
    }

    public static String F(String str) {
        return w(str, "SHA-1");
    }

    public static String G(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long b(String str) {
        long blockSize = new StatFs(str).getBlockSize();
        return (r0.getBlockCount() * blockSize) - (blockSize * r0.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    public static boolean c(Context context) {
        if (!d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void e(Closeable closeable, String str) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                com.google.firebase.crashlytics.d.b.f().e(str, e2);
            }
        }
    }

    public static void f(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    static long g(String str, String str2, int i2) {
        return Long.parseLong(str.split(str2)[0].trim()) * i2;
    }

    public static String h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String string = sb.toString();
        if (string.length() > 0) {
            return F(string);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r2 = r3[1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String i(java.io.File r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L5f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            if (r3 == 0) goto L36
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            int r4 = r3.length     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            if (r4 == 0) goto L15
            r6 = r3[r5]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r2 = r6
        L36:
            e(r1, r0)
            goto L5f
        L3a:
            r7 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L5b
        L3e:
            r7 = move-exception
            r1 = r2
        L40:
            com.google.firebase.crashlytics.d.b r3 = com.google.firebase.crashlytics.d.b.f()     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L59
            r4.append(r6)     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L59
            r3.e(r6, r7)     // Catch: java.lang.Throwable -> L59
            goto L36
        L59:
            r6 = move-exception
            r2 = r1
        L5b:
            e(r2, r0)
            throw r6
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.d.h.h.i(java.io.File, java.lang.String):java.lang.String");
    }

    public static void j(Flushable flushable, String str) throws IOException {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e2) {
                com.google.firebase.crashlytics.d.b.f().e(str, e2);
            }
        }
    }

    public static ActivityManager.RunningAppProcessInfo k(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static boolean l(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iS = s(context, str, "bool");
            if (iS > 0) {
                return resources.getBoolean(iS);
            }
            int iS2 = s(context, str, "string");
            if (iS2 > 0) {
                return Boolean.parseBoolean(context.getString(iS2));
            }
        }
        return z;
    }

    public static int m() {
        return b.a().ordinal();
    }

    public static int n(Context context) {
        int i2 = A(context) ? 1 : 0;
        if (C(context)) {
            i2 |= 2;
        }
        return z() ? i2 | 4 : i2;
    }

    public static SharedPreferences o(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static String p(Context context) {
        int iS = s(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iS == 0) {
            iS = s(context, "com.crashlytics.android.build_id", "string");
        }
        if (iS != 0) {
            return context.getResources().getString(iS);
        }
        return null;
    }

    public static boolean q(Context context) {
        return (A(context) || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static String r(Context context) throws Resources.NotFoundException {
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i2);
            return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int s(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, r(context));
    }

    public static SharedPreferences t(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String u(Context context, String str) {
        int iS = s(context, str, "string");
        return iS > 0 ? context.getString(iS) : "";
    }

    public static synchronized long v() {
        if (f12357b == -1) {
            long jG = 0;
            String strI = i(new File("/proc/meminfo"), "MemTotal");
            if (!TextUtils.isEmpty(strI)) {
                String upperCase = strI.toUpperCase(Locale.US);
                try {
                    if (upperCase.endsWith("KB")) {
                        jG = g(upperCase, "KB", Spliterator.IMMUTABLE);
                    } else if (upperCase.endsWith("MB")) {
                        jG = g(upperCase, "MB", 1048576);
                    } else if (upperCase.endsWith("GB")) {
                        jG = g(upperCase, "GB", 1073741824);
                    } else {
                        com.google.firebase.crashlytics.d.b.f().b("Unexpected meminfo format while computing RAM: " + upperCase);
                    }
                } catch (NumberFormatException e2) {
                    com.google.firebase.crashlytics.d.b.f().e("Unexpected meminfo format while computing RAM: " + upperCase, e2);
                }
            }
            f12357b = jG;
        }
        return f12357b;
    }

    private static String w(String str, String str2) {
        return x(str.getBytes(), str2);
    }

    private static String x(byte[] bArr, String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return y(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            com.google.firebase.crashlytics.d.b.f().e("Could not create hashing algorithm: " + str + ", returning empty string.", e2);
            return "";
        }
    }

    public static String y(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = a;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    public static boolean z() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }
}