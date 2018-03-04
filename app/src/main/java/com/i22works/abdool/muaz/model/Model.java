package com.i22works.abdool.muaz.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by muaz1 on 2018/03/03.
 */

public class Model{
    private   String name;
    private   boolean isHotspot;
    private   boolean isEyeLevel;
    private   boolean isLowerShelf;
    private  Boolean isVisable;


    public Model(String name, boolean isHotspot, boolean isEyeLevel, boolean isLowerShelf, Boolean isVisable) {
        this.name = name;
        this.isHotspot = isHotspot;
        this.isEyeLevel = isEyeLevel;
        this.isLowerShelf = isLowerShelf;
        this.isVisable = isVisable;
    }
public Model()
{

}





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHotspot() {
        return isHotspot;
    }

    public void setHotspot(boolean hotspot) {
        isHotspot = hotspot;
    }

    public boolean isEyeLevel() {
        return isEyeLevel;
    }

    public void setEyeLevel(boolean eyeLevel) {
        isEyeLevel = eyeLevel;
    }

    public boolean isLowerShelf() {
        return isLowerShelf;
    }

    public void setLowerShelf(boolean lowerShelf) {
        isLowerShelf = lowerShelf;
    }

    public Boolean getVisable() {
        return isVisable;
    }

    public void setVisable(Boolean visable) {
        isVisable = visable;
    }






}
