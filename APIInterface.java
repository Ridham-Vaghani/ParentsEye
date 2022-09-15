package com.example.parentseye_collegeapplication.Interface;

import com.example.parentseye_collegeapplication.models.AboutDetailsResponse.AboutDetailsResponse;
import com.example.parentseye_collegeapplication.models.attendance.AttendanceRequest;
import com.example.parentseye_collegeapplication.models.attendance.AttendanceResponse;
import com.example.parentseye_collegeapplication.models.document.DocumentRequest;
import com.example.parentseye_collegeapplication.models.document.DocumentResponse;
import com.example.parentseye_collegeapplication.models.download.DownloadRequest;
import com.example.parentseye_collegeapplication.models.download.DownloadResponse;
import com.example.parentseye_collegeapplication.models.examschedule.ExamScheduleRequest;
import com.example.parentseye_collegeapplication.models.examschedule.ExamScheduleResponse;
import com.example.parentseye_collegeapplication.models.examschedulelist.ExamScheduleListRequest;
import com.example.parentseye_collegeapplication.models.examschedulelist.ExamScheduleListResponse;
import com.example.parentseye_collegeapplication.models.fees.FeesRequest;
import com.example.parentseye_collegeapplication.models.fees.FeesResponse;
import com.example.parentseye_collegeapplication.models.home.HomeRequest;
import com.example.parentseye_collegeapplication.models.home.HomeResponse;
import com.example.parentseye_collegeapplication.models.homework.HomeworkRequest;
import com.example.parentseye_collegeapplication.models.homework.HomeworkResponse;
import com.example.parentseye_collegeapplication.models.login.LoginRequest;
import com.example.parentseye_collegeapplication.models.login.LoginResponse;
import com.example.parentseye_collegeapplication.models.noticeboard.NoticeResponse;
import com.example.parentseye_collegeapplication.models.photoGallery.PhotoGalleryListResponse;
import com.example.parentseye_collegeapplication.models.photoGallery.PhotoGalleryResponse;
import com.example.parentseye_collegeapplication.models.profile.ProfileRequest;
import com.example.parentseye_collegeapplication.models.profile.ProfileResponse;
import com.example.parentseye_collegeapplication.models.reportcard.ReportcardRequest;
import com.example.parentseye_collegeapplication.models.reportcard.ReportcardResponse;
import com.example.parentseye_collegeapplication.models.reportcardDetails.ReportcardDetailsRequest;
import com.example.parentseye_collegeapplication.models.reportcardDetails.ReportcardDetailsResponse;
import com.example.parentseye_collegeapplication.models.subject.SubjectRequest;
import com.example.parentseye_collegeapplication.models.subject.SubjectResponse;
import com.example.parentseye_collegeapplication.models.task.AddTaskRequest;
import com.example.parentseye_collegeapplication.models.task.AddTaskResponse;
import com.example.parentseye_collegeapplication.models.task.TaskRequest;
import com.example.parentseye_collegeapplication.models.task.TaskResponse;
import com.example.parentseye_collegeapplication.models.task.UpdateRequest;
import com.example.parentseye_collegeapplication.models.task.UpdateResponse;
import com.example.parentseye_collegeapplication.models.teacher.TeacherRequest;
import com.example.parentseye_collegeapplication.models.teacher.TeacherResponse;
import com.example.parentseye_collegeapplication.models.timetable.TimetableRequest;
import com.example.parentseye_collegeapplication.models.timetable.TimetableResponse;
import com.example.parentseye_collegeapplication.models.videoGallery.VideoGalleryListResponse;
import com.example.parentseye_collegeapplication.models.videoGallery.VideoGalleryResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {

    @POST("Webservice/login")
    Call<LoginResponse> login(@Body LoginRequest data, @Header("Client-Service") String Client_Service,
                              @Header("Auth-Key") String Auth_Key, @Header("Content-Type") String Content_Type);

    @POST("webservice/getStudentProfile")
    Call<ProfileResponse> profile(@Body ProfileRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                  @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/dashboard")
    Call<HomeResponse> home(@Body HomeRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                            @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/getHomework")
    Call<HomeworkResponse> homework(@Body HomeworkRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                    @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/class_schedule")
    Call<TimetableResponse> timetable(@Body TimetableRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                      @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @GET("webservice/getNotifications")
    Call<NoticeResponse> notice(@Header("Client-Service") String Client_Service, @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID,
                                @Header("Authorization") String Authorization);

    @POST("webservice/getExamResultList")
    Call<ReportcardResponse> reportcard(@Body ReportcardRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                        @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/getExamResultDetails")
    Call<ReportcardDetailsResponse> reportcardDetails(@Body ReportcardDetailsRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                                      @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/getAttendenceRecords")
    Call<AttendanceResponse> attendance(@Body AttendanceRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                        @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/examSchedule")
    Call<ExamScheduleResponse> examSchedule(@Body ExamScheduleRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                            @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/getExamSchedule")
    Call<ExamScheduleListResponse> examScheduleList(@Body ExamScheduleListRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                                    @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/getDownloadsLinks")
    Call<DownloadResponse> download(@Body DownloadRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                    @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/getSubjectList")
    Call<SubjectResponse> subject(@Body SubjectRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                  @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/getTeachersList")
    Call<TeacherResponse> teacher(@Body TeacherRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                  @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/fees")
    Call<FeesResponse> fees(@Body FeesRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                            @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/getDocument")
    Call<List<DocumentResponse>> document(@Body DocumentRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                          @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/getSchoolDetails")
    Call<AboutDetailsResponse> aboutDetails(@Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                            @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/getTask")
    Call<TaskResponse> pendingtask(@Body TaskRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                   @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/updateTask")
    Call<UpdateResponse> updatetask(@Body UpdateRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                    @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @POST("webservice/addTask")
    Call<AddTaskResponse> addtask(@Body AddTaskRequest data, @Header("Content-Type") String Content_Type, @Header("Client-Service") String Client_Service,
                                  @Header("Auth-Key") String Auth_Key, @Header("User-ID") String User_ID, @Header("Authorization") String Authorization);

    @GET("webservice/get_photogallery")
    Call<List<PhotoGalleryResponse>> photos(@Query("usercode") int usercode);

    @GET("webservice/get_gallery_photo")
    Call<List<PhotoGalleryListResponse>> photosList(@Query("gallery_code") String gallery_code);

    @GET("webservice/get_videogallery")
    Call<List<VideoGalleryResponse>> videos(@Query("usercode") int usercode);

    @GET("webservice/get_gallery_video")
    Call<List<VideoGalleryListResponse>> videoList(@Query("video_id") String gallery_code);

}