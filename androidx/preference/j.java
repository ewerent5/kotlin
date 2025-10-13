package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PreferenceManager.java */
/* loaded from: classes.dex */
public class j {
    private Context a;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f1437c;

    /* renamed from: d, reason: collision with root package name */
    private e f1438d;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences.Editor f1439e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1440f;

    /* renamed from: g, reason: collision with root package name */
    private String f1441g;

    /* renamed from: h, reason: collision with root package name */
    private int f1442h;

    /* renamed from: j, reason: collision with root package name */
    private PreferenceScreen f1444j;

    /* renamed from: k, reason: collision with root package name */
    private d f1445k;

    /* renamed from: l, reason: collision with root package name */
    private c f1446l;

    /* renamed from: m, reason: collision with root package name */
    private a f1447m;
    private b n;

    /* renamed from: b, reason: collision with root package name */
    private long f1436b = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f1443i = 0;

    /* compiled from: PreferenceManager.java */
    public interface a {
        void Q(Preference preference);
    }

    /* compiled from: PreferenceManager.java */
    public interface b {
        void V(PreferenceScreen preferenceScreen);
    }

    /* compiled from: PreferenceManager.java */
    public interface c {
        boolean X(Preference preference);
    }

    /* compiled from: PreferenceManager.java */
    public static abstract class d {
    }

    public j(Context context) {
        this.a = context;
        q(b(context));
    }

    private static String b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    private void l(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f1439e) != null) {
            editor.apply();
        }
        this.f1440f = z;
    }

    public <T extends Preference> T a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f1444j;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.G0(charSequence);
    }

    SharedPreferences.Editor c() {
        if (this.f1438d != null) {
            return null;
        }
        if (!this.f1440f) {
            return j().edit();
        }
        if (this.f1439e == null) {
            this.f1439e = j().edit();
        }
        return this.f1439e;
    }

    long d() {
        long j2;
        synchronized (this) {
            j2 = this.f1436b;
            this.f1436b = 1 + j2;
        }
        return j2;
    }

    public b e() {
        return this.n;
    }

    public c f() {
        return this.f1446l;
    }

    public d g() {
        return this.f1445k;
    }

    public e h() {
        return this.f1438d;
    }

    public PreferenceScreen i() {
        return this.f1444j;
    }

    public SharedPreferences j() {
        if (h() != null) {
            return null;
        }
        if (this.f1437c == null) {
            this.f1437c = (this.f1443i != 1 ? this.a : androidx.core.content.a.b(this.a)).getSharedPreferences(this.f1441g, this.f1442h);
        }
        return this.f1437c;
    }

    public PreferenceScreen k(Context context, int i2, PreferenceScreen preferenceScreen) {
        l(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new i(context, this).d(i2, preferenceScreen);
        preferenceScreen2.P(this);
        l(false);
        return preferenceScreen2;
    }

    public void m(a aVar) {
        this.f1447m = aVar;
    }

    public void n(b bVar) {
        this.n = bVar;
    }

    public void o(c cVar) {
        this.f1446l = cVar;
    }

    public boolean p(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f1444j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.U();
        }
        this.f1444j = preferenceScreen;
        return true;
    }

    public void q(String str) {
        this.f1441g = str;
        this.f1437c = null;
    }

    boolean r() {
        return !this.f1440f;
    }

    public void s(Preference preference) {
        a aVar = this.f1447m;
        if (aVar != null) {
            aVar.Q(preference);
        }
    }
}