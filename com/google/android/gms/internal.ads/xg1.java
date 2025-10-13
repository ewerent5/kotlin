package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xg1 implements ah1<zg1<Bundle>> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10169b;

    xg1(h52 h52Var, Context context) {
        this.a = h52Var;
        this.f10169b = context;
    }

    public static Bundle a(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i3 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i3 != 0) {
                String[] strArrSplit = strOptString2.split("/");
                int length = strArrSplit.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = strArrSplit[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(strArrSplit[0], 0);
                        str = strArrSplit[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i4 = i3 - 1;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    final /* synthetic */ zg1 b() {
        String str = (String) c.c().b(w3.k4);
        if (!TextUtils.isEmpty(str)) {
            try {
                final Bundle bundleA = a(this.f10169b, new JSONArray(str));
                return new zg1(bundleA) { // from class: com.google.android.gms.internal.ads.wg1
                    private final Bundle a;

                    {
                        this.a = bundleA;
                    }

                    @Override // com.google.android.gms.internal.ads.zg1
                    public final void a(Object obj) {
                        ((Bundle) obj).putBundle("shared_pref", this.a);
                    }
                };
            } catch (JSONException e2) {
                er.zze("JSON parsing error", e2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<zg1<Bundle>> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.vg1
            private final xg1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b();
            }
        });
    }
}