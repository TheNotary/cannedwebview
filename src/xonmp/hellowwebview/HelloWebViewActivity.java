package xonmp.hellowwebview;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HelloWebViewActivity extends Activity {
    
	private WebView mWebView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("http://192.168.0.11:3000/game.html");
        mWebView.setWebViewClient(new HelloWebViewClient());
    }
    
    private class HelloWebViewClient extends WebViewClient {
    	@Override
    	public boolean shouldOverrideUrlLoading(WebView webview, String url)
    	{
    		webview.loadUrl(url);
    		return true;
    	}
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
    	if ((keyCode == KeyEvent.KEYCODE_BACK)&& mWebView.canGoBack())
    	{
    		mWebView.goBack();
    		return true;
    	}
    	return super.onKeyDown(keyCode,  event);
    }
}