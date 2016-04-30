package cn.studyjams.s1.sj127.greenhouse;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the qianzaiweihai button is clicked.
     */
    public void onQianZaiWeiHai()
    {
        Toast toast = Toast.makeText(this, "这是一个普通的Toast!", Toast.LENGTH_SHORT);
        toast.show();



       startActivity(new Intent(this, ScrollingActivity_WeiHai.class));

    }


    public void onClick(View v) {
        // TODO Auto-generated method stub
        Toast tst;
        switch (v.getId()) {
            case R.id.Btn_WeiHai:
                tst = Toast.makeText(this, "1", Toast.LENGTH_SHORT);
                //tst.show();
                startActivity(new Intent(this, ScrollingActivity_WeiHai.class));
                break;
            case R.id.Btn_JingHua:
                tst = Toast.makeText(this, "222222222", Toast.LENGTH_SHORT);
                //tst.show();
                startActivity(new Intent(this, JingHua.class));
                break;
            case R.id.Btn_LvYi:
                tst = Toast.makeText(this, "33", Toast.LENGTH_SHORT);
                //tst.show();
                startActivity(new Intent(this, LvYi.class));
                break;
            case R.id.Btn_JiangXin:
                tst = Toast.makeText(this, "44", Toast.LENGTH_SHORT);
                startActivity(new Intent(this, JiangXin.class));
                //tst.show();
                break;
            case R.id.Btn_more:
                tst = Toast.makeText(this, "55", Toast.LENGTH_SHORT);
                startActivity(new Intent(this, MoreCool.class));
                //tst.show();
                break;
            default:
                break;
        }
    }

    private void bindEvent() {
        //findViewById(R.id.Btn_WeiHai).setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {
        showExitDialog();
    }


    //use to exit
    private void showExitDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Warning");
        builder.setMessage("Are you sure to exit?");
        builder.setPositiveButton("exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}
