package j$.util;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class StringJoiner {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16006b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16007c;

    /* renamed from: d, reason: collision with root package name */
    private StringBuilder f16008d;

    /* renamed from: e, reason: collision with root package name */
    private String f16009e;

    public StringJoiner(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Objects.requireNonNull(charSequence2, "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull(charSequence3, "The suffix must not be null");
        String string = charSequence2.toString();
        this.a = string;
        this.f16006b = charSequence.toString();
        String string2 = charSequence3.toString();
        this.f16007c = string2;
        this.f16009e = string + string2;
    }

    public StringJoiner add(CharSequence charSequence) {
        StringBuilder sb = this.f16008d;
        if (sb != null) {
            sb.append(this.f16006b);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.a);
            this.f16008d = sb2;
        }
        this.f16008d.append(charSequence);
        return this;
    }

    public String toString() {
        if (this.f16008d == null) {
            return this.f16009e;
        }
        if (this.f16007c.equals("")) {
            return this.f16008d.toString();
        }
        int length = this.f16008d.length();
        StringBuilder sb = this.f16008d;
        sb.append(this.f16007c);
        String string = sb.toString();
        this.f16008d.setLength(length);
        return string;
    }
}