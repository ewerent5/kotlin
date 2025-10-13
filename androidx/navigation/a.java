package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.r;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ActivityNavigator.java */
@r.b("activity")
/* loaded from: classes.dex */
public class a extends r<C0016a> {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f1258b;

    /* compiled from: ActivityNavigator.java */
    /* renamed from: androidx.navigation.a$a, reason: collision with other inner class name */
    public static class C0016a extends j {
        private Intent n;
        private String o;

        public C0016a(r<? extends C0016a> rVar) {
            super(rVar);
        }

        public final String E() {
            Intent intent = this.n;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        public final ComponentName F() {
            Intent intent = this.n;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        public final String G() {
            return this.o;
        }

        public final Intent H() {
            return this.n;
        }

        public final C0016a I(String str) {
            if (this.n == null) {
                this.n = new Intent();
            }
            this.n.setAction(str);
            return this;
        }

        public final C0016a J(ComponentName componentName) {
            if (this.n == null) {
                this.n = new Intent();
            }
            this.n.setComponent(componentName);
            return this;
        }

        public final C0016a K(Uri uri) {
            if (this.n == null) {
                this.n = new Intent();
            }
            this.n.setData(uri);
            return this;
        }

        public final C0016a L(String str) {
            this.o = str;
            return this;
        }

        public final C0016a M(String str) {
            if (this.n == null) {
                this.n = new Intent();
            }
            this.n.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.j
        public void t(Context context, AttributeSet attributeSet) {
            super.t(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, u.a);
            String string = typedArrayObtainAttributes.getString(u.f1370f);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            M(string);
            String string2 = typedArrayObtainAttributes.getString(u.f1366b);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                J(new ComponentName(context, string2));
            }
            I(typedArrayObtainAttributes.getString(u.f1367c));
            String string3 = typedArrayObtainAttributes.getString(u.f1368d);
            if (string3 != null) {
                K(Uri.parse(string3));
            }
            L(typedArrayObtainAttributes.getString(u.f1369e));
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.j
        public String toString() {
            ComponentName componentNameF = F();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentNameF != null) {
                sb.append(" class=");
                sb.append(componentNameF.getClassName());
            } else {
                String strE = E();
                if (strE != null) {
                    sb.append(" action=");
                    sb.append(strE);
                }
            }
            return sb.toString();
        }

        @Override // androidx.navigation.j
        boolean z() {
            return false;
        }
    }

    /* compiled from: ActivityNavigator.java */
    public static final class b implements r.a {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.app.b f1259b;

        public androidx.core.app.b a() {
            return this.f1259b;
        }

        public int b() {
            return this.a;
        }
    }

    public a(Context context) {
        this.a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f1258b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @Override // androidx.navigation.r
    public boolean e() {
        Activity activity = this.f1258b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.r
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0016a a() {
        return new C0016a(this);
    }

    final Context g() {
        return this.a;
    }

    @Override // androidx.navigation.r
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public j b(C0016a c0016a, Bundle bundle, o oVar, r.a aVar) {
        Intent intent;
        int intExtra;
        if (c0016a.H() == null) {
            throw new IllegalStateException("Destination " + c0016a.n() + " does not have an Intent set.");
        }
        Intent intent2 = new Intent(c0016a.H());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String strG = c0016a.G();
            if (!TextUtils.isEmpty(strG)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strG);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + strG);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(bundle.get(strGroup).toString()));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = aVar instanceof b;
        if (z) {
            intent2.addFlags(((b) aVar).b());
        }
        if (!(this.a instanceof Activity)) {
            intent2.addFlags(268435456);
        }
        if (oVar != null && oVar.g()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f1258b;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c0016a.n());
        Resources resources = g().getResources();
        if (oVar != null) {
            int iC = oVar.c();
            int iD = oVar.d();
            if ((iC <= 0 || !resources.getResourceTypeName(iC).equals("animator")) && (iD <= 0 || !resources.getResourceTypeName(iD).equals("animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", iC);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", iD);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(iC) + " and popExit resource " + resources.getResourceName(iD) + "when launching " + c0016a);
            }
        }
        if (z && ((b) aVar).a() != null) {
            throw null;
        }
        this.a.startActivity(intent2);
        if (oVar != null && this.f1258b != null) {
            int iA = oVar.a();
            int iB = oVar.b();
            if ((iA > 0 && resources.getResourceTypeName(iA).equals("animator")) || (iB > 0 && resources.getResourceTypeName(iB).equals("animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(iA) + " and exit resource " + resources.getResourceName(iB) + "when launching " + c0016a);
            } else if (iA >= 0 || iB >= 0) {
                this.f1258b.overridePendingTransition(Math.max(iA, 0), Math.max(iB, 0));
            }
        }
        return null;
    }
}