package android.render.animations;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;

public class Render {
    private long duration = 1000;
    private Context cx;
    private AnimatorSet animatorSet;

    // Render render = new Render(this)
    public Render  (Context cx) {
        this.cx = cx;
    }

    // render.setAnimation(Anim.FadeInRight(textView))
    public void setAnimation (AnimatorSet animationSet) {
        this.animatorSet = animationSet;
    }

    // render.start()
    public void start() {
        animatorSet.setDuration(duration);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
    }

    // render.setDuration(false)
    public void setDuration(long duration){
        this.duration = duration;
    }


}
