package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import ch.qos.logback.core.joran.action.Action;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
class k implements LayoutInflater.Factory2 {

    /* renamed from: e */
    private final m f1033e;

    k(m mVar) {
        this.f1033e = mVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (g.class.getName().equals(str)) {
            return new g(context, attributeSet, this.f1033e);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.l.c.f3255d);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(c.l.c.f3256e);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c.l.c.f3257f, -1);
        String string = typedArrayObtainStyledAttributes.getString(c.l.c.f3258g);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !i.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentW = resourceId != -1 ? this.f1033e.W(resourceId) : null;
        if (fragmentW == null && string != null) {
            fragmentW = this.f1033e.X(string);
        }
        if (fragmentW == null && id != -1) {
            fragmentW = this.f1033e.W(id);
        }
        if (m.p0(2)) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragmentW);
        }
        if (fragmentW == null) {
            fragmentW = this.f1033e.e0().a(context.getClassLoader(), attributeValue);
            fragmentW.r = true;
            fragmentW.A = resourceId != 0 ? resourceId : id;
            fragmentW.B = id;
            fragmentW.C = string;
            fragmentW.s = true;
            m mVar = this.f1033e;
            fragmentW.w = mVar;
            j<?> jVar = mVar.p;
            fragmentW.x = jVar;
            fragmentW.x1(jVar.e(), attributeSet, fragmentW.f974g);
            this.f1033e.d(fragmentW);
            this.f1033e.z0(fragmentW);
        } else {
            if (fragmentW.s) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentW.s = true;
            j<?> jVar2 = this.f1033e.p;
            fragmentW.x = jVar2;
            fragmentW.x1(jVar2.e(), attributeSet, fragmentW.f974g);
        }
        m mVar2 = this.f1033e;
        if (mVar2.o >= 1 || !fragmentW.r) {
            mVar2.z0(fragmentW);
        } else {
            mVar2.A0(fragmentW, 1);
        }
        View view2 = fragmentW.L;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragmentW.L.getTag() == null) {
                fragmentW.L.setTag(string);
            }
            return fragmentW.L;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}