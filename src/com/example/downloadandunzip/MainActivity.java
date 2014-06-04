package com.example.downloadandunzip;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
//http://d.pcs.baidu.com/file/de18d5a05a2c69f8d037f520f50ee863?fid=2031568397-250528-778054393498859&time=1401844642&sign=FDTAER-DCb740ccc5511e5e8fedcff06b081203-bj0ruaChAguHMrXKlEIkZTsaQkk%3D&rt=sh&expires=1401845242&r=491730184&sh=1&sharesign=MONim17iAS/YWlHWVLEQ/v69LQuu42jeC76j16ysJLhUWVPOIkN5xRzxxswmQru+NcAdB9PoP7r8krpCvs71gSP8njdB7dpgR0ZHyAU1KzUYj+jHuWAHHbG2nDZMkILX2V4S+FNWGNGh7Vgux40pRAispMM/SY8l3iTzIwe1C7X5T8yM4Gib1laEi0I09FHKXNVceX6VvhoqyhHIuCXWkpAPLL5VjOpzjLkwhKSIEMdHknDvvCNTfEKsUFBWFJaFJZyyI9jJfkGG5ORFqOsAlDBXYBEYoWOxbv6bAFGGMHJtzU4YaBx4uowPK1iSzmKtYd3PbzjB8m1K6ryJLG52NA==&cflg=65535

public class MainActivity extends Activity {
	private static final String NATIVE_SAVE_PATH = Environment.getExternalStorageDirectory() + "/dao/";
	//百度网盘
	//String url="http://qd.baidupcs.com/file/56d2613296d174a2216c16e68290c4ff?fid=2031568397-250528-206562463223513&time=1401850141&sign=FDTAXER-DCb740ccc5511e5e8fedcff06b081203-%2FlmpLQ%2BalXZOIdpRCS0XSJScCPE%3D&to=qb&fm=Q,B,U,nc&newver=1&expires=8h&rt=pr&r=921627517&logid=1251756051&vuk=2031568397&fn=dao.zip";
	//华为网盘
	String url = "http://222.142.58.33/file/MDAwMDAwMDHg0M8NGMg5Ux9V0WLnscoKhgjjT2iZJxdSZOxjRtKReg../a4a9adc84959bad3ecf8d252439543f64f89145/dao.zip?key=AAABQFOPEQh8KzwI&a=33550594-da1c03cd-48049-e6f7721226/020100&mode=download";
	String[] params = new String[] { url,NATIVE_SAVE_PATH, "dao.zip" };
	public static TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_show=(TextView) findViewById(R.id.tv_show);
        new DownloadAsyncTask(this).execute(params);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
