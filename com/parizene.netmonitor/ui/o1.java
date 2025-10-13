package com.parizene.netmonitor.ui;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.parizene.netmonitor.R;

/* compiled from: ToolbarActivity.kt */
/* loaded from: classes3.dex */
public abstract class o1 extends androidx.appcompat.app.c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(o1 o1Var, View view) {
        i.y.d.l.d(o1Var, "this$0");
        o1Var.finish();
    }

    public abstract int U();

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(U());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        c.h.l.t.r0(toolbar, TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics()));
        toolbar.setTitle(getTitle());
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o1.W(this.f13843e, view);
            }
        });
    }
}