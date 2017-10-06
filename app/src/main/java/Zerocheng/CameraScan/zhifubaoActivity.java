package Zerocheng.CameraScan;

import android.app.Activity;
import android.os.Bundle;
import android.service.quicksettings.TileService;
import android.content.Intent;
import android.net.Uri;

/**
E-Mail:2767832980@qq.com
github:https://github.com/Zerocheng/CameraScan
*/

public class zhifubaoActivity extends TileService{
		@Override//支付宝扫一扫
		public void onClick ( ){
				super.onClick ( );
				try {
    			Uri uri = Uri.parse("alipayqr://platformapi/startapp?saId=10000007");
    			Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
 				}	catch (Exception e) {
 					}
		}
}
