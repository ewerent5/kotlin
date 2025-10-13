package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public interface cm0 {
    void O(String str);

    void a(View view, MotionEvent motionEvent, View view2);

    void b(s0 s0Var);

    void c(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void d(View view, Map<String, WeakReference<View>> map);

    void e(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    JSONObject f(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void g(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void h(View view);

    void i(l8 l8Var);

    boolean j(Bundle bundle);

    void k(Bundle bundle);

    void l(Bundle bundle);

    void m(w0 w0Var);

    void n(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z);

    void zzg();

    boolean zzh();

    void zzm();

    void zzp();

    void zzs();

    void zzu();

    void zzw();
}