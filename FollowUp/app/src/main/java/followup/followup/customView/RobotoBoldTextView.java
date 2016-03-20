package followup.followup.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Rakoon on 3/20/2016.
 */
public class RobotoBoldTextView extends TextView {

    public RobotoBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/roboto-bold.ttf"));
    }
}
