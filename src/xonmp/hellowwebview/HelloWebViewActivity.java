package xonmp.hellowwebview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import xonmp.cannedwebview.R;
import xonmp.hellowwebview.MyWebView;


public class HelloWebViewActivity extends Activity {
	private WebView mWebView;
	//private MyWebView mWebView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mWebView = (WebView) findViewById(R.id.webview);
        //mWebView = (MyWebView) findViewById(R.id.webview);
        
        WebSettings config = mWebView.getSettings();
        config.setJavaScriptEnabled(true);
        config.setLoadWithOverviewMode(true);
        config.setUseWideViewPort(true);
        config.setBuiltInZoomControls(false);
        //config.setSupportZoom(false); 
        // config.setUseWideViewPort(false);  // disables zooming altogether...


        // config.setUserAgentString("android-client"); 
        mWebView.loadUrl("http://192.168.0.11:3000/game.html");
        mWebView.canScrollHorizontally(0);
        mWebView.setWebViewClient(new HelloWebViewClient());
        //boolean isIt = mWebView.isHardwareAccelerated();
    }
    
    private class HelloWebViewClient extends WebViewClient{
    	@Override
    	public boolean shouldOverrideUrlLoading(WebView webview, String url){
    		webview.loadUrl(url);
    		return true;
    	}
    }
    
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
    	if ((keyCode == KeyEvent.KEYCODE_BACK)&& mWebView.canGoBack()){
    		mWebView.goBack();
    		return true;
    	}
    	return super.onKeyDown(keyCode,  event);
    }
    
    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
    } 
}









