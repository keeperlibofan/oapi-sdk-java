// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.google.gson.annotations.SerializedName;

public class UserDeletedEventData {
    @SerializedName("object")
    private UserEvent object;
    @SerializedName("old_object")
    private OldUserObject oldObject;

    public UserEvent getObject() {
        return this.object;
    }

    public void setObject(UserEvent object) {
        this.object = object;
    }

    public OldUserObject getOldObject() {
        return this.oldObject;
    }

    public void setOldObject(OldUserObject oldObject) {
        this.oldObject = oldObject;
    }

}
