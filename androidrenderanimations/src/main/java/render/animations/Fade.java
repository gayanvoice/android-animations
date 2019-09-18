package render.animations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

public class Fade {
    public static AnimatorSet In(View view) {
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object = ObjectAnimator.ofFloat(view, "alpha", 0, 1);

        animatorSet.playTogether(object);
        return animatorSet;
    }

    public static AnimatorSet InLeft(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long width =  - view.getWidth();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view, "alpha", 0, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view, "translationX", width / 4, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet InRight(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long width =  view.getWidth();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,  "alpha", 0, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,   "translationX", width / 4, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet InUp(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long height = view.getHeight();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,   "alpha", 0, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,    "translationY", height / 4, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet InDown(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long height = - view.getHeight();

        ObjectAnimator object1 =   ObjectAnimator.ofFloat(view,  "alpha", 0, 1);
        ObjectAnimator object2 =   ObjectAnimator.ofFloat(view,   "translationY", height / 4, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    /*
    Out
     */

    public static AnimatorSet Out(View view) {
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object = ObjectAnimator.ofFloat(view,  "alpha", 1, 0);

        animatorSet.playTogether(object);
        return animatorSet;
    }

    public static AnimatorSet OutLeft(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long width =  - view.getWidth();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view, "alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view, "translationX", 0, width / 4);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet OutRight(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long width =  view.getWidth();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,   "alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,    "translationX", 0, width / 4);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet OutUp(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long height = view.getHeight();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,   "alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,    "translationY", 0, height / 4);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet OutDown(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long height = - view.getHeight();

        ObjectAnimator object1 =   ObjectAnimator.ofFloat(view,   "alpha", 1, 0);
        ObjectAnimator object2 =   ObjectAnimator.ofFloat(view,    "translationY", 0, height / 4);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

}