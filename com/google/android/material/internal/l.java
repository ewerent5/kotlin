package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

/* compiled from: VisibilityAwareImageButton.java */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class l extends ImageButton {

    /* renamed from: e, reason: collision with root package name */
    private int f11717e;

    public final void b(int i2, boolean z) {
        super.setVisibility(i2);
        if (z) {
            this.f11717e = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.f11717e;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        b(i2, true);
    }
}