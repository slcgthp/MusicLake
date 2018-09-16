package com.cyl.musiclake.ui.zone;

import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.cyl.musiclake.R;
import com.cyl.musiclake.base.BaseActivity;
import com.cyl.musiclake.ui.main.MainActivity;
import com.cyl.musiclake.ui.my.user.User;
import com.cyl.musiclake.ui.my.user.UserStatus;
import com.cyl.musiclake.utils.ToastUtils;

import butterknife.BindView;


/**
 * Created by 永龙 on 2016/3/15.
 */
public class EditActivity extends BaseActivity {

    @BindView(R.id.edit_content)
    EditText mEditText;
    String user_id;
    String content;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_edit;
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initData() {
        content = getIntent().getStringExtra("content");
        if (!TextUtils.isEmpty(content))
            mEditText.setText(content + "");
    }

    @Override
    protected void initInjector() {

    }

    @Override
    protected void listener() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        } else if (id == R.id.menu_send) {
            content = mEditText.getText().toString().trim();
            if (content.length() == 0) {
                ToastUtils.show(this, "不能发送空");
                return true;
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
