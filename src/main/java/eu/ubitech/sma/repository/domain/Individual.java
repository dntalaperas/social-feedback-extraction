package eu.ubitech.sma.repository.domain;
// Generated Sep 17, 2014 12:03:28 PM by Hibernate Tools 3.6.0

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Individual generated by hbm2java
 */
@Document
public class Individual implements Serializable {

    private String id;
    private City city;
    private Group group;
    private String profileType;
    private Province province;
    private Profile profile;
    private long userId;
    private int postsNum;
    private String fullname;
    private String location;
    private String screenName;
    private String profileImageUrl;

    public Individual() {
    }

    public Individual(Group group, String profileType, Profile profile, long userId, int postsNum, String fullname, String location, String screenName, String profileImageUrl) {
        this.group = group;
        this.profileType = profileType;
        this.profile = profile;
        this.userId = userId;
        this.postsNum = postsNum;
        this.fullname = fullname;
        this.location = location;
        this.screenName = screenName;
        this.profileImageUrl = profileImageUrl;
    }

    public Individual(City city, Group group, String profileType, Province province, Profile profile, long userId, int postsNum, String fullname, String location, String screenName, String profileImageUrl) {
        this.city = city;
        this.group = group;
        this.profileType = profileType;
        this.province = province;
        this.profile = profile;
        this.userId = userId;
        this.postsNum = postsNum;
        this.fullname = fullname;
        this.location = location;
        this.screenName = screenName;
        this.profileImageUrl = profileImageUrl;
    }

    @Id
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    public Group getGroup() {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }


    public String getProfileType() {
        return this.profileType;
    }

    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }


    public Province getProvince() {
        return this.province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }


    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }


    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


    public int getPostsNum() {
        return this.postsNum;
    }

    public void setPostsNum(int postsNum) {
        this.postsNum = postsNum;
    }


    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getScreenName() {
        return this.screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }


    public String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public void increasePostNum() {
        this.postsNum++;
    }

}
