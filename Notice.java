package com.example.parentseye_collegeapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.parentseye_collegeapplication.Interface.APIInterface;
import com.example.parentseye_collegeapplication.adapter.MyNoticeListAdapter;
import com.example.parentseye_collegeapplication.client.APIClient;
import com.example.parentseye_collegeapplication.models.noticeboard.NoticeData;
import com.example.parentseye_collegeapplication.models.noticeboard.NoticeResponse;
import com.example.parentseye_collegeapplication.models.profile.Data;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Notice extends AppCompatActivity {

    List<NoticeData> list;
    RecyclerView recyclerViewNotice;
    TextView txtTitle;
    ImageView ivBack;
    String StudentId, Id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_notice );

        recyclerViewNotice = findViewById( R.id.recyclerViewNotice );
        txtTitle = findViewById( R.id.txtTitle );
        ivBack = findViewById( R.id.ivBack );

        txtTitle.setText( "Notice Board" );
        ivBack.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        } );

        SharedPreferences sharedPreferences = getSharedPreferences( Constant.MYPreef, MODE_PRIVATE );
        StudentId = sharedPreferences.getString( "studentid", null );
        Id = sharedPreferences.getString( "id", null );
        getNotice();
    }

    private void getNotice() {

        final RelativeLayout relativeLayout = findViewById( R.id.relativeLayoutNotice );
        relativeLayout.setVisibility( View.GONE );
        final ProgressDialog progressDialog = new ProgressDialog( this );
        progressDialog.setMessage( "Loading data..." );
        progressDialog.show();

        APIInterface apiInterface = APIClient.getClient().create( APIInterface.class );
        Call<NoticeResponse> call = apiInterface.notice( "smartschool", "schoolAdmin@", Id, "NgOQNwMQNg" );
        call.enqueue( new Callback<NoticeResponse>() {
            @Override
            public void onResponse(Call<NoticeResponse> call, Response<NoticeResponse> response) {
                NoticeResponse noticeResponse = response.body();

                try {
                    if (noticeResponse.getSuccess() == 1) {
                        list = response.body().getStudentResult();

                        loadData( list );
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                progressDialog.dismiss();
                relativeLayout.setVisibility( View.VISIBLE );

            }

            @Override
            public void onFailure(Call<NoticeResponse> call, Throwable t) {

            }
        } );
    }

    private void loadData(List<NoticeData> list) {
        recyclerViewNotice = findViewById( R.id.recyclerViewNotice );
        MyNoticeListAdapter adapter = new MyNoticeListAdapter( Notice.this, list );
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( getApplicationContext() );
        recyclerViewNotice.setLayoutManager( layoutManager );
        recyclerViewNotice.setAdapter( adapter );
    }
}