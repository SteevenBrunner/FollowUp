package followup.followup.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Rakoon on 3/20/2016.
 */
public class PiersansTextView extends TextView {

    public PiersansTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/pier-sans.otf"));
    }
}
