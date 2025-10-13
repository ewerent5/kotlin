package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class xq {
    public static final Handler a = new l02(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private static final String f10217b = AdView.class.getName();

    /* renamed from: c, reason: collision with root package name */
    private static final String f10218c = InterstitialAd.class.getName();

    /* renamed from: d, reason: collision with root package name */
    private static final String f10219d = AdManagerAdView.class.getName();

    /* renamed from: e, reason: collision with root package name */
    private static final String f10220e = AdManagerInterstitialAd.class.getName();

    /* renamed from: f, reason: collision with root package name */
    private static final String f10221f = SearchAdView.class.getName();

    /* renamed from: g, reason: collision with root package name */
    private static final String f10222g = AdLoader.class.getName();

    /* renamed from: h, reason: collision with root package name */
    private float f10223h = -1.0f;

    public static String d(String str) throws NoSuchAlgorithmException {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static String f() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public static Throwable g(Throwable th) {
        if (r5.f8583f.e().booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (i(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    public static AdSize h(Context context, int i2, int i3, int i4) {
        int iJ = j(context, i4);
        if (iJ == -1) {
            return AdSize.INVALID;
        }
        return new AdSize(i2, Math.max(Math.min(i2 > 655 ? Math.round((i2 / 728.0f) * 90.0f) : i2 > 632 ? 81 : i2 > 526 ? Math.round((i2 / 468.0f) * 60.0f) : i2 > 432 ? 68 : Math.round((i2 / 320.0f) * 50.0f), Math.min(90, Math.round(iJ * 0.15f))), 50));
    }

    public static boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(r5.f8581d.e());
    }

    public static int j(Context context, int i2) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i3 = configuration.orientation;
        if (i2 == 0) {
            i2 = i3;
        }
        return i2 == i3 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static final int k(DisplayMetrics displayMetrics, int i2) {
        return (int) TypedValue.applyDimension(1, i2, displayMetrics);
    }

    public static final String l(StackTraceElement[] stackTraceElementArr, String str) {
        int i2;
        String className;
        int i3 = 0;
        while (true) {
            i2 = i3 + 1;
            if (i2 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f10217b.equalsIgnoreCase(className2) || f10218c.equalsIgnoreCase(className2) || f10219d.equalsIgnoreCase(className2) || f10220e.equalsIgnoreCase(className2) || f10221f.equalsIgnoreCase(className2) || f10222g.equalsIgnoreCase(className2))) {
                break;
            }
            i3 = i2;
        }
        className = stackTraceElementArr[i2].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                int i4 = 2;
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                    i4 = i5;
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final boolean m() {
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean n(Context context, int i2) {
        return com.google.android.gms.common.f.f().h(context, i2) == 0;
    }

    public static final boolean o(Context context) {
        int iH = com.google.android.gms.common.f.f().h(context, 12451000);
        return iH == 0 || iH == 2;
    }

    public static final boolean p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int q(DisplayMetrics displayMetrics, int i2) {
        return Math.round(i2 / displayMetrics.density);
    }

    public static final void r(Context context, String str, String str2, Bundle bundle, boolean z, wq wqVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int iA = com.google.android.gms.common.f.f().a(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(iA);
            sb.append(".210890000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        wqVar.zza(builderAppendQueryParameter.toString());
    }

    public static final int s(Context context, int i2) {
        return k(context.getResources().getDisplayMetrics(), i2);
    }

    public static final String t(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || m()) {
            string = "emulator";
        }
        return d(string);
    }

    private static final void u(ViewGroup viewGroup, r93 r93Var, String str, int i2, int i3) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i2);
        textView.setBackgroundColor(i3);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i2);
        int iS = s(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(r93Var.f8620j - iS, r93Var.f8617g - iS, 17));
        viewGroup.addView(frameLayout, r93Var.f8620j, r93Var.f8617g);
    }

    public final int a(Context context, int i2) {
        if (this.f10223h < 0.0f) {
            synchronized (this) {
                if (this.f10223h < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f10223h = displayMetrics.density;
                }
            }
        }
        return Math.round(i2 / this.f10223h);
    }

    public final void b(ViewGroup viewGroup, r93 r93Var, String str, String str2) {
        if (str2 != null) {
            er.zzi(str2);
        }
        u(viewGroup, r93Var, str, -65536, -16777216);
    }

    public final void c(ViewGroup viewGroup, r93 r93Var, String str) {
        u(viewGroup, r93Var, "Ads by Google", -16777216, -1);
    }

    public final void e(Context context, String str, String str2, Bundle bundle, boolean z) {
        r(context, str, "gmob-apps", bundle, true, new vq(this));
    }
}