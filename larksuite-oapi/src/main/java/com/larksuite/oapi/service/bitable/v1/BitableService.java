// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1;

import com.larksuite.oapi.core.api.AccessTokenType;
import com.larksuite.oapi.core.api.Api;
import com.larksuite.oapi.core.api.ReqCaller;
import com.larksuite.oapi.core.api.request.*;
import com.larksuite.oapi.core.api.response.*;
import com.larksuite.oapi.core.Config;
import com.larksuite.oapi.service.bitable.v1.model.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class BitableService {

    private final Config config;
    private final Apps apps;
    private final AppTables appTables;
    private final AppTableFields appTableFields;
    private final AppTableRecords appTableRecords;

    public BitableService(Config config) {
        this.config = config;
        this.apps = new Apps(this);
        this.appTables = new AppTables(this);
        this.appTableFields = new AppTableFields(this);
        this.appTableRecords = new AppTableRecords(this);
    }

    public Apps getApps() {
        return apps;
    }

    public static class Apps {

        private final BitableService service;

        public Apps(BitableService service) {
            this.service = service;
        }
    
        public AppGetReqCall get(RequestOptFn... optFns) {
            return new AppGetReqCall(this, optFns);
        }
    
    }
    public static class AppGetReqCall extends ReqCaller<Object, AppGetResult> {
        private final Apps apps;
        
        private final Map<String, Object> pathParams;
        private final List<RequestOptFn> optFns;
        private AppGetResult result;
        
        private AppGetReqCall(Apps apps, RequestOptFn... optFns) {
        
            this.pathParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new AppGetResult();
            this.apps = apps;
        }
        
        public AppGetReqCall setAppToken(String appToken){
            this.pathParams.put("app_token", appToken);
            return this;
        }

        @Override
        public Response<AppGetResult> execute() throws Exception {
            this.optFns.add(Request.setPathParams(this.pathParams));
            Request<Object, AppGetResult> request = Request.newRequest("bitable/v1/apps/:app_token", "GET",
                    new AccessTokenType[]{AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.apps.service.config, request);
        }
    }

    public AppTables getAppTables() {
        return appTables;
    }

    public static class AppTables {

        private final BitableService service;

        public AppTables(BitableService service) {
            this.service = service;
        }
    
        public AppTableListReqCall list(RequestOptFn... optFns) {
            return new AppTableListReqCall(this, optFns);
        }
    
    }
    public static class AppTableListReqCall extends ReqCaller<Object, AppTableListResult> {
        private final AppTables appTables;
        
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private AppTableListResult result;
        
        private AppTableListReqCall(AppTables appTables, RequestOptFn... optFns) {
        
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new AppTableListResult();
            this.appTables = appTables;
        }
        
        public AppTableListReqCall setAppToken(String appToken){
            this.pathParams.put("app_token", appToken);
            return this;
        }
        
        public AppTableListReqCall setPageToken(String pageToken){
            this.queryParams.put("page_token", pageToken);
            return this;
        }
        public AppTableListReqCall setPageSize(Integer pageSize){
            this.queryParams.put("page_size", pageSize);
            return this;
        }

        @Override
        public Response<AppTableListResult> execute() throws Exception {
            this.optFns.add(Request.setPathParams(this.pathParams));
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<Object, AppTableListResult> request = Request.newRequest("bitable/v1/apps/:app_token/tables", "GET",
                    new AccessTokenType[]{AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.appTables.service.config, request);
        }
    }

    public AppTableFields getAppTableFields() {
        return appTableFields;
    }

    public static class AppTableFields {

        private final BitableService service;

        public AppTableFields(BitableService service) {
            this.service = service;
        }
    
        public AppTableFieldListReqCall list(RequestOptFn... optFns) {
            return new AppTableFieldListReqCall(this, optFns);
        }
    
    }
    public static class AppTableFieldListReqCall extends ReqCaller<Object, AppTableFieldListResult> {
        private final AppTableFields appTableFields;
        
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private AppTableFieldListResult result;
        
        private AppTableFieldListReqCall(AppTableFields appTableFields, RequestOptFn... optFns) {
        
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new AppTableFieldListResult();
            this.appTableFields = appTableFields;
        }
        
        public AppTableFieldListReqCall setAppToken(String appToken){
            this.pathParams.put("app_token", appToken);
            return this;
        }
        public AppTableFieldListReqCall setTableId(String tableId){
            this.pathParams.put("table_id", tableId);
            return this;
        }
        
        public AppTableFieldListReqCall setViewId(String viewId){
            this.queryParams.put("view_id", viewId);
            return this;
        }
        public AppTableFieldListReqCall setPageToken(String pageToken){
            this.queryParams.put("page_token", pageToken);
            return this;
        }
        public AppTableFieldListReqCall setPageSize(Integer pageSize){
            this.queryParams.put("page_size", pageSize);
            return this;
        }

        @Override
        public Response<AppTableFieldListResult> execute() throws Exception {
            this.optFns.add(Request.setPathParams(this.pathParams));
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<Object, AppTableFieldListResult> request = Request.newRequest("bitable/v1/apps/:app_token/tables/:table_id/fields", "GET",
                    new AccessTokenType[]{AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.appTableFields.service.config, request);
        }
    }

    public AppTableRecords getAppTableRecords() {
        return appTableRecords;
    }

    public static class AppTableRecords {

        private final BitableService service;

        public AppTableRecords(BitableService service) {
            this.service = service;
        }
    
        public AppTableRecordBatchDeleteReqCall batchDelete(AppTableRecordBatchDeleteReqBody body, RequestOptFn... optFns) {
            return new AppTableRecordBatchDeleteReqCall(this, body, optFns);
        }
    
        public AppTableRecordBatchCreateReqCall batchCreate(AppTableRecordBatchCreateReqBody body, RequestOptFn... optFns) {
            return new AppTableRecordBatchCreateReqCall(this, body, optFns);
        }
    
        public AppTableRecordGetReqCall get(RequestOptFn... optFns) {
            return new AppTableRecordGetReqCall(this, optFns);
        }
    
        public AppTableRecordUpdateReqCall update(AppTableRecord body, RequestOptFn... optFns) {
            return new AppTableRecordUpdateReqCall(this, body, optFns);
        }
    
        public AppTableRecordDeleteReqCall delete(RequestOptFn... optFns) {
            return new AppTableRecordDeleteReqCall(this, optFns);
        }
    
        public AppTableRecordListReqCall list(RequestOptFn... optFns) {
            return new AppTableRecordListReqCall(this, optFns);
        }
    
        public AppTableRecordBatchUpdateReqCall batchUpdate(AppTableRecordBatchUpdateReqBody body, RequestOptFn... optFns) {
            return new AppTableRecordBatchUpdateReqCall(this, body, optFns);
        }
    
        public AppTableRecordCreateReqCall create(AppTableRecord body, RequestOptFn... optFns) {
            return new AppTableRecordCreateReqCall(this, body, optFns);
        }
    
    }
    public static class AppTableRecordBatchDeleteReqCall extends ReqCaller<AppTableRecordBatchDeleteReqBody, AppTableRecordBatchDeleteResult> {
        private final AppTableRecords appTableRecords;
        
        private final AppTableRecordBatchDeleteReqBody body;
        private final Map<String, Object> pathParams;
        private final List<RequestOptFn> optFns;
        private AppTableRecordBatchDeleteResult result;
        
        private AppTableRecordBatchDeleteReqCall(AppTableRecords appTableRecords, AppTableRecordBatchDeleteReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.pathParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new AppTableRecordBatchDeleteResult();
            this.appTableRecords = appTableRecords;
        }
        
        public AppTableRecordBatchDeleteReqCall setAppToken(String appToken){
            this.pathParams.put("app_token", appToken);
            return this;
        }
        public AppTableRecordBatchDeleteReqCall setTableId(String tableId){
            this.pathParams.put("table_id", tableId);
            return this;
        }

        @Override
        public Response<AppTableRecordBatchDeleteResult> execute() throws Exception {
            this.optFns.add(Request.setPathParams(this.pathParams));
            Request<AppTableRecordBatchDeleteReqBody, AppTableRecordBatchDeleteResult> request = Request.newRequest("bitable/v1/apps/:app_token/tables/:table_id/records/batch_delete", "POST",
                    new AccessTokenType[]{AccessTokenType.User},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.appTableRecords.service.config, request);
        }
    }
    public static class AppTableRecordBatchCreateReqCall extends ReqCaller<AppTableRecordBatchCreateReqBody, AppTableRecordBatchCreateResult> {
        private final AppTableRecords appTableRecords;
        
        private final AppTableRecordBatchCreateReqBody body;
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private AppTableRecordBatchCreateResult result;
        
        private AppTableRecordBatchCreateReqCall(AppTableRecords appTableRecords, AppTableRecordBatchCreateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new AppTableRecordBatchCreateResult();
            this.appTableRecords = appTableRecords;
        }
        
        public AppTableRecordBatchCreateReqCall setAppToken(String appToken){
            this.pathParams.put("app_token", appToken);
            return this;
        }
        public AppTableRecordBatchCreateReqCall setTableId(String tableId){
            this.pathParams.put("table_id", tableId);
            return this;
        }
        
        public AppTableRecordBatchCreateReqCall setUserIdType(String userIdType){
            this.queryParams.put("user_id_type", userIdType);
            return this;
        }

        @Override
        public Response<AppTableRecordBatchCreateResult> execute() throws Exception {
            this.optFns.add(Request.setPathParams(this.pathParams));
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<AppTableRecordBatchCreateReqBody, AppTableRecordBatchCreateResult> request = Request.newRequest("bitable/v1/apps/:app_token/tables/:table_id/records/batch_create", "POST",
                    new AccessTokenType[]{AccessTokenType.User},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.appTableRecords.service.config, request);
        }
    }
    public static class AppTableRecordGetReqCall extends ReqCaller<Object, AppTableRecordGetResult> {
        private final AppTableRecords appTableRecords;
        
        private final Map<String, Object> pathParams;
        private final List<RequestOptFn> optFns;
        private AppTableRecordGetResult result;
        
        private AppTableRecordGetReqCall(AppTableRecords appTableRecords, RequestOptFn... optFns) {
        
            this.pathParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new AppTableRecordGetResult();
            this.appTableRecords = appTableRecords;
        }
        
        public AppTableRecordGetReqCall setAppToken(String appToken){
            this.pathParams.put("app_token", appToken);
            return this;
        }
        public AppTableRecordGetReqCall setTableId(String tableId){
            this.pathParams.put("table_id", tableId);
            return this;
        }
        public AppTableRecordGetReqCall setRecordId(String recordId){
            this.pathParams.put("record_id", recordId);
            return this;
        }

        @Override
        public Response<AppTableRecordGetResult> execute() throws Exception {
            this.optFns.add(Request.setPathParams(this.pathParams));
            Request<Object, AppTableRecordGetResult> request = Request.newRequest("bitable/v1/apps/:app_token/tables/:table_id/records/:record_id", "GET",
                    new AccessTokenType[]{AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.appTableRecords.service.config, request);
        }
    }
    public static class AppTableRecordUpdateReqCall extends ReqCaller<AppTableRecord, AppTableRecordUpdateResult> {
        private final AppTableRecords appTableRecords;
        
        private final AppTableRecord body;
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private AppTableRecordUpdateResult result;
        
        private AppTableRecordUpdateReqCall(AppTableRecords appTableRecords, AppTableRecord body, RequestOptFn... optFns) {
        
            this.body = body;
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new AppTableRecordUpdateResult();
            this.appTableRecords = appTableRecords;
        }
        
        public AppTableRecordUpdateReqCall setAppToken(String appToken){
            this.pathParams.put("app_token", appToken);
            return this;
        }
        public AppTableRecordUpdateReqCall setTableId(String tableId){
            this.pathParams.put("table_id", tableId);
            return this;
        }
        public AppTableRecordUpdateReqCall setRecordId(String recordId){
            this.pathParams.put("record_id", recordId);
            return this;
        }
        
        public AppTableRecordUpdateReqCall setUserIdType(String userIdType){
            this.queryParams.put("user_id_type", userIdType);
            return this;
        }

        @Override
        public Response<AppTableRecordUpdateResult> execute() throws Exception {
            this.optFns.add(Request.setPathParams(this.pathParams));
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<AppTableRecord, AppTableRecordUpdateResult> request = Request.newRequest("bitable/v1/apps/:app_token/tables/:table_id/records/:record_id", "PUT",
                    new AccessTokenType[]{AccessTokenType.User},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.appTableRecords.service.config, request);
        }
    }
    public static class AppTableRecordDeleteReqCall extends ReqCaller<Object, DeleteRecord> {
        private final AppTableRecords appTableRecords;
        
        private final Map<String, Object> pathParams;
        private final List<RequestOptFn> optFns;
        private DeleteRecord result;
        
        private AppTableRecordDeleteReqCall(AppTableRecords appTableRecords, RequestOptFn... optFns) {
        
            this.pathParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new DeleteRecord();
            this.appTableRecords = appTableRecords;
        }
        
        public AppTableRecordDeleteReqCall setAppToken(String appToken){
            this.pathParams.put("app_token", appToken);
            return this;
        }
        public AppTableRecordDeleteReqCall setTableId(String tableId){
            this.pathParams.put("table_id", tableId);
            return this;
        }
        public AppTableRecordDeleteReqCall setRecordId(String recordId){
            this.pathParams.put("record_id", recordId);
            return this;
        }

        @Override
        public Response<DeleteRecord> execute() throws Exception {
            this.optFns.add(Request.setPathParams(this.pathParams));
            Request<Object, DeleteRecord> request = Request.newRequest("bitable/v1/apps/:app_token/tables/:table_id/records/:record_id", "DELETE",
                    new AccessTokenType[]{AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.appTableRecords.service.config, request);
        }
    }
    public static class AppTableRecordListReqCall extends ReqCaller<Object, AppTableRecordListResult> {
        private final AppTableRecords appTableRecords;
        
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private AppTableRecordListResult result;
        
        private AppTableRecordListReqCall(AppTableRecords appTableRecords, RequestOptFn... optFns) {
        
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new AppTableRecordListResult();
            this.appTableRecords = appTableRecords;
        }
        
        public AppTableRecordListReqCall setAppToken(String appToken){
            this.pathParams.put("app_token", appToken);
            return this;
        }
        public AppTableRecordListReqCall setTableId(String tableId){
            this.pathParams.put("table_id", tableId);
            return this;
        }
        
        public AppTableRecordListReqCall setViewId(String viewId){
            this.queryParams.put("view_id", viewId);
            return this;
        }
        public AppTableRecordListReqCall setPageToken(String pageToken){
            this.queryParams.put("page_token", pageToken);
            return this;
        }
        public AppTableRecordListReqCall setPageSize(Integer pageSize){
            this.queryParams.put("page_size", pageSize);
            return this;
        }

        @Override
        public Response<AppTableRecordListResult> execute() throws Exception {
            this.optFns.add(Request.setPathParams(this.pathParams));
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<Object, AppTableRecordListResult> request = Request.newRequest("bitable/v1/apps/:app_token/tables/:table_id/records", "GET",
                    new AccessTokenType[]{AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.appTableRecords.service.config, request);
        }
    }
    public static class AppTableRecordBatchUpdateReqCall extends ReqCaller<AppTableRecordBatchUpdateReqBody, AppTableRecordBatchUpdateResult> {
        private final AppTableRecords appTableRecords;
        
        private final AppTableRecordBatchUpdateReqBody body;
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private AppTableRecordBatchUpdateResult result;
        
        private AppTableRecordBatchUpdateReqCall(AppTableRecords appTableRecords, AppTableRecordBatchUpdateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new AppTableRecordBatchUpdateResult();
            this.appTableRecords = appTableRecords;
        }
        
        public AppTableRecordBatchUpdateReqCall setAppToken(String appToken){
            this.pathParams.put("app_token", appToken);
            return this;
        }
        public AppTableRecordBatchUpdateReqCall setTableId(String tableId){
            this.pathParams.put("table_id", tableId);
            return this;
        }
        
        public AppTableRecordBatchUpdateReqCall setUserIdType(String userIdType){
            this.queryParams.put("user_id_type", userIdType);
            return this;
        }

        @Override
        public Response<AppTableRecordBatchUpdateResult> execute() throws Exception {
            this.optFns.add(Request.setPathParams(this.pathParams));
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<AppTableRecordBatchUpdateReqBody, AppTableRecordBatchUpdateResult> request = Request.newRequest("bitable/v1/apps/:app_token/tables/:table_id/records/batch_update", "POST",
                    new AccessTokenType[]{AccessTokenType.User},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.appTableRecords.service.config, request);
        }
    }
    public static class AppTableRecordCreateReqCall extends ReqCaller<AppTableRecord, AppTableRecordCreateResult> {
        private final AppTableRecords appTableRecords;
        
        private final AppTableRecord body;
        private final Map<String, Object> pathParams;
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private AppTableRecordCreateResult result;
        
        private AppTableRecordCreateReqCall(AppTableRecords appTableRecords, AppTableRecord body, RequestOptFn... optFns) {
        
            this.body = body;
            this.pathParams = new HashMap<>();
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new AppTableRecordCreateResult();
            this.appTableRecords = appTableRecords;
        }
        
        public AppTableRecordCreateReqCall setAppToken(String appToken){
            this.pathParams.put("app_token", appToken);
            return this;
        }
        public AppTableRecordCreateReqCall setTableId(String tableId){
            this.pathParams.put("table_id", tableId);
            return this;
        }
        
        public AppTableRecordCreateReqCall setUserIdType(String userIdType){
            this.queryParams.put("user_id_type", userIdType);
            return this;
        }

        @Override
        public Response<AppTableRecordCreateResult> execute() throws Exception {
            this.optFns.add(Request.setPathParams(this.pathParams));
            this.optFns.add(Request.setQueryParams(this.queryParams));
            Request<AppTableRecord, AppTableRecordCreateResult> request = Request.newRequest("bitable/v1/apps/:app_token/tables/:table_id/records", "POST",
                    new AccessTokenType[]{AccessTokenType.User},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.appTableRecords.service.config, request);
        }
    }

}
