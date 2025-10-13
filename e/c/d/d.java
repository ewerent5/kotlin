package e.c.d;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* loaded from: classes.dex */
public abstract class d implements e.c.d.e {

    /* renamed from: e, reason: collision with root package name */
    public static final d f15418e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f15419f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f15420g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f15421h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f15422i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f15423j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ d[] f15424k;

    /* compiled from: FieldNamingPolicy.java */
    enum a extends d {
        a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // e.c.d.e
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f15418e = aVar;
        d dVar = new d("UPPER_CAMEL_CASE", 1) { // from class: e.c.d.d.b
            {
                a aVar2 = null;
            }

            @Override // e.c.d.e
            public String a(Field field) {
                return d.c(field.getName());
            }
        };
        f15419f = dVar;
        d dVar2 = new d("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: e.c.d.d.c
            {
                a aVar2 = null;
            }

            @Override // e.c.d.e
            public String a(Field field) {
                return d.c(d.b(field.getName(), " "));
            }
        };
        f15420g = dVar2;
        d dVar3 = new d("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: e.c.d.d.d
            {
                a aVar2 = null;
            }

            @Override // e.c.d.e
            public String a(Field field) {
                return d.b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f15421h = dVar3;
        d dVar4 = new d("LOWER_CASE_WITH_DASHES", 4) { // from class: e.c.d.d.e
            {
                a aVar2 = null;
            }

            @Override // e.c.d.e
            public String a(Field field) {
                return d.b(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f15422i = dVar4;
        d dVar5 = new d("LOWER_CASE_WITH_DOTS", 5) { // from class: e.c.d.d.f
            {
                a aVar2 = null;
            }

            @Override // e.c.d.e
            public String a(Field field) {
                return d.b(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f15423j = dVar5;
        f15424k = new d[]{aVar, dVar, dVar2, dVar3, dVar4, dVar5};
    }

    private d(String str, int i2) {
    }

    static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String c(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        while (!Character.isLetter(str.charAt(i2)) && i2 < length) {
            i2++;
        }
        char cCharAt = str.charAt(i2);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i2 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f15424k.clone();
    }

    /* synthetic */ d(String str, int i2, a aVar) {
        this(str, i2);
    }
}