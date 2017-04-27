package eu.ubitech.sma.repository.domain;
// Generated Sep 17, 2014 12:03:28 PM by Hibernate Tools 3.6.0


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Comment generated by hbm2java
 */
@Document
public class Comment  implements Serializable {


     private String id;
     private Post post;
     private String comment;
     private Date createdDate;
     private long commentId;
     private long userId;
     private boolean isOwner;
     private byte acted;
     private Byte priority;
     private String sentimentScore;
     private String sentimentScoreTag;
     private String sentimentSd;
     private String sentimentSdTag;
     private String sentimentSubjectivity;
     private String sentimentIrony;
     private String jsonContent;

    public Comment() {
    }


    public Comment(Post post, String comment, Date createdDate, long commentId, long userId, boolean isOwner, byte acted) {
        this.post = post;
        this.comment = comment;
        this.createdDate = createdDate;
        this.commentId = commentId;
        this.userId = userId;
        this.isOwner = isOwner;
        this.acted = acted;
    }
    public Comment(Post post, String comment, Date createdDate, long commentId, long userId, boolean isOwner, byte acted, Byte priority, String sentimentScore, String sentimentScoreTag, String sentimentSd, String sentimentSdTag, String sentimentSubjectivity, String sentimentIrony, String jsonContent) {
       this.post = post;
       this.comment = comment;
       this.createdDate = createdDate;
       this.commentId = commentId;
       this.userId = userId;
       this.isOwner = isOwner;
       this.acted = acted;
       this.priority = priority;
       this.sentimentScore = sentimentScore;
       this.sentimentScoreTag = sentimentScoreTag;
       this.sentimentSd = sentimentSd;
       this.sentimentSdTag = sentimentSdTag;
       this.sentimentSubjectivity = sentimentSubjectivity;
       this.sentimentIrony = sentimentIrony;
       this.jsonContent = jsonContent;
    }
   
     @Id 
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }


    public Post getPost() {
        return this.post;
    }
    
    public void setPost(Post post) {
        this.post = post;
    }

    
    
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    

    public long getCommentId() {
        return this.commentId;
    }
    
    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    

    public long getUserId() {
        return this.userId;
    }
    
    public void setUserId(long userId) {
        this.userId = userId;
    }

    

    public boolean isIsOwner() {
        return this.isOwner;
    }
    
    public void setIsOwner(boolean isOwner) {
        this.isOwner = isOwner;
    }

    

    public byte getActed() {
        return this.acted;
    }
    
    public void setActed(byte acted) {
        this.acted = acted;
    }

    

    public Byte getPriority() {
        return this.priority;
    }
    
    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    

    public String getSentimentScore() {
        return this.sentimentScore;
    }
    
    public void setSentimentScore(String sentimentScore) {
        this.sentimentScore = sentimentScore;
    }

    

    public String getSentimentScoreTag() {
        return this.sentimentScoreTag;
    }
    
    public void setSentimentScoreTag(String sentimentScoreTag) {
        this.sentimentScoreTag = sentimentScoreTag;
    }

    

    public String getSentimentSd() {
        return this.sentimentSd;
    }
    
    public void setSentimentSd(String sentimentSd) {
        this.sentimentSd = sentimentSd;
    }

    

    public String getSentimentSdTag() {
        return this.sentimentSdTag;
    }
    
    public void setSentimentSdTag(String sentimentSdTag) {
        this.sentimentSdTag = sentimentSdTag;
    }

    

    public String getSentimentSubjectivity() {
        return this.sentimentSubjectivity;
    }
    
    public void setSentimentSubjectivity(String sentimentSubjectivity) {
        this.sentimentSubjectivity = sentimentSubjectivity;
    }

    

    public String getSentimentIrony() {
        return this.sentimentIrony;
    }
    
    public void setSentimentIrony(String sentimentIrony) {
        this.sentimentIrony = sentimentIrony;
    }

    

    public String getJsonContent() {
        return this.jsonContent;
    }
    
    public void setJsonContent(String jsonContent) {
        this.jsonContent = jsonContent;
    }




}

