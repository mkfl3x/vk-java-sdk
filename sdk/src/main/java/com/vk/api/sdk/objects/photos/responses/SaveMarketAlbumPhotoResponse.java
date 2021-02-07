package com.vk.api.sdk.objects.photos.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.media.Restriction;
import com.vk.api.sdk.objects.photos.Image;
import com.vk.api.sdk.objects.photos.PhotoSizes;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * SaveMarketAlbumPhotoResponse object
 */
public class SaveMarketAlbumPhotoResponse implements Validable {
    /**
     * Access key for the photo
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Album ID
     */
    @SerializedName("album_id")
    private Integer albumId;

    /**
     * Date when uploaded
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Original photo height
     */
    @SerializedName("height")
    private Integer height;

    /**
     * Photo ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    @SerializedName("images")
    private List<Image> images;

    /**
     * Latitude
     */
    @SerializedName("lat")
    private Float lat;

    /**
     * Longitude
     */
    @SerializedName("long")
    private Float lng;

    /**
     * Photo owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * URL of image with 2560 px width
     */
    @SerializedName("photo_256")
    private URI photo256;

    /**
     * Information whether current user can comment the photo
     */
    @SerializedName("can_comment")
    private BoolInt canComment;

    @SerializedName("place")
    private String place;

    /**
     * Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("sizes")
    private List<PhotoSizes> sizes;

    /**
     * Photo caption
     */
    @SerializedName("text")
    private String text;

    /**
     * ID of the user who have uploaded the photo
     */
    @SerializedName("user_id")
    private Integer userId;

    /**
     * Original photo width
     */
    @SerializedName("width")
    private Integer width;

    /**
     * Whether photo has attached tag links
     */
    @SerializedName("has_tags")
    private Boolean hasTags;

    @SerializedName("restrictions")
    private Restriction restrictions;

    public String getAccessKey() {
        return accessKey;
    }

    public SaveMarketAlbumPhotoResponse setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public SaveMarketAlbumPhotoResponse setAlbumId(Integer albumId) {
        this.albumId = albumId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public SaveMarketAlbumPhotoResponse setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public SaveMarketAlbumPhotoResponse setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public SaveMarketAlbumPhotoResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public List<Image> getImages() {
        return images;
    }

    public SaveMarketAlbumPhotoResponse setImages(List<Image> images) {
        this.images = images;
        return this;
    }

    public Float getLat() {
        return lat;
    }

    public SaveMarketAlbumPhotoResponse setLat(Float lat) {
        this.lat = lat;
        return this;
    }

    public Float getLng() {
        return lng;
    }

    public SaveMarketAlbumPhotoResponse setLng(Float lng) {
        this.lng = lng;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public SaveMarketAlbumPhotoResponse setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public URI getPhoto256() {
        return photo256;
    }

    public SaveMarketAlbumPhotoResponse setPhoto256(URI photo256) {
        this.photo256 = photo256;
        return this;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public BoolInt getCanComment() {
        return canComment;
    }

    public String getPlace() {
        return place;
    }

    public SaveMarketAlbumPhotoResponse setPlace(String place) {
        this.place = place;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public SaveMarketAlbumPhotoResponse setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    public SaveMarketAlbumPhotoResponse setSizes(List<PhotoSizes> sizes) {
        this.sizes = sizes;
        return this;
    }

    public String getText() {
        return text;
    }

    public SaveMarketAlbumPhotoResponse setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public SaveMarketAlbumPhotoResponse setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public SaveMarketAlbumPhotoResponse setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Boolean getHasTags() {
        return hasTags;
    }

    public SaveMarketAlbumPhotoResponse setHasTags(Boolean hasTags) {
        this.hasTags = hasTags;
        return this;
    }

    public Restriction getRestrictions() {
        return restrictions;
    }

    public SaveMarketAlbumPhotoResponse setRestrictions(Restriction restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, images, lng, restrictions, albumId, photo256, postId, ownerId, userId, sizes, accessKey, width, hasTags, canComment, id, place, text, lat, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveMarketAlbumPhotoResponse saveMarketAlbumPhotoResponse = (SaveMarketAlbumPhotoResponse) o;
        return Objects.equals(date, saveMarketAlbumPhotoResponse.date) &&
                Objects.equals(images, saveMarketAlbumPhotoResponse.images) &&
                Objects.equals(ownerId, saveMarketAlbumPhotoResponse.ownerId) &&
                Objects.equals(restrictions, saveMarketAlbumPhotoResponse.restrictions) &&
                Objects.equals(lng, saveMarketAlbumPhotoResponse.lng) &&
                Objects.equals(canComment, saveMarketAlbumPhotoResponse.canComment) &&
                Objects.equals(postId, saveMarketAlbumPhotoResponse.postId) &&
                Objects.equals(sizes, saveMarketAlbumPhotoResponse.sizes) &&
                Objects.equals(userId, saveMarketAlbumPhotoResponse.userId) &&
                Objects.equals(accessKey, saveMarketAlbumPhotoResponse.accessKey) &&
                Objects.equals(width, saveMarketAlbumPhotoResponse.width) &&
                Objects.equals(albumId, saveMarketAlbumPhotoResponse.albumId) &&
                Objects.equals(hasTags, saveMarketAlbumPhotoResponse.hasTags) &&
                Objects.equals(id, saveMarketAlbumPhotoResponse.id) &&
                Objects.equals(place, saveMarketAlbumPhotoResponse.place) &&
                Objects.equals(text, saveMarketAlbumPhotoResponse.text) &&
                Objects.equals(lat, saveMarketAlbumPhotoResponse.lat) &&
                Objects.equals(photo256, saveMarketAlbumPhotoResponse.photo256) &&
                Objects.equals(height, saveMarketAlbumPhotoResponse.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SaveMarketAlbumPhotoResponse{");
        sb.append("date=").append(date);
        sb.append(", images=").append(images);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", restrictions=").append(restrictions);
        sb.append(", lng=").append(lng);
        sb.append(", canComment=").append(canComment);
        sb.append(", postId=").append(postId);
        sb.append(", sizes=").append(sizes);
        sb.append(", userId=").append(userId);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", width=").append(width);
        sb.append(", albumId=").append(albumId);
        sb.append(", hasTags=").append(hasTags);
        sb.append(", id=").append(id);
        sb.append(", place='").append(place).append("'");
        sb.append(", text='").append(text).append("'");
        sb.append(", lat=").append(lat);
        sb.append(", photo256=").append(photo256);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
