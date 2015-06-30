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
public class RankingHeritage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ranking);

		//TOPが押されたら
		ImageView top =(ImageView)findViewById(R.id.rankingtop);
		top.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent = new Intent(RankingHeritage.this,Top.class);
				startActivity(intent);
			}
		});
	}

}
