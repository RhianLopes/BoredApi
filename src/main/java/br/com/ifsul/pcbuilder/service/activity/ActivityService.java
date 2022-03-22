package br.com.ifsul.pcbuilder.service.activity;

import br.com.ifsul.pcbuilder.dto.ActivityCreationRequestDto;
import br.com.ifsul.pcbuilder.dto.ActivitySearchResponseDto;

import java.util.List;

public interface ActivityService {

    ActivitySearchResponseDto search(String type);

    ActivitySearchResponseDto searchById(Long id);

    void create(ActivityCreationRequestDto requestDto);

}
