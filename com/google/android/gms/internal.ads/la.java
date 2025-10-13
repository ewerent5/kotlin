package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class la {
    public static final Intent a(Uri uri, Context context, ip2 ip2Var, View view) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final ResolveInfo b(Intent intent, Context context, ip2 ip2Var, View view) {
        return c(intent, new ArrayList(), context, ip2Var, view);
    }

    public static final ResolveInfo c(Intent intent, ArrayList<ResolveInfo> arrayList, Context context, ip2 ip2Var, View view) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable th) {
            zzs.zzg().g(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= listQueryIntentActivities.size()) {
                    break;
                }
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                    resolveInfo = resolveInfoResolveActivity;
                    break;
                }
                i2++;
            }
        }
        arrayList.addAll(listQueryIntentActivities);
        return resolveInfo;
    }

    public static final Intent d(Intent intent, ResolveInfo resolveInfo, Context context, ip2 ip2Var, View view) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }
}