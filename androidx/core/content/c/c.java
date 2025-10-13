package androidx.core.content.c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat.java */
/* loaded from: classes.dex */
public class c {

    /* compiled from: FontResourcesParserCompat.java */
    public interface a {
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class b implements a {
        private final C0009c[] a;

        public b(C0009c[] c0009cArr) {
            this.a = c0009cArr;
        }

        public C0009c[] a() {
            return this.a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.c.c$c, reason: collision with other inner class name */
    public static final class C0009c {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private int f893b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f894c;

        /* renamed from: d, reason: collision with root package name */
        private String f895d;

        /* renamed from: e, reason: collision with root package name */
        private int f896e;

        /* renamed from: f, reason: collision with root package name */
        private int f897f;

        public C0009c(String str, int i2, boolean z, String str2, int i3, int i4) {
            this.a = str;
            this.f893b = i2;
            this.f894c = z;
            this.f895d = str2;
            this.f896e = i3;
            this.f897f = i4;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f897f;
        }

        public int c() {
            return this.f896e;
        }

        public String d() {
            return this.f895d;
        }

        public int e() {
            return this.f893b;
        }

        public boolean f() {
            return this.f894c;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class d implements a {
        private final c.h.i.a a;

        /* renamed from: b, reason: collision with root package name */
        private final int f898b;

        /* renamed from: c, reason: collision with root package name */
        private final int f899c;

        public d(c.h.i.a aVar, int i2, int i3) {
            this.a = aVar;
            this.f899c = i2;
            this.f898b = i3;
        }

        public int a() {
            return this.f899c;
        }

        public c.h.i.a b() {
            return this.a;
        }

        public int c() {
            return this.f898b;
        }
    }

    private static int a(TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i2);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i2) throws Resources.NotFoundException {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c.h.c.f2985e);
        String string = typedArrayObtainAttributes.getString(c.h.c.f2986f);
        String string2 = typedArrayObtainAttributes.getString(c.h.c.f2990j);
        String string3 = typedArrayObtainAttributes.getString(c.h.c.f2991k);
        int resourceId = typedArrayObtainAttributes.getResourceId(c.h.c.f2987g, 0);
        int integer = typedArrayObtainAttributes.getInteger(c.h.c.f2988h, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(c.h.c.f2989i, 500);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new c.h.i.a(string, string2, string3, c(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((C0009c[]) arrayList.toArray(new C0009c[arrayList.size()]));
    }

    private static C0009c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c.h.c.f2992l);
        int i2 = c.h.c.u;
        if (!typedArrayObtainAttributes.hasValue(i2)) {
            i2 = c.h.c.n;
        }
        int i3 = typedArrayObtainAttributes.getInt(i2, 400);
        int i4 = c.h.c.s;
        if (!typedArrayObtainAttributes.hasValue(i4)) {
            i4 = c.h.c.o;
        }
        boolean z = 1 == typedArrayObtainAttributes.getInt(i4, 0);
        int i5 = c.h.c.v;
        if (!typedArrayObtainAttributes.hasValue(i5)) {
            i5 = c.h.c.p;
        }
        int i6 = c.h.c.t;
        if (!typedArrayObtainAttributes.hasValue(i6)) {
            i6 = c.h.c.q;
        }
        String string = typedArrayObtainAttributes.getString(i6);
        int i7 = typedArrayObtainAttributes.getInt(i5, 0);
        int i8 = c.h.c.r;
        if (!typedArrayObtainAttributes.hasValue(i8)) {
            i8 = c.h.c.f2993m;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i8, 0);
        String string2 = typedArrayObtainAttributes.getString(i8);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0009c(string2, i3, z, string, i7, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}