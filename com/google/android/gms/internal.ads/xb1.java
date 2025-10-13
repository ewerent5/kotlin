package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzs;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xb1 implements zg1<Bundle> {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final r93 f10153b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Parcelable> f10154c;

    public xb1(Context context, r93 r93Var, List<Parcelable> list) {
        this.a = context;
        this.f10153b = r93Var;
        this.f10154c = list;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle2 = bundle;
        if (n5.a.e().booleanValue()) {
            Bundle bundle3 = new Bundle();
            zzs.zzc();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                    className = componentName.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle3.putString("activity", className);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("width", this.f10153b.f8619i);
            bundle4.putInt("height", this.f10153b.f8616f);
            bundle3.putBundle("size", bundle4);
            if (this.f10154c.size() > 0) {
                List<Parcelable> list = this.f10154c;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}