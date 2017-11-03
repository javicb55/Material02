package es.vcarmen.material02;

import android.animation.Animator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Toast;

public class Material02 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material02);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setScaleX(0);
        fab.setScaleY(0);

        //Creamos Interpolator
        final Interpolator interpolator = AnimationUtils.loadInterpolator
                (getBaseContext(),android.R.interpolator.fast_out_linear_in);

        //Creamos el animate
        fab.animate().scaleX(1).scaleY(1).setInterpolator(interpolator).
                setDuration(600).setStartDelay(1000).setListener(new Animator.AnimatorListener(){
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                fab.animate().scaleX(1).scaleY(1).setInterpolator(interpolator).
                        setDuration(600).start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Material02.this,"FAB TOCADO", Toast.LENGTH_LONG).show();
                
            }
        });

    }
}
