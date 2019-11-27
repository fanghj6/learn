package com.junit.junittest.test.mapstruct;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author fhj
 * @version 1.0
 * @ClassName UserConverter
 * @Description TODO
 * @date 2019/11/27  8:56
 **/
@Mapper(componentModel = "spring")
public interface UserConverter {

    @Mappings({
            @Mapping(source = "id",target = "testId"),
            @Mapping(source = "name",target = "testName"),
    })
   UserDto DoToDto(User user);
}
