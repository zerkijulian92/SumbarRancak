package com.takatutustudio.sumbarrancak;

import android.os.Parcel;
import android.os.Parcelable;

public class WisataSumbar implements Parcelable {

    private String name, remarks, photo, deskripsi;

    protected WisataSumbar(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        deskripsi = in.readString();
    }

    public static final Creator<WisataSumbar> CREATOR = new Creator<WisataSumbar>() {
        @Override
        public WisataSumbar createFromParcel(Parcel in) {
            return new WisataSumbar(in);
        }

        @Override
        public WisataSumbar[] newArray(int size) {
            return new WisataSumbar[size];
        }
    };


    public WisataSumbar(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.remarks);
        parcel.writeString(this.photo);
        parcel.writeString(this.deskripsi);

    }
}
