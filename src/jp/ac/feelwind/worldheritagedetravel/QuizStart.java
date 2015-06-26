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
public class QuizStart extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quiz_start);

		//ランダムが押されたとき
		ImageView random = (ImageView)findViewById(R.id.random);
		random.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent = new Intent(QuizStart.this,RandomQuiz.class);
				startActivity(intent);
			}
		});

		//地域別が押されたとき
		ImageView tiiki = (ImageView)findViewById(R.id.tiiki);
		tiiki.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent = new Intent(QuizStart.this,TiikiQuiz.class);
				startActivity(intent);
			}
		});

	}

}
