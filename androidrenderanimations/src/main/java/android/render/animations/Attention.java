package android.render.animations;
import android.animation.ObjectAnimator;
import android.view.View;

public class Attention{
    public static ObjectAnimator Bounce(View view) {
        return ObjectAnimator.ofFloat(view, "translationY", 0, 0, -30, 0, -15, 0, 0);
    }

    public static ObjectAnimator Flash(View view){
        return  ObjectAnimator.ofFloat(view, "alpha", 1, 0, 1, 0, 1);
    }

    public static ObjectAnimator Pulse(View view){
        return  ObjectAnimator.ofFloat(view, "alpha", 1, 0, 1, 0, 1);
    }

}
