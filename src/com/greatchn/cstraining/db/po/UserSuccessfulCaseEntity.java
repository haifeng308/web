package com.greatchn.cstraining.db.po;

/**
 * Created by DXG on 2016/4/12.
 */
public class UserSuccessfulCaseEntity {
    private String id;
    private String userTruename;
    private String jobs;
    private String userVoices;
    private String userIcoPath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserTruename() {
        return userTruename;
    }

    public void setUserTruename(String userTruename) {
        this.userTruename = userTruename;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getUserVoices() {
        return userVoices;
    }

    public void setUserVoices(String userVoices) {
        this.userVoices = userVoices;
    }

    public String getUserIcoPath() {
        return userIcoPath;
    }

    public void setUserIcoPath(String userIcoPath) {
        this.userIcoPath = userIcoPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserSuccessfulCaseEntity that = (UserSuccessfulCaseEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userTruename != null ? !userTruename.equals(that.userTruename) : that.userTruename != null) return false;
        if (jobs != null ? !jobs.equals(that.jobs) : that.jobs != null) return false;
        if (userVoices != null ? !userVoices.equals(that.userVoices) : that.userVoices != null) return false;
        if (userIcoPath != null ? !userIcoPath.equals(that.userIcoPath) : that.userIcoPath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userTruename != null ? userTruename.hashCode() : 0);
        result = 31 * result + (jobs != null ? jobs.hashCode() : 0);
        result = 31 * result + (userVoices != null ? userVoices.hashCode() : 0);
        result = 31 * result + (userIcoPath != null ? userIcoPath.hashCode() : 0);
        return result;
    }
}
