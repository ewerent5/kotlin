package e.c.b.b.c.e;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class h2 implements l2 {
    private static final Map<Uri, h2> a = new c.e.a();

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f14579b = {Action.KEY_ATTRIBUTE, "value"};

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f14580c;

    /* renamed from: d, reason: collision with root package name */
    private final Uri f14581d;

    /* renamed from: e, reason: collision with root package name */
    private final ContentObserver f14582e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f14583f;

    /* renamed from: g, reason: collision with root package name */
    private volatile Map<String, String> f14584g;

    /* renamed from: h, reason: collision with root package name */
    private final List<i2> f14585h;

    private h2(ContentResolver contentResolver, Uri uri) {
        j2 j2Var = new j2(this, null);
        this.f14582e = j2Var;
        this.f14583f = new Object();
        this.f14585h = new ArrayList();
        q3.b(contentResolver);
        q3.b(uri);
        this.f14580c = contentResolver;
        this.f14581d = uri;
        contentResolver.registerContentObserver(uri, false, j2Var);
    }

    public static h2 a(ContentResolver contentResolver, Uri uri) {
        h2 h2Var;
        synchronized (h2.class) {
            Map<Uri, h2> map = a;
            h2Var = map.get(uri);
            if (h2Var == null) {
                try {
                    h2 h2Var2 = new h2(contentResolver, uri);
                    try {
                        map.put(uri, h2Var2);
                    } catch (SecurityException unused) {
                    }
                    h2Var = h2Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return h2Var;
    }

    static synchronized void d() {
        for (h2 h2Var : a.values()) {
            h2Var.f14580c.unregisterContentObserver(h2Var.f14582e);
        }
        a.clear();
    }

    private final Map<String, String> f() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) k2.a(new n2(this) { // from class: e.c.b.b.c.e.g2
                    private final h2 a;

                    {
                        this.a = this;
                    }

                    @Override // e.c.b.b.c.e.n2
                    public final Object zza() {
                        return this.a.e();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public final Map<String, String> b() {
        Map<String, String> mapF = this.f14584g;
        if (mapF == null) {
            synchronized (this.f14583f) {
                mapF = this.f14584g;
                if (mapF == null) {
                    mapF = f();
                    this.f14584g = mapF;
                }
            }
        }
        return mapF != null ? mapF : Collections.emptyMap();
    }

    public final void c() {
        synchronized (this.f14583f) {
            this.f14584g = null;
            w2.g();
        }
        synchronized (this) {
            Iterator<i2> it = this.f14585h.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }

    final /* synthetic */ Map e() {
        Cursor cursorQuery = this.f14580c.query(this.f14581d, f14579b, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new c.e.a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return aVar;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // e.c.b.b.c.e.l2
    public final /* synthetic */ Object zza(String str) {
        return b().get(str);
    }
}