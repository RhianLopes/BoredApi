package br.com.ifsul.pcbuilder.service.activity;

import br.com.ifsul.pcbuilder.dto.ActivityCreationRequestDto;
import br.com.ifsul.pcbuilder.dto.ActivitySearchResponseDto;
import br.com.ifsul.pcbuilder.mapper.ActivityMapper;
import br.com.ifsul.pcbuilder.model.Activity;
import br.com.ifsul.pcbuilder.repository.ActivityRepository;
import liquibase.pro.packaged.A;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository repository;

    private final ActivityMapper mapper;

    @Override
    public ActivitySearchResponseDto search(String type) {
        Activity response;
        if (Objects.isNull(type)) {
            response = repository.findAll().stream()
                    .findFirst()
                    .orElse(new Activity());
        } else {
            response = repository.findAllByType(type).stream()
                    .findFirst()
                    .orElse(new Activity());
        }
        return mapper.mapToActivitySearchResponseDto(response);
    }

    @Override
    public ActivitySearchResponseDto searchById(Long id) {
        return repository.findById(id)
                .map(mapper::mapToActivitySearchResponseDto)
                .orElseThrow(() -> new RuntimeException("Atividade não encontrada, burro, mediocre!!"));
    }

    @Override
    public void create(ActivityCreationRequestDto requestDto) {
        final var activity = mapper.mapFromActivityCreationRequestDto(requestDto);
        repository.save(activity);
    }
}
