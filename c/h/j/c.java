package c.h.j;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public class c implements Spannable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f3084e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Spannable f3085f;

    /* renamed from: g, reason: collision with root package name */
    private final a f3086g;

    /* renamed from: h, reason: collision with root package name */
    private final PrecomputedText f3087h;

    public a a() {
        return this.f3086g;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f3085f;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f3085f.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3085f.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3085f.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3085f.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f3087h.getSpans(i2, i3, cls) : (T[]) this.f3085f.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3085f.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f3085f.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3087h.removeSpan(obj);
        } else {
            this.f3085f.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3087h.setSpan(obj, i2, i3, i4);
        } else {
            this.f3085f.setSpan(obj, i2, i3, i4);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f3085f.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3085f.toString();
    }

    /* compiled from: PrecomputedTextCompat.java */
    public static final class a {
        private final TextPaint a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f3088b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3089c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3090d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f3091e;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: c.h.j.c$a$a, reason: collision with other inner class name */
        public static class C0054a {
            private final TextPaint a;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f3092b;

            /* renamed from: c, reason: collision with root package name */
            private int f3093c;

            /* renamed from: d, reason: collision with root package name */
            private int f3094d;

            public C0054a(TextPaint textPaint) {
                this.a = textPaint;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    this.f3093c = 1;
                    this.f3094d = 1;
                } else {
                    this.f3094d = 0;
                    this.f3093c = 0;
                }
                if (i2 >= 18) {
                    this.f3092b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f3092b = null;
                }
            }

            public a a() {
                return new a(this.a, this.f3092b, this.f3093c, this.f3094d);
            }

            public C0054a b(int i2) {
                this.f3093c = i2;
                return this;
            }

            public C0054a c(int i2) {
                this.f3094d = i2;
                return this;
            }

            public C0054a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3092b = textDirectionHeuristic;
                return this;
            }
        }

        @SuppressLint({"NewApi"})
        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3091e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f3091e = null;
            }
            this.a = textPaint;
            this.f3088b = textDirectionHeuristic;
            this.f3089c = i2;
            this.f3090d = i3;
        }

        public boolean a(a aVar) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 23 && (this.f3089c != aVar.b() || this.f3090d != aVar.c())) || this.a.getTextSize() != aVar.e().getTextSize() || this.a.getTextScaleX() != aVar.e().getTextScaleX() || this.a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((i2 >= 21 && (this.a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                if (!this.a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i2 >= 17 && !this.a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.a.getTypeface() == null ? aVar.e().getTypeface() == null : this.a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f3089c;
        }

        public int c() {
            return this.f3090d;
        }

        public TextDirectionHeuristic d() {
            return this.f3088b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar)) {
                return Build.VERSION.SDK_INT < 18 || this.f3088b == aVar.d();
            }
            return false;
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            return i2 >= 24 ? c.h.k.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f3088b, Integer.valueOf(this.f3089c), Integer.valueOf(this.f3090d)) : i2 >= 21 ? c.h.k.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f3088b, Integer.valueOf(this.f3089c), Integer.valueOf(this.f3090d)) : i2 >= 18 ? c.h.k.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.f3088b, Integer.valueOf(this.f3089c), Integer.valueOf(this.f3090d)) : i2 >= 17 ? c.h.k.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.f3088b, Integer.valueOf(this.f3089c), Integer.valueOf(this.f3090d)) : c.h.k.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.f3088b, Integer.valueOf(this.f3089c), Integer.valueOf(this.f3090d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.a.getTextSize());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                sb.append(", letterSpacing=" + this.a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            }
            if (i2 >= 24) {
                sb.append(", textLocale=" + this.a.getTextLocales());
            } else if (i2 >= 17) {
                sb.append(", textLocale=" + this.a.getTextLocale());
            }
            sb.append(", typeface=" + this.a.getTypeface());
            if (i2 >= 26) {
                sb.append(", variationSettings=" + this.a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f3088b);
            sb.append(", breakStrategy=" + this.f3089c);
            sb.append(", hyphenationFrequency=" + this.f3090d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.f3088b = params.getTextDirection();
            this.f3089c = params.getBreakStrategy();
            this.f3090d = params.getHyphenationFrequency();
            this.f3091e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}