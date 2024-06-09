package com.woopi.sample.spring_boot.domain.sample;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;


@Transactional(readOnly = true) // Class에 read-only를 설정하고, 개별 메소드에 CUD가 있다면 해당 메소드에 거기에 read-only를 false로 설정한다.
@RequiredArgsConstructor
@Service
public class SampleService {

    /* SERVICES */
    private final SampleDomainService sampleDomainService;

    /* GET METHODS */

    /**
     * Sample List 조회
     * @return
     */
    public List<SampleEntity> getSamples () throws NotFoundException {
        return sampleDomainService.getSamples();
    }

    /**
     * Id로 조회된 Sample 조회
     * @param id
     * @return
     */
    public SampleEntity getSample (Long id) throws NotFoundException {
        return sampleDomainService.getSample(id);
    }

    /* CREATE METHODS */

    /* UPDATE METHODS */

    /* DELETE METHODS */

}
