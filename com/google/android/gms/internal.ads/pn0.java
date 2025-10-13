package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public interface pn0 extends View.OnClickListener, View.OnTouchListener {
    FrameLayout R();

    void U(String str, View view, boolean z);

    View Y();

    e.c.b.b.b.b a();

    w13 zzh();

    Map<String, WeakReference<View>> zzj();

    Map<String, WeakReference<View>> zzk();

    Map<String, WeakReference<View>> zzl();

    View zzm(String str);

    String zzn();

    JSONObject zzp();
}