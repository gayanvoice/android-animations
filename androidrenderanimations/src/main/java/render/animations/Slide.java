package render.animations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

public class Slide {
    public static AnimatorSet InDown(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        int distance = view.getTop() + view.getHeight();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,"alpha", 0, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,"translationY", - distance, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet InLeft(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        ViewGroup parent = (ViewGroup) view.getParent();
        int distance = parent.getWidth() - view.getLeft();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view, "alpha", 0, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,"translationX", - distance, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet InRight(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        ViewGroup parent = (ViewGroup) view.getParent();
        int distance = parent.getWidth() - view.getLeft();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,   "alpha", 0, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,  "translationX", distance, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet InUp(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        ViewGroup parent = (ViewGroup) view.getParent();
        int distance = parent.getHeight() - view.getTop();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,    "alpha", 0, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,    "translationY", distance, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet OutDown(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        ViewGroup parent = (ViewGroup) view.getParent();
        int distance = parent.getHeight() - view.getTop();

        ObjectAnimator object1 =   ObjectAnimator.ofFloat(view, "alpha", 1, 0);
        ObjectAnimator object2 =   ObjectAnimator.ofFloat(view, "translationY", 0, distance);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet OutLeft(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        float right = view.getRight();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,"alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,"translationX", 0, - right);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet OutRight(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        ViewGroup parent = (ViewGroup) view.getParent();
        int distance = parent.getWidth() - view.getLeft();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,"alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,"translationX", 0, distance);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet OutUp(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        float bottom = - view.getBottom();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,   "alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,   "translationY", 0, bottom);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }
}