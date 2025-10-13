package com.google.android.gms.auth.api.signin.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* loaded from: classes.dex */
public class a {
    private static final Lock a = new ReentrantLock();

    /* renamed from: b */
    @GuardedBy("sLk")
    private static a f4519b;

    /* renamed from: c */
    private final Lock f4520c = new ReentrantLock();

    /* renamed from: d */
    @GuardedBy("mLk")
    private final SharedPreferences f4521d;

    private a(Context context) {
        this.f4521d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        p.j(context);
        Lock lock = a;
        lock.lock();
        try {
            if (f4519b == null) {
                f4519b = new a(context.getApplicationContext());
            }
            a aVar = f4519b;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    private static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    private final GoogleSignInAccount d(String str) {
        String strE;
        if (!TextUtils.isEmpty(str) && (strE = e(c("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.S(strE);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    private final String e(String str) {
        this.f4520c.lock();
        try {
            return this.f4521d.getString(str, null);
        } finally {
            this.f4520c.unlock();
        }
    }

    @Nullable
    public GoogleSignInAccount b() {
        return d(e("defaultGoogleSignInAccount"));
    }
}