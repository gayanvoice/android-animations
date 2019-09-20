package render.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import render.animations.Attention;
import render.animations.Bounce;
import render.animations.Fade;
import render.animations.Flip;
import render.animations.Render;
import render.animations.Rotate;
import render.animations.Slide;
import render.animations.Zoom;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Render render;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAttentionBounce = findViewById(R.id.btn_attention_bounce); // bounce
        Button buttonAttentionFlash = findViewById(R.id.btn_attention_flash); // flash
        Button buttonAttentionPulse = findViewById(R.id.btn_attention_pulse); // pulse
        Button buttonAttentionRuberband = findViewById(R.id.btn_attention_ruberband); // ruberband
        Button buttonAttentionShake = findViewById(R.id.btn_attention_shake); // shake
        Button buttonAttentionStandup = findViewById(R.id.btn_attention_stand_up); // standup
        Button buttonAttentionSwing = findViewById(R.id.btn_attention_swing); // swing
        Button buttonAttentionTada = findViewById(R.id.btn_attention_tada); // tada
        Button buttonAttentionWave = findViewById(R.id.btn_attention_wave); // wave
        Button buttonAttentionWobble = findViewById(R.id.btn_attention_wobble); // wobble

        Button buttonBounceInLeft = findViewById(R.id.btn_bounce_inleft); // bounce in left
        Button buttonBounceInRight = findViewById(R.id.btn_bounce_inright); // bounce in right
        Button buttonBounceInUp = findViewById(R.id.button_bounce_inup); // bounce in up
        Button buttonBounceInDown = findViewById(R.id.btn_bounce_indown); // bounce in down
        Button buttonBounceIn = findViewById(R.id.btn_bounce_in); // bounce in

        Button buttonFadeInUp = findViewById(R.id.btn_fade_inup); // fade in up
        Button buttonFadeInDown = findViewById(R.id.btn_fade_indown); // fade in down
        Button buttonFadeInRight = findViewById(R.id.btn_fade_inright); // fade in right
        Button buttonFadeInLeft = findViewById(R.id.btn_fade_inleft); // fade left

        Button buttonFadeOutUp = findViewById(R.id.btn_fade_outup); // fade out up
        Button buttonFadeOutDown = findViewById(R.id.btn_fade_outdown); // fade out down
        Button buttonFadeOutRight = findViewById(R.id.btn_fade_outright); // fade out right
        Button buttonFadeOutLeft = findViewById(R.id.btn_fade_outleft); // fade out left

        Button buttonFadeIn = findViewById(R.id.btn_fade_in); // fade in
        Button buttonFadeOut = findViewById(R.id.btn_fade_out); // fade out

        Button buttonFlipInX = findViewById(R.id.btn_flip_inx); // flip in x
        Button buttonFlipInY = findViewById(R.id.btn_flip_iny); // flip in y
        Button buttonFlipOutX = findViewById(R.id.btn_flip_outx); // flip out x
        Button buttonFlipOutY = findViewById(R.id.btn_flip_outy); // flip out y

        Button buttonRotateInDownLeft = findViewById(R.id.btn_rotate_indownleft); // rotate in down left
        Button buttonRotateInDownRight = findViewById(R.id.btn_rotate_indownright); // rotate in down right
        Button buttonRotateInUpLeft = findViewById(R.id.btn_rotate_inupleft); // rotate in up left
        Button buttonRotateInUpRight = findViewById(R.id.btn_rotate_inupright); // rotate in up right
        Button buttonRotateOutDownLeft = findViewById(R.id.btn_rotate_outdownleft); // rotate out down left
        Button buttonRotateOutDownRight = findViewById(R.id.btn_rotate_outdownright); // rotate out down right
        Button buttonRotateOutUpLeft = findViewById(R.id.btn_rotate_outupleft); // rotate out up left
        Button buttonRotateOutUpRight = findViewById(R.id.btn_rotate_outupright); // rotate out up right

        Button buttonRotateIn = findViewById(R.id.btn_rotate_in); // rotate in
        Button buttonRotateOut = findViewById(R.id.btn_rotate_out); // rotate out

        Button buttonSlideInDown = findViewById(R.id.btn_slide_indown); // slide in down
        Button buttonSlideInLeft = findViewById(R.id.btn_slide_inleft); // slide in left
        Button buttonSlideInRight = findViewById(R.id.btn_slide_inright); // slide in right
        Button buttonSlideInUp = findViewById(R.id.btn_slide_inup); // slide in up
        Button buttonSlideOutDown = findViewById(R.id.btn_slide_outdown); // slide out down
        Button buttonSlideOutLeft = findViewById(R.id.btn_slide_outleft); // slide out left
        Button buttonSlideOutRight = findViewById(R.id.btn_slide_outright); // slide out right
        Button buttonSlideOutUp = findViewById(R.id.btn_slide_outup); // slide out up

        Button buttonZoomIn = findViewById(R.id.btn_zoom_in); // zoom in
        Button buttonZoomInDown = findViewById(R.id.btn_zoom_indown); // zoom in down
        Button buttonZoomInLeft = findViewById(R.id.btn_zoom_inleft); // zoom in left
        Button buttonZoomInRight = findViewById(R.id.btn_zoom_inright); // error
        Button buttonZoomInUp = findViewById(R.id.btn_zoom_inup); // zoom in up
        Button buttonZoomOut = findViewById(R.id.btn_zoom_out); /// zoom out
        Button buttonZoomOutDown = findViewById(R.id.btn_zoom_outdown); // zoom out down
        Button buttonZoomOutLeft = findViewById(R.id.btn_zoom_outleft); // zoom out left
        Button buttonZoomOutRight = findViewById(R.id.btn_zoom_outright); // zoom out right
        Button buttonZoomOutUp = findViewById(R.id.btn_zoom_outup); // zoom out up

        imageView = findViewById(R.id.iv_image);

        render = new Render(this);
        render.setDuration(1000);

        buttonAttentionBounce.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Bounce(imageView));
                render.start();
            }
        });

        buttonAttentionFlash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Flash(imageView));
                render.start();
            }
        });

        buttonAttentionPulse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Pulse(imageView));
                render.start();
            }
        });

        buttonAttentionRuberband.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.RuberBand(imageView));
                render.start();
            }
        });

        buttonAttentionShake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Shake(imageView));
                render.start();
            }
        });

        buttonAttentionStandup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.StandUp(imageView));
                render.start();
            }
        });

        buttonAttentionSwing.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Swing(imageView));
                render.start();
            }
        });

        buttonAttentionTada.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Tada(imageView));
                render.start();
            }
        });

        buttonAttentionWave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Wave(imageView));
                render.start();
            }
        });

        buttonAttentionWobble.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Attention.Wobble(imageView));
                render.start();
            }
        });

        buttonBounceInLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InLeft(imageView));
                render.start();
            }
        });

        buttonBounceInRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InRight(imageView));
                render.start();
            }
        });

        buttonBounceInUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InUp(imageView));
                render.start();
            }
        });

        buttonBounceInDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InDown(imageView));
                render.start();
            }
        });

        buttonBounceIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.In(imageView));
                render.start();
            }
        });

        buttonFadeInUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InUp(imageView));
                render.start();
            }
        });

        buttonFadeInDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InDown(imageView));
                render.start();
            }
        });

        buttonFadeInRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InRight(imageView));
                render.start();
            }
        });

        buttonFadeInLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InLeft(imageView));
                render.start();
            }
        });

        buttonFadeOutUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutUp(imageView));
                render.start();
            }
        });


        buttonFadeOutDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutDown(imageView));
                render.start();
            }
        });

        buttonFadeOutRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutRight(imageView));
                render.start();
            }
        });

        buttonFadeOutLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutLeft(imageView));
                render.start();
            }
        });

        buttonFadeIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.In(imageView));
                render.start();
            }
        });

        buttonFadeOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.Out(imageView));
                render.start();
            }
        });

        buttonFlipInX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.InX(imageView));
                render.start();
            }
        });

        buttonFlipInY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.InY(imageView));
                render.start();
            }
        });

        buttonFlipOutX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.OutX(imageView));
                render.start();
            }
        });

        buttonFlipOutY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.OutY(imageView));
                render.start();
            }
        });

        buttonRotateInDownLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.InDownLeft(imageView));
                render.start();
            }
        });

        buttonRotateInDownRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.InDownRight(imageView));
                render.start();
            }
        });

        buttonRotateInUpLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.InUpLeft(imageView));
                render.start();
            }
        });

        buttonRotateInUpRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.InUpRight(imageView));
                render.start();
            }
        });

        buttonRotateOutDownLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.OutDownLeft(imageView));
                render.start();
            }
        });

        buttonRotateOutDownRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.OutDownRight(imageView));
                render.start();
            }
        });

        buttonRotateOutUpLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.OutUpLeft(imageView));
                render.start();
            }
        });

        buttonRotateOutUpRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.OutUpRight(imageView));
                render.start();
            }
        });

        buttonRotateIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.In(imageView));
                render.start();
            }
        });

        buttonRotateOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Rotate.Out(imageView));
                render.start();
            }
        });

        buttonSlideInDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.InDown(imageView));
                render.start();
            }
        });

        buttonSlideInLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.InLeft(imageView));
                render.start();
            }
        });

        buttonSlideInRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.InRight(imageView));
                render.start();
            }
        });

        buttonSlideInUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.InUp(imageView));
                render.start();
            }
        });

        buttonSlideOutDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.OutDown(imageView));
                render.start();
            }
        });

        buttonSlideOutLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.OutLeft(imageView));
                render.start();
            }
        });

        buttonSlideOutRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.OutRight(imageView));
                render.start();
            }
        });

        buttonSlideOutUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Slide.OutUp(imageView));
                render.start();
            }
        });

        buttonZoomIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.In(imageView));
                render.start();
            }
        });

        buttonZoomInDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.InDown(imageView));
                render.start();
            }
        });


        buttonZoomInLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.InLeft(imageView));
                render.start();
            }
        });

        buttonZoomInRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.InRight(imageView));
                render.start();
            }
        });

        buttonZoomInUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.InUp(imageView));
                render.start();
            }
        });

        buttonZoomOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.Out(imageView));
                render.start();
            }
        });

        buttonZoomOutDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.OutDown(imageView));
                render.start();
            }
        });

        buttonZoomOutLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.OutLeft(imageView));
                render.start();
            }
        });

        buttonZoomOutRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.OutRight(imageView));
                render.start();
            }
        });

        buttonZoomOutUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Zoom.OutUp(imageView));
                render.start();
            }
        });

    }
}
