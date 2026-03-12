package com.codeguru.review.mapper;

import com.codeguru.review.dto.ReviewDto;
import com.codeguru.review.entity.Review;

public class EntityDtoMapper {

    public static ReviewDto toDto(Review review){
        return new ReviewDto(
                review.getId(),
                review.getRating(),
                review.getComment(),
                review.getReviewer()
        );
    }

}
