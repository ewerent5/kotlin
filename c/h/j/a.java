package c.h.j;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: BidiFormatter.java */
/* loaded from: classes.dex */
public final class a {
    static final d a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f3069b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f3070c;

    /* renamed from: d, reason: collision with root package name */
    static final a f3071d;

    /* renamed from: e, reason: collision with root package name */
    static final a f3072e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3073f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3074g;

    /* renamed from: h, reason: collision with root package name */
    private final d f3075h;

    /* compiled from: BidiFormatter.java */
    /* renamed from: c.h.j.a$a, reason: collision with other inner class name */
    public static final class C0053a {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private int f3076b;

        /* renamed from: c, reason: collision with root package name */
        private d f3077c;

        public C0053a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z) {
            return z ? a.f3072e : a.f3071d;
        }

        private void c(boolean z) {
            this.a = z;
            this.f3077c = a.a;
            this.f3076b = 2;
        }

        public a a() {
            return (this.f3076b == 2 && this.f3077c == a.a) ? b(this.a) : new a(this.a, this.f3076b, this.f3077c);
        }
    }

    /* compiled from: BidiFormatter.java */
    private static class b {
        private static final byte[] a = new byte[1792];

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f3078b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f3079c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3080d;

        /* renamed from: e, reason: collision with root package name */
        private int f3081e;

        /* renamed from: f, reason: collision with root package name */
        private char f3082f;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                a[i2] = Character.getDirectionality(i2);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.f3078b = charSequence;
            this.f3079c = z;
            this.f3080d = charSequence.length();
        }

        private static byte c(char c2) {
            return c2 < 1792 ? a[c2] : Character.getDirectionality(c2);
        }

        private byte f() {
            char cCharAt;
            int i2 = this.f3081e;
            do {
                int i3 = this.f3081e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3078b;
                int i4 = i3 - 1;
                this.f3081e = i4;
                cCharAt = charSequence.charAt(i4);
                this.f3082f = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f3081e = i2;
            this.f3082f = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i2 = this.f3081e;
                if (i2 >= this.f3080d) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f3078b;
                this.f3081e = i2 + 1;
                cCharAt = charSequence.charAt(i2);
                this.f3082f = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i2 = this.f3081e;
            while (true) {
                int i3 = this.f3081e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3078b;
                int i4 = i3 - 1;
                this.f3081e = i4;
                char cCharAt2 = charSequence.charAt(i4);
                this.f3082f = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i5 = this.f3081e;
                        if (i5 > 0) {
                            CharSequence charSequence2 = this.f3078b;
                            int i6 = i5 - 1;
                            this.f3081e = i6;
                            cCharAt = charSequence2.charAt(i6);
                            this.f3082f = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f3081e = i2;
            this.f3082f = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i2 = this.f3081e;
            while (true) {
                int i3 = this.f3081e;
                if (i3 >= this.f3080d) {
                    this.f3081e = i2;
                    this.f3082f = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f3078b;
                this.f3081e = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                this.f3082f = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.f3081e;
                        if (i4 < this.f3080d) {
                            CharSequence charSequence2 = this.f3078b;
                            this.f3081e = i4 + 1;
                            cCharAt = charSequence2.charAt(i4);
                            this.f3082f = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f3078b.charAt(this.f3081e - 1);
            this.f3082f = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f3078b, this.f3081e);
                this.f3081e -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f3081e--;
            byte bC = c(this.f3082f);
            if (!this.f3079c) {
                return bC;
            }
            char c2 = this.f3082f;
            return c2 == '>' ? h() : c2 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f3078b.charAt(this.f3081e);
            this.f3082f = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f3078b, this.f3081e);
                this.f3081e += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f3081e++;
            byte bC = c(this.f3082f);
            if (!this.f3079c) {
                return bC;
            }
            char c2 = this.f3082f;
            return c2 == '<' ? i() : c2 == '&' ? g() : bC;
        }

        int d() {
            this.f3081e = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (this.f3081e < this.f3080d && i2 == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i4 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                i4++;
                                i3 = -1;
                                continue;
                            case 16:
                            case 17:
                                i4++;
                                i3 = 1;
                                continue;
                            case 18:
                                i4--;
                                i3 = 0;
                                continue;
                        }
                    }
                } else if (i4 == 0) {
                    return -1;
                }
                i2 = i4;
            }
            if (i2 == 0) {
                return 0;
            }
            if (i3 != 0) {
                return i3;
            }
            while (this.f3081e > 0) {
                switch (a()) {
                    case 14:
                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        if (i2 == i4) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i2 == i4) {
                            return 1;
                        }
                        break;
                    case 18:
                        i4++;
                        continue;
                }
                i4--;
            }
            return 0;
        }

        int e() {
            this.f3081e = this.f3080d;
            int i2 = 0;
            int i3 = 0;
            while (this.f3081e > 0) {
                byte bA = a();
                if (bA != 0) {
                    if (bA == 1 || bA == 2) {
                        if (i2 == 0) {
                            return 1;
                        }
                        if (i3 == 0) {
                            i3 = i2;
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                if (i3 == i2) {
                                    return -1;
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i3 == i2) {
                                    return 1;
                                }
                                i2--;
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i3 != 0) {
                                    break;
                                } else {
                                    i3 = i2;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i2 == 0) {
                        return -1;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                }
            }
            return 0;
        }
    }

    static {
        d dVar = e.f3096c;
        a = dVar;
        f3069b = Character.toString((char) 8206);
        f3070c = Character.toString((char) 8207);
        f3071d = new a(false, 2, dVar);
        f3072e = new a(true, 2, dVar);
    }

    a(boolean z, int i2, d dVar) {
        this.f3073f = z;
        this.f3074g = i2;
        this.f3075h = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0053a().a();
    }

    static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        return (this.f3073f || !(zA || b(charSequence) == 1)) ? this.f3073f ? (!zA || b(charSequence) == -1) ? f3070c : "" : "" : f3069b;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        return (this.f3073f || !(zA || a(charSequence) == 1)) ? this.f3073f ? (!zA || a(charSequence) == -1) ? f3070c : "" : "" : f3069b;
    }

    public boolean d() {
        return (this.f3074g & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f3075h, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? e.f3095b : e.a));
        }
        if (zA != this.f3073f) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? e.f3095b : e.a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f3075h, true);
    }

    public String k(String str, d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z).toString();
    }
}