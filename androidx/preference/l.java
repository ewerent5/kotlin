package androidx.preference;

import android.R;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceViewHolder.java */
/* loaded from: classes.dex */
public class l extends RecyclerView.d0 {
    private final SparseArray<View> x;
    private boolean y;
    private boolean z;

    l(View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.x = sparseArray;
        sparseArray.put(R.id.title, view.findViewById(R.id.title));
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i2 = p.a;
        sparseArray.put(i2, view.findViewById(i2));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
    }

    public View N(int i2) {
        View view = this.x.get(i2);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.f1546f.findViewById(i2);
        if (viewFindViewById != null) {
            this.x.put(i2, viewFindViewById);
        }
        return viewFindViewById;
    }

    public boolean O() {
        return this.y;
    }

    public boolean P() {
        return this.z;
    }

    public void Q(boolean z) {
        this.y = z;
    }

    public void S(boolean z) {
        this.z = z;
    }
}