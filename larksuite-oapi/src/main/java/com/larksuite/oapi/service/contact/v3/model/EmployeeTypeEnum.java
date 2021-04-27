// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.google.gson.annotations.SerializedName;

public class EmployeeTypeEnum {
    @SerializedName("enum_id")
    private String enumId;
    @SerializedName("enum_value")
    private Long enumValue;
    @SerializedName("content")
    private String content;
    @SerializedName("enum_type")
    private Integer enumType;
    @SerializedName("enum_status")
    private Integer enumStatus;
    @SerializedName("i18n_content")
    private I18nContent[] i18nContent;

    public String getEnumId() {
        return this.enumId;
    }

    public void setEnumId(String enumId) {
        this.enumId = enumId;
    }

    public Long getEnumValue() {
        return this.enumValue;
    }

    public void setEnumValue(Long enumValue) {
        this.enumValue = enumValue;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getEnumType() {
        return this.enumType;
    }

    public void setEnumType(Integer enumType) {
        this.enumType = enumType;
    }

    public Integer getEnumStatus() {
        return this.enumStatus;
    }

    public void setEnumStatus(Integer enumStatus) {
        this.enumStatus = enumStatus;
    }

    public I18nContent[] getI18nContent() {
        return this.i18nContent;
    }

    public void setI18nContent(I18nContent[] i18nContent) {
        this.i18nContent = i18nContent;
    }

}
