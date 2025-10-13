package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.zzak;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yr0 extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private final zzak f10468e;

    public yr0(Context context, View view, zzak zzakVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f10468e = zzakVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f10468e.zza(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            KeyEvent.Callback childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof ew)) {
                arrayList.add((ew) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ew) arrayList.get(i3)).destroy();
        }
    }
}