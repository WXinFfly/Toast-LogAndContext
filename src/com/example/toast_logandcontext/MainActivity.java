package com.example.toast_logandcontext;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn_Toast = (Button) findViewById(R.id.btn_Toast);
		Button btn_Log = (Button) findViewById(R.id.btn_Log);
		btn_Toast.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				//Toast�ĵ�һ�������������ģ��ڶ�����ʾ���ı�����������������ʾ��ʱ��
				Toast.makeText(MainActivity.this, "����Toast", Toast.LENGTH_SHORT).show();
			}
		});
		btn_Log.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				//��һ�������Ǳ�ǣ��ڶ�������������
				Log.d("MainActivity", "����");
			}
		});
	}

}
