package com.maggie.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class GameView extends View {
	public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        requestFocus();
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
	
		
		int offsetX = 5;
		int offsetY = 5;
		
		int width = 270;
		int height = 270;
		int delta = 40;

		Paint linePaint = new Paint();
		linePaint = new Paint();
        linePaint.setColor(0xFFFFFFFF);
        linePaint.setStrokeWidth(4);
        linePaint.setStyle(Style.STROKE);
        
        for (int i = 0; i < 3; i++) {
        	Rect rect = new Rect(offsetX + i*delta, offsetY + i*delta, width - i*delta, height - i*delta );
        	canvas.drawRect(rect, linePaint);
        }
        	
		
        canvas.drawLine( width/2 - offsetX , offsetY, width/2 - offsetX, offsetY + 2 * delta, linePaint);
        canvas.drawLine( width/2 - offsetX , height - 2 * delta, width/2 - offsetX, height, linePaint);
        canvas.drawLine( offsetX, height/2 - offsetY , offsetX + 2 * delta, height/2 - offsetY, linePaint);
		canvas.drawLine( width - 2 * delta, height/2 - offsetY , width, height/2 - offsetY, linePaint);
		
	}
}
