package e.c.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: e, reason: collision with root package name */
    public static final u f15450e;

    /* renamed from: f, reason: collision with root package name */
    public static final u f15451f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ u[] f15452g;

    /* compiled from: LongSerializationPolicy.java */
    enum a extends u {
        a(String str, int i2) {
            super(str, i2, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f15450e = aVar;
        u uVar = new u("STRING", 1) { // from class: e.c.d.u.b
            {
                a aVar2 = null;
            }
        };
        f15451f = uVar;
        f15452g = new u[]{aVar, uVar};
    }

    private u(String str, int i2) {
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f15452g.clone();
    }

    /* synthetic */ u(String str, int i2, a aVar) {
        this(str, i2);
    }
}