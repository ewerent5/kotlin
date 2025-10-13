package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: SuggestionsAdapter.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
class q0 extends c.i.a.c implements View.OnClickListener {
    private int A;
    private int B;
    private int C;
    private final SearchView p;
    private final SearchableInfo q;
    private final Context r;
    private final WeakHashMap<String, Drawable.ConstantState> s;
    private final int t;
    private boolean u;
    private int v;
    private ColorStateList w;
    private int x;
    private int y;
    private int z;

    /* compiled from: SuggestionsAdapter.java */
    private static final class a {
        public final TextView a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f557b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f558c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f559d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f560e;

        public a(View view) {
            this.a = (TextView) view.findViewById(R.id.text1);
            this.f557b = (TextView) view.findViewById(R.id.text2);
            this.f558c = (ImageView) view.findViewById(R.id.icon1);
            this.f559d = (ImageView) view.findViewById(R.id.icon2);
            this.f560e = (ImageView) view.findViewById(c.a.f.q);
        }
    }

    public q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.u = false;
        this.v = 1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.p = searchView;
        this.q = searchableInfo;
        this.t = searchView.getSuggestionCommitIconResId();
        this.r = context;
        this.s = weakHashMap;
    }

    private void A(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void B(String str, Drawable drawable) {
        if (drawable != null) {
            this.s.put(str, drawable.getConstantState());
        }
    }

    private void C(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    private Drawable l(String str) {
        Drawable.ConstantState constantState = this.s.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence m(CharSequence charSequence) {
        if (this.w == null) {
            TypedValue typedValue = new TypedValue();
            this.f3183h.getTheme().resolveAttribute(c.a.a.L, typedValue, true);
            this.w = this.f3183h.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.w, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable n(ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.f3183h.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("SuggestionsAdapter", e2.toString());
            return null;
        }
    }

    private Drawable o(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.s.containsKey(strFlattenToShortString)) {
            Drawable drawableN = n(componentName);
            this.s.put(strFlattenToShortString, drawableN != null ? drawableN.getConstantState() : null);
            return drawableN;
        }
        Drawable.ConstantState constantState = this.s.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.r.getResources());
    }

    public static String p(Cursor cursor, String str) {
        return x(cursor, cursor.getColumnIndex(str));
    }

    private Drawable q() throws PackageManager.NameNotFoundException {
        Drawable drawableO = o(this.q.getSearchActivity());
        return drawableO != null ? drawableO : this.f3183h.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable r(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return s(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.r.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e2) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                }
            }
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    private Drawable t(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i2 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.r.getPackageName() + "/" + i2;
            Drawable drawableL = l(str2);
            if (drawableL != null) {
                return drawableL;
            }
            Drawable drawableE = androidx.core.content.a.e(this.r, i2);
            B(str2, drawableE);
            return drawableE;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableL2 = l(str);
            if (drawableL2 != null) {
                return drawableL2;
            }
            Drawable drawableR = r(Uri.parse(str));
            B(str, drawableR);
            return drawableR;
        }
    }

    private Drawable u(Cursor cursor) throws NumberFormatException, IOException {
        int i2 = this.A;
        if (i2 == -1) {
            return null;
        }
        Drawable drawableT = t(cursor.getString(i2));
        return drawableT != null ? drawableT : q();
    }

    private Drawable v(Cursor cursor) {
        int i2 = this.B;
        if (i2 == -1) {
            return null;
        }
        return t(cursor.getString(i2));
    }

    private static String x(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    private void z(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // c.i.a.a, c.i.a.b.a
    public void b(Cursor cursor) {
        if (this.u) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.x = cursor.getColumnIndex("suggest_text_1");
                this.y = cursor.getColumnIndex("suggest_text_2");
                this.z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // c.i.a.a, c.i.a.b.a
    public CharSequence d(Cursor cursor) {
        String strP;
        String strP2;
        if (cursor == null) {
            return null;
        }
        String strP3 = p(cursor, "suggest_intent_query");
        if (strP3 != null) {
            return strP3;
        }
        if (this.q.shouldRewriteQueryFromData() && (strP2 = p(cursor, "suggest_intent_data")) != null) {
            return strP2;
        }
        if (!this.q.shouldRewriteQueryFromText() || (strP = p(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strP;
    }

    @Override // c.i.a.b.a
    public Cursor e(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.p.getVisibility() == 0 && this.p.getWindowVisibility() == 0) {
            try {
                Cursor cursorW = w(this.q, string, 50);
                if (cursorW != null) {
                    cursorW.getCount();
                    return cursorW;
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        }
        return null;
    }

    @Override // c.i.a.a
    public void f(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i2 = this.C;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        if (aVar.a != null) {
            A(aVar.a, x(cursor, this.x));
        }
        if (aVar.f557b != null) {
            String strX = x(cursor, this.z);
            CharSequence charSequenceM = strX != null ? m(strX) : x(cursor, this.y);
            if (TextUtils.isEmpty(charSequenceM)) {
                TextView textView = aVar.a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.a.setMaxLines(1);
                }
            }
            A(aVar.f557b, charSequenceM);
        }
        ImageView imageView = aVar.f558c;
        if (imageView != null) {
            z(imageView, u(cursor), 4);
        }
        ImageView imageView2 = aVar.f559d;
        if (imageView2 != null) {
            z(imageView2, v(cursor), 8);
        }
        int i4 = this.v;
        if (i4 != 2 && (i4 != 1 || (i3 & 1) == 0)) {
            aVar.f560e.setVisibility(8);
            return;
        }
        aVar.f560e.setVisibility(0);
        aVar.f560e.setTag(aVar.a.getText());
        aVar.f560e.setOnClickListener(this);
    }

    @Override // c.i.a.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewH = h(this.f3183h, this.f3182g, viewGroup);
            if (viewH != null) {
                ((a) viewH.getTag()).a.setText(e2.toString());
            }
            return viewH;
        }
    }

    @Override // c.i.a.a, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewI = i(this.f3183h, this.f3182g, viewGroup);
            if (viewI != null) {
                ((a) viewI.getTag()).a.setText(e2.toString());
            }
            return viewI;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // c.i.a.c, c.i.a.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewI = super.i(context, cursor, viewGroup);
        viewI.setTag(new a(viewI));
        ((ImageView) viewI.findViewById(c.a.f.q)).setImageResource(this.t);
        return viewI;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        C(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        C(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.p.U((CharSequence) tag);
        }
    }

    Drawable s(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f3183h.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor w(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f3183h.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void y(int i2) {
        this.v = i2;
    }
}