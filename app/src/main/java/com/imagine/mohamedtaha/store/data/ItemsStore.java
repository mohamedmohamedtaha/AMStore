package com.imagine.mohamedtaha.store.data;

/**
 * Created by MANASATT on 03/12/17.
 */

public class ItemsStore {

    private   String typeStore;
    private String namePermission;
    private String notes;
    private String createdDate;
    private String createdTime;
    private String convertTo;

    public String getConvertTo() {
        return convertTo;
    }

    public void setConvertTo(String convertTo) {
        this.convertTo = convertTo;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    private String nameGategory;
    private String nauralCategory;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public void setmTimeInMilliseconds(long mTimeInMilliseconds) {
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    private long  mTimeInMilliseconds;


    private int id,issued,incoming;
    private long id_code_category;
    private long id_code_store;
    private long id_permission_id;

    public long getId_convert_to() {
        return id_convert_to;
    }

    public void setId_convert_to(long id_conert_to) {
        this.id_convert_to = id_conert_to;
    }

    public long getUserId() {
        return userId;
    }

    private long id_convert_to;

    private long userId;
    private int first_balanse;


    public long getId_permission_id() {
        return id_permission_id;
    }

    public void setId_permission_id(long id_permission_id) {
        this.id_permission_id = id_permission_id;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


    public int getIncoming() {
        return incoming;
    }

    public void setIncoming(int incoming) {
        this.incoming = incoming;
    }

    public int getIssued() {
        return issued;
    }

    public void setIssued(int issued) {
        this.issued = issued;
    }


    public String getTypeStore() {
        return typeStore;
    }

    public void setTypeStore(String typeStore) {
        this.typeStore = typeStore;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePermission() {
        return namePermission;
    }

    public void setNamePermission(String namePermission) {
        this.namePermission = namePermission;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }


    public int getFirst_balanse() {
        return first_balanse;
    }

    public void setFirst_balanse(int first_balanse) {
        this.first_balanse = first_balanse;
    }


    public long getId_code_category() {
        return id_code_category;
    }

    public void setId_code_category(long id_code_category) {
        this.id_code_category = id_code_category;
    }

    public long getId_code_store() {
        return id_code_store;
    }

    public void setId_code_store(long id_code_store) {
        this.id_code_store = id_code_store;
    }


    public String getNameGategory() {
        return nameGategory;
    }

    public void setNameGategory(String nameGategory) {
        this.nameGategory = nameGategory;
    }

       public String getNauralCategory() {
        return nauralCategory;
    }

    public void setNauralCategory(String nauralCategory) {
        this.nauralCategory = nauralCategory;
    }

  }
