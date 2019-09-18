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

    public static AnimatorSet RuberBand(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,  "scaleX", 1, 1.25f, 0.75f, 1.15f, 1);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,  "scaleY", 1, 0.75f, 1.25f, 0.85f, 1);
        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet Shake(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,   "translationX", 0, 25, -25, 25, -25, 15, -15, 6, -6, 0);
        animatorSet.playTogether(object1);
        return animatorSet;
    }

    public static AnimatorSet StandUp(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        float x = (view.getWidth() - view.getPaddingLeft() - view.getPaddingRight()) / 2 + view.getPaddingLeft();
        float y = view.getHeight() - view.getPaddingBottom();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,   "pivotX", x, x, x, x, x);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,   "pivotY", y, y, y, y, y);
        ObjectAnimator object3 = ObjectAnimator.ofFloat(view,   "rotationX", 55, -30, 15, -15, 0);

        animatorSet.playTogether(object1, object2, object3);
        return animatorSet;
    }
}
