package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import e.c.b.c.j;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes.dex */
class i extends e {

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f11866d;

    /* renamed from: e, reason: collision with root package name */
    private final TextInputLayout.f f11867e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.g f11868f;

    /* compiled from: PasswordToggleEndIconDelegate.java */
    class a extends com.google.android.material.internal.i {
        a() {
        }

        @Override // com.google.android.material.internal.i, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            i.this.f11845c.setChecked(!r1.g());
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            i.this.f11845c.setChecked(!r4.g());
            editText.removeTextChangedListener(i.this.f11866d);
            editText.addTextChangedListener(i.this.f11866d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    class c implements TextInputLayout.g {

        /* compiled from: PasswordToggleEndIconDelegate.java */
        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ EditText f11870e;

            a(EditText editText) {
                this.f11870e = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f11870e.removeTextChangedListener(i.this.f11866d);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = i.this.a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (i.this.g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            i.this.a.V();
        }
    }

    i(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f11866d = new a();
        this.f11867e = new b();
        this.f11868f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText editText = this.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.a.setEndIconDrawable(c.a.k.a.a.d(this.f11844b, e.c.b.c.e.a));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.t));
        this.a.setEndIconOnClickListener(new d());
        this.a.e(this.f11867e);
        this.a.f(this.f11868f);
        EditText editText = this.a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}