package render.animations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

public class Fade {
    public static AnimatorSet In(View view) {
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view, "alpha", 0, 1, 1, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view, "scaleX", 0.3f, 1.05f, 0.9f, 1);
        ObjectAnimator object3 = ObjectAnimator.ofFloat(view, "scaleY", 0.3f, 1.05f, 0.9f, 1);

        animatorSet.playTogether(object1, object2, object3);
        return animatorSet;
    }

    public static AnimatorSet InDown(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long height = - view.getHeight();
        ObjectAnimator object1 =   ObjectAnimator.ofFloat(view,  "alpha", 0, 1, 1, 1);
        ObjectAnimator object2 =   ObjectAnimator.ofFloat(view,  "translationY", height, 30, -10, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet InLeft(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long width =  - view.getWidth();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view, "translationX", width, 30, -10, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view, "alpha", 0, 1, 1, 1);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet InRight(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long width =  - view.getWidth();
        long measured_width =  - view.getMeasuredWidth();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,  "translationX", measured_width + width, -30, 10, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,   "alpha", 0, 1, 1, 1);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet InUp(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long measured_height = view.getMeasuredHeight();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,   "translationY", measured_height, -30, 10, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,   "alpha", 0, 1, 1, 1);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

}