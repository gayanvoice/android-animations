package render.animations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

public class Rotate {
    public static AnimatorSet In(View view) {
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,"alpha", 0, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,"rotation", -200, 0);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet InDownLeft(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        float x = view.getPaddingLeft();
        float y = view.getHeight() - view.getPaddingBottom();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,"rotation", -90, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,"alpha", 0, 1);
        ObjectAnimator object3 = ObjectAnimator.ofFloat(view,"pivotX", x, x);
        ObjectAnimator object4 = ObjectAnimator.ofFloat(view,"pivotY", y, y);

        animatorSet.playTogether(object1, object2, object3, object4);
        return animatorSet;
    }

    public static AnimatorSet InDownRight(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        float x = view.getWidth() - view.getPaddingRight();
        float y = view.getHeight() - view.getPaddingBottom();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,  "rotation", 90, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view, "alpha", 0, 1);
        ObjectAnimator object3 = ObjectAnimator.ofFloat(view,  "pivotX", x, x);
        ObjectAnimator object4 = ObjectAnimator.ofFloat(view,  "pivotY", y, y);

        animatorSet.playTogether(object1, object2, object3, object4);
        return animatorSet;
    }

    public static AnimatorSet InUpLeft(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        float x = view.getPaddingLeft();
        float y = view.getHeight() - view.getPaddingBottom();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,   "rotation", 90, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,    "alpha", 0, 1);
        ObjectAnimator object3 = ObjectAnimator.ofFloat(view,    "pivotX", x, x);
        ObjectAnimator object4 = ObjectAnimator.ofFloat(view,    "pivotY", y, y);

        animatorSet.playTogether(object1, object2, object3, object4);
        return animatorSet;
    }

    public static AnimatorSet InUpRight(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        float x = view.getWidth() - view.getPaddingRight();
        float y = view.getHeight() - view.getPaddingBottom();

        ObjectAnimator object1 =   ObjectAnimator.ofFloat(view, "rotation", -90, 0);
        ObjectAnimator object2 =   ObjectAnimator.ofFloat(view, "alpha", 0, 1);
        ObjectAnimator object3 =   ObjectAnimator.ofFloat(view, "pivotX", x, x);
        ObjectAnimator object4 =   ObjectAnimator.ofFloat(view, "pivotY", y, y);

        animatorSet.playTogether(object1, object2, object3, object4);
        return animatorSet;
    }

    /*
    Out
     */

    public static AnimatorSet Out(View view) {
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,"alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,"rotation", 0, 200);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet OutDownLeft(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        float x = view.getPaddingLeft();
        float y = view.getHeight() - view.getPaddingBottom();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,"alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,"rotation", 0, 90);
        ObjectAnimator object3 = ObjectAnimator.ofFloat(view,"pivotX", x, x);
        ObjectAnimator object4 = ObjectAnimator.ofFloat(view,"pivotY", y, y);

        animatorSet.playTogether(object1, object2, object3, object4);
        return animatorSet;
    }

    public static AnimatorSet OutDownRight(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        float x = view.getWidth() - view.getPaddingRight();
        float y = view.getHeight() - view.getPaddingBottom();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,  "alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,  "rotation", 0, -90);
        ObjectAnimator object3 = ObjectAnimator.ofFloat(view,  "pivotX", x, x);
        ObjectAnimator object4 = ObjectAnimator.ofFloat(view,  "pivotY", y, y);

        animatorSet.playTogether(object1, object2, object3, object4);
        return animatorSet;
    }

    public static AnimatorSet OutUpLeft(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        float x = view.getPaddingLeft();
        float y = view.getHeight() - view.getPaddingBottom();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view, "alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view, "rotation", 0, -90);
        ObjectAnimator object3 = ObjectAnimator.ofFloat(view, "pivotX", x, x);
        ObjectAnimator object4 = ObjectAnimator.ofFloat(view, "pivotY", y, y);

        animatorSet.playTogether(object1, object2, object3, object4);
        return animatorSet;
    }

    public static AnimatorSet OutUpRight(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        float x = view.getWidth() - view.getPaddingRight();
        float y = view.getHeight() - view.getPaddingBottom();

        ObjectAnimator object1 =   ObjectAnimator.ofFloat(view, "alpha", 1, 0);
        ObjectAnimator object2 =   ObjectAnimator.ofFloat(view, "rotation", 0, 90);
        ObjectAnimator object3 =   ObjectAnimator.ofFloat(view, "pivotX", x, x);
        ObjectAnimator object4 =   ObjectAnimator.ofFloat(view, "pivotY", y, y);

        animatorSet.playTogether(object1, object2, object3, object4);
        return animatorSet;
    }

}