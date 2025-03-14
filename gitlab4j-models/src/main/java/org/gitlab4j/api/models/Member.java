package org.gitlab4j.api.models;

import java.util.Date;

import org.gitlab4j.models.utils.JacksonJson;

public class Member extends AbstractUser<Member> {
    private static final long serialVersionUID = 1L;

    private AccessLevel accessLevel;
    private Date expiresAt;
    private Identity groupSamlIdentity;

    public AccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Date getExpiresAt() {
        return this.expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Identity getGroupSamlIdentity() {
        return groupSamlIdentity;
    }

    public void setGroupSamlIdentity(Identity groupSamlIdentity) {
        this.groupSamlIdentity = groupSamlIdentity;
    }

    public Member withAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    public Member withExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public Member withGroupSamlIdentity(Identity groupSamlIdentity) {
        this.groupSamlIdentity = groupSamlIdentity;
        return this;
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }
}
