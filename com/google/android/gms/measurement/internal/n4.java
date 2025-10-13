package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class n4 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f11051b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11052c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f11053d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ i4 f11054e;

    public n4(i4 i4Var, String str, Bundle bundle) {
        this.f11054e = i4Var;
        com.google.android.gms.common.internal.p.f(str);
        this.a = str;
        this.f11051b = new Bundle();
    }

    private final String c(Bundle bundle) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str);
                    jSONObject.put("v", String.valueOf(obj));
                    if (obj instanceof String) {
                        jSONObject.put("t", "s");
                    } else if (obj instanceof Long) {
                        jSONObject.put("t", "l");
                    } else if (obj instanceof Double) {
                        jSONObject.put("t", DateTokenConverter.CONVERTER_KEY);
                    } else {
                        this.f11054e.zzq().A().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e2) {
                    this.f11054e.zzq().A().b("Cannot serialize bundle value to SharedPreferences", e2);
                }
            }
        }
        return jSONArray.toString();
    }

    public final Bundle a() {
        if (!this.f11052c) {
            this.f11052c = true;
            String string = this.f11054e.z().getString(this.a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            char c2 = 65535;
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode == 115 && string3.equals("s")) {
                                        c2 = 0;
                                    }
                                } else if (string3.equals("l")) {
                                    c2 = 2;
                                }
                            } else if (string3.equals(DateTokenConverter.CONVERTER_KEY)) {
                                c2 = 1;
                            }
                            if (c2 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c2 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c2 != 2) {
                                this.f11054e.zzq().A().b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f11054e.zzq().A().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f11053d = bundle;
                } catch (JSONException unused2) {
                    this.f11054e.zzq().A().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f11053d == null) {
                this.f11053d = this.f11051b;
            }
        }
        return this.f11053d;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = this.f11054e.z().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(this.a);
        } else {
            editorEdit.putString(this.a, c(bundle));
        }
        editorEdit.apply();
        this.f11053d = bundle;
    }
}