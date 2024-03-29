package com.vektorel.restful.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostSaveRequestDto {
    private String token;
    private String title;
    private String description;
    private String imageUrl;
}
