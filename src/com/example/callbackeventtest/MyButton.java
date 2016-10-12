package com.example.callbackeventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;

public class MyButton extends Button {
      private Context context;
	public MyButton(Context context,AttributeSet attrs) {
		super(context);
		this.context=context;	
	}
	public boolean onTouchEvent(MotionEvent event){
		Toast.makeText(context, "MyButton中触摸事件触发了！", Toast.LENGTH_SHORT).show();
		return true;
		
	}
 
}
