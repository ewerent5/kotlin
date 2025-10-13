package c.h.j;

import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class e {
    public static final c.h.j.d a = new C0055e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final c.h.j.d f3095b = new C0055e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final c.h.j.d f3096c;

    /* renamed from: d, reason: collision with root package name */
    public static final c.h.j.d f3097d;

    /* renamed from: e, reason: collision with root package name */
    public static final c.h.j.d f3098e;

    /* renamed from: f, reason: collision with root package name */
    public static final c.h.j.d f3099f;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class a implements c {
        static final a a = new a(true);

        /* renamed from: b, reason: collision with root package name */
        private final boolean f3100b;

        private a(boolean z) {
            this.f3100b = z;
        }

        @Override // c.h.j.e.c
        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            boolean z = false;
            while (i2 < i4) {
                int iA = e.a(Character.getDirectionality(charSequence.charAt(i2)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i2++;
                    } else if (!this.f3100b) {
                        return 1;
                    }
                } else if (this.f3100b) {
                    return 0;
                }
                z = true;
                i2++;
            }
            if (z) {
                return this.f3100b ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class b implements c {
        static final b a = new b();

        private b() {
        }

        @Override // c.h.j.e.c
        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int iB = 2;
            while (i2 < i4 && iB == 2) {
                iB = e.b(Character.getDirectionality(charSequence.charAt(i2)));
                i2++;
            }
            return iB;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private interface c {
        int a(CharSequence charSequence, int i2, int i3);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static abstract class d implements c.h.j.d {
        private final c a;

        d(c cVar) {
            this.a = cVar;
        }

        private boolean c(CharSequence charSequence, int i2, int i3) {
            int iA = this.a.a(charSequence, i2, i3);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        @Override // c.h.j.d
        public boolean a(CharSequence charSequence, int i2, int i3) {
            if (charSequence == null || i2 < 0 || i3 < 0 || charSequence.length() - i3 < i2) {
                throw new IllegalArgumentException();
            }
            return this.a == null ? b() : c(charSequence, i2, i3);
        }

        protected abstract boolean b();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: c.h.j.e$e, reason: collision with other inner class name */
    private static class C0055e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f3101b;

        C0055e(c cVar, boolean z) {
            super(cVar);
            this.f3101b = z;
        }

        @Override // c.h.j.e.d
        protected boolean b() {
            return this.f3101b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f3102b = new f();

        f() {
            super(null);
        }

        @Override // c.h.j.e.d
        protected boolean b() {
            return c.h.j.f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.a;
        f3096c = new C0055e(bVar, false);
        f3097d = new C0055e(bVar, true);
        f3098e = new C0055e(a.a, false);
        f3099f = f.f3102b;
    }

    static int a(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
                case 14:
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}