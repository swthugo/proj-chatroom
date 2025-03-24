package com.godev.chatroom.service;

import com.godev.chatroom.model.Profile;
import com.godev.chatroom.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Optional<Profile> getProfileByUserId(Long accountId) {
        return profileRepository.findByAccountId(accountId);
    }
}
