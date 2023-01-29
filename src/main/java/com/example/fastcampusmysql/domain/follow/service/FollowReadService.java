package com.example.fastcampusmysql.domain.follow.service;

import com.example.fastcampusmysql.domain.follow.entity.Follow;
import com.example.fastcampusmysql.domain.follow.repository.FollowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FollowReadService {

    final private FollowRepository followRepository;

    public List<Follow> getFollwings(Long memberId){
        return followRepository.findAllByFromMemberId(memberId);
    }
    public List<Follow> getFollwers(Long memberId){
        return followRepository.findAllByToMemberId(memberId);
    }
}
