package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.m12;
import com.google.android.gms.internal.ads.t02;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.xo1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzbn {
    public static boolean zza(int i2) {
        if (((Boolean) c.c().b(w3.Q1)).booleanValue()) {
            return ((Boolean) c.c().b(w3.R1)).booleanValue() || i2 <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016f A[Catch: JSONException -> 0x0174, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0174, blocks: (B:93:0x013b, B:110:0x0166, B:111:0x016a, B:112:0x016f), top: B:119:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0144  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0175 -> B:118:0x017a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject zzb(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbn.zzb(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject zzc(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) c.c().b(w3.f5)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzs.zzc();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    if (parent != null) {
                        z = true;
                    }
                    jSONObject.put("contained_in_scroll_view", z);
                } else {
                    com.google.android.gms.ads.internal.zzs.zzc();
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject zzd(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzs.zzc();
            jSONObject.put("can_show_on_lock_screen", zzr.zzt(view));
            com.google.android.gms.ads.internal.zzs.zzc();
            jSONObject.put("is_keyguard_locked", zzr.zzF(context));
        } catch (JSONException unused) {
            er.zzi("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject zze(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map.Entry<String, WeakReference<View>> entry;
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] iArrZzg = zzg(view);
        Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, WeakReference<View>> next = it.next();
            View view2 = next.getValue().get();
            if (view2 != null) {
                int[] iArrZzg2 = zzg(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", ta3.a().a(context, view2.getMeasuredWidth()));
                        jSONObject5.put("height", ta3.a().a(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", ta3.a().a(context, iArrZzg2[0] - iArrZzg[0]));
                        jSONObject5.put("y", ta3.a().a(context, iArrZzg2[1] - iArrZzg[1]));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = zzk(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", ta3.a().a(context, iArrZzg2[0] - iArrZzg[0]));
                            jSONObject2.put("y", ta3.a().a(context, iArrZzg2[1] - iArrZzg[1]));
                            jSONObject2.put("relative_to", "ad_view");
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            entry = next;
                            jSONObject4.put("font_size", textView.getTextSize());
                            jSONObject4.put("text", textView.getText());
                        } else {
                            entry = next;
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                        try {
                            jSONObject.put(entry.getKey(), jSONObject4);
                        } catch (JSONException unused) {
                            er.zzi("Unable to get asset views information");
                            jSONObject3 = jSONObject;
                            it = it2;
                        }
                    } catch (JSONException unused2) {
                        jSONObject = jSONObject6;
                    }
                } catch (JSONException unused3) {
                    jSONObject = jSONObject3;
                }
                jSONObject3 = jSONObject;
                it = it2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject zzf(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", ta3.a().a(context, point2.x));
                    jSONObject3.put("y", ta3.a().a(context, point2.y));
                    jSONObject3.put("start_x", ta3.a().a(context, point.x));
                    jSONObject3.put("start_y", ta3.a().a(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e2) {
                    er.zzg("Error occurred while putting signals into JSON object.", e2);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e3) {
                e = e3;
                jSONObject = jSONObject2;
                er.zzg("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static int[] zzg(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zzh(MotionEvent motionEvent, View view) {
        int[] iArrZzg = zzg(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - iArrZzg[0], ((int) motionEvent.getRawY()) - iArrZzg[1]);
    }

    public static boolean zzi(Context context, xo1 xo1Var) {
        if (!xo1Var.I) {
            return false;
        }
        if (((Boolean) c.c().b(w3.g5)).booleanValue()) {
            return ((Boolean) c.c().b(w3.j5)).booleanValue();
        }
        String str = (String) c.c().b(w3.h5);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator<String> it = m12.a(t02.b(';')).b(str).iterator();
            while (it.hasNext()) {
                if (it.next().equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static WindowManager.LayoutParams zzj() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) c.c().b(w3.i5)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    private static JSONObject zzk(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", ta3.a().a(context, rect.right - rect.left));
        jSONObject.put("height", ta3.a().a(context, rect.bottom - rect.top));
        jSONObject.put("x", ta3.a().a(context, rect.left));
        jSONObject.put("y", ta3.a().a(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}