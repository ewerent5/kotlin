package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton.java */
/* loaded from: classes.dex */
public class b0 extends ToggleButton {

    /* renamed from: e, reason: collision with root package name */
    private final y f424e;

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public b0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r0.a(this, getContext());
        y yVar = new y(this);
        this.f424e = yVar;
        yVar.m(attributeSet, i2);
    }
}