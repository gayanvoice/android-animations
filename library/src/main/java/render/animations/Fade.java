/*
 * MIT License
 *
 * Copyright (c) 2019 Gayan Kuruppu
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
        long height = - view.getHeight();

        ObjectAnimator object1 = ObjectAnimator.ofFloat(view,   "alpha", 1, 0);
        ObjectAnimator object2 = ObjectAnimator.ofFloat(view,    "translationY", 0, height / 4);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

    public static AnimatorSet OutDown(View view){
        AnimatorSet animatorSet = new AnimatorSet();
        long height = view.getHeight();

        ObjectAnimator object1 =   ObjectAnimator.ofFloat(view,   "alpha", 1, 0);
        ObjectAnimator object2 =   ObjectAnimator.ofFloat(view,    "translationY", 0, height / 4);

        animatorSet.playTogether(object1, object2);
        return animatorSet;
    }

}