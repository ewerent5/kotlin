package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import c.c.b.c;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.p.c;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.n;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.em;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.l02;
import com.google.android.gms.internal.ads.o3;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.v4;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.xo2;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.y42;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzr {
    public static final l02 zza = new zzf(Looper.getMainLooper());

    @GuardedBy("AdUtil.class")
    private static boolean zzd = false;

    @GuardedBy("userAgentLock")
    private String zzg;
    private final AtomicReference<Pattern> zzb = new AtomicReference<>(null);
    private final AtomicReference<Pattern> zzc = new AtomicReference<>(null);
    private boolean zze = true;
    private final Object zzf = new Object();
    private boolean zzh = false;
    private boolean zzi = false;
    private final Executor zzj = Executors.newSingleThreadExecutor();

    public static final WebResourceResponse zzA(Context context, String str, String str2) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.zzs.zzc().zze(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = new zzbe(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e2) {
            er.zzj("Could not fetch MRAID JS.", e2);
        }
        return null;
    }

    public static final String zzB() {
        Resources resourcesF = com.google.android.gms.ads.internal.zzs.zzg().f();
        return resourcesF != null ? resourcesF.getString(R.string.s7) : "Test Ad";
    }

    public static final zzbh zzC(Context context) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                er.zzf("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(iBinder);
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzs.zzg().g(e2, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzD(Context context, String str) {
        Context contextA = em.a(context);
        return c.a(contextA).b(str, contextA.getPackageName()) == 0;
    }

    public static final boolean zzE(String str) {
        if (!dr.j()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.internal.ads.c.c().b(w3.e3)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.internal.ads.c.c().b(w3.g3);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.internal.ads.c.c().b(w3.f3);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(16)
    public static final boolean zzF(Context context) {
        KeyguardManager keyguardManagerZzab;
        return context != null && n.c() && (keyguardManagerZzab = zzab(context)) != null && keyguardManagerZzab.isKeyguardLocked();
    }

    public static final boolean zzG(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            er.zzg("Error loading class.", th);
            com.google.android.gms.ads.internal.zzs.zzg().g(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzH(Context context) {
        boolean z;
        if (n.k()) {
            if (((Boolean) com.google.android.gms.internal.ads.c.c().b(w3.B5)).booleanValue()) {
                synchronized (zzr.class) {
                    z = zzd;
                }
                return z;
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static final boolean zzI(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzJ(Context context) {
        Bundle bundleZzae = zzae(context);
        return TextUtils.isEmpty(zzad(bundleZzae)) && !TextUtils.isEmpty(bundleZzae.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean zzK(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzL(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new zzbo(context, str, (String) it.next()).zzb();
        }
    }

    public static final void zzM(Context context, Throwable th) {
        if (context != null) {
            try {
                if (r5.f8579b.e().booleanValue()) {
                    h.a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void zzN(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final int zzO(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Could not parse value:");
            sb.append(strValueOf);
            er.zzi(sb.toString());
            return 0;
        }
    }

    public static final Map<String, String> zzP(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    public static final WebResourceResponse zzQ(HttpURLConnection httpURLConnection) {
        com.google.android.gms.ads.internal.zzs.zzc();
        String contentType = httpURLConnection.getContentType();
        String strTrim = "";
        String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        com.google.android.gms.ads.internal.zzs.zzc();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] strArrSplit = contentType2.split(";");
            if (strArrSplit.length != 1) {
                int i2 = 1;
                while (true) {
                    if (i2 >= strArrSplit.length) {
                        break;
                    }
                    if (strArrSplit[i2].trim().startsWith("charset")) {
                        String[] strArrSplit2 = strArrSplit[i2].trim().split("=");
                        if (strArrSplit2.length > 1) {
                            strTrim = strArrSplit2[1].trim();
                            break;
                        }
                    }
                    i2++;
                }
            }
        }
        String str = strTrim;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap map = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                map.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return com.google.android.gms.ads.internal.zzs.zze().zzn(strTrim2, str, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map, httpURLConnection.getInputStream());
    }

    public static final int[] zzR(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? zzz() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    protected static final String zzS(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return zzw();
        }
    }

    public static final int[] zzT(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrZzz = (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? zzz() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{ta3.a().a(activity, iArrZzz[0]), ta3.a().a(activity, iArrZzz[1])};
    }

    public static final boolean zzU(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzs.zzc().zze || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzt(view);
        if (view.getVisibility() != 0 || !view.isShown()) {
            return false;
        }
        if ((powerManager == null || powerManager.isScreenOn()) && z) {
            return !((Boolean) com.google.android.gms.internal.ads.c.c().b(w3.P0)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect());
        }
        return false;
    }

    @TargetApi(18)
    public static final void zzV(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzu(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 26);
            sb.append("Opening ");
            sb.append(string);
            sb.append(" in a new browser.");
            er.zzd(sb.toString());
        } catch (ActivityNotFoundException e2) {
            er.zzg("No browser is found.", e2);
        }
    }

    public static final int[] zzW(Activity activity) {
        int[] iArrZzR = zzR(activity);
        return new int[]{ta3.a().a(activity, iArrZzR[0]), ta3.a().a(activity, iArrZzR[1])};
    }

    public static final boolean zzX(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzU(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzab(context));
    }

    private final JSONArray zzY(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            zzZ(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void zzZ(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(zzh((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(zzf((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(zzY((Collection) obj));
            return;
        }
        if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Object obj2 : (Object[]) obj) {
            zzZ(jSONArray2, obj2);
        }
        jSONArray.put(jSONArray2);
    }

    public static int zza(int i2) {
        if (i2 >= 5000) {
            return i2;
        }
        if (i2 <= 0) {
            return CoreConstants.MILLIS_IN_ONE_MINUTE;
        }
        StringBuilder sb = new StringBuilder(97);
        sb.append("HTTP timeout too low: ");
        sb.append(i2);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        er.zzi(sb.toString());
        return CoreConstants.MILLIS_IN_ONE_MINUTE;
    }

    private final void zzaa(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzh((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, zzf((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, zzY((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, zzY(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    private static KeyguardManager zzab(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static boolean zzac(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static String zzad(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private static Bundle zzae(Context context) {
        try {
            return c.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            zze.zzb("Error getting metadata", e2);
            return null;
        }
    }

    public static void zzk(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            qr.a.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzt(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzr.zzt(android.view.View):boolean");
    }

    @TargetApi(18)
    public static final void zzu(Context context, Intent intent) {
        if (intent != null && n.e()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static final String zzv(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzad(zzae(context));
    }

    static final String zzw() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzx() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static final DisplayMetrics zzy(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzz() {
        return new int[]{0, 0};
    }

    public final void zzb(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i2) {
        int iZza = zza(i2);
        StringBuilder sb = new StringBuilder(39);
        sb.append("HTTP timeout: ");
        sb.append(iZza);
        sb.append(" milliseconds.");
        er.zzh(sb.toString());
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        httpURLConnection.setRequestProperty("User-Agent", zze(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzc(Context context) {
        if (this.zzh) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new zzq(this, null), intentFilter);
        this.zzh = true;
        return true;
    }

    public final boolean zzd(Context context) {
        if (this.zzi) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new zzp(this, null), intentFilter);
        this.zzi = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a A[Catch: Exception -> 0x00a9, all -> 0x00c3, TRY_LEAVE, TryCatch #3 {Exception -> 0x00a9, blocks: (B:29:0x0090, B:31:0x009a), top: B:47:0x0090, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zze(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zzf
            monitor-enter(r0)
            java.lang.String r1 = r4.zzg     // Catch: java.lang.Throwable -> Lc3
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            return r1
        L9:
            if (r6 != 0) goto L11
            java.lang.String r5 = zzw()     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            return r5
        L11:
            com.google.android.gms.ads.internal.util.zzac r1 = com.google.android.gms.ads.internal.zzs.zze()     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> Lc3
            java.lang.String r1 = r1.zzb(r5)     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> Lc3
            r4.zzg = r1     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> Lc3
        L1b:
            java.lang.String r1 = r4.zzg     // Catch: java.lang.Throwable -> Lc3
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lc3
            if (r1 == 0) goto L69
            com.google.android.gms.internal.ads.ta3.a()     // Catch: java.lang.Throwable -> Lc3
            boolean r1 = com.google.android.gms.internal.ads.xq.p()     // Catch: java.lang.Throwable -> Lc3
            if (r1 != 0) goto L63
            r1 = 0
            r4.zzg = r1     // Catch: java.lang.Throwable -> Lc3
            com.google.android.gms.internal.ads.l02 r1 = com.google.android.gms.ads.internal.util.zzr.zza     // Catch: java.lang.Throwable -> Lc3
            com.google.android.gms.ads.internal.util.zzm r2 = new com.google.android.gms.ads.internal.util.zzm     // Catch: java.lang.Throwable -> Lc3
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lc3
            r1.post(r2)     // Catch: java.lang.Throwable -> Lc3
        L39:
            java.lang.String r1 = r4.zzg     // Catch: java.lang.Throwable -> Lc3
            if (r1 != 0) goto L69
            java.lang.Object r1 = r4.zzf     // Catch: java.lang.InterruptedException -> L43 java.lang.Throwable -> Lc3
            r1.wait()     // Catch: java.lang.InterruptedException -> L43 java.lang.Throwable -> Lc3
            goto L39
        L43:
            java.lang.String r1 = zzw()     // Catch: java.lang.Throwable -> Lc3
            r4.zzg = r1     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = "Interrupted, use default user agent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc3
            int r3 = r1.length()     // Catch: java.lang.Throwable -> Lc3
            if (r3 == 0) goto L5a
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Lc3
            goto L5f
        L5a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lc3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc3
        L5f:
            com.google.android.gms.internal.ads.er.zzi(r1)     // Catch: java.lang.Throwable -> Lc3
            goto L39
        L63:
            java.lang.String r1 = zzS(r5)     // Catch: java.lang.Throwable -> Lc3
            r4.zzg = r1     // Catch: java.lang.Throwable -> Lc3
        L69:
            java.lang.String r1 = r4.zzg     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc3
            int r2 = r1.length()     // Catch: java.lang.Throwable -> Lc3
            int r2 = r2 + 10
            int r3 = r6.length()     // Catch: java.lang.Throwable -> Lc3
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lc3
            r3.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch: java.lang.Throwable -> Lc3
            r3.append(r6)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> Lc3
            r4.zzg = r6     // Catch: java.lang.Throwable -> Lc3
            com.google.android.gms.common.p.b r5 = com.google.android.gms.common.p.c.a(r5)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            boolean r5 = r5.g()     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            if (r5 == 0) goto Lb3
            java.lang.String r5 = r4.zzg     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            r4.zzg = r5     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            goto Lb3
        La9:
            r5 = move-exception
            com.google.android.gms.internal.ads.oq r6 = com.google.android.gms.ads.internal.zzs.zzg()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.g(r5, r1)     // Catch: java.lang.Throwable -> Lc3
        Lb3:
            java.lang.String r5 = r4.zzg     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> Lc3
            r4.zzg = r5     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            return r5
        Lc3:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzr.zze(android.content.Context, java.lang.String):java.lang.String");
    }

    public final JSONObject zzf(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzaa(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            throw new JSONException(strValueOf.length() != 0 ? "Could not convert map to JSON: ".concat(strValueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final JSONObject zzg(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return zzh(bundle);
        } catch (JSONException e2) {
            er.zzg("Error converting Bundle to JSON", e2);
            return null;
        }
    }

    public final JSONObject zzh(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzaa(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final g52<Map<String, String>> zzi(final Uri uri) {
        return y42.c(new Callable(uri) { // from class: com.google.android.gms.ads.internal.util.zzk
            private final Uri zza;

            {
                this.zza = uri;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = this.zza;
                l02 l02Var = zzr.zza;
                com.google.android.gms.ads.internal.zzs.zzc();
                return zzr.zzP(uri2);
            }
        }, this.zzj);
    }

    public final void zzj(Context context, String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzs.zzc();
        bundle.putString("device", zzx());
        bundle.putString("eids", TextUtils.join(",", w3.c()));
        ta3.a();
        xq.r(context, str, "gmob-apps", bundle, true, new zzn(this, context, str));
    }

    public final boolean zzl(String str) {
        return zzac(str, this.zzb, (String) com.google.android.gms.internal.ads.c.c().b(w3.W));
    }

    public final boolean zzm(String str) {
        return zzac(str, this.zzc, (String) com.google.android.gms.internal.ads.c.c().b(w3.X));
    }

    @TargetApi(26)
    public final void zzn(Context context) {
        if (n.k()) {
            if (((Boolean) com.google.android.gms.internal.ads.c.c().b(w3.B5)).booleanValue()) {
                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzo(this));
            }
        }
    }

    @TargetApi(18)
    public final int zzs(Context context, Uri uri) {
        int i2;
        if (!n.e()) {
            zze.zza("Chrome Custom Tabs can only work with version Jellybean onwards.");
            i2 = 1;
        } else if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            i2 = 3;
        } else if (!(context instanceof Activity)) {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i2 = 2;
        } else if (xo2.a(context) == null) {
            zze.zza("Default browser does not support custom tabs.");
            i2 = 4;
        } else {
            i2 = 0;
        }
        o3<Boolean> o3Var = w3.K2;
        Boolean bool = (Boolean) com.google.android.gms.internal.ads.c.c().b(o3Var);
        o3<Boolean> o3Var2 = w3.L2;
        if (true == bool.equals(com.google.android.gms.internal.ads.c.c().b(o3Var2))) {
            i2 = 9;
        }
        if (i2 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i2;
        }
        if (((Boolean) com.google.android.gms.internal.ads.c.c().b(o3Var)).booleanValue()) {
            v4 v4Var = new v4();
            v4Var.d(new zzl(this, v4Var, context, uri));
            v4Var.e((Activity) context);
        }
        if (!((Boolean) com.google.android.gms.internal.ads.c.c().b(o3Var2)).booleanValue()) {
            return 5;
        }
        new c.a().a().a(context, uri);
        return 5;
    }
}