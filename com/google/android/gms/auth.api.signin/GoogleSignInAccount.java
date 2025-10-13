package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b();

    /* renamed from: e */
    private static f f4510e = i.d();

    /* renamed from: f */
    private final int f4511f;

    /* renamed from: g */
    private String f4512g;

    /* renamed from: h */
    private String f4513h;

    /* renamed from: i */
    private String f4514i;

    /* renamed from: j */
    private String f4515j;

    /* renamed from: k */
    private Uri f4516k;

    /* renamed from: l */
    private String f4517l;

    /* renamed from: m */
    private long f4518m;
    private String n;
    private List<Scope> o;
    private String p;
    private String q;
    private Set<Scope> r = new HashSet();

    GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f4511f = i2;
        this.f4512g = str;
        this.f4513h = str2;
        this.f4514i = str3;
        this.f4515j = str4;
        this.f4516k = uri;
        this.f4517l = str5;
        this.f4518m = j2;
        this.n = str6;
        this.o = list;
        this.p = str7;
        this.q = str8;
    }

    public static GoogleSignInAccount S(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl", null);
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j2 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount googleSignInAccountU = U(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), uri, Long.valueOf(j2), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountU.f4517l = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccountU;
    }

    private static GoogleSignInAccount U(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l2 == null ? Long.valueOf(f4510e.a() / 1000) : l2).longValue(), p.f(str7), new ArrayList((Collection) p.j(set)), str5, str6);
    }

    public String I() {
        return this.f4515j;
    }

    public String J() {
        return this.f4514i;
    }

    public String K() {
        return this.q;
    }

    public String L() {
        return this.p;
    }

    public String M() {
        return this.f4512g;
    }

    public String O() {
        return this.f4513h;
    }

    public Uri P() {
        return this.f4516k;
    }

    public Set<Scope> Q() {
        HashSet hashSet = new HashSet(this.o);
        hashSet.addAll(this.r);
        return hashSet;
    }

    public String R() {
        return this.f4517l;
    }

    public Account c() {
        if (this.f4514i == null) {
            return null;
        }
        return new Account(this.f4514i, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.n.equals(this.n) && googleSignInAccount.Q().equals(Q());
    }

    public int hashCode() {
        return ((this.n.hashCode() + 527) * 31) + Q().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.m(parcel, 1, this.f4511f);
        c.s(parcel, 2, M(), false);
        c.s(parcel, 3, O(), false);
        c.s(parcel, 4, J(), false);
        c.s(parcel, 5, I(), false);
        c.r(parcel, 6, P(), i2, false);
        c.s(parcel, 7, R(), false);
        c.p(parcel, 8, this.f4518m);
        c.s(parcel, 9, this.n, false);
        c.w(parcel, 10, this.o, false);
        c.s(parcel, 11, L(), false);
        c.s(parcel, 12, K(), false);
        c.b(parcel, iA);
    }
}