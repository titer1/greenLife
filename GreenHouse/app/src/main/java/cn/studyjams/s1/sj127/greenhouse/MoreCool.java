package cn.studyjams.s1.sj127.greenhouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MoreCool extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_cool);
    }

    public void onClick(View v) {
        // TODO Auto-generated method stub
        Toast tst;
        switch (v.getId()) {
            case R.id.btn_feedback:

                EditText feedback = (EditText) findViewById(R.id.messageFeedback);
                Editable txt = feedback.getText();
                String name = txt.toString();
                String msg = "Get your feedback:"+ name;
                tst = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
                tst.show();

                //start email later
                /*
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_SUBJECT,
                        getString(R.string.order_summary_email_subject, name));
                intent.putExtra(Intent.EXTRA_TEXT, message);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                */
                break;
            default:
                break;
        }
    }

}
