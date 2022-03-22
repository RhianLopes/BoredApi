package br.com.ifsul.pcbuilder.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivitySearchResponseDto {

    private Long id;

    private String activity;

    private String type;

    private Integer participants;

}
