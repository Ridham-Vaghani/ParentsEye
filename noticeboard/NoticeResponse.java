package com.example.parentseye_collegeapplication.models.noticeboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class NoticeResponse {
    @SerializedName("success")
    @Expose
    private Integer success;
    @SerializedName("data")
    @Expose
    private List<NoticeData> data = new ArrayList<>(  );

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public List<NoticeData> getStudentResult() {
        return data;
    }

    public void setData(List<NoticeData> data) {
        this.data = data;
    }

}
