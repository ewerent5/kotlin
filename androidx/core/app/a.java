package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* compiled from: ActivityCompat.java */
/* loaded from: classes.dex */
public class a extends androidx.core.content.a {

    /* renamed from: c, reason: collision with root package name */
    private static c f819c;

    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    class RunnableC0007a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String[] f820e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f821f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f822g;

        RunnableC0007a(String[] strArr, Activity activity, int i2) {
            this.f820e = strArr;
            this.f821f = activity;
            this.f822g = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f820e.length];
            PackageManager packageManager = this.f821f.getPackageManager();
            String packageName = this.f821f.getPackageName();
            int length = this.f820e.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f820e[i2], packageName);
            }
            ((b) this.f821f).onRequestPermissionsResult(this.f822g, this.f820e, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    public interface b {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    public interface c {
        boolean a(Activity activity, int i2, int i3, Intent intent);

        boolean b(Activity activity, String[] strArr, int i2);
    }

    /* compiled from: ActivityCompat.java */
    public interface d {
        void b(int i2);
    }

    public static void j(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static c k() {
        return f819c;
    }

    public static void l(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            if (androidx.core.app.c.i(activity)) {
                return;
            }
            activity.recreate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(Activity activity, String[] strArr, int i2) {
        c cVar = f819c;
        if (cVar == null || !cVar.b(activity, strArr, i2)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof d) {
                    ((d) activity).b(i2);
                }
                activity.requestPermissions(strArr, i2);
            } else if (activity instanceof b) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0007a(strArr, activity, i2));
            }
        }
    }

    public static <T extends View> T n(Activity activity, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) activity.requireViewById(i2);
        }
        T t = (T) activity.findViewById(i2);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static boolean o(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void p(Activity activity, Intent intent, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i2, bundle);
        } else {
            activity.startActivityForResult(intent, i2);
        }
    }
}