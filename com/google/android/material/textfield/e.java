package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: EndIconDelegate.java */
/* loaded from: classes.dex */
abstract class e {
    TextInputLayout a;

    /* renamed from: b, reason: collision with root package name */
    Context f11844b;

    /* renamed from: c, reason: collision with root package name */
    CheckableImageButton f11845c;

    e(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        this.f11844b = textInputLayout.getContext();
        this.f11845c = textInputLayout.getEndIconView();
    }

    abstract void a();

    boolean b(int i2) {
        return true;
    }

    void c(boolean z) {
    }

    boolean d() {
        return false;
    }
}