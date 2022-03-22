package br.com.ifsul.pcbuilder.controller;

import br.com.ifsul.pcbuilder.dto.ActivityCreationRequestDto;
import br.com.ifsul.pcbuilder.dto.ActivitySearchResponseDto;
import br.com.ifsul.pcbuilder.service.activity.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activity")
@RequiredArgsConstructor
public class ActivityController {

    private final ActivityService activityService;

    @GetMapping
    public ActivitySearchResponseDto search(@RequestParam(name = "type", required = false) String type) {
        return activityService.search(type);
    }

    @GetMapping("/{id}")
    public ActivitySearchResponseDto search(@PathVariable(name = "id") Long id) {
        return activityService.searchById(id);
    }

    @PostMapping
    public void register(@RequestBody ActivityCreationRequestDto requestDto) {
        activityService.create(requestDto);
    }
}
