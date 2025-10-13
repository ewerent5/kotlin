package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
final class x {
    private TextView a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f614b;

    x(TextView textView) {
        this.a = (TextView) c.h.k.h.c(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f614b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f614b = textClassifier;
    }
}