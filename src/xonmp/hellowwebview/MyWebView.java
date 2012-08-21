package xonmp.hellowwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.Toast;


class MyWebView extends WebView { 
	boolean doubleTap = false;
	
    public MyWebView(Context context) {
		super(context);
	}
    
    public MyWebView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

    @Override
	public boolean onTouchEvent(MotionEvent event) {
		Log.d("113133", "onTouchEvent Fired!");
		if(true){
			GestureDetector gd = new GestureDetector(sogl);
			gd.onTouchEvent(event);
			
	        // disable double tap zooming
	        if(doubleTap){
	            doubleTap = false;
	            return false;
	        }
	            return super.onTouchEvent(event);
		}
		
		return super.onTouchEvent(event);
    }/**/
    

	GestureDetector.SimpleOnGestureListener sogl = new GestureDetector.SimpleOnGestureListener() { 
		public boolean onDown(MotionEvent e){
			Log.d("ohmygosh", "ohmygosh - onDown");
			return false;
		}
	    public boolean onDoubleTap(MotionEvent e) {
            doubleTap = true;
            Log.d("ohmygosh", "ohmygosh - onDoubleTap");
            return false;
	    }
	};/**/
    
    /*
    @Override
    public boolean onTouchEvent(MotionEvent event){
    	Log.d("113133", "onTouchEvent Fired!");
    	//float myF = 9/0;
    	
    	return true;
    }/**/
}