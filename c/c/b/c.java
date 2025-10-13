package c.c.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class c {
    public final Intent a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f2663b;

    /* compiled from: CustomTabsIntent.java */
    public static final class a {
        private final Intent a;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<Bundle> f2664b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f2665c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList<Bundle> f2666d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2667e;

        public a() {
            this(null);
        }

        public c a() {
            ArrayList<Bundle> arrayList = this.f2664b;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f2666d;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f2667e);
            return new c(this.a, this.f2665c);
        }

        public a(e eVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.a = intent;
            this.f2664b = null;
            this.f2665c = null;
            this.f2666d = null;
            this.f2667e = true;
            if (eVar != null) {
                intent.setPackage(eVar.b().getPackageName());
            }
            Bundle bundle = new Bundle();
            androidx.core.app.e.a(bundle, "android.support.customtabs.extra.SESSION", eVar != null ? eVar.a() : null);
            intent.putExtras(bundle);
        }
    }

    c(Intent intent, Bundle bundle) {
        this.a = intent;
        this.f2663b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        androidx.core.content.a.i(context, this.a, this.f2663b);
    }
}