package br.com.ifsul.pcbuilder.mapper;

import br.com.ifsul.pcbuilder.dto.ActivityCreationRequestDto;
import br.com.ifsul.pcbuilder.dto.ActivitySearchResponseDto;
import br.com.ifsul.pcbuilder.model.Activity;
import org.springframework.stereotype.Component;

@Component
public class ActivityMapper {

    public ActivitySearchResponseDto mapToActivitySearchResponseDto(Activity activity) {
        return ActivitySearchResponseDto.builder()
                .id(activity.getId())
                .activity(activity.getActivity())
                .participants(activity.getParticipants())
                .type(activity.getType())
                .build();
    }

    public Activity mapFromActivityCreationRequestDto(ActivityCreationRequestDto requestDto) {
        return Activity.builder()
                .activity(requestDto.getActivity())
                .participants(requestDto.getParticipants())
                .type(requestDto.getType())
                .build();
    }
}
