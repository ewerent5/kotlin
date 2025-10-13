package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.i;
import com.google.android.material.textfield.TextInputLayout;
import e.c.b.c.f;
import e.c.b.c.h;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: e, reason: collision with root package name */
    private final Chip f11874e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout f11875f;

    /* renamed from: g, reason: collision with root package name */
    private final EditText f11876g;

    /* renamed from: h, reason: collision with root package name */
    private TextWatcher f11877h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f11878i;

    private class b extends i {
        private b() {
        }

        @Override // com.google.android.material.internal.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f11874e.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f11874e.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return c.a(getResources(), charSequence);
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f11876g.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f11874e.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f11874e.setChecked(z);
        this.f11876g.setVisibility(z ? 0 : 4);
        this.f11874e.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            this.f11876g.requestFocus();
            if (TextUtils.isEmpty(this.f11876g.getText())) {
                return;
            }
            EditText editText = this.f11876g;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f11874e.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        this.f11874e.setTag(i2, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f11874e.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(h.f15225k, (ViewGroup) this, false);
        this.f11874e = chip;
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(h.f15226l, (ViewGroup) this, false);
        this.f11875f = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f11876g = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f11877h = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f11878i = (TextView) findViewById(f.f15213l);
        editText.setSaveEnabled(false);
    }
}