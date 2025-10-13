package e.f.o;

import com.google.android.gms.ads.AdRequest;
import e.f.l.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: RowValidatorAggregator.java */
/* loaded from: classes.dex */
public class d {
    private List<c> a = new ArrayList();

    public void a(String[] strArr) throws e {
        if (this.a.isEmpty()) {
            return;
        }
        StringBuilder sb = null;
        Iterator<c> it = this.a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(strArr);
            } catch (e e2) {
                if (sb == null) {
                    sb = new StringBuilder(Math.max((e2.getMessage().length() + 2) * 3, AdRequest.MAX_CONTENT_URL_LENGTH));
                }
                sb.append(e2.getMessage());
                sb.append("\n");
            }
        }
        if (sb != null && sb.length() > 0) {
            throw new e(sb.toString());
        }
    }
}