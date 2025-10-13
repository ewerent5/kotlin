package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.v;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class o implements Iterable<Intent>, Iterable {

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<Intent> f883e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private final Context f884f;

    /* compiled from: TaskStackBuilder.java */
    public interface a {
        Intent m();
    }

    private o(Context context) {
        this.f884f = context;
    }

    public static o h(Context context) {
        return new o(context);
    }

    public o a(Intent intent) {
        this.f883e.add(intent);
        return this;
    }

    public o c(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f884f.getPackageManager());
        }
        if (component != null) {
            f(component);
        }
        a(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o e(Activity activity) {
        Intent intentM = activity instanceof a ? ((a) activity).m() : null;
        if (intentM == null) {
            intentM = g.a(activity);
        }
        if (intentM != null) {
            ComponentName component = intentM.getComponent();
            if (component == null) {
                component = intentM.resolveActivity(this.f884f.getPackageManager());
            }
            f(component);
            a(intentM);
        }
        return this;
    }

    public o f(ComponentName componentName) {
        int size = this.f883e.size();
        try {
            Intent intentB = g.b(this.f884f, componentName);
            while (intentB != null) {
                this.f883e.add(size, intentB);
                intentB = g.b(this.f884f, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f883e.iterator();
    }

    public void k() {
        l(null);
    }

    public void l(Bundle bundle) {
        if (this.f883e.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f883e;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.h(this.f884f, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f884f.startActivity(intent);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return v.o(iterator(), 0);
    }
}