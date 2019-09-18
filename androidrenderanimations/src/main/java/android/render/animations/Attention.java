package android.render.animations;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

public class Attention{

    public static AnimatorSet Bounce(View view) {
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view, "translationY", 0, 0, -30, 0, -15, 0, 0);

        animatorSet.playTogether(object1);
        return animatorSet;
    }

    public static AnimatorSet Flash(View view){
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object1 =   ObjectAnimator.ofFloat(view, "alpha", 1, 0, 1, 0, 1);
        animatorSet.playTogether(object1);

        return animatorSet;
    }

    public static AnimatorSet Pulse(View view){
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view, "scaleY", 1, 1.1f, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view, "scaleX", 1, 1.1f, 1);

        animatorSet.playTogether(object1, object2);
        return animatorSet;

    }


}
