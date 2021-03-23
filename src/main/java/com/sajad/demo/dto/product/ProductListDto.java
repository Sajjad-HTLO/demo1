package com.sajad.demo.dto.product;

import com.sajad.demo.dto.comment.CommentDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents detail of a product to be used as a list item in front-end.
 */
public class ProductListDto {

    private long id;

    private String name;

    private boolean isVisible;

    private boolean isCommentable;

    private boolean isRatable;

    private boolean commentableToPublic;

    private boolean ratableToPublic;

    /**
     * Last 3 comments
     */
    private List<CommentDto> comments = new ArrayList<>();

    /**
     * Average of given rates for this product
     */
    private double ratesAverage;

    /**
     * Count of verified comments
     */
    private int commentsCount;

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public boolean isCommentableToPublic() {
        return commentableToPublic;
    }

    public void setCommentableToPublic(boolean commentableToPublic) {
        this.commentableToPublic = commentableToPublic;
    }

    public boolean isRatableToPublic() {
        return ratableToPublic;
    }

    public void setRatableToPublic(boolean ratableToPublic) {
        this.ratableToPublic = ratableToPublic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRatesAverage() {
        return ratesAverage;
    }

    public void setRatesAverage(double ratesAverage) {
        this.ratesAverage = ratesAverage;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public List<CommentDto> getComments() {
        return comments;
    }

    public void setComments(List<CommentDto> comments) {
        this.comments = comments;
    }

    public boolean isCommentable() {
        return isCommentable;
    }

    public void setCommentable(boolean commentable) {
        isCommentable = commentable;
    }

    public boolean isRatable() {
        return isRatable;
    }

    public void setRatable(boolean ratable) {
        isRatable = ratable;
    }
}
