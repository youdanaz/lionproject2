package com.example.lionproject2backend.tutorial.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostTutorialCreateRequest {

    private Long mentorId;
    private String title;
    private String description;
    private int price;
    private int duration;

    private List<Long> skillIds;

}
