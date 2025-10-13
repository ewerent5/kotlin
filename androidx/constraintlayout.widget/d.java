package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class d {
    private static final int[] a = {0, 4, 8};

    /* renamed from: b, reason: collision with root package name */
    private static SparseIntArray f726b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f727c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f728d = true;

    /* renamed from: e, reason: collision with root package name */
    private HashMap<Integer, a> f729e = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    public static class a {
        int a;

        /* renamed from: b, reason: collision with root package name */
        public final C0006d f730b = new C0006d();

        /* renamed from: c, reason: collision with root package name */
        public final c f731c = new c();

        /* renamed from: d, reason: collision with root package name */
        public final b f732d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final e f733e = new e();

        /* renamed from: f, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f734f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i2, ConstraintLayout.b bVar) {
            this.a = i2;
            b bVar2 = this.f732d;
            bVar2.f742i = bVar.f674d;
            bVar2.f743j = bVar.f675e;
            bVar2.f744k = bVar.f676f;
            bVar2.f745l = bVar.f677g;
            bVar2.f746m = bVar.f678h;
            bVar2.n = bVar.f679i;
            bVar2.o = bVar.f680j;
            bVar2.p = bVar.f681k;
            bVar2.q = bVar.f682l;
            bVar2.r = bVar.p;
            bVar2.s = bVar.q;
            bVar2.t = bVar.r;
            bVar2.u = bVar.s;
            bVar2.v = bVar.z;
            bVar2.w = bVar.A;
            bVar2.x = bVar.B;
            bVar2.y = bVar.f683m;
            bVar2.z = bVar.n;
            bVar2.A = bVar.o;
            bVar2.B = bVar.Q;
            bVar2.C = bVar.R;
            bVar2.D = bVar.S;
            bVar2.f741h = bVar.f673c;
            bVar2.f739f = bVar.a;
            bVar2.f740g = bVar.f672b;
            b bVar3 = this.f732d;
            bVar3.f737d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar3.f738e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar3.E = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar3.F = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar3.G = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar3.H = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar3.Q = bVar.F;
            bVar3.R = bVar.E;
            bVar3.T = bVar.H;
            bVar3.S = bVar.G;
            bVar3.i0 = bVar.T;
            bVar3.j0 = bVar.U;
            bVar3.U = bVar.I;
            bVar3.V = bVar.J;
            bVar3.W = bVar.M;
            bVar3.X = bVar.N;
            bVar3.Y = bVar.K;
            bVar3.Z = bVar.L;
            bVar3.a0 = bVar.O;
            bVar3.b0 = bVar.P;
            bVar3.h0 = bVar.V;
            bVar3.L = bVar.u;
            bVar3.N = bVar.w;
            bVar3.K = bVar.t;
            bVar3.M = bVar.v;
            b bVar4 = this.f732d;
            bVar4.P = bVar.x;
            bVar4.O = bVar.y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar4.I = bVar.getMarginEnd();
                this.f732d.J = bVar.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i2, e.a aVar) {
            f(i2, aVar);
            this.f730b.f756d = aVar.p0;
            e eVar = this.f733e;
            eVar.f759c = aVar.s0;
            eVar.f760d = aVar.t0;
            eVar.f761e = aVar.u0;
            eVar.f762f = aVar.v0;
            eVar.f763g = aVar.w0;
            eVar.f764h = aVar.x0;
            eVar.f765i = aVar.y0;
            eVar.f766j = aVar.z0;
            eVar.f767k = aVar.A0;
            eVar.f768l = aVar.B0;
            eVar.n = aVar.r0;
            eVar.f769m = aVar.q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.b bVar, int i2, e.a aVar) {
            g(i2, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f732d;
                bVar2.e0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.c0 = barrier.getType();
                this.f732d.f0 = barrier.getReferencedIds();
                this.f732d.d0 = barrier.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f732d;
            bVar.f674d = bVar2.f742i;
            bVar.f675e = bVar2.f743j;
            bVar.f676f = bVar2.f744k;
            bVar.f677g = bVar2.f745l;
            bVar.f678h = bVar2.f746m;
            bVar.f679i = bVar2.n;
            bVar.f680j = bVar2.o;
            bVar.f681k = bVar2.p;
            bVar.f682l = bVar2.q;
            bVar.p = bVar2.r;
            bVar.q = bVar2.s;
            bVar.r = bVar2.t;
            bVar.s = bVar2.u;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.E;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.H;
            bVar.x = bVar2.P;
            bVar.y = bVar2.O;
            bVar.u = bVar2.L;
            bVar.w = bVar2.N;
            bVar.z = bVar2.v;
            bVar.A = bVar2.w;
            bVar.f683m = bVar2.y;
            bVar.n = bVar2.z;
            b bVar3 = this.f732d;
            bVar.o = bVar3.A;
            bVar.B = bVar3.x;
            bVar.Q = bVar3.B;
            bVar.R = bVar3.C;
            bVar.F = bVar3.Q;
            bVar.E = bVar3.R;
            bVar.H = bVar3.T;
            bVar.G = bVar3.S;
            bVar.T = bVar3.i0;
            bVar.U = bVar3.j0;
            bVar.I = bVar3.U;
            bVar.J = bVar3.V;
            bVar.M = bVar3.W;
            bVar.N = bVar3.X;
            bVar.K = bVar3.Y;
            bVar.L = bVar3.Z;
            bVar.O = bVar3.a0;
            bVar.P = bVar3.b0;
            bVar.S = bVar3.D;
            bVar.f673c = bVar3.f741h;
            bVar.a = bVar3.f739f;
            bVar.f672b = bVar3.f740g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar3.f737d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar3.f738e;
            String str = bVar3.h0;
            if (str != null) {
                bVar.V = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(this.f732d.J);
                bVar.setMarginEnd(this.f732d.I);
            }
            bVar.a();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f732d.a(this.f732d);
            aVar.f731c.a(this.f731c);
            aVar.f730b.a(this.f730b);
            aVar.f733e.a(this.f733e);
            aVar.a = this.a;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class b {
        private static SparseIntArray a;

        /* renamed from: d, reason: collision with root package name */
        public int f737d;

        /* renamed from: e, reason: collision with root package name */
        public int f738e;
        public int[] f0;
        public String g0;
        public String h0;

        /* renamed from: b, reason: collision with root package name */
        public boolean f735b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f736c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f739f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f740g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f741h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public int f742i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f743j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f744k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f745l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f746m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public float v = 0.5f;
        public float w = 0.5f;
        public String x = null;
        public int y = -1;
        public int z = 0;
        public float A = 0.0f;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public int P = -1;
        public float Q = -1.0f;
        public float R = -1.0f;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = 0;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public int Z = -1;
        public float a0 = 1.0f;
        public float b0 = 1.0f;
        public int c0 = -1;
        public int d0 = 0;
        public int e0 = -1;
        public boolean i0 = false;
        public boolean j0 = false;
        public boolean k0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(i.F3, 24);
            a.append(i.G3, 25);
            a.append(i.I3, 28);
            a.append(i.J3, 29);
            a.append(i.O3, 35);
            a.append(i.N3, 34);
            a.append(i.q3, 4);
            a.append(i.p3, 3);
            a.append(i.n3, 1);
            a.append(i.T3, 6);
            a.append(i.U3, 7);
            a.append(i.x3, 17);
            a.append(i.y3, 18);
            a.append(i.z3, 19);
            a.append(i.Y2, 26);
            a.append(i.K3, 31);
            a.append(i.L3, 32);
            a.append(i.w3, 10);
            a.append(i.v3, 9);
            a.append(i.X3, 13);
            a.append(i.a4, 16);
            a.append(i.Y3, 14);
            a.append(i.V3, 11);
            a.append(i.Z3, 15);
            a.append(i.W3, 12);
            a.append(i.R3, 38);
            a.append(i.D3, 37);
            a.append(i.C3, 39);
            a.append(i.Q3, 40);
            a.append(i.B3, 20);
            a.append(i.P3, 36);
            a.append(i.u3, 5);
            a.append(i.E3, 76);
            a.append(i.M3, 76);
            a.append(i.H3, 76);
            a.append(i.o3, 76);
            a.append(i.m3, 76);
            a.append(i.b3, 23);
            a.append(i.d3, 27);
            a.append(i.f3, 30);
            a.append(i.g3, 8);
            a.append(i.c3, 33);
            a.append(i.e3, 2);
            a.append(i.Z2, 22);
            a.append(i.a3, 21);
            a.append(i.r3, 61);
            a.append(i.t3, 62);
            a.append(i.s3, 63);
            a.append(i.S3, 69);
            a.append(i.A3, 70);
            a.append(i.k3, 71);
            a.append(i.i3, 72);
            a.append(i.j3, 73);
            a.append(i.l3, 74);
            a.append(i.h3, 75);
        }

        public void a(b bVar) {
            this.f735b = bVar.f735b;
            this.f737d = bVar.f737d;
            this.f736c = bVar.f736c;
            this.f738e = bVar.f738e;
            this.f739f = bVar.f739f;
            this.f740g = bVar.f740g;
            this.f741h = bVar.f741h;
            this.f742i = bVar.f742i;
            this.f743j = bVar.f743j;
            this.f744k = bVar.f744k;
            this.f745l = bVar.f745l;
            this.f746m = bVar.f746m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.h0 = bVar.h0;
            int[] iArr = bVar.f0;
            if (iArr != null) {
                this.f0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f0 = null;
            }
            this.g0 = bVar.g0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.k0 = bVar.k0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.X2);
            this.f736c = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = a.get(index);
                if (i3 == 80) {
                    this.i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.i0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.q = d.o(typedArrayObtainStyledAttributes, index, this.q);
                            break;
                        case 2:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 3:
                            this.p = d.o(typedArrayObtainStyledAttributes, index, this.p);
                            break;
                        case 4:
                            this.o = d.o(typedArrayObtainStyledAttributes, index, this.o);
                            break;
                        case 5:
                            this.x = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 7:
                            this.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                            break;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            this.u = d.o(typedArrayObtainStyledAttributes, index, this.u);
                            break;
                        case 10:
                            this.t = d.o(typedArrayObtainStyledAttributes, index, this.t);
                            break;
                        case 11:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 12:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 13:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 14:
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        case 16:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 17:
                            this.f739f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f739f);
                            break;
                        case 18:
                            this.f740g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f740g);
                            break;
                        case 19:
                            this.f741h = typedArrayObtainStyledAttributes.getFloat(index, this.f741h);
                            break;
                        case 20:
                            this.v = typedArrayObtainStyledAttributes.getFloat(index, this.v);
                            break;
                        case 21:
                            this.f738e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f738e);
                            break;
                        case 22:
                            this.f737d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f737d);
                            break;
                        case 23:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case SyslogConstants.LOG_DAEMON /* 24 */:
                            this.f742i = d.o(typedArrayObtainStyledAttributes, index, this.f742i);
                            break;
                        case 25:
                            this.f743j = d.o(typedArrayObtainStyledAttributes, index, this.f743j);
                            break;
                        case 26:
                            this.D = typedArrayObtainStyledAttributes.getInt(index, this.D);
                            break;
                        case 27:
                            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 28:
                            this.f744k = d.o(typedArrayObtainStyledAttributes, index, this.f744k);
                            break;
                        case 29:
                            this.f745l = d.o(typedArrayObtainStyledAttributes, index, this.f745l);
                            break;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                                break;
                            } else {
                                break;
                            }
                        case 31:
                            this.r = d.o(typedArrayObtainStyledAttributes, index, this.r);
                            break;
                        case 32:
                            this.s = d.o(typedArrayObtainStyledAttributes, index, this.s);
                            break;
                        case 33:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 34:
                            this.n = d.o(typedArrayObtainStyledAttributes, index, this.n);
                            break;
                        case 35:
                            this.f746m = d.o(typedArrayObtainStyledAttributes, index, this.f746m);
                            break;
                        case 36:
                            this.w = typedArrayObtainStyledAttributes.getFloat(index, this.w);
                            break;
                        case 37:
                            this.R = typedArrayObtainStyledAttributes.getFloat(index, this.R);
                            break;
                        case 38:
                            this.Q = typedArrayObtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 39:
                            this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                            break;
                        case 40:
                            this.T = typedArrayObtainStyledAttributes.getInt(index, this.T);
                            break;
                        default:
                            switch (i3) {
                                case 54:
                                    this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 55:
                                    this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                                    break;
                                case SyslogConstants.LOG_NEWS /* 56 */:
                                    this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 57:
                                    this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 58:
                                    this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                case 59:
                                    this.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    break;
                                default:
                                    switch (i3) {
                                        case 61:
                                            this.y = d.o(typedArrayObtainStyledAttributes, index, this.y);
                                            break;
                                        case 62:
                                            this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                                            break;
                                        case 63:
                                            this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                                            break;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case CoreConstants.OOS_RESET_FREQUENCY /* 70 */:
                                                    this.b0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case SyslogConstants.LOG_CRON /* 72 */:
                                                    this.c0 = typedArrayObtainStyledAttributes.getInt(index, this.c0);
                                                    break;
                                                case 73:
                                                    this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                                    break;
                                                case 74:
                                                    this.g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.k0 = typedArrayObtainStyledAttributes.getBoolean(index, this.k0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                                                    break;
                                                case 77:
                                                    this.h0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.j0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class c {
        private static SparseIntArray a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f747b = false;

        /* renamed from: c, reason: collision with root package name */
        public int f748c = -1;

        /* renamed from: d, reason: collision with root package name */
        public String f749d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f750e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f751f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f752g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f753h = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(i.l4, 1);
            a.append(i.n4, 2);
            a.append(i.o4, 3);
            a.append(i.k4, 4);
            a.append(i.j4, 5);
            a.append(i.m4, 6);
        }

        public void a(c cVar) {
            this.f747b = cVar.f747b;
            this.f748c = cVar.f748c;
            this.f749d = cVar.f749d;
            this.f750e = cVar.f750e;
            this.f751f = cVar.f751f;
            this.f753h = cVar.f753h;
            this.f752g = cVar.f752g;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.i4);
            this.f747b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (a.get(index)) {
                    case 1:
                        this.f753h = typedArrayObtainStyledAttributes.getFloat(index, this.f753h);
                        break;
                    case 2:
                        this.f750e = typedArrayObtainStyledAttributes.getInt(index, this.f750e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f749d = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f749d = c.f.a.a.a.f2754b[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f751f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f748c = d.o(typedArrayObtainStyledAttributes, index, this.f748c);
                        break;
                    case 6:
                        this.f752g = typedArrayObtainStyledAttributes.getFloat(index, this.f752g);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0006d {
        public boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f754b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f755c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f756d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f757e = Float.NaN;

        public void a(C0006d c0006d) {
            this.a = c0006d.a;
            this.f754b = c0006d.f754b;
            this.f756d = c0006d.f756d;
            this.f757e = c0006d.f757e;
            this.f755c = c0006d.f755c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.x4);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.z4) {
                    this.f756d = typedArrayObtainStyledAttributes.getFloat(index, this.f756d);
                } else if (index == i.y4) {
                    this.f754b = typedArrayObtainStyledAttributes.getInt(index, this.f754b);
                    this.f754b = d.a[this.f754b];
                } else if (index == i.B4) {
                    this.f755c = typedArrayObtainStyledAttributes.getInt(index, this.f755c);
                } else if (index == i.A4) {
                    this.f757e = typedArrayObtainStyledAttributes.getFloat(index, this.f757e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class e {
        private static SparseIntArray a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f758b = false;

        /* renamed from: c, reason: collision with root package name */
        public float f759c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f760d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f761e = 0.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f762f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f763g = 1.0f;

        /* renamed from: h, reason: collision with root package name */
        public float f764h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f765i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f766j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f767k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f768l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f769m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(i.V4, 1);
            a.append(i.W4, 2);
            a.append(i.X4, 3);
            a.append(i.T4, 4);
            a.append(i.U4, 5);
            a.append(i.P4, 6);
            a.append(i.Q4, 7);
            a.append(i.R4, 8);
            a.append(i.S4, 9);
            a.append(i.Y4, 10);
            a.append(i.Z4, 11);
        }

        public void a(e eVar) {
            this.f758b = eVar.f758b;
            this.f759c = eVar.f759c;
            this.f760d = eVar.f760d;
            this.f761e = eVar.f761e;
            this.f762f = eVar.f762f;
            this.f763g = eVar.f763g;
            this.f764h = eVar.f764h;
            this.f765i = eVar.f765i;
            this.f766j = eVar.f766j;
            this.f767k = eVar.f767k;
            this.f768l = eVar.f768l;
            this.f769m = eVar.f769m;
            this.n = eVar.n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.O4);
            this.f758b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (a.get(index)) {
                    case 1:
                        this.f759c = typedArrayObtainStyledAttributes.getFloat(index, this.f759c);
                        break;
                    case 2:
                        this.f760d = typedArrayObtainStyledAttributes.getFloat(index, this.f760d);
                        break;
                    case 3:
                        this.f761e = typedArrayObtainStyledAttributes.getFloat(index, this.f761e);
                        break;
                    case 4:
                        this.f762f = typedArrayObtainStyledAttributes.getFloat(index, this.f762f);
                        break;
                    case 5:
                        this.f763g = typedArrayObtainStyledAttributes.getFloat(index, this.f763g);
                        break;
                    case 6:
                        this.f764h = typedArrayObtainStyledAttributes.getDimension(index, this.f764h);
                        break;
                    case 7:
                        this.f765i = typedArrayObtainStyledAttributes.getDimension(index, this.f765i);
                        break;
                    case 8:
                        this.f766j = typedArrayObtainStyledAttributes.getDimension(index, this.f766j);
                        break;
                    case 9:
                        this.f767k = typedArrayObtainStyledAttributes.getDimension(index, this.f767k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f768l = typedArrayObtainStyledAttributes.getDimension(index, this.f768l);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f769m = true;
                            this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                            break;
                        } else {
                            break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f726b = sparseIntArray;
        sparseIntArray.append(i.u0, 25);
        f726b.append(i.v0, 26);
        f726b.append(i.x0, 29);
        f726b.append(i.y0, 30);
        f726b.append(i.E0, 36);
        f726b.append(i.D0, 35);
        f726b.append(i.c0, 4);
        f726b.append(i.b0, 3);
        f726b.append(i.Z, 1);
        f726b.append(i.M0, 6);
        f726b.append(i.N0, 7);
        f726b.append(i.j0, 17);
        f726b.append(i.k0, 18);
        f726b.append(i.l0, 19);
        f726b.append(i.s, 27);
        f726b.append(i.z0, 32);
        f726b.append(i.A0, 33);
        f726b.append(i.i0, 10);
        f726b.append(i.h0, 9);
        f726b.append(i.Q0, 13);
        f726b.append(i.T0, 16);
        f726b.append(i.R0, 14);
        f726b.append(i.O0, 11);
        f726b.append(i.S0, 15);
        f726b.append(i.P0, 12);
        f726b.append(i.H0, 40);
        f726b.append(i.s0, 39);
        f726b.append(i.r0, 41);
        f726b.append(i.G0, 42);
        f726b.append(i.q0, 20);
        f726b.append(i.F0, 37);
        f726b.append(i.g0, 5);
        f726b.append(i.t0, 82);
        f726b.append(i.C0, 82);
        f726b.append(i.w0, 82);
        f726b.append(i.a0, 82);
        f726b.append(i.Y, 82);
        f726b.append(i.x, 24);
        f726b.append(i.z, 28);
        f726b.append(i.L, 31);
        f726b.append(i.M, 8);
        f726b.append(i.y, 34);
        f726b.append(i.A, 2);
        f726b.append(i.v, 23);
        f726b.append(i.w, 21);
        f726b.append(i.u, 22);
        f726b.append(i.B, 43);
        f726b.append(i.O, 44);
        f726b.append(i.J, 45);
        f726b.append(i.K, 46);
        f726b.append(i.I, 60);
        f726b.append(i.G, 47);
        f726b.append(i.H, 48);
        f726b.append(i.C, 49);
        f726b.append(i.D, 50);
        f726b.append(i.E, 51);
        f726b.append(i.F, 52);
        f726b.append(i.N, 53);
        f726b.append(i.I0, 54);
        f726b.append(i.m0, 55);
        f726b.append(i.J0, 56);
        f726b.append(i.n0, 57);
        f726b.append(i.K0, 58);
        f726b.append(i.o0, 59);
        f726b.append(i.d0, 61);
        f726b.append(i.f0, 62);
        f726b.append(i.e0, 63);
        f726b.append(i.P, 64);
        f726b.append(i.X0, 65);
        f726b.append(i.V, 66);
        f726b.append(i.Y0, 67);
        f726b.append(i.V0, 79);
        f726b.append(i.t, 38);
        f726b.append(i.U0, 68);
        f726b.append(i.L0, 69);
        f726b.append(i.p0, 70);
        f726b.append(i.T, 71);
        f726b.append(i.R, 72);
        f726b.append(i.S, 73);
        f726b.append(i.U, 74);
        f726b.append(i.Q, 75);
        f726b.append(i.W0, 76);
        f726b.append(i.B0, 77);
        f726b.append(i.Z0, 78);
        f726b.append(i.X, 80);
        f726b.append(i.W, 81);
    }

    private int[] j(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objG;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objG = ((ConstraintLayout) view.getParent()).g(0, strTrim)) != null && (objG instanceof Integer)) {
                iIntValue = ((Integer) objG).intValue();
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private a k(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.r);
        p(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a l(int i2) {
        if (!this.f729e.containsKey(Integer.valueOf(i2))) {
            this.f729e.put(Integer.valueOf(i2), new a());
        }
        return this.f729e.get(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    private void p(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != i.t && i.L != index && i.M != index) {
                aVar.f731c.f747b = true;
                aVar.f732d.f736c = true;
                aVar.f730b.a = true;
                aVar.f733e.f758b = true;
            }
            switch (f726b.get(index)) {
                case 1:
                    b bVar = aVar.f732d;
                    bVar.q = o(typedArray, index, bVar.q);
                    break;
                case 2:
                    b bVar2 = aVar.f732d;
                    bVar2.H = typedArray.getDimensionPixelSize(index, bVar2.H);
                    break;
                case 3:
                    b bVar3 = aVar.f732d;
                    bVar3.p = o(typedArray, index, bVar3.p);
                    break;
                case 4:
                    b bVar4 = aVar.f732d;
                    bVar4.o = o(typedArray, index, bVar4.o);
                    break;
                case 5:
                    aVar.f732d.x = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f732d;
                    bVar5.B = typedArray.getDimensionPixelOffset(index, bVar5.B);
                    break;
                case 7:
                    b bVar6 = aVar.f732d;
                    bVar6.C = typedArray.getDimensionPixelOffset(index, bVar6.C);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.f732d;
                        bVar7.I = typedArray.getDimensionPixelSize(index, bVar7.I);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    b bVar8 = aVar.f732d;
                    bVar8.u = o(typedArray, index, bVar8.u);
                    break;
                case 10:
                    b bVar9 = aVar.f732d;
                    bVar9.t = o(typedArray, index, bVar9.t);
                    break;
                case 11:
                    b bVar10 = aVar.f732d;
                    bVar10.N = typedArray.getDimensionPixelSize(index, bVar10.N);
                    break;
                case 12:
                    b bVar11 = aVar.f732d;
                    bVar11.O = typedArray.getDimensionPixelSize(index, bVar11.O);
                    break;
                case 13:
                    b bVar12 = aVar.f732d;
                    bVar12.K = typedArray.getDimensionPixelSize(index, bVar12.K);
                    break;
                case 14:
                    b bVar13 = aVar.f732d;
                    bVar13.M = typedArray.getDimensionPixelSize(index, bVar13.M);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    b bVar14 = aVar.f732d;
                    bVar14.P = typedArray.getDimensionPixelSize(index, bVar14.P);
                    break;
                case 16:
                    b bVar15 = aVar.f732d;
                    bVar15.L = typedArray.getDimensionPixelSize(index, bVar15.L);
                    break;
                case 17:
                    b bVar16 = aVar.f732d;
                    bVar16.f739f = typedArray.getDimensionPixelOffset(index, bVar16.f739f);
                    break;
                case 18:
                    b bVar17 = aVar.f732d;
                    bVar17.f740g = typedArray.getDimensionPixelOffset(index, bVar17.f740g);
                    break;
                case 19:
                    b bVar18 = aVar.f732d;
                    bVar18.f741h = typedArray.getFloat(index, bVar18.f741h);
                    break;
                case 20:
                    b bVar19 = aVar.f732d;
                    bVar19.v = typedArray.getFloat(index, bVar19.v);
                    break;
                case 21:
                    b bVar20 = aVar.f732d;
                    bVar20.f738e = typedArray.getLayoutDimension(index, bVar20.f738e);
                    break;
                case 22:
                    C0006d c0006d = aVar.f730b;
                    c0006d.f754b = typedArray.getInt(index, c0006d.f754b);
                    C0006d c0006d2 = aVar.f730b;
                    c0006d2.f754b = a[c0006d2.f754b];
                    break;
                case 23:
                    b bVar21 = aVar.f732d;
                    bVar21.f737d = typedArray.getLayoutDimension(index, bVar21.f737d);
                    break;
                case SyslogConstants.LOG_DAEMON /* 24 */:
                    b bVar22 = aVar.f732d;
                    bVar22.E = typedArray.getDimensionPixelSize(index, bVar22.E);
                    break;
                case 25:
                    b bVar23 = aVar.f732d;
                    bVar23.f742i = o(typedArray, index, bVar23.f742i);
                    break;
                case 26:
                    b bVar24 = aVar.f732d;
                    bVar24.f743j = o(typedArray, index, bVar24.f743j);
                    break;
                case 27:
                    b bVar25 = aVar.f732d;
                    bVar25.D = typedArray.getInt(index, bVar25.D);
                    break;
                case 28:
                    b bVar26 = aVar.f732d;
                    bVar26.F = typedArray.getDimensionPixelSize(index, bVar26.F);
                    break;
                case 29:
                    b bVar27 = aVar.f732d;
                    bVar27.f744k = o(typedArray, index, bVar27.f744k);
                    break;
                case 30:
                    b bVar28 = aVar.f732d;
                    bVar28.f745l = o(typedArray, index, bVar28.f745l);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.f732d;
                        bVar29.J = typedArray.getDimensionPixelSize(index, bVar29.J);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    b bVar30 = aVar.f732d;
                    bVar30.r = o(typedArray, index, bVar30.r);
                    break;
                case 33:
                    b bVar31 = aVar.f732d;
                    bVar31.s = o(typedArray, index, bVar31.s);
                    break;
                case 34:
                    b bVar32 = aVar.f732d;
                    bVar32.G = typedArray.getDimensionPixelSize(index, bVar32.G);
                    break;
                case 35:
                    b bVar33 = aVar.f732d;
                    bVar33.n = o(typedArray, index, bVar33.n);
                    break;
                case 36:
                    b bVar34 = aVar.f732d;
                    bVar34.f746m = o(typedArray, index, bVar34.f746m);
                    break;
                case 37:
                    b bVar35 = aVar.f732d;
                    bVar35.w = typedArray.getFloat(index, bVar35.w);
                    break;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    break;
                case 39:
                    b bVar36 = aVar.f732d;
                    bVar36.R = typedArray.getFloat(index, bVar36.R);
                    break;
                case 40:
                    b bVar37 = aVar.f732d;
                    bVar37.Q = typedArray.getFloat(index, bVar37.Q);
                    break;
                case 41:
                    b bVar38 = aVar.f732d;
                    bVar38.S = typedArray.getInt(index, bVar38.S);
                    break;
                case 42:
                    b bVar39 = aVar.f732d;
                    bVar39.T = typedArray.getInt(index, bVar39.T);
                    break;
                case 43:
                    C0006d c0006d3 = aVar.f730b;
                    c0006d3.f756d = typedArray.getFloat(index, c0006d3.f756d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.f733e;
                        eVar.f769m = true;
                        eVar.n = typedArray.getDimension(index, eVar.n);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    e eVar2 = aVar.f733e;
                    eVar2.f760d = typedArray.getFloat(index, eVar2.f760d);
                    break;
                case 46:
                    e eVar3 = aVar.f733e;
                    eVar3.f761e = typedArray.getFloat(index, eVar3.f761e);
                    break;
                case 47:
                    e eVar4 = aVar.f733e;
                    eVar4.f762f = typedArray.getFloat(index, eVar4.f762f);
                    break;
                case SyslogConstants.LOG_LPR /* 48 */:
                    e eVar5 = aVar.f733e;
                    eVar5.f763g = typedArray.getFloat(index, eVar5.f763g);
                    break;
                case 49:
                    e eVar6 = aVar.f733e;
                    eVar6.f764h = typedArray.getDimension(index, eVar6.f764h);
                    break;
                case 50:
                    e eVar7 = aVar.f733e;
                    eVar7.f765i = typedArray.getDimension(index, eVar7.f765i);
                    break;
                case 51:
                    e eVar8 = aVar.f733e;
                    eVar8.f766j = typedArray.getDimension(index, eVar8.f766j);
                    break;
                case 52:
                    e eVar9 = aVar.f733e;
                    eVar9.f767k = typedArray.getDimension(index, eVar9.f767k);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.f733e;
                        eVar10.f768l = typedArray.getDimension(index, eVar10.f768l);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    b bVar40 = aVar.f732d;
                    bVar40.U = typedArray.getInt(index, bVar40.U);
                    break;
                case 55:
                    b bVar41 = aVar.f732d;
                    bVar41.V = typedArray.getInt(index, bVar41.V);
                    break;
                case SyslogConstants.LOG_NEWS /* 56 */:
                    b bVar42 = aVar.f732d;
                    bVar42.W = typedArray.getDimensionPixelSize(index, bVar42.W);
                    break;
                case 57:
                    b bVar43 = aVar.f732d;
                    bVar43.X = typedArray.getDimensionPixelSize(index, bVar43.X);
                    break;
                case 58:
                    b bVar44 = aVar.f732d;
                    bVar44.Y = typedArray.getDimensionPixelSize(index, bVar44.Y);
                    break;
                case 59:
                    b bVar45 = aVar.f732d;
                    bVar45.Z = typedArray.getDimensionPixelSize(index, bVar45.Z);
                    break;
                case 60:
                    e eVar11 = aVar.f733e;
                    eVar11.f759c = typedArray.getFloat(index, eVar11.f759c);
                    break;
                case 61:
                    b bVar46 = aVar.f732d;
                    bVar46.y = o(typedArray, index, bVar46.y);
                    break;
                case 62:
                    b bVar47 = aVar.f732d;
                    bVar47.z = typedArray.getDimensionPixelSize(index, bVar47.z);
                    break;
                case 63:
                    b bVar48 = aVar.f732d;
                    bVar48.A = typedArray.getFloat(index, bVar48.A);
                    break;
                case 64:
                    c cVar = aVar.f731c;
                    cVar.f748c = o(typedArray, index, cVar.f748c);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f731c.f749d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f731c.f749d = c.f.a.a.a.f2754b[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f731c.f751f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f731c;
                    cVar2.f753h = typedArray.getFloat(index, cVar2.f753h);
                    break;
                case 68:
                    C0006d c0006d4 = aVar.f730b;
                    c0006d4.f757e = typedArray.getFloat(index, c0006d4.f757e);
                    break;
                case 69:
                    aVar.f732d.a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case CoreConstants.OOS_RESET_FREQUENCY /* 70 */:
                    aVar.f732d.b0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case SyslogConstants.LOG_CRON /* 72 */:
                    b bVar49 = aVar.f732d;
                    bVar49.c0 = typedArray.getInt(index, bVar49.c0);
                    break;
                case 73:
                    b bVar50 = aVar.f732d;
                    bVar50.d0 = typedArray.getDimensionPixelSize(index, bVar50.d0);
                    break;
                case 74:
                    aVar.f732d.g0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f732d;
                    bVar51.k0 = typedArray.getBoolean(index, bVar51.k0);
                    break;
                case 76:
                    c cVar3 = aVar.f731c;
                    cVar3.f750e = typedArray.getInt(index, cVar3.f750e);
                    break;
                case 77:
                    aVar.f732d.h0 = typedArray.getString(index);
                    break;
                case 78:
                    C0006d c0006d5 = aVar.f730b;
                    c0006d5.f755c = typedArray.getInt(index, c0006d5.f755c);
                    break;
                case 79:
                    c cVar4 = aVar.f731c;
                    cVar4.f752g = typedArray.getFloat(index, cVar4.f752g);
                    break;
                case SyslogConstants.LOG_AUTHPRIV /* 80 */:
                    b bVar52 = aVar.f732d;
                    bVar52.i0 = typedArray.getBoolean(index, bVar52.i0);
                    break;
                case 81:
                    b bVar53 = aVar.f732d;
                    bVar53.j0 = typedArray.getBoolean(index, bVar53.j0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f726b.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f726b.get(index));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f729e.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f729e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + c.f.a.b.a.a(childAt));
            } else {
                if (this.f728d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f729e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f729e.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f732d.e0 = 1;
                        }
                        int i3 = aVar.f732d.e0;
                        if (i3 != -1 && i3 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f732d.c0);
                            barrier.setMargin(aVar.f732d.d0);
                            barrier.setAllowsGoneWidget(aVar.f732d.k0);
                            b bVar = aVar.f732d;
                            int[] iArr = bVar.f0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.g0;
                                if (str != null) {
                                    bVar.f0 = j(barrier, str);
                                    barrier.setReferencedIds(aVar.f732d.f0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f734f);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0006d c0006d = aVar.f730b;
                        if (c0006d.f755c == 0) {
                            childAt.setVisibility(c0006d.f754b);
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 17) {
                            childAt.setAlpha(aVar.f730b.f756d);
                            childAt.setRotation(aVar.f733e.f759c);
                            childAt.setRotationX(aVar.f733e.f760d);
                            childAt.setRotationY(aVar.f733e.f761e);
                            childAt.setScaleX(aVar.f733e.f762f);
                            childAt.setScaleY(aVar.f733e.f763g);
                            if (!Float.isNaN(aVar.f733e.f764h)) {
                                childAt.setPivotX(aVar.f733e.f764h);
                            }
                            if (!Float.isNaN(aVar.f733e.f765i)) {
                                childAt.setPivotY(aVar.f733e.f765i);
                            }
                            childAt.setTranslationX(aVar.f733e.f766j);
                            childAt.setTranslationY(aVar.f733e.f767k);
                            if (i4 >= 21) {
                                childAt.setTranslationZ(aVar.f733e.f768l);
                                e eVar = aVar.f733e;
                                if (eVar.f769m) {
                                    childAt.setElevation(eVar.n);
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f729e.get(num);
            int i5 = aVar2.f732d.e0;
            if (i5 != -1 && i5 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f732d;
                int[] iArr2 = bVar3.f0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.g0;
                    if (str2 != null) {
                        bVar3.f0 = j(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f732d.f0);
                    }
                }
                barrier2.setType(aVar2.f732d.c0);
                barrier2.setMargin(aVar2.f732d.d0);
                ConstraintLayout.b bVarE = constraintLayout.generateDefaultLayoutParams();
                barrier2.n();
                aVar2.d(bVarE);
                constraintLayout.addView(barrier2, bVarE);
            }
            if (aVar2.f732d.f735b) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b bVarE2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.d(bVarE2);
                constraintLayout.addView(guideline, bVarE2);
            }
        }
    }

    public void e(int i2, int i3) {
        if (this.f729e.containsKey(Integer.valueOf(i2))) {
            a aVar = this.f729e.get(Integer.valueOf(i2));
            switch (i3) {
                case 1:
                    b bVar = aVar.f732d;
                    bVar.f743j = -1;
                    bVar.f742i = -1;
                    bVar.E = -1;
                    bVar.K = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f732d;
                    bVar2.f745l = -1;
                    bVar2.f744k = -1;
                    bVar2.F = -1;
                    bVar2.M = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f732d;
                    bVar3.n = -1;
                    bVar3.f746m = -1;
                    bVar3.G = -1;
                    bVar3.L = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f732d;
                    bVar4.o = -1;
                    bVar4.p = -1;
                    bVar4.H = -1;
                    bVar4.N = -1;
                    return;
                case 5:
                    aVar.f732d.q = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f732d;
                    bVar5.r = -1;
                    bVar5.s = -1;
                    bVar5.J = -1;
                    bVar5.P = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f732d;
                    bVar6.t = -1;
                    bVar6.u = -1;
                    bVar6.I = -1;
                    bVar6.O = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void f(Context context, int i2) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f729e.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f728d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f729e.containsKey(Integer.valueOf(id))) {
                this.f729e.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f729e.get(Integer.valueOf(id));
            aVar.f734f = androidx.constraintlayout.widget.a.a(this.f727c, childAt);
            aVar.f(id, bVar);
            aVar.f730b.f754b = childAt.getVisibility();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 17) {
                aVar.f730b.f756d = childAt.getAlpha();
                aVar.f733e.f759c = childAt.getRotation();
                aVar.f733e.f760d = childAt.getRotationX();
                aVar.f733e.f761e = childAt.getRotationY();
                aVar.f733e.f762f = childAt.getScaleX();
                aVar.f733e.f763g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f733e;
                    eVar.f764h = pivotX;
                    eVar.f765i = pivotY;
                }
                aVar.f733e.f766j = childAt.getTranslationX();
                aVar.f733e.f767k = childAt.getTranslationY();
                if (i3 >= 21) {
                    aVar.f733e.f768l = childAt.getTranslationZ();
                    e eVar2 = aVar.f733e;
                    if (eVar2.f769m) {
                        eVar2.n = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f732d.k0 = barrier.o();
                aVar.f732d.f0 = barrier.getReferencedIds();
                aVar.f732d.c0 = barrier.getType();
                aVar.f732d.d0 = barrier.getMargin();
            }
        }
    }

    public void h(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f729e.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = eVar.getChildAt(i2);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f728d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f729e.containsKey(Integer.valueOf(id))) {
                this.f729e.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f729e.get(Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.b) {
                aVar2.h((androidx.constraintlayout.widget.b) childAt, id, aVar);
            }
            aVar2.g(id, aVar);
        }
    }

    public void i(int i2, int i3, int i4, float f2) {
        b bVar = l(i2).f732d;
        bVar.y = i3;
        bVar.z = i4;
        bVar.A = f2;
    }

    public void m(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarK = k(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarK.f732d.f735b = true;
                    }
                    this.f729e.put(Integer.valueOf(aVarK.a), aVarK);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0179, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.n(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}