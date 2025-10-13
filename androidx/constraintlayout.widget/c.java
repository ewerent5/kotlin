package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public class c {
    private final ConstraintLayout a;

    /* renamed from: b, reason: collision with root package name */
    int f714b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f715c = -1;

    /* renamed from: d, reason: collision with root package name */
    private SparseArray<a> f716d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<d> f717e = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    static class a {
        int a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<b> f718b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f719c;

        /* renamed from: d, reason: collision with root package name */
        d f720d;

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f719c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.F4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.G4) {
                    this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == i.H4) {
                    this.f719c = typedArrayObtainStyledAttributes.getResourceId(index, this.f719c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f719c);
                    context.getResources().getResourceName(this.f719c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f720d = dVar;
                        dVar.f(context, this.f719c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f718b.add(bVar);
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    static class b {
        float a;

        /* renamed from: b, reason: collision with root package name */
        float f721b;

        /* renamed from: c, reason: collision with root package name */
        float f722c;

        /* renamed from: d, reason: collision with root package name */
        float f723d;

        /* renamed from: e, reason: collision with root package name */
        int f724e;

        /* renamed from: f, reason: collision with root package name */
        d f725f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.a = Float.NaN;
            this.f721b = Float.NaN;
            this.f722c = Float.NaN;
            this.f723d = Float.NaN;
            this.f724e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.b5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.c5) {
                    this.f724e = typedArrayObtainStyledAttributes.getResourceId(index, this.f724e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f724e);
                    context.getResources().getResourceName(this.f724e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f725f = dVar;
                        dVar.f(context, this.f724e);
                    }
                } else if (index == i.d5) {
                    this.f723d = typedArrayObtainStyledAttributes.getDimension(index, this.f723d);
                } else if (index == i.e5) {
                    this.f721b = typedArrayObtainStyledAttributes.getDimension(index, this.f721b);
                } else if (index == i.f5) {
                    this.f722c = typedArrayObtainStyledAttributes.getDimension(index, this.f722c);
                } else if (index == i.g5) {
                    this.a = typedArrayObtainStyledAttributes.getDimension(index, this.a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.a = constraintLayout;
        a(context, i2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i2);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c2 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0 && c2 != 1) {
                        if (c2 == 2) {
                            aVar = new a(context, xml);
                            this.f716d.put(aVar.a, aVar);
                        } else if (c2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (c2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) throws NumberFormatException {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.n(context, xmlPullParser);
                this.f717e.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }
}