package c.r.a;

/* compiled from: SimpleSQLiteQuery.java */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: e, reason: collision with root package name */
    private final String f3301e;

    /* renamed from: f, reason: collision with root package name */
    private final Object[] f3302f;

    public a(String str, Object[] objArr) {
        this.f3301e = str;
        this.f3302f = objArr;
    }

    private static void a(d dVar, int i2, Object obj) {
        if (obj == null) {
            dVar.t0(i2);
            return;
        }
        if (obj instanceof byte[]) {
            dVar.X(i2, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            dVar.E(i2, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            dVar.E(i2, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            dVar.R(i2, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            dVar.R(i2, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            dVar.R(i2, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            dVar.R(i2, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            dVar.r(i2, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            dVar.R(i2, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            a(dVar, i2, obj);
        }
    }

    @Override // c.r.a.e
    public String b() {
        return this.f3301e;
    }

    @Override // c.r.a.e
    public void c(d dVar) {
        d(dVar, this.f3302f);
    }

    public a(String str) {
        this(str, null);
    }
}