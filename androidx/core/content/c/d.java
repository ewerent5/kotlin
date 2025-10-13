package androidx.core.content.c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: classes.dex */
final class d {
    private static a a(a aVar, int i2, int i3, boolean z, int i4) {
        return aVar != null ? aVar : z ? new a(i2, i4, i3) : new a(i2, i3);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayS = g.s(resources, theme, attributeSet, c.h.c.w);
        float fJ = g.j(typedArrayS, xmlPullParser, "startX", c.h.c.F, 0.0f);
        float fJ2 = g.j(typedArrayS, xmlPullParser, "startY", c.h.c.G, 0.0f);
        float fJ3 = g.j(typedArrayS, xmlPullParser, "endX", c.h.c.H, 0.0f);
        float fJ4 = g.j(typedArrayS, xmlPullParser, "endY", c.h.c.I, 0.0f);
        float fJ5 = g.j(typedArrayS, xmlPullParser, "centerX", c.h.c.A, 0.0f);
        float fJ6 = g.j(typedArrayS, xmlPullParser, "centerY", c.h.c.B, 0.0f);
        int iK = g.k(typedArrayS, xmlPullParser, "type", c.h.c.z, 0);
        int iF = g.f(typedArrayS, xmlPullParser, "startColor", c.h.c.x, 0);
        boolean zR = g.r(xmlPullParser, "centerColor");
        int iF2 = g.f(typedArrayS, xmlPullParser, "centerColor", c.h.c.E, 0);
        int iF3 = g.f(typedArrayS, xmlPullParser, "endColor", c.h.c.y, 0);
        int iK2 = g.k(typedArrayS, xmlPullParser, "tileMode", c.h.c.D, 0);
        float fJ7 = g.j(typedArrayS, xmlPullParser, "gradientRadius", c.h.c.C, 0.0f);
        typedArrayS.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iF, iF3, zR, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.a, aVarA.f900b, d(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.a, aVarA.f900b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.a, aVarA.f900b, d(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new androidx.core.content.c.d.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.c.d.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = c.h.c.J
            android.content.res.TypedArray r3 = androidx.core.content.c.g.s(r9, r12, r11, r3)
            int r5 = c.h.c.K
            boolean r6 = r3.hasValue(r5)
            int r7 = c.h.c.L
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.c.d$a r9 = new androidx.core.content.c.d$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.c.d.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.c.d$a");
    }

    private static Shader.TileMode d(int i2) {
        return i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* compiled from: GradientColorInflaterCompat.java */
    static final class a {
        final int[] a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f900b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.f900b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.a[i2] = list.get(i2).intValue();
                this.f900b[i2] = list2.get(i2).floatValue();
            }
        }

        a(int i2, int i3) {
            this.a = new int[]{i2, i3};
            this.f900b = new float[]{0.0f, 1.0f};
        }

        a(int i2, int i3, int i4) {
            this.a = new int[]{i2, i3, i4};
            this.f900b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}