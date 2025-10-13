package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.w;
import androidx.appcompat.widget.z;
import c.h.l.t;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class h {
    private static final Class<?>[] a = {Context.class, AttributeSet.class};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f109b = {R.attr.onClick};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f110c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d, reason: collision with root package name */
    private static final c.e.g<String, Constructor<? extends View>> f111d = new c.e.g<>();

    /* renamed from: e, reason: collision with root package name */
    private final Object[] f112e = new Object[2];

    /* compiled from: AppCompatViewInflater.java */
    private static class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        private final View f113e;

        /* renamed from: f, reason: collision with root package name */
        private final String f114f;

        /* renamed from: g, reason: collision with root package name */
        private Method f115g;

        /* renamed from: h, reason: collision with root package name */
        private Context f116h;

        public a(View view, String str) {
            this.f113e = view;
            this.f114f = str;
        }

        private void b(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f114f, View.class)) != null) {
                        this.f115g = method;
                        this.f116h = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f113e.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f113e.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f114f + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f113e.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f115g == null) {
                b(this.f113e.getContext());
            }
            try {
                this.f115g.invoke(this.f116h, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || t.L(view)) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f109b);
                String string = typedArrayObtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    private View r(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        c.e.g<String, Constructor<? extends View>> gVar = f111d;
        Constructor<? extends View> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(a);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f112e);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
        }
        try {
            Object[] objArr = this.f112e;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f110c;
                if (i2 >= strArr.length) {
                    return null;
                }
                View viewR = r(context, str, strArr[i2]);
                if (viewR != null) {
                    return viewR;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f112e;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.j.O3, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(c.a.j.P3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(c.a.j.Q3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof c.a.o.d) && ((c.a.o.d) context).c() == resourceId) ? context : new c.a.o.d(context, resourceId) : context;
    }

    private void u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected androidx.appcompat.widget.d b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    protected androidx.appcompat.widget.f c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    protected androidx.appcompat.widget.g d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    protected androidx.appcompat.widget.h e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    protected androidx.appcompat.widget.k f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.k(context, attributeSet);
    }

    protected androidx.appcompat.widget.m g(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.m(context, attributeSet);
    }

    protected o h(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    protected p i(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected s j(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    protected androidx.appcompat.widget.t k(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.t(context, attributeSet);
    }

    protected u l(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    protected w m(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    protected z n(Context context, AttributeSet attributeSet) {
        return new z(context, attributeSet);
    }

    protected b0 o(Context context, AttributeSet attributeSet) {
        return new b0(context, attributeSet);
    }

    protected View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View viewK;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = t0.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewK = k(context2, attributeSet);
                u(viewK, str);
                break;
            case "CheckedTextView":
                viewK = e(context2, attributeSet);
                u(viewK, str);
                break;
            case "MultiAutoCompleteTextView":
                viewK = i(context2, attributeSet);
                u(viewK, str);
                break;
            case "TextView":
                viewK = n(context2, attributeSet);
                u(viewK, str);
                break;
            case "ImageButton":
                viewK = g(context2, attributeSet);
                u(viewK, str);
                break;
            case "SeekBar":
                viewK = l(context2, attributeSet);
                u(viewK, str);
                break;
            case "Spinner":
                viewK = m(context2, attributeSet);
                u(viewK, str);
                break;
            case "RadioButton":
                viewK = j(context2, attributeSet);
                u(viewK, str);
                break;
            case "ToggleButton":
                viewK = o(context2, attributeSet);
                u(viewK, str);
                break;
            case "ImageView":
                viewK = h(context2, attributeSet);
                u(viewK, str);
                break;
            case "AutoCompleteTextView":
                viewK = b(context2, attributeSet);
                u(viewK, str);
                break;
            case "CheckBox":
                viewK = d(context2, attributeSet);
                u(viewK, str);
                break;
            case "EditText":
                viewK = f(context2, attributeSet);
                u(viewK, str);
                break;
            case "Button":
                viewK = c(context2, attributeSet);
                u(viewK, str);
                break;
            default:
                viewK = p(context2, str, attributeSet);
                break;
        }
        if (viewK == null && context != context2) {
            viewK = s(context2, str, attributeSet);
        }
        if (viewK != null) {
            a(viewK, attributeSet);
        }
        return viewK;
    }
}