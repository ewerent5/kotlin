package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzs;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class a6 extends RelativeLayout {

    /* renamed from: e, reason: collision with root package name */
    private static final float[] f4845e = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: f, reason: collision with root package name */
    private AnimationDrawable f4846f;

    public a6(Context context, z5 z5Var, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        com.google.android.gms.common.internal.p.j(z5Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f4845e, null, null));
        shapeDrawable.getPaint().setColor(z5Var.zze());
        setLayoutParams(layoutParams);
        zzs.zze();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(z5Var.zzb())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(z5Var.zzb());
            textView.setTextColor(z5Var.zzf());
            textView.setTextSize(z5Var.J4());
            ta3.a();
            int iS = xq.s(context, 4);
            ta3.a();
            textView.setPadding(iS, 0, xq.s(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<c6> listZzd = z5Var.zzd();
        if (listZzd != null && listZzd.size() > 1) {
            this.f4846f = new AnimationDrawable();
            Iterator<c6> it = listZzd.iterator();
            while (it.hasNext()) {
                try {
                    this.f4846f.addFrame((Drawable) e.c.b.b.b.d.Y(it.next().zzb()), z5Var.K4());
                } catch (Exception e2) {
                    er.zzg("Error while getting drawable.", e2);
                }
            }
            zzs.zze();
            imageView.setBackground(this.f4846f);
        } else if (listZzd.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) e.c.b.b.b.d.Y(listZzd.get(0).zzb()));
            } catch (Exception e3) {
                er.zzg("Error while getting drawable.", e3);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f4846f;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}