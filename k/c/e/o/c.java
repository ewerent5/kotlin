package k.c.e.o;

import android.os.Handler;
import android.os.Message;
import android.view.View;

/* compiled from: SimpleInvalidationHandler.java */
/* loaded from: classes3.dex */
public class c extends Handler {
    private View a;

    public c(View view) {
        this.a = view;
    }

    public void a() {
        this.a = null;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        View view;
        if (message.what == 0 && (view = this.a) != null) {
            view.invalidate();
        }
    }
}