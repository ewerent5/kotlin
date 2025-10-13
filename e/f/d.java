package e.f;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

/* compiled from: CSVParser.java */
/* loaded from: classes.dex */
public class d extends e.f.a {

    /* renamed from: e, reason: collision with root package name */
    private final char f15596e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15597f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f15598g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15599h;

    /* renamed from: i, reason: collision with root package name */
    private int f15600i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15601j;

    /* renamed from: k, reason: collision with root package name */
    private Locale f15602k;

    /* compiled from: CSVParser.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.f.k.a.values().length];
            a = iArr;
            try {
                iArr[e.f.k.a.BOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.f.k.a.EMPTY_SEPARATORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.f.k.a.EMPTY_QUOTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: CSVParser.java */
    private static class b {
        private final String a;

        /* renamed from: c, reason: collision with root package name */
        private StringBuilder f15604c;

        /* renamed from: b, reason: collision with root package name */
        private int f15603b = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f15605d = 0;

        /* renamed from: e, reason: collision with root package name */
        private int f15606e = 0;

        b(String str) {
            this.a = str;
        }

        private StringBuilder h() {
            if (this.f15604c == null) {
                this.f15604c = new StringBuilder(this.a.length() + 128);
            }
            int i2 = this.f15605d;
            int i3 = this.f15606e;
            if (i2 < i3) {
                this.f15604c.append((CharSequence) this.a, i2, i3);
                int i4 = this.f15603b;
                this.f15606e = i4;
                this.f15605d = i4;
            }
            return this.f15604c;
        }

        public void b(char c2) {
            h().append(c2);
        }

        public void c(String str) {
            h().append(str);
        }

        public void d() {
            int i2 = this.f15606e;
            if (i2 == this.f15605d) {
                int i3 = this.f15603b;
                this.f15605d = i3 - 1;
                this.f15606e = i3;
            } else if (i2 == this.f15603b - 1) {
                this.f15606e = i2 + 1;
            } else {
                h().append(this.a.charAt(this.f15603b - 1));
            }
        }

        public void e() {
            StringBuilder sb = this.f15604c;
            if (sb != null) {
                sb.setLength(0);
            }
            int i2 = this.f15603b;
            this.f15606e = i2;
            this.f15605d = i2;
        }

        public boolean f() {
            return this.f15603b >= this.a.length();
        }

        public boolean g() {
            StringBuilder sb;
            return this.f15605d >= this.f15606e && ((sb = this.f15604c) == null || sb.length() == 0);
        }

        public String i() {
            StringBuilder sb = this.f15604c;
            return (sb == null || sb.length() == 0) ? this.a.substring(this.f15605d, this.f15606e) : h().toString();
        }

        public char j() {
            String str = this.a;
            int i2 = this.f15603b;
            this.f15603b = i2 + 1;
            return str.charAt(i2);
        }

        public String k() {
            String strI = i();
            e();
            return strI;
        }
    }

    d(char c2, char c3, char c4, boolean z, boolean z2, boolean z3, e.f.k.a aVar, Locale locale) {
        super(c2, c3, aVar);
        this.f15600i = -1;
        this.f15601j = false;
        this.f15602k = (Locale) k.a.a.a.b.a(locale, Locale.getDefault());
        if (e(c2, c3, c4)) {
            throw new UnsupportedOperationException(ResourceBundle.getBundle("opencsv", this.f15602k).getString("special.characters.must.differ"));
        }
        if (c2 == 0) {
            throw new UnsupportedOperationException(ResourceBundle.getBundle("opencsv", this.f15602k).getString("define.separator"));
        }
        this.f15596e = c4;
        this.f15597f = z;
        this.f15598g = z2;
        this.f15599h = z3;
    }

    private boolean e(char c2, char c3, char c4) {
        return p(c2, c3) || p(c2, c4) || p(c3, c4);
    }

    private String f(String str, boolean z) {
        if (str.isEmpty() && q(z)) {
            return null;
        }
        return str;
    }

    private void g(String str, b bVar, boolean z) {
        if (n(str, i(z), bVar.f15603b - 1)) {
            bVar.j();
            bVar.d();
        }
    }

    private void h(String str, b bVar) {
        int i2;
        if (this.f15597f || (i2 = bVar.f15603b) <= 3 || str.charAt(i2 - 2) == this.a || str.length() <= i2 || str.charAt(i2) == this.a) {
            return;
        }
        if (this.f15598g && !bVar.g() && k.a.a.a.c.i(bVar.i())) {
            bVar.e();
        } else {
            bVar.d();
        }
    }

    private boolean i(boolean z) {
        return (z && !this.f15599h) || this.f15601j;
    }

    private boolean j(char c2) {
        return l(c2) || k(c2) || m(c2);
    }

    private boolean k(char c2) {
        return c2 == this.f15596e;
    }

    private boolean l(char c2) {
        return c2 == this.f15587b;
    }

    private boolean m(char c2) {
        return c2 == this.a;
    }

    private boolean o(String str, boolean z, int i2) {
        int i3;
        return z && str.length() > (i3 = i2 + 1) && l(str.charAt(i3));
    }

    private boolean p(char c2, char c3) {
        return c2 != 0 && c2 == c3;
    }

    private boolean q(boolean z) {
        int i2 = a.a[this.f15588c.ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return !z;
        }
        if (i2 != 3) {
            return false;
        }
        return z;
    }

    @Override // e.f.a
    protected String[] d(String str, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        if (!z && this.f15589d != null) {
            this.f15589d = null;
        }
        if (str == null) {
            String str2 = this.f15589d;
            if (str2 == null) {
                return null;
            }
            this.f15589d = null;
            return new String[]{str2};
        }
        ArrayList arrayList = this.f15600i <= 0 ? new ArrayList() : new ArrayList((this.f15600i + 1) * 2);
        b bVar = new b(str);
        String str3 = this.f15589d;
        if (str3 != null) {
            bVar.c(str3);
            this.f15589d = null;
            z2 = !this.f15599h;
        } else {
            z2 = false;
        }
        loop0: while (true) {
            z3 = false;
            while (!bVar.f()) {
                char cJ = bVar.j();
                if (cJ == this.f15596e) {
                    g(str, bVar, z2);
                } else if (cJ == this.f15587b) {
                    if (o(str, i(z2), bVar.f15603b - 1)) {
                        bVar.j();
                        bVar.d();
                    } else {
                        z2 = !z2;
                        if (bVar.g()) {
                            z3 = true;
                        }
                        h(str, bVar);
                    }
                    this.f15601j = !this.f15601j;
                } else if (cJ != this.a || (z2 && !this.f15599h)) {
                    if (!this.f15597f || (z2 && !this.f15599h)) {
                        bVar.d();
                        this.f15601j = true;
                        z3 = true;
                    }
                }
            }
            arrayList.add(f(bVar.k(), z3));
            this.f15601j = false;
        }
        if (!z2 || this.f15599h) {
            this.f15601j = false;
            arrayList.add(f(bVar.k(), z3));
        } else {
            if (!z) {
                throw new IOException(String.format(ResourceBundle.getBundle("opencsv", this.f15602k).getString("unterminated.quote"), bVar.i()));
            }
            bVar.b('\n');
            this.f15589d = bVar.i();
        }
        this.f15600i = arrayList.size();
        return (String[]) arrayList.toArray(k.a.a.a.a.u);
    }

    protected boolean n(String str, boolean z, int i2) {
        int i3;
        return z && str.length() > (i3 = i2 + 1) && j(str.charAt(i3));
    }
}