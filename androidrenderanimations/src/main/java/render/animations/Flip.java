package render.animations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

public class Flip {
    public static AnimatorSet InX(View view) {
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,  "alpha", 0.25f, 0.5f, 0.75f, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,  "rotationX", 90, -15, 15, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet InY(View view){
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view, "alpha", 0.25f, 0.5f, 0.75f, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view, "rotationY", 90, -15, 15, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet OutX(View view){
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view, "alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view, "rotationX", 0, 90);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet OutY(View view){
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,    "alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,    "rotationY", 0, 90);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

}