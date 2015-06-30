/**
 *
 */
package jp.ac.feelwind.worldheritagedetravel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * @author student
 *
 */
public class Menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);

		//TOPが押されたら
		ImageView top = (ImageView)findViewById(R.id.menutop);
		top.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent = new Intent(Menu.this,Top.class);
				startActivity(intent);
			}
		});
	}

}
