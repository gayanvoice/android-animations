package android.render.animations;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;

public class Render {
    long duration = 1000;
    Context cx;
    ObjectAnimator animation;

    // Render render = new Render(this)
    public Render  (Context cx) {
        this.cx = cx;
    }

    // render.setAnimation(Anim.FadeInRight(textView))
    public void setAnimation (ObjectAnimator animation) {
        this.animation = animation;
    }


    // render.start()
    public void start() {
        animation.setDuration(duration);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        animation.start();
    }

    // render.setDuration(false)
    public void setDuration(long duration){
        this.duration = duration;
    }


}
