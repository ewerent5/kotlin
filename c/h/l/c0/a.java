package c.h.l.c0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: e, reason: collision with root package name */
    private final int f3125e;

    /* renamed from: f, reason: collision with root package name */
    private final c f3126f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3127g;

    public a(int i2, c cVar, int i3) {
        this.f3125e = i2;
        this.f3126f = cVar;
        this.f3127g = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3125e);
        this.f3126f.O(this.f3127g, bundle);
    }
}