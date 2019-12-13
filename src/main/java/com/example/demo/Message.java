package com.example.demo;

import com.cloudinary.Cloudinary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.text.DateFormat;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(max=280)
    private String content;

    @NotNull
    @Size(min=2)
    private String sentBy;

    private String postedDate;
    private String pic;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Message() {

    }
//    public Message(@NotNull @Size(max = 280) String content, Date postedDate,
//                   @NotNull @Size(min = 2) String sentBy) {
//        this.content = content;
//        this.postedDate = postedDate;
//        this.sentBy = sentBy;
//    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }
}
