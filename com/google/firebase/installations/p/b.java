package com.google.firebase.installations.p;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* compiled from: IidStore.java */
/* loaded from: classes.dex */
public class b {
    private static final String[] a = {Marker.ANY_MARKER, "FCM", "GCM", ""};

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f12825b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12826c;

    public b(com.google.firebase.c cVar) {
        this.f12825b = cVar.g().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f12826c = b(cVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(com.google.firebase.c cVar) {
        String strD = cVar.j().d();
        if (strD != null) {
            return strD;
        }
        String strC = cVar.j().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + SyslogConstants.LOG_ALERT) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored " + e2);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f12825b) {
            string = this.f12825b.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f12825b) {
            String string = this.f12825b.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey publicKeyE = e(string);
            if (publicKeyE == null) {
                return null;
            }
            return c(publicKeyE);
        }
    }

    public String f() {
        synchronized (this.f12825b) {
            String strG = g();
            if (strG != null) {
                return strG;
            }
            return h();
        }
    }

    public String i() {
        synchronized (this.f12825b) {
            for (String str : a) {
                String string = this.f12825b.getString(a(this.f12826c, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}