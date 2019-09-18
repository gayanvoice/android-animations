package android.render.animations;
import android.animation.ObjectAnimator;
import android.view.View;

public class Attention{
    public static ObjectAnimator BounceAnimator(View view) {
        return ObjectAnimator.ofFloat(view, "translationY", 0, 0, -30, 0, -15, 0, 0);
    }

    public static ObjectAnimator FlashAnimator(View view){
        return  ObjectAnimator.ofFloat(view, "alpha", 1, 0, 1, 0, 1);
    }

}
