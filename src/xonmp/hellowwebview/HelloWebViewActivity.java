package xonmp.hellowwebview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import xonmp.cannedwebview.R;
import xonmp.hellowwebview.MyWebView;


public class HelloWebViewActivity extends Activity {
	//private WebView mWebView;
	private MyWebView mWebView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Log.d("We Got Here", "By here I mean onCreate");
        
        //mWebView = (WebView) findViewById(R.id.webview);
        mWebView = (MyWebView) findViewById(R.id.webview);
        
        
        WebSettings config = mWebView.getSettings();
        config.setJavaScriptEnabled(true);
        config.setLoadWithOverviewMode(true);
        config.setUseWideViewPort(true);
        config.setBuiltInZoomControls(false);
        config.setSupportZoom(false); 
        // config.setUserAgentString("android-client"); 
        
        mWebView.loadUrl("http://192.168.0.11:3000/game.html");
        mWebView.setWebViewClient(new HelloWebViewClient());
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
}









