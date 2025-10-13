package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.d;
import androidx.navigation.h;
import androidx.navigation.o;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: NavInflater.java */
/* loaded from: classes.dex */
public final class n {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private Context f1336b;

    /* renamed from: c, reason: collision with root package name */
    private s f1337c;

    public n(Context context, s sVar) {
        this.f1336b = context;
        this.f1337c = sVar;
    }

    private static p a(TypedValue typedValue, p pVar, p pVar2, String str, String str2) throws XmlPullParserException {
        if (pVar == null || pVar == pVar2) {
            return pVar != null ? pVar : pVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    private j b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i2) throws XmlPullParserException {
        int depth;
        j jVarA = this.f1337c.e(xmlResourceParser.getName()).a();
        jVarA.t(this.f1336b, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    g(resources, jVarA, attributeSet, i2);
                } else if ("deepLink".equals(name)) {
                    h(resources, jVarA, attributeSet);
                } else if ("action".equals(name)) {
                    d(resources, jVarA, attributeSet, xmlResourceParser, i2);
                } else if ("include".equals(name) && (jVarA instanceof k)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, u.r);
                    ((k) jVarA).E(c(typedArrayObtainAttributes.getResourceId(u.s, 0)));
                    typedArrayObtainAttributes.recycle();
                } else if (jVarA instanceof k) {
                    ((k) jVarA).E(b(resources, xmlResourceParser, attributeSet, i2));
                }
            }
        }
        return jVarA;
    }

    private void d(Resources resources, j jVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i2) throws XmlPullParserException {
        int depth;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.v.a.f1382f);
        int resourceId = typedArrayObtainAttributes.getResourceId(androidx.navigation.v.a.f1383g, 0);
        c cVar = new c(typedArrayObtainAttributes.getResourceId(androidx.navigation.v.a.f1384h, 0));
        o.a aVar = new o.a();
        aVar.d(typedArrayObtainAttributes.getBoolean(androidx.navigation.v.a.f1387k, false));
        aVar.g(typedArrayObtainAttributes.getResourceId(androidx.navigation.v.a.n, -1), typedArrayObtainAttributes.getBoolean(androidx.navigation.v.a.o, false));
        aVar.b(typedArrayObtainAttributes.getResourceId(androidx.navigation.v.a.f1385i, -1));
        aVar.c(typedArrayObtainAttributes.getResourceId(androidx.navigation.v.a.f1386j, -1));
        aVar.e(typedArrayObtainAttributes.getResourceId(androidx.navigation.v.a.f1388l, -1));
        aVar.f(typedArrayObtainAttributes.getResourceId(androidx.navigation.v.a.f1389m, -1));
        cVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                f(resources, bundle, attributeSet, i2);
            }
        }
        if (!bundle.isEmpty()) {
            cVar.d(bundle);
        }
        jVar.u(resourceId, cVar);
        typedArrayObtainAttributes.recycle();
    }

    private d e(TypedArray typedArray, Resources resources, int i2) throws XmlPullParserException {
        d.a aVar = new d.a();
        aVar.c(typedArray.getBoolean(androidx.navigation.v.a.t, false));
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(androidx.navigation.v.a.s);
        Object objK = null;
        p<?> pVarA = string != null ? p.a(string, resources.getResourcePackageName(i2)) : null;
        int i3 = androidx.navigation.v.a.r;
        if (typedArray.getValue(i3, typedValue)) {
            p<Integer> pVar = p.f1350b;
            if (pVarA == pVar) {
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    objK = Integer.valueOf(i4);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + pVarA.c() + ". Must be a reference to a resource.");
                    }
                    objK = 0;
                }
            } else {
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    if (pVarA != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + pVarA.c() + ". You must use a \"" + pVar.c() + "\" type to reference other resources.");
                    }
                    pVarA = pVar;
                    objK = Integer.valueOf(i5);
                } else if (pVarA == p.f1358j) {
                    objK = typedArray.getString(i3);
                } else {
                    int i6 = typedValue.type;
                    if (i6 == 3) {
                        String string2 = typedValue.string.toString();
                        if (pVarA == null) {
                            pVarA = p.d(string2);
                        }
                        objK = pVarA.k(string2);
                    } else if (i6 == 4) {
                        pVarA = a(typedValue, pVarA, p.f1354f, string, "float");
                        objK = Float.valueOf(typedValue.getFloat());
                    } else if (i6 == 5) {
                        pVarA = a(typedValue, pVarA, p.a, string, "dimension");
                        objK = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i6 == 18) {
                        pVarA = a(typedValue, pVarA, p.f1356h, string, "boolean");
                        objK = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i6 < 16 || i6 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        p<Float> pVar2 = p.f1354f;
                        if (pVarA == pVar2) {
                            pVarA = a(typedValue, pVarA, pVar2, string, "float");
                            objK = Float.valueOf(typedValue.data);
                        } else {
                            pVarA = a(typedValue, pVarA, p.a, string, "integer");
                            objK = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (objK != null) {
            aVar.b(objK);
        }
        if (pVarA != null) {
            aVar.d(pVarA);
        }
        return aVar.a();
    }

    private void f(Resources resources, Bundle bundle, AttributeSet attributeSet, int i2) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.v.a.p);
        String string = typedArrayObtainAttributes.getString(androidx.navigation.v.a.q);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        d dVarE = e(typedArrayObtainAttributes, resources, i2);
        if (dVarE.b()) {
            dVarE.c(string, bundle);
        }
        typedArrayObtainAttributes.recycle();
    }

    private void g(Resources resources, j jVar, AttributeSet attributeSet, int i2) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.v.a.p);
        String string = typedArrayObtainAttributes.getString(androidx.navigation.v.a.q);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        jVar.a(string, e(typedArrayObtainAttributes, resources, i2));
        typedArrayObtainAttributes.recycle();
    }

    private void h(Resources resources, j jVar, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.v.a.u);
        String string = typedArrayObtainAttributes.getString(androidx.navigation.v.a.x);
        String string2 = typedArrayObtainAttributes.getString(androidx.navigation.v.a.v);
        String string3 = typedArrayObtainAttributes.getString(androidx.navigation.v.a.w);
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        h.a aVar = new h.a();
        if (string != null) {
            aVar.d(string.replace("${applicationId}", this.f1336b.getPackageName()));
        }
        if (!TextUtils.isEmpty(string2)) {
            aVar.b(string2.replace("${applicationId}", this.f1336b.getPackageName()));
        }
        if (string3 != null) {
            aVar.c(string3.replace("${applicationId}", this.f1336b.getPackageName()));
        }
        jVar.c(aVar.a());
        typedArrayObtainAttributes.recycle();
    }

    @SuppressLint({"ResourceType"})
    public k c(int i2) {
        int next;
        Resources resources = this.f1336b.getResources();
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i2) + " line " + xml.getLineNumber(), e2);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        j jVarB = b(resources, xml, attributeSetAsAttributeSet, i2);
        if (jVarB instanceof k) {
            return (k) jVarB;
        }
        throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
    }
}