package com.example.webview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{
	
	private EditText addressURL;
    private Button btnGo;
    private WebView webView;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);

	        addressURL = (EditText) findViewById(R.id.addressURL);
	        btnGo = (Button) findViewById(R.id.btnOK);
	        webView = (WebView) findViewById(R.id.webView1);
	        
	        btnGo.setOnClickListener(this);
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		/*
		//Uri uri = Uri.parse(addressURL.getText().toString());
        //Intent i = new Intent(Intent.ACTION_VIEW, uri);
        //startActivity(i);
        */
		 //webView.getSettings().setJavaScriptEnabled(true);
		 webView.loadUrl(addressURL.getText().toString());
	}
	
}
