package com.parizene.netmonitor.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import com.parizene.netmonitor.R;

/* loaded from: classes3.dex */
public class LabelWithTextView extends androidx.appcompat.widget.z {

    /* renamed from: i, reason: collision with root package name */
    private String f13737i;

    public LabelWithTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(context, attributeSet, 0);
    }

    private void g(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.parizene.netmonitor.c0.x0, i2, 0);
        this.f13737i = typedArrayObtainStyledAttributes.getString(0) + " ";
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setText(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f13737i);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(getContext(), R.style.label_text), 0, this.f13737i.length(), 33);
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(getContext(), R.style.value_text), this.f13737i.length(), this.f13737i.length() + str.length(), 33);
        super.setText(spannableStringBuilder);
    }
}