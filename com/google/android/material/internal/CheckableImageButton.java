package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.m;
import c.h.l.t;

/* loaded from: classes.dex */
public class CheckableImageButton extends m implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f11667g = {R.attr.state_checked};

    /* renamed from: h, reason: collision with root package name */
    private boolean f11668h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11669i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11670j;

    class a extends c.h.l.a {
        a() {
        }

        @Override // c.h.l.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.W(CheckableImageButton.this.a());
            cVar.X(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends c.j.a.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        boolean f11672g;

        static class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f11672g = parcel.readInt() == 1;
        }

        @Override // c.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f11672g ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.B);
    }

    public boolean a() {
        return this.f11669i;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f11668h;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (!this.f11668h) {
            return super.onCreateDrawableState(i2);
        }
        int[] iArr = f11667g;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f11672g);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f11672g = this.f11668h;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f11669i != z) {
            this.f11669i = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f11669i || this.f11668h == z) {
            return;
        }
        this.f11668h = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f11670j = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f11670j) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f11668h);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f11669i = true;
        this.f11670j = true;
        t.k0(this, new a());
    }
}