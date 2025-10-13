package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.preference.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private c M;
    private List<Preference> N;
    private PreferenceGroup O;
    private boolean P;
    private boolean Q;
    private f R;
    private g S;
    private final View.OnClickListener T;

    /* renamed from: e, reason: collision with root package name */
    private Context f1394e;

    /* renamed from: f, reason: collision with root package name */
    private j f1395f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.preference.e f1396g;

    /* renamed from: h, reason: collision with root package name */
    private long f1397h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1398i;

    /* renamed from: j, reason: collision with root package name */
    private d f1399j;

    /* renamed from: k, reason: collision with root package name */
    private e f1400k;

    /* renamed from: l, reason: collision with root package name */
    private int f1401l;

    /* renamed from: m, reason: collision with root package name */
    private int f1402m;
    private CharSequence n;
    private CharSequence o;
    private int p;
    private Drawable q;
    private String r;
    private Intent s;
    private String t;
    private Bundle u;
    private boolean v;
    private boolean w;
    private boolean x;
    private String y;
    private Object z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.e0(view);
        }
    }

    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        static class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    interface c {
        void a(Preference preference);

        void b(Preference preference);
    }

    public interface d {
        boolean a(Preference preference, Object obj);
    }

    public interface e {
        boolean a(Preference preference);
    }

    private static class f implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: e, reason: collision with root package name */
        private final Preference f1404e;

        f(Preference preference) {
            this.f1404e = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence charSequenceB = this.f1404e.B();
            if (!this.f1404e.G() || TextUtils.isEmpty(charSequenceB)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceB);
            contextMenu.add(0, 0, 0, r.a).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f1404e.k().getSystemService("clipboard");
            CharSequence charSequenceB = this.f1404e.B();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceB));
            Toast.makeText(this.f1404e.k(), this.f1404e.k().getString(r.f1474d, charSequenceB), 0).show();
            return true;
        }
    }

    public interface g<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1401l = Integer.MAX_VALUE;
        this.f1402m = 0;
        this.v = true;
        this.w = true;
        this.x = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.G = true;
        this.J = true;
        int i4 = q.f1469b;
        this.K = i4;
        this.T = new a();
        this.f1394e = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.s0, i2, i3);
        this.p = androidx.core.content.c.g.n(typedArrayObtainStyledAttributes, t.Q0, t.t0, 0);
        this.r = androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.T0, t.z0);
        this.n = androidx.core.content.c.g.p(typedArrayObtainStyledAttributes, t.b1, t.x0);
        this.o = androidx.core.content.c.g.p(typedArrayObtainStyledAttributes, t.a1, t.A0);
        this.f1401l = androidx.core.content.c.g.d(typedArrayObtainStyledAttributes, t.V0, t.B0, Integer.MAX_VALUE);
        this.t = androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.P0, t.G0);
        this.K = androidx.core.content.c.g.n(typedArrayObtainStyledAttributes, t.U0, t.w0, i4);
        this.L = androidx.core.content.c.g.n(typedArrayObtainStyledAttributes, t.c1, t.C0, 0);
        this.v = androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, t.O0, t.v0, true);
        this.w = androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, t.X0, t.y0, true);
        this.x = androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, t.W0, t.u0, true);
        this.y = androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.M0, t.D0);
        int i5 = t.J0;
        this.D = androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, i5, i5, this.w);
        int i6 = t.K0;
        this.E = androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, i6, i6, this.w);
        int i7 = t.L0;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            this.z = V(typedArrayObtainStyledAttributes, i7);
        } else {
            int i8 = t.E0;
            if (typedArrayObtainStyledAttributes.hasValue(i8)) {
                this.z = V(typedArrayObtainStyledAttributes, i8);
            }
        }
        this.J = androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, t.Y0, t.F0, true);
        int i9 = t.Z0;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i9);
        this.F = zHasValue;
        if (zHasValue) {
            this.G = androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, i9, t.H0, true);
        }
        this.H = androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, t.R0, t.I0, false);
        int i10 = t.S0;
        this.C = androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, i10, i10, true);
        int i11 = t.N0;
        this.I = androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, i11, i11, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void B0(SharedPreferences.Editor editor) {
        if (this.f1395f.r()) {
            editor.apply();
        }
    }

    private void C0() {
        Preference preferenceJ;
        String str = this.y;
        if (str == null || (preferenceJ = j(str)) == null) {
            return;
        }
        preferenceJ.D0(this);
    }

    private void D0(Preference preference) {
        List<Preference> list = this.N;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void h() {
        if (y() != null) {
            c0(true, this.z);
            return;
        }
        if (A0() && A().contains(this.r)) {
            c0(true, null);
            return;
        }
        Object obj = this.z;
        if (obj != null) {
            c0(false, obj);
        }
    }

    private void j0() {
        if (TextUtils.isEmpty(this.y)) {
            return;
        }
        Preference preferenceJ = j(this.y);
        if (preferenceJ != null) {
            preferenceJ.k0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.y + "\" not found for preference \"" + this.r + "\" (title: \"" + ((Object) this.n) + "\"");
    }

    private void k0(Preference preference) {
        if (this.N == null) {
            this.N = new ArrayList();
        }
        this.N.add(preference);
        preference.T(this, z0());
    }

    private void n0(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                n0(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public SharedPreferences A() {
        if (this.f1395f == null || y() != null) {
            return null;
        }
        return this.f1395f.j();
    }

    protected boolean A0() {
        return this.f1395f != null && I() && F();
    }

    public CharSequence B() {
        return C() != null ? C().a(this) : this.o;
    }

    public final g C() {
        return this.S;
    }

    public CharSequence D() {
        return this.n;
    }

    public final int E() {
        return this.L;
    }

    public boolean F() {
        return !TextUtils.isEmpty(this.r);
    }

    public boolean G() {
        return this.I;
    }

    public boolean H() {
        return this.v && this.A && this.B;
    }

    public boolean I() {
        return this.x;
    }

    public boolean J() {
        return this.w;
    }

    public final boolean K() {
        return this.C;
    }

    protected void L() {
        c cVar = this.M;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    public void M(boolean z) {
        List<Preference> list = this.N;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).T(this, z);
        }
    }

    protected void N() {
        c cVar = this.M;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    public void O() {
        j0();
    }

    protected void P(j jVar) {
        this.f1395f = jVar;
        if (!this.f1398i) {
            this.f1397h = jVar.d();
        }
        h();
    }

    protected void Q(j jVar, long j2) {
        this.f1397h = j2;
        this.f1398i = true;
        try {
            P(jVar);
        } finally {
            this.f1398i = false;
        }
    }

    public void R(l lVar) {
        Integer numValueOf;
        View view = lVar.f1546f;
        view.setOnClickListener(this.T);
        view.setId(this.f1402m);
        TextView textView = (TextView) lVar.N(R.id.summary);
        if (textView != null) {
            CharSequence charSequenceB = B();
            if (TextUtils.isEmpty(charSequenceB)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceB);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) lVar.N(R.id.title);
        if (textView2 != null) {
            CharSequence charSequenceD = D();
            if (TextUtils.isEmpty(charSequenceD)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequenceD);
                textView2.setVisibility(0);
                if (this.F) {
                    textView2.setSingleLine(this.G);
                }
                if (!J() && H() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) lVar.N(R.id.icon);
        if (imageView != null) {
            int i2 = this.p;
            if (i2 != 0 || this.q != null) {
                if (this.q == null) {
                    this.q = c.a.k.a.a.d(this.f1394e, i2);
                }
                Drawable drawable = this.q;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.q != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.H ? 4 : 8);
            }
        }
        View viewN = lVar.N(p.a);
        if (viewN == null) {
            viewN = lVar.N(R.id.icon_frame);
        }
        if (viewN != null) {
            if (this.q != null) {
                viewN.setVisibility(0);
            } else {
                viewN.setVisibility(this.H ? 4 : 8);
            }
        }
        if (this.J) {
            n0(view, H());
        } else {
            n0(view, true);
        }
        boolean zJ = J();
        view.setFocusable(zJ);
        view.setClickable(zJ);
        lVar.Q(this.D);
        lVar.S(this.E);
        boolean zG = G();
        if (zG && this.R == null) {
            this.R = new f(this);
        }
        view.setOnCreateContextMenuListener(zG ? this.R : null);
        view.setLongClickable(zG);
        if (!zG || zJ) {
            return;
        }
        c.h.l.t.n0(view, null);
    }

    protected void S() {
    }

    public void T(Preference preference, boolean z) {
        if (this.A == z) {
            this.A = !z;
            M(z0());
            L();
        }
    }

    public void U() {
        C0();
        this.P = true;
    }

    protected Object V(TypedArray typedArray, int i2) {
        return null;
    }

    @Deprecated
    public void W(c.h.l.c0.c cVar) {
    }

    public void X(Preference preference, boolean z) {
        if (this.B == z) {
            this.B = !z;
            M(z0());
            L();
        }
    }

    protected void Y() {
        C0();
    }

    protected void Z(Parcelable parcelable) {
        this.Q = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    void a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.O != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.O = preferenceGroup;
    }

    protected Parcelable a0() {
        this.Q = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public boolean b(Object obj) {
        d dVar = this.f1399j;
        return dVar == null || dVar.a(this, obj);
    }

    protected void b0(Object obj) {
    }

    final void c() {
        this.P = false;
    }

    @Deprecated
    protected void c0(boolean z, Object obj) {
        b0(obj);
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i2 = this.f1401l;
        int i3 = preference.f1401l;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.n;
        CharSequence charSequence2 = preference.n;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.n.toString());
    }

    public void d0() {
        j.c cVarF;
        if (H() && J()) {
            S();
            e eVar = this.f1400k;
            if (eVar == null || !eVar.a(this)) {
                j jVarZ = z();
                if ((jVarZ == null || (cVarF = jVarZ.f()) == null || !cVarF.X(this)) && this.s != null) {
                    k().startActivity(this.s);
                }
            }
        }
    }

    void e(Bundle bundle) {
        Parcelable parcelable;
        if (!F() || (parcelable = bundle.getParcelable(this.r)) == null) {
            return;
        }
        this.Q = false;
        Z(parcelable);
        if (!this.Q) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    protected void e0(View view) {
        d0();
    }

    void f(Bundle bundle) {
        if (F()) {
            this.Q = false;
            Parcelable parcelableA0 = a0();
            if (!this.Q) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableA0 != null) {
                bundle.putParcelable(this.r, parcelableA0);
            }
        }
    }

    protected boolean f0(boolean z) {
        if (!A0()) {
            return false;
        }
        if (z == u(!z)) {
            return true;
        }
        if (y() != null) {
            throw null;
        }
        SharedPreferences.Editor editorC = this.f1395f.c();
        editorC.putBoolean(this.r, z);
        B0(editorC);
        return true;
    }

    protected boolean g0(int i2) {
        if (!A0()) {
            return false;
        }
        if (i2 == v(~i2)) {
            return true;
        }
        if (y() != null) {
            throw null;
        }
        SharedPreferences.Editor editorC = this.f1395f.c();
        editorC.putInt(this.r, i2);
        B0(editorC);
        return true;
    }

    protected boolean h0(String str) {
        if (!A0()) {
            return false;
        }
        if (TextUtils.equals(str, w(null))) {
            return true;
        }
        if (y() != null) {
            throw null;
        }
        SharedPreferences.Editor editorC = this.f1395f.c();
        editorC.putString(this.r, str);
        B0(editorC);
        return true;
    }

    public boolean i0(Set<String> set) {
        if (!A0()) {
            return false;
        }
        if (set.equals(x(null))) {
            return true;
        }
        if (y() != null) {
            throw null;
        }
        SharedPreferences.Editor editorC = this.f1395f.c();
        editorC.putStringSet(this.r, set);
        B0(editorC);
        return true;
    }

    protected <T extends Preference> T j(String str) {
        j jVar = this.f1395f;
        if (jVar == null) {
            return null;
        }
        return (T) jVar.a(str);
    }

    public Context k() {
        return this.f1394e;
    }

    public Bundle l() {
        if (this.u == null) {
            this.u = new Bundle();
        }
        return this.u;
    }

    public void l0(Bundle bundle) {
        e(bundle);
    }

    StringBuilder m() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceD = D();
        if (!TextUtils.isEmpty(charSequenceD)) {
            sb.append(charSequenceD);
            sb.append(' ');
        }
        CharSequence charSequenceB = B();
        if (!TextUtils.isEmpty(charSequenceB)) {
            sb.append(charSequenceB);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public void m0(Bundle bundle) {
        f(bundle);
    }

    public String n() {
        return this.t;
    }

    long o() {
        return this.f1397h;
    }

    public void o0(int i2) {
        p0(c.a.k.a.a.d(this.f1394e, i2));
        this.p = i2;
    }

    public Intent p() {
        return this.s;
    }

    public void p0(Drawable drawable) {
        if (this.q != drawable) {
            this.q = drawable;
            this.p = 0;
            L();
        }
    }

    public String q() {
        return this.r;
    }

    public void q0(Intent intent) {
        this.s = intent;
    }

    public final int r() {
        return this.K;
    }

    public void r0(int i2) {
        this.K = i2;
    }

    public int s() {
        return this.f1401l;
    }

    final void s0(c cVar) {
        this.M = cVar;
    }

    public PreferenceGroup t() {
        return this.O;
    }

    public void t0(e eVar) {
        this.f1400k = eVar;
    }

    public String toString() {
        return m().toString();
    }

    protected boolean u(boolean z) {
        if (!A0()) {
            return z;
        }
        if (y() == null) {
            return this.f1395f.j().getBoolean(this.r, z);
        }
        throw null;
    }

    public void u0(int i2) {
        if (i2 != this.f1401l) {
            this.f1401l = i2;
            N();
        }
    }

    protected int v(int i2) {
        if (!A0()) {
            return i2;
        }
        if (y() == null) {
            return this.f1395f.j().getInt(this.r, i2);
        }
        throw null;
    }

    public void v0(CharSequence charSequence) {
        if (C() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.o, charSequence)) {
            return;
        }
        this.o = charSequence;
        L();
    }

    protected String w(String str) {
        if (!A0()) {
            return str;
        }
        if (y() == null) {
            return this.f1395f.j().getString(this.r, str);
        }
        throw null;
    }

    public final void w0(g gVar) {
        this.S = gVar;
        L();
    }

    public Set<String> x(Set<String> set) {
        if (!A0()) {
            return set;
        }
        if (y() == null) {
            return this.f1395f.j().getStringSet(this.r, set);
        }
        throw null;
    }

    public void x0(int i2) {
        y0(this.f1394e.getString(i2));
    }

    public androidx.preference.e y() {
        androidx.preference.e eVar = this.f1396g;
        if (eVar != null) {
            return eVar;
        }
        j jVar = this.f1395f;
        if (jVar != null) {
            return jVar.h();
        }
        return null;
    }

    public void y0(CharSequence charSequence) {
        if ((charSequence != null || this.n == null) && (charSequence == null || charSequence.equals(this.n))) {
            return;
        }
        this.n = charSequence;
        L();
    }

    public j z() {
        return this.f1395f;
    }

    public boolean z0() {
        return !H();
    }

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.c.g.a(context, m.f1459i, R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}