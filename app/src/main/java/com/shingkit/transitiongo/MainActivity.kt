package com.shingkit.transitiongo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.updateLayoutParams
import androidx.transition.ChangeBounds
import androidx.transition.Scene
import androidx.transition.TransitionManager

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val top = findViewById<View>(R.id.top)
        top.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val root = findViewById<ViewGroup>(R.id.root)
// 1. 显示ChangeBounds 动画
//        TransitionManager.beginDelayedTransition(root)
//        v.updateLayoutParams<ConstraintLayout.LayoutParams> {
//            height *=2
//            width *=2
//        }
//        v.requestLayout()

//  2. 只显示ChangeBounds 动画
        val end = Scene.getSceneForLayout(root, R.layout.activity_end, this)
        TransitionManager.go(end)

//  3. 显示ChangeBounds 动画
//        val end = Scene.getSceneForLayout(root, R.layout.activity_end, this)
//        TransitionManager.go(end, ChangeBounds())
    }
}