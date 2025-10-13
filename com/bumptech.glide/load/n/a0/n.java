package com.bumptech.glide.load.n.a0;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy.java */
/* loaded from: classes.dex */
public class n implements l {
    private static final Bitmap.Config[] a;

    /* renamed from: b, reason: collision with root package name */
    private static final Bitmap.Config[] f3673b;

    /* renamed from: c, reason: collision with root package name */
    private static final Bitmap.Config[] f3674c;

    /* renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f3675d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f3676e;

    /* renamed from: f, reason: collision with root package name */
    private final c f3677f = new c();

    /* renamed from: g, reason: collision with root package name */
    private final h<b, Bitmap> f3678g = new h<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f3679h = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    static final class b implements m {
        private final c a;

        /* renamed from: b, reason: collision with root package name */
        int f3680b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f3681c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // com.bumptech.glide.load.n.a0.m
        public void a() {
            this.a.c(this);
        }

        public void b(int i2, Bitmap.Config config) {
            this.f3680b = i2;
            this.f3681c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3680b == bVar.f3680b && com.bumptech.glide.t.k.c(this.f3681c, bVar.f3681c);
        }

        public int hashCode() {
            int i2 = this.f3680b * 31;
            Bitmap.Config config = this.f3681c;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.h(this.f3680b, this.f3681c);
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    static class c extends d<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.n.a0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i2, Bitmap.Config config) {
            b bVarB = b();
            bVarB.b(i2, config);
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        a = configArr;
        f3673b = configArr;
        f3674c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f3675d = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f3676e = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    private b g(int i2, Bitmap.Config config) {
        b bVarE = this.f3677f.e(i2, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer numCeilingKey = j(config2).ceilingKey(Integer.valueOf(i2));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i2 * 8) {
                if (numCeilingKey.intValue() == i2) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVarE;
                        }
                    } else if (config2.equals(config)) {
                        return bVarE;
                    }
                }
                this.f3677f.c(bVarE);
                return this.f3677f.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarE;
    }

    static String h(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f3673b;
        }
        int i2 = a.a[config.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new Bitmap.Config[]{config} : f3676e : f3675d : f3674c : a;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f3679h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f3679h.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public String a(int i2, int i3, Bitmap.Config config) {
        return h(com.bumptech.glide.t.k.f(i2, i3, config), config);
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.t.k.g(bitmap);
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public void c(Bitmap bitmap) {
        b bVarE = this.f3677f.e(com.bumptech.glide.t.k.g(bitmap), bitmap.getConfig());
        this.f3678g.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num = (Integer) navigableMapJ.get(Integer.valueOf(bVarE.f3680b));
        navigableMapJ.put(Integer.valueOf(bVarE.f3680b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        b bVarG = g(com.bumptech.glide.t.k.f(i2, i3, config), config);
        Bitmap bitmapA = this.f3678g.a(bVarG);
        if (bitmapA != null) {
            f(Integer.valueOf(bVarG.f3680b), bitmapA);
            bitmapA.reconfigure(i2, i3, config);
        }
        return bitmapA;
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public String e(Bitmap bitmap) {
        return h(com.bumptech.glide.t.k.g(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f3678g.f();
        if (bitmapF != null) {
            f(Integer.valueOf(com.bumptech.glide.t.k.g(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f3678g);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f3679h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f3679h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}