package xonmp.hellowwebview;

import android.content.Context;
import android.webkit.WebView;


class MyWebView extends WebView { 
	
    public MyWebView(Context context) {
		super(context);
	}

/*
	public boolean onTouchEvent(MotionEvent event) {
		GestureDetector gd = new GestureDetector(sogl);
		gd.onTouchEvent(event);
        // disable double tap zooming
		boolean doubleTap = true;
        if(doubleTap){
            doubleTap = false;
            return false;
        }
            return super.onTouchEvent(event);
    }/**/
    
/*
	GestureDetector.SimpleOnGestureListener sogl = new GestureDetector.SimpleOnGestureListener() { 
	    public boolean onDoubleTap(MotionEvent e) {
            //showToast("Double tap");
            //doubleTap = true;

            return false;
	    }  
	};/**/
}