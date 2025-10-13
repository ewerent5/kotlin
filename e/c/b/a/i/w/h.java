package e.c.b.a.i.w;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;

/* compiled from: SchedulingModule.java */
/* loaded from: classes.dex */
public abstract class h {
    static s a(Context context, e.c.b.a.i.w.j.c cVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.g gVar, e.c.b.a.i.y.a aVar) {
        return Build.VERSION.SDK_INT >= 21 ? new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(context, cVar, gVar) : new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(context, cVar, aVar, gVar);
    }
}