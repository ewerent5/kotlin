package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;

/* compiled from: NoEndIconDelegate.java */
/* loaded from: classes.dex */
class h extends e {
    h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.a.setEndIconOnClickListener(null);
        this.a.setEndIconDrawable((Drawable) null);
        this.a.setEndIconContentDescription((CharSequence) null);
    }
}