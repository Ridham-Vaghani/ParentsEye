package com.example.parentseye_collegeapplication.models.noticeboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NoticeData {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("publish_date")
    @Expose
    private String publishDate;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("visible_student")
    @Expose
    private String visibleStudent;
    @SerializedName("visible_staff")
    @Expose
    private String visibleStaff;
    @SerializedName("visible_parent")
    @Expose
    private String visibleParent;
    @SerializedName("created_by")
    @Expose
    private String createdBy;
    @SerializedName("created_id")
    @Expose
    private String createdId;
    @SerializedName("is_active")
    @Expose
    private String isActive;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVisibleStudent() {
        return visibleStudent;
    }

    public void setVisibleStudent(String visibleStudent) {
        this.visibleStudent = visibleStudent;
    }

    public String getVisibleStaff() {
        return visibleStaff;
    }

    public void setVisibleStaff(String visibleStaff) {
        this.visibleStaff = visibleStaff;
    }

    public String getVisibleParent() {
        return visibleParent;
    }

    public void setVisibleParent(String visibleParent) {
        this.visibleParent = visibleParent;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedId() {
        return createdId;
    }

    public void setCreatedId(String createdId) {
        this.createdId = createdId;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
