package com.example.parentseye_collegeapplication.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parentseye_collegeapplication.R;
import com.example.parentseye_collegeapplication.models.noticeboard.NoticeData;

import java.util.List;

public class MyNoticeListAdapter extends RecyclerView.Adapter<MyNoticeListAdapter.ViewHolder> {

    List<NoticeData> dataList;
    Context context;

    public MyNoticeListAdapter(@NonNull Context context, List<NoticeData> dataList) {
        this.dataList = dataList;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtDate, txtTitle, txtView, txtCreatedBy;

        public ViewHolder(@NonNull View itemView) {
            super( itemView );

            this.txtDate = itemView.findViewById( R.id.txtDate );
            this.txtTitle = itemView.findViewById( R.id.txtTitle );
            this.txtView = itemView.findViewById( R.id.txtView );
            this.txtCreatedBy = itemView.findViewById( R.id.txtCreatedBy );
        }
    }


    @NonNull
    @Override
    public MyNoticeListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from( parent.getContext() );
        View view = layoutInflater.inflate( R.layout.my_notice_customlist, parent, false );

        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull MyNoticeListAdapter.ViewHolder holder, final int position) {


        holder.txtTitle.setText( dataList.get( position ).getTitle() );
        holder.txtDate.setText( dataList.get( position ).getDate() );
        holder.txtCreatedBy.setText( "Created By "+dataList.get( position ).getCreatedBy() );

        holder.txtView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder( context );
                alertDialog.setTitle( dataList.get( position ).getTitle() );
                alertDialog.setMessage( Html.fromHtml( dataList.get( position ).getMessage() ).toString() );
                alertDialog.setPositiveButton( "Got It", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                } );
                AlertDialog dialog = alertDialog.create();
                dialog.show();
            }
        } );
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}