package br.com.ifsul.pcbuilder.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityCreationRequestDto {


    @NotNull
    @Size(max = 255)
    private String activity;

    @NotNull
    @Size(max = 255)
    private String type;

    @NotNull
    private Integer participants;

}
